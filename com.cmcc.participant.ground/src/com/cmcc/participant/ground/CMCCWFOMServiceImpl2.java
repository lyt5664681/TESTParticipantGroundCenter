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

public class CMCCWFOMServiceImpl2
  implements IWFOMService
{
  public static final String PARTICIPANTTYPE_PERSON = "person";
  public static final String PARTICIPANTTYPE_ORGANIZATION = "organization";
  public static Map<String, ParticipantType> participantTypes = new HashMap();

  public CMCCWFOMServiceImpl2() {
    try {
      init();
    } catch (WFOMException e) {
      e.printStackTrace();
    }
  }

  private void init()
    throws WFOMException
  {
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

  public WFParticipant findParticipantByID(String typeCode, String participantID)
  {
    WFParticipant participantInfo = new WFParticipant();
    IWFPOrgService orgService = WFPOrgCacheService.getInstance();
    IWFPUserService userService = WFPUserCacheService.getInstance();

    ParticipantType partType = (ParticipantType)participantTypes.get(typeCode);
    if (partType == null) {
      return null;
    }

    if ("person".equals(typeCode))
    {
      try
      {
        participantInfo = userService.getParticipantByID(participantID);
        participantInfo.setTypeCode("person");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    else if ("organization".equals(typeCode))
    {
      try
      {
        participantInfo = orgService.findOrgRoleParticipant(participantID);
        participantInfo.setTypeCode("organization");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return participantInfo;
  }

  public List<WFParticipant> findRootParticipants(String typeCode)
  {
    if (!"organization".equals(typeCode)) {
      return new ArrayList();
    }

    WFParticipant rootOrgParticipant = new WFParticipant();
    try
    {
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
    return partiList;
  }

  public List<WFParticipant> getAllChildParticipants(String typeCode, String participantID)
  {
	//bps角色排序
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
        tenantID = (String)muo.get("userObject/attributes/TENANT_ID");
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      try
      {
    	//bps角色排序
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
    return partiList;
  }

  public List<WFParticipant> getAllParentParticipants(String typeCode, String participantID)
  {
    List partiList = new ArrayList();
    return partiList;
  }

  public List<WFParticipant> getChildParticipants(String typeCode, String participantID, String childType)
  {
    List partiList = new ArrayList();
    IWFPUserService userService = WFPUserCacheService.getInstance();
    IWFPOrgService orgService = WFPOrgCacheService.getInstance();

    if (!"organization".equals(typeCode)) {
      return partiList;
    }

    String orgCode = participantID;
    if ("organization".equals(childType))
    {
      try
      {
        partiList.addAll(orgService.getChildOrgParticipantList(orgCode));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    else if ("person".equals(childType))
    {
      try
      {
        partiList.addAll(userService.getParticipantByOrgId(orgCode));
      } catch (Exception e) {
        e.printStackTrace();
      }

    }

    return partiList;
  }

  public List<WFParticipant> getJointChildParticipant(String jointParticipantType, List<String> participantIDList)
  {
    List partiList = new ArrayList();
    return partiList;
  }

  public List<WFParticipant> getParentParticipants(String typeCode, String participantID, String parentType)
  {
    List partiList = new ArrayList();
    WFParticipant parentParticipant = new WFParticipant();
    IWFPOrgService orgService = WFPOrgCacheService.getInstance();

    if (!"organization".equals(parentType)) {
      return partiList;
    }

    try
    {
      if ("organization".equals(typeCode))
      {
        parentParticipant = orgService.getParentParticipantByOrgCode(participantID);
      } else if ("person".equals(typeCode))
      {
        parentParticipant = orgService.getParentParticipantByUserID(participantID);
      }
      partiList.add(parentParticipant);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return partiList;
  }

  public List<WFParticipant> getParticipantScope(String typeCode, String participantID)
  {
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

    return partiList;
  }

  public ParticipantType getParticipantType(String typeCode)
  {
    return (ParticipantType)participantTypes.get(typeCode);
  }

  public List<ParticipantType> getParticipantTypes()
  {
    List participantTypeList = null;

    if (participantTypes.size() > 0) {
      participantTypeList = new ArrayList();

      ParticipantType participantType = null;

      Set participantTypeSets = participantTypes.keySet();
      Iterator i = participantTypeSets.iterator();

      while (i.hasNext()) {
        participantType = (ParticipantType)participantTypes.get(i.next());
        participantTypeList.add(participantType);
      }
    }

    return participantTypeList;
  }

  public List<WFParticipant> getParticipants(String typeCode, PageCond pc)
  {
    List resultParticipants = new ArrayList();
    IWFPOrgService orgService = WFPOrgCacheService.getInstance();
    try
    {
      if ("organization".equals(typeCode))
      {
        List allOrgParticipants = orgService.getAllOrgParticipantList(pc);
        resultParticipants.addAll(allOrgParticipants); } else {
        if ("person".equals(typeCode))
        {
          return new ArrayList();
        }

        return new ArrayList();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return resultParticipants;
  }
}