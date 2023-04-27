package com.cmcc.participant.ground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.service.IWFPOrgService;
import com.cmcc.participant.ground.service.IWFPUserService;
import com.cmcc.participant.ground.service.common.WFPCommonOrgService;
import com.cmcc.participant.ground.service.common.WFPCommonUserService;
import com.eos.data.datacontext.DataContextManager;
import com.eos.data.datacontext.IMUODataContext;
import com.eos.runtime.core.TraceLoggerFactory;
import com.eos.runtime.resource.ContributionMetaData;
import com.eos.system.logging.Logger;
import com.eos.workflow.omservice.IWFOMService;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.api.PageCond;
import com.primeton.workflow.api.ParticipantType;
import com.primeton.workflow.api.WFOMException;

/**
 * 组织机构实现类
 * 
 * @author YunTao.Li
 * 
 */
public class CMCCWFOMServiceImplForCommon implements IWFOMService {

    public static final String PARTICIPANTTYPE_PERSON = "person";

    public static final String PARTICIPANTTYPE_ORGANIZATION = "organization";

    public static final String CONTRIBUTIONNAME = "com.cmcc.participant.ground";

    private static final Logger logger = TraceLoggerFactory.getContributionTraceLogger("com.cmcc.participant.ground",
            CMCCWFOMServiceImplForCommon.class);

    /**
     * 所有被定义的参与者类型
     */
    public static Map<String, ParticipantType> participantTypes = new HashMap<String, ParticipantType>();

    /**
     * 将构建包的名称放入引擎上下文，以便根据租户ID查询对应dsname时能获取相关配置
     */
    private static void pushContributionName() {
        ContributionMetaData con = new ContributionMetaData();
        con.setName(CONTRIBUTIONNAME);
        DataContextManager.current().pushContributionMetaData(con);
    }

    public CMCCWFOMServiceImplForCommon() {
        try {
            init();
        } catch (WFOMException e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化
     * 
     * @throws WFOMException
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void init() throws WFOMException {
        // 步骤1 : 初始化参与者类型
        // 人员
        ParticipantType ptPerson = null;
        ptPerson = new ParticipantType('P', "person", "个人", "个人", false, 1, true, null, false, null);
        // 机构
        ParticipantType ptOrganization = null;
        List organizationChildParticipantTypeCodes = new ArrayList();
        organizationChildParticipantTypeCodes.add("person");
        organizationChildParticipantTypeCodes.add("organization");
        // organizationChildParticipantTypeCodes.add("position");
        ptOrganization = new ParticipantType('O', "organization", "组织机构", "组织机构", true, 4, false,
                organizationChildParticipantTypeCodes, false, null);
        // 步骤2 ： 将初始化的参与者类型放到集合中
        participantTypes.put("person", ptPerson);
        participantTypes.put("organization", ptOrganization);
    }

    /**
     * 根据ID获取某个类型的参与者*
     * 
     * @param typeCode
     * @param participantID
     * 
     * @return
     */
    public WFParticipant findParticipantByID(String typeCode, String participantID) {
        pushContributionName();
        WFParticipant participantInfo = new WFParticipant();
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        IWFPUserService userService = WFPCommonUserService.newInstance();
        // step1 : 根据typeCode获得participantType对象,找不到对应的类型则返回空（会报空指针异常）
        ParticipantType partType = (ParticipantType) participantTypes.get(typeCode);
        if (partType == null) {
            return null;
        }
        // step2 : 直接根据typecode判断是org还是user，调用不同的sql查询出明确的参与者返回就行了
        if (PARTICIPANTTYPE_PERSON.equals(typeCode)) { // 如果是person
            try {
                // step2.1.1 : 查询内部用户或外部用户
                participantInfo = userService.getParticipantByID(participantID);
                participantInfo.setTypeCode(PARTICIPANTTYPE_PERSON);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (PARTICIPANTTYPE_ORGANIZATION.equals(typeCode)) { // 如果是organization
            try {
                // step2.2.1 : 查询外部机构或内部机构(org或role)信息
                participantInfo = orgService.findOrgRoleParticipant(participantID);
                participantInfo.setTypeCode(PARTICIPANTTYPE_ORGANIZATION);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return participantInfo;
    }

    /**
     * 获取某个类型参与者的根参与者<br>
     * 因为目前只有org与person两类参与者，有层级关系的只有org一类，所以此处的typeCode只用考虑org
     * 
     * @param typeCode
     * 
     * @return
     */
    public List<WFParticipant> findRootParticipants(String typeCode) {
        pushContributionName();
        // step1 : 判断，如果类型不是机构，则直接返回空，外面会抛出空指针异常
        if (!("organization").equals(typeCode)) {
            return new ArrayList<WFParticipant>();
        }
        // step2 : 构造顶级机构
        WFParticipant rootOrgParticipant = new WFParticipant();
        try {
            // step2.1 :查询顶级机构
            IWFPOrgService orgService = WFPCommonOrgService.newInstance();
            WfpAfOrganization orgInfo = orgService.getRootOrganization();
            String orgCode = orgInfo.getOrgCode();
            String orgName = orgInfo.getOrgName();
            // step2.2 : set机构到参与者对象
            rootOrgParticipant.setId(orgCode);
            rootOrgParticipant.setName(orgName);
            rootOrgParticipant.setTypeCode(PARTICIPANTTYPE_ORGANIZATION);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // step3 : 构造顶级角色(即本地机构)
        WFParticipant rootRoleParticipant = new WFParticipant();
        rootRoleParticipant.setId("role");
        rootRoleParticipant.setName("角色");
        rootRoleParticipant.setTypeCode("organization");
        // step4 : 将顶级机构与顶级角色加入到list中返回
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        partiList.add(rootOrgParticipant);
        partiList.add(rootRoleParticipant);
        return partiList;
    }

    /**
     * 查询所有下级参与者 因为目前只有person与org所以有层级关系的只有org,此处typeCode必为organization
     * 
     * @param typeCode
     * @param participantID
     * 
     * @return
     */
    public List<WFParticipant> getAllChildParticipants(String typeCode, String participantID) {
        pushContributionName();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        // 初始化Service
        IWFPUserService userService = WFPCommonUserService.newInstance();
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        // step1 : 判断，如果类型不是机构，则直接返回空，外面会抛出空指针异常
        if (!("organization").equals(typeCode)) {
            return new ArrayList<WFParticipant>();
        }
        // step2 : 特殊判断，如果participantID = role 则说明是查询顶级角色下的所有角色
        if ("role".equals(participantID)) {
            IMUODataContext muo = DataContextManager.current().getMUODataContext();
            String tenantID = "";
            try {
                tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
            } catch (Exception e) {
                // tenantID = "AAM";
                e.printStackTrace();
            }
            try {
                partiList.addAll(orgService.getRoleParticipantsByTenantID(tenantID));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String orgCode = participantID;
            // step2.2.1 : 获得机构下的所有机构(此处只包括外部机构)
            List<WFParticipant> childOrgParticipants = new ArrayList<WFParticipant>();
            try {
                childOrgParticipants.addAll(orgService.getChildOrgParticipantList(orgCode));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // step2.2.2 : 获得机构下的所有人员
            List<WFParticipant> childPersonParticipants = new ArrayList<WFParticipant>();
            try {
                childPersonParticipants.addAll(userService.getParticipantByOrgId(orgCode));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // step2.2.3 : 取并集
            partiList.addAll(childOrgParticipants);
            partiList.addAll(childPersonParticipants);
        }
        return partiList;
    }

    /**
     * 查询所有的上级参与者(因为原有为空，所以此处为空)
     * 
     * @param typeCode
     * @param participantID
     * @return
     */
    public List<WFParticipant> getAllParentParticipants(String typeCode, String participantID) {
        pushContributionName();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        return partiList;
    }

    /**
     * 查询某个参与者的指定类型的子参与者*
     * 
     * @param typeCode
     * @param participantID
     * @param childType
     * @return
     */
    public List<WFParticipant> getChildParticipants(String typeCode, String participantID, String childType) {
        pushContributionName();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        IWFPUserService userService = WFPCommonUserService.newInstance();
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        // step1 : 因为只有组织有子参与者，所以判断typeCode如果不是organization则返回空
        if (!("organization").equals(typeCode)) {
            return partiList;
        }
        // step2 : 判断是获取机构下的机构还是机构下的人员
        String orgCode = participantID;
        if (("organization").equals(childType)) {
            // step2.1 : 获取机构下的机构
            try {
                partiList.addAll(orgService.getChildOrgParticipantList(orgCode));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (("person").equals(childType)) {
            // step2.2 : 获取机构下的人员
            try {
                partiList.addAll(userService.getParticipantByOrgId(orgCode));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return partiList;
    }

    /**
     * 查询交集类型参与者的所有下属参与者 目前系统中没有交集类型参与者（比如岗位）所以此处为空
     * 
     * @param jointParticipantType
     * @param participantIDList
     * @return
     */
    public List<WFParticipant> getJointChildParticipant(String jointParticipantType, List<String> participantIDList) {
        pushContributionName();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        return partiList;
    }

    /**
     * 查询某个参与者的指定类型的父参与者(原有实现类此处为空)
     * 
     * @param typeCode
     * @param participantID
     * @param parentType
     * @return
     */
    public List<WFParticipant> getParentParticipants(String typeCode, String participantID, String parentType) {
        pushContributionName();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        WFParticipant parentParticipant = new WFParticipant();
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        // 组织机构结构只有当parentType为机构时才符合逻辑
        if (!PARTICIPANTTYPE_ORGANIZATION.equals(parentType)) {
            return partiList;
        }
        // step1 : 判断typeCode是人员还是机构
        try {
            if (PARTICIPANTTYPE_ORGANIZATION.equals(typeCode)) { // 机构
                // step2.1 : 如果是机构则取机构的父机构
                parentParticipant = orgService.getParentParticipantByOrgCode(participantID);
            } else if (PARTICIPANTTYPE_PERSON.equals(typeCode)) {// 人员
                // step2.2 : 如果是人员则取人员所属机构
                parentParticipant = orgService.getParentParticipantByUserID(participantID);
            }
            partiList.add(parentParticipant);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partiList;
    }

    /**
     * 获取某个参与者的参与范围 <br>
     * 
     * 来源于jms的统称远程，远程用户，远程机构，来源于role或者person的统称本地<br>
     * 1. type不是person直接返回空list对象<br>
     * 2. 根据id查询接口用户表，获得远程用户对象<br>
     * 3. 根据远程用户对象的user_account查询person表的pm_person_id获得本地角色列表<br>
     * 
     * @param typeCode
     * @param participantID
     * @return
     */
    public List<WFParticipant> getParticipantScope(String typeCode, String participantID) {
        pushContributionName();
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        List<WFParticipant> partiList = new ArrayList<WFParticipant>();
        // 如果类型不是person,则直接返回空list
        if (!PARTICIPANTTYPE_PERSON.equals(typeCode)) {
            return new ArrayList<WFParticipant>();
        }
        // step1 : 首先获取自己的参与者
        WFParticipant selfParticipant = this.findParticipantByID(PARTICIPANTTYPE_PERSON, participantID);
        // step1.1:如果获取不到参与者，则把自己加到返回列表中
        if (selfParticipant == null || StringUtils.isBlank(selfParticipant.getId())) {
            selfParticipant.setId(participantID);
            selfParticipant.setName(null);
            selfParticipant.setTypeCode(PARTICIPANTTYPE_PERSON);
        }
        partiList.add(selfParticipant);
        // step2 : 获取自己所属所有角色列表对象
        try {
            List<WFParticipant> roleParticipants = orgService.getRoleListByUserId(participantID);
            partiList.addAll(roleParticipants);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // for (WFParticipant p : partiList) {
        // System.out.println("---------------" + p.getId());
        // System.out.println("---------------" + p.getName());
        // System.out.println("---------------" + p.getTypeCode());
        // }
        return partiList;
    }

    /**
     * 获取指定参与者类型
     * 
     * @param typeCode
     * @return
     */
    public ParticipantType getParticipantType(String typeCode) {
        pushContributionName();
        return ((ParticipantType) participantTypes.get(typeCode));
    }

    /**
     * 获取所有参与者类型的列表
     * **/
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<ParticipantType> getParticipantTypes() {
        pushContributionName();
        List participantTypeList = null;
        if (participantTypes.size() > 0) {
            participantTypeList = new ArrayList();
            ParticipantType participantType = null;
            // step1 : 参与者类型集合去重，然后遍历
            Set participantTypeSets = participantTypes.keySet();
            Iterator i = participantTypeSets.iterator();
            // step2 : 将去重的结果遍历到list中
            while (i.hasNext()) {
                participantType = (ParticipantType) participantTypes.get(i.next());
                participantTypeList.add(participantType);
            }
        }
        return participantTypeList;
    }

    /**
     * 获取某个类型的所有参与者(分页)
     * 
     * 2018.12.09修改：只查询外部机构（org）不查询（role）且在查询时分页,不查询人员
     * 
     * @param typeCode
     * @param pc
     * @return
     */
    public List<WFParticipant> getParticipants(String typeCode, PageCond pc) {
        pushContributionName();
        List<WFParticipant> resultParticipants = new ArrayList<WFParticipant>(); // 结果参与者列表（处理过的)
        IWFPOrgService orgService = WFPCommonOrgService.newInstance();
        // step1 : 判断参与者类型，将对应类型的参与者放入临时参与者list
        try {
            if (PARTICIPANTTYPE_ORGANIZATION.equals(typeCode)) { // 机构
                List<WFParticipant> allOrgParticipants = orgService.getAllOrgParticipantList(pc);
                resultParticipants.addAll(allOrgParticipants);
            } else if (PARTICIPANTTYPE_PERSON.equals(typeCode)) { // 人员
                // 如果是人员，直接返回空list
                return new ArrayList<WFParticipant>();
            } else {
                // 错误的参与者类型，直接返回空list
                return new ArrayList<WFParticipant>();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultParticipants;
    }
}
