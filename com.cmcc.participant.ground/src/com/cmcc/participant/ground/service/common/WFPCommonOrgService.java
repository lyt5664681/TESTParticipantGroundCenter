/**
 * 
 */
package com.cmcc.participant.ground.service.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.cmcc.participant.ground.CMCCWFOMServiceImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl;
import com.cmcc.participant.ground.service.IWFPOrgService;
import com.cmcc.participant.ground.util.DataConnectionUtil;
import com.eos.foundation.database.DatabaseExt;
import com.eos.foundation.database.DatabaseUtil;
import com.eos.foundation.impl.PageCondImpl;
import com.eos.runtime.core.TraceLoggerFactory;
import com.eos.spring.DASDaoSupport;
import com.eos.system.logging.Logger;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.api.PageCond;
import com.primeton.workflow.api.engine.EngineContextManager;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;
import commonj.sdo.DataObject;

/**
 * <pre>
 * Title: 查询组织机构service
 * Description: 不带缓存，直接查询数据库
 * </pre>
 * 
 * @author YunTao.Li
 * @version 1.00.00
 * 
 */
public class WFPCommonOrgService extends DASDaoSupport implements IWFPOrgService {

    private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(WFPCommonOrgService.class);

    private static final Logger logger = TraceLoggerFactory.getContributionTraceLogger("com.cmcc.participant.ground",
            WFPCommonOrgService.class);

    public WFPCommonOrgService() {
    }

    /**
     * 静态方法初始化对象
     * 
     * @return
     */
    public static WFPCommonOrgService newInstance() {
        return new WFPCommonOrgService();
    }

    /**
     * 新增机构
     * 
     * @param orgInfo
     * @throws Exception
     */
    public void addWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
        String dsName = DataConnectionUtil.getTenantIdDataSource(EngineContextManager.current().getTenantIDSilence());
        DatabaseUtil.insertEntity(dsName, orgInfo);
        // this.getDASTemplate().insertEntity(orgInfo);
    }

    /**
     * 保存机构，根据org_code字段来判断是否有重复的，有则删了再加
     * 
     * @param orgInfo
     * @throws Exception
     */
    public void saveWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
        // step1 : 首先判断本地库有没有此组织机构
        String orgCode = orgInfo.getOrgCode();
        WfpAfOrganization priKeyTemplate = new WfpAfOrganizationImpl();
        priKeyTemplate.setOrgCode(orgCode);
        String dsName = DataConnectionUtil.getTenantIdDataSource(EngineContextManager.current().getTenantIDSilence());
        int ucount = DatabaseUtil.countByTemplate(dsName, priKeyTemplate);
        // int ucount = this.getDASTemplate().countByTemplate(priKeyTemplate);
        // step2 : 如果有则先删除
        if (ucount > 0) {
            // 记录日志
            this.deleteWFPOrganization(orgInfo);
        }
        // step3 : 然后插入此机构到数据库
        this.addWFPOrganization(orgInfo);
    }

    /**
     * 删除机构
     * 
     * @param orgInfo
     * @throws Exception
     */
    public void deleteWFPOrganization(WfpAfOrganization orgInfo) throws Exception {
        String tenantID = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tenantID);
        DatabaseUtil.deleteEntity(dsName, orgInfo);
        // this.getDASTemplate().deleteEntity(orgInfo);
    }

    /**
     * 获得根机构root organization
     * 
     * @return
     * @throws Exception
     */
    public WfpAfOrganization getRootOrganization() throws Exception {
        String defaultParentCode = "00000000000000000000";
        // step1 : 将20个0作为parentCode去查询主数据机构表
        WfpAfOrganization rootOrgTemplate = new WfpAfOrganizationImpl();
        rootOrgTemplate.setOrgCode(defaultParentCode);
        String tenantID = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tenantID);
        System.out.println(dsName);
        DataObject[] OrgData = DatabaseUtil.queryEntitiesByTemplate(dsName, rootOrgTemplate);
        WfpAfOrganization[] rootOrgData = (WfpAfOrganization[]) DataConnectionUtil.castArray(WfpAfOrganization.class,
                OrgData);
        // WfpAfOrganization[] rootOrgData =
        // this.getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class,
        // rootOrgTemplate);
        if (rootOrgData.length > 0) {
            return rootOrgData[0];
        } else {
            // 查不到数据返回空的WfpAfOrganization对象
            return new WfpAfOrganizationImpl();
        }
    }

    /**
     * 根据用户id获得用户的所有角色列表
     * 
     * @param participantID
     * @return
     * @throws Exception
     */
    public List<WFParticipant> getRoleListByUserId(String participantID) throws Exception {
        List<WFParticipant> rolePartiList = new ArrayList<WFParticipant>();
        Map<String, String> deWeightMap = new HashMap<String, String>(); // 去重map
        // step1 : 查询中间表，根据id获得此id的所有角色列表
        WfpAfPersonmanagement personMgrTemplate = new WfpAfPersonmanagementImpl();
        personMgrTemplate.setPmPersonId(participantID);
        String tenantID = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tenantID);
        DataObject[] queryEntitiesByTemplate = DatabaseUtil.queryEntitiesByTemplate(dsName, personMgrTemplate);
        WfpAfPersonmanagement[] personMgrDatas = (WfpAfPersonmanagement[]) DataConnectionUtil.castArray(
                WfpAfPersonmanagement.class, queryEntitiesByTemplate);
        // WfpAfPersonmanagement[] personMgrDatas =
        // this.getDASTemplate().queryEntitiesByTemplate(
        // WfpAfPersonmanagement.class, personMgrTemplate);
        // step2 : 遍历转换成参与者列表对象
        for (WfpAfPersonmanagement personData : personMgrDatas) {
            String roleId = personData.getPmRoleId();
            String roleName = personData.getPmRoleName();
            String replaceKey = roleId + "-" + roleName; // roleid 与
                                                         // rolename都重复时当做重复的数据不返回
            if (!deWeightMap.containsKey(replaceKey)) {
                WFParticipant roleParticipant = new WFParticipant();
                roleParticipant.setId(roleId);
                roleParticipant.setName(roleName);
                roleParticipant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
                rolePartiList.add(roleParticipant);
                deWeightMap.put(replaceKey, "123");
            }
        }
        deWeightMap.clear();
        return rolePartiList;
    }

    /**
     * 根据id获取外部机构或者内部机构<br>
     * 
     * @param participantID
     * @return
     * @throws Exception
     */
    public WFParticipant findOrgRoleParticipant(String participantID) throws Exception {
        String orgCode = participantID;
        WFParticipant orgParticipant = new WFParticipant();
        orgParticipant.setId(participantID);
        orgParticipant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
        String tenantID = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tenantID);
        try {
            // step1 : 查询本地机构（role）
            WfpAfRole roleTemplate = new WfpAfRoleImpl();
            roleTemplate.setRoRoleId(participantID);
            DatabaseUtil.expandEntity(dsName, roleTemplate);
            // this.getDASTemplate().expandEntity(roleTemplate);
            String roleName = roleTemplate.getRoRoleName();
            if (StringUtils.isNotBlank(roleName)) { // 如果不为空则直接返回
                orgParticipant.setName(roleName);
                return orgParticipant;
            } else {
                // step2 : 查询外部机构
                WfpAfOrganization queryOrgTemplate = new WfpAfOrganizationImpl();
                queryOrgTemplate.setOrgCode(orgCode);
                DatabaseUtil.expandEntity(dsName, queryOrgTemplate);
                // this.getDASTemplate().expandEntity(queryOrgTemplate);
                String orgName = queryOrgTemplate.getOrgName();
                orgParticipant.setName(orgName);
                return orgParticipant;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
    }

    /**
     * 根据租户ID，查询该租户下的所有本地机构(role)参与者列表
     * 
     * @param tenantID
     * @return
     * @throws Exception
     */
    public List<WFParticipant> getRoleParticipantsByTenantID(String tenantID) throws Exception {
        List<WFParticipant> roleParticipants = new ArrayList<WFParticipant>();
        try {
            // step1 : 根据tenantID作为template查询所有符合条件的数据
            WfpAfRole roleTemplate = new WfpAfRoleImpl();
            roleTemplate.setRoTenantid(tenantID);
            String tid = EngineContextManager.current().getTenantIDSilence();
            String dsName = DataConnectionUtil.getTenantIdDataSource(tid);
            DataObject[] Datas = DatabaseUtil.queryEntitiesByTemplate(dsName, roleTemplate);
            WfpAfRole[] roleDatas = (WfpAfRole[]) DataConnectionUtil.castArray(WfpAfRole.class, Datas);
            // WfpAfRole[] roleDatas =
            // this.getDASTemplate().queryEntitiesByTemplate(WfpAfRole.class,
            // roleTemplate);
            // step2 : 将WfpAfRole对象转换为participant对象并返回list
            for (WfpAfRole roleData : roleDatas) {
                WFParticipant roleParticipant = new WFParticipant();
                roleParticipant.setId(roleData.getRoRoleId());
                roleParticipant.setName(roleData.getRoRoleName());
                roleParticipant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
                roleParticipants.add(roleParticipant);
            }
            return roleParticipants;
        } catch (Exception e) {
            throw new Exception();
        }
    }

    /**
     * 根据机构编码获得子机构<br>
     * 此处仅查询外部机构,因为内部机构（role）没有层级关系
     * 
     * @return
     * @throws Exception
     */
    public List<WFParticipant> getChildOrgParticipantList(String orgCode) throws Exception {
        List<WFParticipant> participantList = new ArrayList<WFParticipant>();
        // step1 : 按照template方式查询子机构
        String tid = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tid);
        WfpAfOrganization queryOrgTemplate = new WfpAfOrganizationImpl();
        queryOrgTemplate.setParentOrgCode(orgCode);
        DataObject[] Datas = DatabaseUtil.queryEntitiesByTemplate(dsName, queryOrgTemplate);
        WfpAfOrganization[] orgDatas = (WfpAfOrganization[]) DataConnectionUtil.castArray(WfpAfOrganization.class,
                Datas);
        // WfpAfOrganization[] orgDatas =
        // this.getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class,
        // queryOrgTemplate);
        // step2 : 遍历查询结果，获得participantList
        for (WfpAfOrganization orgData : orgDatas) {
            WFParticipant participantData = new WFParticipant();
            participantData.setId(orgData.getOrgCode());
            participantData.setName(orgData.getOrgName());
            participantData.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
            participantList.add(participantData);
        }
        return participantList;
    }

    /**
     * 获得所有的组织机构信息<br>
     * 2018.12.09修改：只查询外部机构（org）不查询（role）且在查询时分页
     * 
     * @return
     * @throws Exception
     */
    public List<WFParticipant> getAllOrgParticipantList(PageCond pageCond) throws Exception {
        List<WFParticipant> allOrgParticipants = new ArrayList<WFParticipant>();
        // pageCond转换
        com.eos.foundation.PageCond eosPageCond = new PageCondImpl();
        eosPageCond.setBegin(pageCond.getBegin());
        eosPageCond.setCount(pageCond.getCount());
        eosPageCond.setCurrentPage(pageCond.getCurrentPage());
        eosPageCond.setIsCount(pageCond.getIsCount());
        eosPageCond.setTotalPage(pageCond.getTotalPage());
        eosPageCond.setLength(pageCond.getLength());
        String tid = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tid);
        DataObject[] orgDatas = (DataObject[]) DatabaseExt.queryByNamedSqlWithPage(dsName,
                "com.cmcc.participant.ground.service.cmcc_om.getAllOrganizations", eosPageCond,
                new HashMap<String, Object>());
        // step1 : 获得所有的外部机构 (organization)
        // DataObject[] orgDatas =
        // this.getDASTemplate().queryByNamedSqlWithPage(DataObject.class,
        // "com.cmcc.participant.ground.service.cmcc_om.getAllOrganizations",
        // eosPageCond,
        // new HashMap<String, Object>());
        // step2 : 转换成WFParticipant对象并加入list
        for (DataObject data : orgDatas) {
            String orgCode = data.getString("orgcode");
            String orgName = data.getString("orgname");
            WFParticipant participant = new WFParticipant();
            participant.setId(orgCode);
            participant.setName(orgName);
            participant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
            allOrgParticipants.add(participant);
        }
        // // ste2 : 加入顶级外部机构 (organization) 顶级机构查询中有 不用加
        //
        // // step4 : 加入顶级本地机构（role) 内部机构不查了
        return allOrgParticipants;
    }

    /**
     * 根据用户id获得此用户的机构参与者
     * 
     * @param userId
     * @return
     * @throws Exception
     */
    public WFParticipant getParentParticipantByUserID(String userId) throws Exception {
        String parentOrgCode = "";
        WFParticipant parentParticipant = new WFParticipant();
        // step1 : 判断是外部用户(WFP_AF_USERINFO)还是本地用户(WfpAfPersonmanagement)
        WfpAfPersonmanagement personTemplate = new WfpAfPersonmanagementImpl();
        personTemplate.setPmPersonId(userId);
        String tid = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tid);
        DataObject[] npersons = DatabaseUtil.queryEntitiesByTemplate(dsName, personTemplate);
        WfpAfPersonmanagement[] persons = (WfpAfPersonmanagement[]) DataConnectionUtil.castArray(
                WfpAfPersonmanagement.class, npersons);
        // WfpAfPersonmanagement[] persons =
        // this.getDASTemplate().queryEntitiesByTemplate(WfpAfPersonmanagement.class,
        // personTemplate);
        // step2 : 不判断有多少个，拿到了就取第一个WfpAfPersonmanagement
        if (persons.length > 0) {
            WfpAfPersonmanagement person = persons[0];
            // 获得本地用户的机构code
            parentOrgCode = person.getPmRoleId();
        }
        // step3: 如果为空则说明不是外部用户，转而查询本地用户
        if (StringUtils.isBlank(parentOrgCode)) {
            // step3.1 : 判断是外部用户(WFP_AF_USERINFO)还是本地用户(WfpAfPersonmanagement)
            WfpAfUserinfo userInfo = new WfpAfUserinfoImpl();
            userInfo.setUserAccount(userId);
            DatabaseUtil.expandEntity(dsName, userInfo);
            // this.getDASTemplate().expandEntity(userInfo);
            // step3.2 : 预设为外部用户获得外部用户的机构code
            parentOrgCode = userInfo.getOrgCode();
        }
        // step4 : 根据机构ID获取外部机构或者本地机构
        parentParticipant = this.findOrgRoleParticipant(parentOrgCode);
        return parentParticipant;
    }

    /**
     * 根据机构ID获得此机构的父机构参与者
     * 
     * @param userId
     * @return
     * @throws Exception
     */
    public WFParticipant getParentParticipantByOrgCode(String parentOrgCode) throws Exception {
        WFParticipant parentOrgParti = new WFParticipant();
        // step1 : 本地机构对象role没有层级概念所以只查外部机构
        // step2 : 如果本地不存在，获得外部机构对象
        WfpAfOrganization orgTemplate = new WfpAfOrganizationImpl();
        orgTemplate.setParentOrgCode(parentOrgCode);
        String tid = EngineContextManager.current().getTenantIDSilence();
        String dsName = DataConnectionUtil.getTenantIdDataSource(tid);
        DataObject[] dat = DatabaseUtil.queryEntitiesByTemplate(dsName, orgTemplate);
        WfpAfOrganization[] datas = (WfpAfOrganization[]) DataConnectionUtil.castArray(WfpAfOrganization.class, dat);
        // WfpAfOrganization[] datas =
        // this.getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class,
        // orgTemplate);
        if (datas.length > 0) {
            WfpAfOrganization data = datas[0];
            String orgCode = data.getOrgCode();
            String orgName = data.getOrgName();
            parentOrgParti.setId(orgCode);
            parentOrgParti.setName(orgName);
            parentOrgParti.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
        }
        return parentOrgParti;
    }
}
