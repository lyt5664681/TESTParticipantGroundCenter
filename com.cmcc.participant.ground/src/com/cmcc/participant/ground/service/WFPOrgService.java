package com.cmcc.participant.ground.service;

import com.cmcc.participant.ground.CMCCWFOMServiceImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl;
import com.cmcc.wfp.control.system.CustomConfiguration;
import com.eos.foundation.impl.PageCondImpl;
import com.eos.spring.DASDaoSupport;
import com.eos.spring.DASTemplate;
import com.eos.workflow.omservice.WFParticipant;
import com.primeton.workflow.service.notifaction.impl.helper.WFMessageLog;

import commonj.sdo.DataObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class WFPOrgService extends DASDaoSupport
  implements IWFPOrgService
{
  private static WFMessageLog messageLogger = WFMessageLog.getWFMessageLogger(WFPOrgService.class);

  public static WFPOrgService newInstance()
  {
    return new WFPOrgService();
  }

  public void addWFPOrganization(WfpAfOrganization orgInfo)
    throws Exception
  {
    getDASTemplate().insertEntity(orgInfo);
  }

  public void saveWFPOrganization(WfpAfOrganization orgInfo)
    throws Exception
  {
    String orgCode = orgInfo.getOrgCode();
    WfpAfOrganization priKeyTemplate = new WfpAfOrganizationImpl();
    priKeyTemplate.setOrgCode(orgCode);

    int ucount = getDASTemplate().countByTemplate(priKeyTemplate);

    if (ucount > 0)
    {
      messageLogger.log(40000, "************WFPOrg************:机构数据变更: org code" + orgCode);
      deleteWFPOrganization(orgInfo);
    }

    addWFPOrganization(orgInfo);
  }

  public void deleteWFPOrganization(WfpAfOrganization orgInfo)
    throws Exception
  {
    getDASTemplate().deleteEntity(orgInfo);
  }

  public WfpAfOrganization getRootOrganization()
  {
    String defaultParentCode = "00000000000000000000";

    WfpAfOrganization rootOrgTemplate = new WfpAfOrganizationImpl();
    rootOrgTemplate.setOrgCode(defaultParentCode);

    WfpAfOrganization[] rootOrgData = (WfpAfOrganization[])getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class, rootOrgTemplate);
    if (rootOrgData.length > 0) {
      return rootOrgData[0];
    }

    return new WfpAfOrganizationImpl();
  }

  public List<WFParticipant> getRoleListByUserId(String participantID)
    throws Exception
  {
    List rolePartiList = new ArrayList();

    WfpAfPersonmanagement personMgrTemplate = new WfpAfPersonmanagementImpl();
    personMgrTemplate.setPmPersonId(participantID);
    WfpAfPersonmanagement[] personMgrDatas = (WfpAfPersonmanagement[])getDASTemplate().queryEntitiesByTemplate(WfpAfPersonmanagement.class, personMgrTemplate);

    for (WfpAfPersonmanagement personData : personMgrDatas) {
      String roleId = personData.getPmRoleId();
      String roleName = personData.getPmRoleName();

      WFParticipant roleParticipant = new WFParticipant();
      roleParticipant.setId(roleId);
      roleParticipant.setName(roleName);
      roleParticipant.setTypeCode("organization");

      rolePartiList.add(roleParticipant);
    }

    return rolePartiList;
  }

  public WFParticipant findOrgRoleParticipant(String participantID)
    throws Exception
  {
    String orgCode = participantID;
    WFParticipant orgParticipant = new WFParticipant();
    orgParticipant.setId(participantID);
    orgParticipant.setTypeCode("organization");
    try
    {
      WfpAfRole roleTemplate = new WfpAfRoleImpl();
      roleTemplate.setRoRoleId(participantID);
      getDASTemplate().expandEntity(roleTemplate);

      String roleName = roleTemplate.getRoRoleName();
      if (StringUtils.isNotBlank(roleName)) {
        orgParticipant.setName(roleName);
        return orgParticipant;
      }

      WfpAfOrganization queryOrgTemplate = new WfpAfOrganizationImpl();
      queryOrgTemplate.setOrgCode(orgCode);
      getDASTemplate().expandEntity(queryOrgTemplate);
      String orgName = queryOrgTemplate.getOrgName();

      orgParticipant.setName(orgName);
      return orgParticipant;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }throw new Exception();
  }

  public List<WFParticipant> getRoleParticipantsByTenantID(String tenantID)
    throws Exception
  {
    List roleParticipants = new ArrayList();
    try
    {
      WfpAfRole roleTemplate = new WfpAfRoleImpl();
      roleTemplate.setRoTenantid(tenantID);
      WfpAfRole[] roleDatas = (WfpAfRole[])getDASTemplate().queryEntitiesByTemplate(WfpAfRole.class, roleTemplate);
      DASTemplate dasTemplate = this.getDASTemplate();
      RoleService roleService = (RoleService) getRoleService(tenantID);
      Object[] Roles = roleService.queryRole(tenantID,dasTemplate);
      // step2 : 将WfpAfRole对象转换为participant对象并返回list
      for (Object object : Roles) {
       WFParticipant roleParticipant = new WFParticipant();
       DataObject dataObj = (DataObject) object;
       roleParticipant.setId(dataObj.getString("roRoleId"));
       roleParticipant.setName(dataObj.getString("roRoleName"));
       roleParticipant.setTypeCode(CMCCWFOMServiceImpl.PARTICIPANTTYPE_ORGANIZATION);
       roleParticipants.add(roleParticipant);
      }

      return roleParticipants; 
      } catch (Exception e) {
    }
    throw new Exception();
  }

  public List<WFParticipant> getChildOrgParticipantList(String orgCode)
    throws Exception
  {
    List participantList = new ArrayList();

    WfpAfOrganization queryOrgTemplate = new WfpAfOrganizationImpl();
    queryOrgTemplate.setParentOrgCode(orgCode);

    WfpAfOrganization[] orgDatas = (WfpAfOrganization[])getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class, queryOrgTemplate);

    for (WfpAfOrganization orgData : orgDatas) {
      WFParticipant participantData = new WFParticipant();
      participantData.setId(orgData.getOrgCode());
      participantData.setName(orgData.getOrgName());
      participantData.setTypeCode("organization");

      participantList.add(participantData);
    }

    return participantList;
  }

  public List<WFParticipant> getAllOrgParticipantList(com.primeton.workflow.api.PageCond pageCond)
    throws Exception
  {
    List allOrgParticipants = new ArrayList();

    com.eos.foundation.PageCond eosPageCond = new PageCondImpl();
    eosPageCond.setBegin(pageCond.getBegin());
    eosPageCond.setCount(pageCond.getCount());
    eosPageCond.setCurrentPage(pageCond.getCurrentPage());
    eosPageCond.setIsCount(pageCond.getIsCount());
    eosPageCond.setTotalPage(pageCond.getTotalPage());
    eosPageCond.setLength(pageCond.getLength());

    DataObject[] orgDatas = (DataObject[])getDASTemplate().queryByNamedSqlWithPage(DataObject.class, 
      "com.cmcc.participant.ground.service.cmcc_om.getAllOrganizations", eosPageCond, new HashMap());

    for (DataObject data : orgDatas) {
      String orgCode = data.getString("orgcode");
      String orgName = data.getString("orgname");

      WFParticipant participant = new WFParticipant();
      participant.setId(orgCode);
      participant.setName(orgName);
      participant.setTypeCode("organization");
      allOrgParticipants.add(participant);
    }

    return allOrgParticipants;
  }

  public WFParticipant getParentParticipantByUserID(String userId)
    throws Exception
  {
    String parentOrgCode = "";
    WFParticipant parentParticipant = new WFParticipant();

    WfpAfPersonmanagement personTemplate = new WfpAfPersonmanagementImpl();
    personTemplate.setPmPersonId(userId);
    WfpAfPersonmanagement[] persons = (WfpAfPersonmanagement[])getDASTemplate().queryEntitiesByTemplate(WfpAfPersonmanagement.class, personTemplate);

    if (persons.length > 0) {
      WfpAfPersonmanagement person = persons[0];

      parentOrgCode = person.getPmRoleId();
    }

    if (StringUtils.isBlank(parentOrgCode))
    {
      WfpAfUserinfo userInfo = new WfpAfUserinfoImpl();
      userInfo.setUserAccount(userId);
      getDASTemplate().expandEntity(userInfo);

      parentOrgCode = userInfo.getOrgCode();
    }

    parentParticipant = findOrgRoleParticipant(parentOrgCode);
    return parentParticipant;
  }

  public WFParticipant getParentParticipantByOrgCode(String parentOrgCode)
    throws Exception
  {
    WFParticipant parentOrgParti = new WFParticipant();

    WfpAfOrganization orgTemplate = new WfpAfOrganizationImpl();
    orgTemplate.setParentOrgCode(parentOrgCode);

    WfpAfOrganization[] datas = (WfpAfOrganization[])getDASTemplate().queryEntitiesByTemplate(WfpAfOrganization.class, orgTemplate);
    if (datas.length > 0) {
      WfpAfOrganization data = datas[0];
      String orgCode = data.getOrgCode();
      String orgName = data.getOrgName();

      parentOrgParti.setId(orgCode);
      parentOrgParti.setName(orgName);
      parentOrgParti.setTypeCode("organization");
    }

    return parentOrgParti;
  }
  
	//===============================================================
  public static  Object getRoleService(String tenantId) {
      String className = CustomConfiguration.get("BpsRoleSort." + tenantId);
      return (RoleService)getService(className);
  }
  
  public static Object getService(String className) {
      try {
          return Class.forName(className).newInstance();
      } catch (InstantiationException e) {
          
      } catch (IllegalAccessException e) {
         
      } catch (ClassNotFoundException e) {
         
      }
      return null;
  }
}