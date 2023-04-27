package com.cmcc.participant.ground;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.service.IWFPOrgService;
import com.cmcc.participant.ground.service.IWFPUserService;
import com.cmcc.participant.ground.service.WFPOrgCacheService;
import com.cmcc.participant.ground.service.WFPUserCacheService;
import com.eos.data.datacontext.DataContextManager;
import com.eos.data.datacontext.IMUODataContext;
import com.eos.workflow.omservice.IWFOMService;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.bos.api.redis.RedisThreadUtil;
import com.primeton.workflow.api.PageCond;
import com.primeton.workflow.api.ParticipantType;
import com.primeton.workflow.api.WFOMException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class CMCCWFOMServiceImpl implements IWFOMService {
	public static final String PARTICIPANTTYPE_PERSON = "person";
	public static final String PARTICIPANTTYPE_ORGANIZATION = "organization";
	public static Map<String, ParticipantType> participantTypes = new HashMap();

	public CMCCWFOMServiceImpl() {
		try {
			init();
		} catch (WFOMException e) {
			e.printStackTrace();
		}
	}

	private void init() throws WFOMException {
		ParticipantType ptPerson = null;
		ptPerson = new ParticipantType('P', "person", "个人", "个人", false, 1, true, null, false, null);

		ParticipantType ptOrganization = null;
		List organizationChildParticipantTypeCodes = new ArrayList();
		organizationChildParticipantTypeCodes.add("person");
		organizationChildParticipantTypeCodes.add("organization");

		ptOrganization = new ParticipantType('O', "organization", "组织机构", "组织机构", true, 4, false, organizationChildParticipantTypeCodes, false, null);

		participantTypes.put("person", ptPerson);
		participantTypes.put("organization", ptOrganization);
	}

	public WFParticipant findParticipantByID(String typeCode, String participantID) {
		// ----------《组织接口调用计数zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《组织接口调用计数zjc》----------
		WFParticipant participantInfo = new WFParticipant();
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();
		IWFPUserService userService = WFPUserCacheService.getInstance();

		ParticipantType partType = (ParticipantType) participantTypes.get(typeCode);
		if (partType == null) {
			return null;
		}

		if ("person".equals(typeCode)) {
			try {
				participantInfo = userService.getParticipantByID(participantID);
				participantInfo.setTypeCode("person");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("organization".equals(typeCode)) {
			try {
				participantInfo = orgService.findOrgRoleParticipant(participantID);
				participantInfo.setTypeCode("organization");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("findParticipantByID", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("findParticipantByID", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return participantInfo;
	}

	public List<WFParticipant> findRootParticipants(String typeCode) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		if (!"organization".equals(typeCode)) {
			return new ArrayList();
		}

		WFParticipant rootOrgParticipant = new WFParticipant();
		try {
			IWFPOrgService orgService = WFPOrgCacheService.getInstance();
			WfpAfOrganization orgInfo = orgService.getRootOrganization();

			String orgCode = orgInfo.getOrgCode();
			String orgName = orgInfo.getOrgName();

			rootOrgParticipant.setId(orgCode);
			rootOrgParticipant.setName(orgName);
			rootOrgParticipant.setTypeCode("organization");
		} catch (Exception e) {
			e.printStackTrace();
		}

		WFParticipant rootRoleParticipant = new WFParticipant();
		rootRoleParticipant.setId("role");
		rootRoleParticipant.setName("角色");
		rootRoleParticipant.setTypeCode("organization");

		List partiList = new ArrayList();
		partiList.add(rootOrgParticipant);
		partiList.add(rootRoleParticipant);
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("findRootParticipants", tenantID, partiList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("findRootParticipants", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("findRootParticipants", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return partiList;
	}

	public List<WFParticipant> getAllChildParticipants(String typeCode, String participantID) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		// bps角色排序
		List partiList = new LinkedList();

		IWFPUserService userService = WFPUserCacheService.getInstance();
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();

		if (!"organization".equals(typeCode)) {
			return new ArrayList();
		}

		if ("role".equals(participantID)) {
			IMUODataContext muo = DataContextManager.current().getMUODataContext();
			String tenantID = "";
			try {
				tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				// bps角色排序
				partiList.addAll(orgService.getRoleParticipantsByTenantID(tenantID));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			String orgCode = participantID;

			List childOrgParticipants = new ArrayList();
			try {
				childOrgParticipants.addAll(orgService.getChildOrgParticipantList(orgCode));
			} catch (Exception e) {
				e.printStackTrace();
			}

			List childPersonParticipants = new ArrayList();
			try {
				childPersonParticipants.addAll(userService.getParticipantByOrgId(orgCode));
			} catch (Exception e) {
				e.printStackTrace();
			}

			partiList.addAll(childOrgParticipants);
			partiList.addAll(childPersonParticipants);
		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getAllChildParticipants", tenantID, partiList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getAllChildParticipants", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getAllChildParticipants", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return partiList;
	}

	public List<WFParticipant> getAllParentParticipants(String typeCode, String participantID) {
		List partiList = new ArrayList();
		return partiList;
	}

	public List<WFParticipant> getChildParticipants(String typeCode, String participantID, String childType) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		List partiList = new ArrayList();
		IWFPUserService userService = WFPUserCacheService.getInstance();
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();

		if (!"organization".equals(typeCode)) {
			return partiList;
		}

		String orgCode = participantID;
		if ("organization".equals(childType)) {
			try {
				partiList.addAll(orgService.getChildOrgParticipantList(orgCode));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("person".equals(childType)) {
			try {
				partiList.addAll(userService.getParticipantByOrgId(orgCode));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getChildParticipants", tenantID, partiList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getChildParticipants", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getChildParticipants", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return partiList;
	}

	public List<WFParticipant> getJointChildParticipant(String jointParticipantType, List<String> participantIDList) {
		List partiList = new ArrayList();
		return partiList;
	}

	public List<WFParticipant> getParentParticipants(String typeCode, String participantID, String parentType) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		List partiList = new ArrayList();
		WFParticipant parentParticipant = new WFParticipant();
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();

		if (!"organization".equals(parentType)) {
			return partiList;
		}

		try {
			if ("organization".equals(typeCode)) {
				parentParticipant = orgService.getParentParticipantByOrgCode(participantID);
			} else if ("person".equals(typeCode)) {
				parentParticipant = orgService.getParentParticipantByUserID(participantID);
			}
			partiList.add(parentParticipant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getParentParticipants", tenantID, partiList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getParentParticipants", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getParentParticipants", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return partiList;
	}

	public List<WFParticipant> getParticipantScope(String typeCode, String participantID) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();
		List partiList = new ArrayList();

		if (!"person".equals(typeCode)) {
			return new ArrayList();
		}

		WFParticipant selfParticipant = findParticipantByID("person", participantID);

		if ((selfParticipant == null) || (StringUtils.isBlank(selfParticipant.getId()))) {
			selfParticipant.setId(participantID);
			selfParticipant.setName(null);
			selfParticipant.setTypeCode("person");
		}
		partiList.add(selfParticipant);
		try {
			List roleParticipants = orgService.getRoleListByUserId(participantID);
			partiList.addAll(roleParticipants);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getParticipantScope", tenantID, partiList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getParticipantScope", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getParticipantScope", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return partiList;
	}

	public ParticipantType getParticipantType(String typeCode) {
		return (ParticipantType) participantTypes.get(typeCode);
	}

	public List<ParticipantType> getParticipantTypes() {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		List participantTypeList = null;

		if (participantTypes.size() > 0) {
			participantTypeList = new ArrayList();

			ParticipantType participantType = null;

			Set participantTypeSets = participantTypes.keySet();
			Iterator i = participantTypeSets.iterator();

			while (i.hasNext()) {
				participantType = (ParticipantType) participantTypes.get(i.next());
				participantTypeList.add(participantType);
			}
		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getParticipantTypes", tenantID, participantTypeList.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getParticipantTypes", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getParticipantTypes", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return participantTypeList;
	}

	public List<WFParticipant> getParticipants(String typeCode, PageCond pc) {
		// ----------《组织接口耗时判断时间开始zjc》----------
		Long startMillisecond = System.currentTimeMillis();// 组织接口耗时判断时间开始
		// ----------《组织接口耗时判断时间开始zjc》----------
		List resultParticipants = new ArrayList();
		IWFPOrgService orgService = WFPOrgCacheService.getInstance();
		try {
			if ("organization".equals(typeCode)) {
				List allOrgParticipants = orgService.getAllOrgParticipantList(pc);
				resultParticipants.addAll(allOrgParticipants);
			} else {
				if ("person".equals(typeCode)) {
					return new ArrayList();
				}

				return new ArrayList();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ----------《记录组织接口参与者数量zjc》----------
		IMUODataContext muo = DataContextManager.current().getMUODataContext();
		String tenantID = "";
		try {
			tenantID = (String) muo.get("userObject/attributes/TENANT_ID");
		} catch (Exception e) {
			e.printStackTrace();
		}
		RedisThreadUtil.orgInterfaceParSize("getParticipants", tenantID, resultParticipants.size() + "");
		RedisThreadUtil.orgInterfaceAdd("findParticipantByID", tenantID);// 组织机构接口调用频次
		// ----------《记录组织接口参与者数量zjc》----------
		// ----------《组织接口耗时判断zjc》----------
		Long endMillisecond = System.currentTimeMillis();
		String timeMillisecond = endMillisecond - startMillisecond + "";
		RedisThreadUtil.orgInterfaceTimeAvgNumAdd("getParticipants", tenantID);
		RedisThreadUtil.orgInterfaceTimeAvgMsecAdd("getParticipants", tenantID, timeMillisecond);
		// ----------《组织接口耗时判断zjc》----------
		return resultParticipants;
	}
}