package com.cmcc.participant.ground.resolve;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl;
import com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl;
import com.cmcc.participant.ground.service.IWFPOrgService;
import com.cmcc.participant.ground.service.IWFPUserService;
import com.cmcc.participant.ground.service.WFPUserPositionService;
import com.eos.spring.BeanFactory;

/**
 * 初始化组织机构人员数据
 * 
 * @author YunTao.Li
 * 
 */
public class InitializeOMData {
	public static final String ELEMENTNAME_INPUTCOLLECTION = "INPUTCOLLECTION";
	public static final String ELEMENTNAME_INPUTCOLLECTION_ITEM = "INPUTCOLLECTION_ITEM";

	/**
	 * document对象,通过不同的构造方法初始化
	 */
	private Document document;

	/**
	 * 通过文件方式初始化document
	 */
	public InitializeOMData(String filePath) {
		File inputXmlFile = new File(filePath);
		SAXReader saxReader = new SAXReader();
		try {
			this.document = saxReader.read(inputXmlFile);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public InitializeOMData(String msgText, String charsetName) {
		SAXReader saxReader = new SAXReader();
		try {
			this.document = saxReader.read(new ByteArrayInputStream(msgText.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 初始化内部用户入库
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public void initInnerUserData() throws Exception {
		try {
			IWFPUserService userService = BeanFactory.newInstance().getBean("WFPUserServiceBean");
			WFPUserPositionService userPositionService = BeanFactory.newInstance()
					.getBean("WFPUserPositionServiceBean");

			// step1 : 解析根节点以及公共部分节点比如body或者header
			List<Element> itemListElement = this.parseOMXmlPublic();

			// step2 : 解析内部用户Item
			List<Map<String, Object>> innerUserDataList = this.parseOMXmlInnerUserItem(itemListElement);

			// step2.1 :遍历入库内部用户
			for (Map<String, Object> innerUserMap : innerUserDataList) {
				// step2.1.1 : 入库内部用户
				WfpAfUserinfo userInfo = (WfpAfUserinfo) innerUserMap.get("userInfo");
				String userAccount = userInfo.getUserAccount();
				String system_code=userInfo.getSystemCode().toUpperCase();
				//sjk 20190923 start 获取内部用户状态
				String userStatus = userInfo.getUserStatus();
				int uStatus = Integer.parseInt(userStatus);
				//sjk 20190923 end
				if(system_code.equals("WFP")){
					//sjk 20190923 start 判断内部用户状态不为0的都视为失效账号
					if(uStatus != 0){
						Date currentTime = new Date();
						SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String dateString  = formatter.format(currentTime);
						userInfo.setAttribute2(dateString);
					}
					//sjk 20190923 end
					userService.saveWFPUser(userInfo);
					// step2.1.2 : 入库内部用户岗位数据
					List<WfpAfUserposition> userPositionList = (List<WfpAfUserposition>) innerUserMap
							.get("userPositionList" + userAccount);
					userPositionService.saveUserPositions(userPositionList);
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 初始化外部用户并入库
	 * 
	 * @throws Exception
	 */
	public void initOutsideUserData() throws Exception {
		IWFPUserService userService = BeanFactory.newInstance().getBean("WFPUserServiceBean");

		// step1 : 解析根节点以及公共部分节点比如body或者header
		List<Element> itemListElement = this.parseOMXmlPublic();

		// step2 : 解析外部用户Item
		List<WfpAfUserinfo> outsideUserDataList = this.parseOMXmlOutsideUserItem(itemListElement);

		// step2.1 : 遍历入库外部用户
		for (WfpAfUserinfo outsideUserData : outsideUserDataList) {

			// step2.1.1 : 入库外部用户
			WfpAfUserinfo userInfo = outsideUserData;
			String system_code=userInfo.getSystemCode().toUpperCase();
			//sjk 20190923 start 获取内部用户状态
			String userStatus = userInfo.getUserStatus();
			int uStatus = Integer.parseInt(userStatus);
			//sjk 20190923 end
			if(system_code.equals("WFP")){
				//sjk 20190923 start 判断内部用户状态不为0的都视为失效账号
				if(uStatus != 0){
					Date currentTime = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String dateString  = formatter.format(currentTime);
					userInfo.setAttribute2(dateString);
				}
				//sjk 20190923 end
				userService.saveWFPUser(userInfo);
			}
			
		}
	}

	/**
	 * 初始化机构并入库
	 * 
	 * @throws Exception
	 */
	public void initOrganizationData() throws Exception {
		IWFPOrgService orgService = BeanFactory.newInstance().getBean("WFPOrgServiceBean");

		// step1 : 解析根节点以及公共部分节点比如body或者header
		List<Element> itemListElement = this.parseOMXmlPublic();

		// step2 : 解析外部用户Item
		List<WfpAfOrganization> orgDataList = this.parseOMXmlOrganizationItem(itemListElement);

		// step2.1 : 遍历入库外部用户
		for (WfpAfOrganization orgData : orgDataList) {

			// step2.1.1 : 入库外部用户
			WfpAfOrganization orgInfo = orgData;
			orgService.saveWFPOrganization(orgInfo);
		}
	}

	/**
	 * 解析公共部分的xml,并返回Item部分的list
	 * 
	 * @param filePath
	 */
	@SuppressWarnings("unchecked")
	private List<Element> parseOMXmlPublic() {
		// step1 : 获得根节点
		Element rootElement = this.document.getRootElement();

		// step2 : 获得body节点
		Element bodyElement = rootElement.element("Body");

		// step3 : 获得InputParameters节点
		Element paramElement = null;
		if (bodyElement != null) {
			paramElement = bodyElement.element("InputParameters");
		} else {
			paramElement = (Element) rootElement.clone();
		}

		// step4 : 获得INPUTCOLLECTION节点
		Element inputCollectionElement = paramElement.element(ELEMENTNAME_INPUTCOLLECTION);

		// step5 : 获得数据节点(INPUTCOLLECTION_ITEM)集合,并遍历
		List<Element> itemListElement = inputCollectionElement.elements(ELEMENTNAME_INPUTCOLLECTION_ITEM);

		return itemListElement;
	}

	/**
	 * 解析内部用户item
	 * 
	 * @throws Exception
	 */
	private List<Map<String, Object>> parseOMXmlInnerUserItem(List<Element> itemListElement) throws Exception {

		/**
		 * 本次解析的所有用户对象以及对应用户的岗位列表
		 * */
		List<Map<String, Object>> innerUserDataList = new ArrayList<Map<String, Object>>();

		/**
		 * 一次性返回用户对象以及该用户的岗位列表
		 * */
		Map<String, Object> innerUserDataMap = new HashMap<String, Object>();

		// step1 : 遍历item Element列表
		for (int i = 0; i < itemListElement.size(); i++) {
			Element itemElement = itemListElement.get(i);

			// step7.1 保存userinfo数据
			WfpAfUserinfo userInfo = this.parseInnerUserObject(itemElement);
			String userAccount = userInfo.getUserAccount();
			innerUserDataMap.put("userInfo", userInfo); // 放入用户数据

			List<WfpAfUserposition> userPositionList = this.parseInnerUserPositionObject(itemElement, userAccount);
			innerUserDataMap.put("userPositionList" + userAccount, userPositionList); // 放入用户岗位列表数据

			innerUserDataList.add(innerUserDataMap); // 将数据加入list
			innerUserDataMap = new HashMap<String, Object>();
		}

		return innerUserDataList;
	}

	/**
	 * 解析外部用户Item
	 * 
	 * @throws Exception
	 */
	private List<WfpAfUserinfo> parseOMXmlOutsideUserItem(List<Element> itemListElement) throws Exception {
		List<WfpAfUserinfo> outsideUserDataList = new ArrayList<WfpAfUserinfo>();

		// step1 : 遍历item Element列表
		for (int i = 0; i < itemListElement.size(); i++) {
			Element itemElement = itemListElement.get(i);
			// 将标签转换为对象
			WfpAfUserinfo userInfo = this.parseOutsideUserObject(itemElement);
			outsideUserDataList.add(userInfo);
		}

		return outsideUserDataList;
	}

	/**
	 * 解析组织机构Item
	 * 
	 * @throws Exception
	 */
	private List<WfpAfOrganization> parseOMXmlOrganizationItem(List<Element> itemListElement) throws Exception {
		List<WfpAfOrganization> organizationDataList = new ArrayList<WfpAfOrganization>();

		// step1 : 遍历item Element列表
		for (int i = 0; i < itemListElement.size(); i++) {
			Element itemElement = itemListElement.get(i);
			// 将标签转换为对象
			WfpAfOrganization orgInfo = this.parseOrganizationObject(itemElement);

			organizationDataList.add(orgInfo);
		}

		return organizationDataList;
	}

	/**
	 * 私有方法,将Element Item(内部用户)转换成User对象
	 * 
	 * @param itemElement
	 */
	private WfpAfUserinfo parseInnerUserObject(Element itemElement) throws Exception {
		try {
			String priKey = itemElement.elementText("PRI_KEY");
			String systemCode = itemElement.elementText("SYSTEM_CODE");
			String userId = itemElement.elementText("USER_ID");
			String userAccount = itemElement.elementText("USER_ACCOUNT");// 用户账号
			String givenName = itemElement.elementText("GIVEN_NAME"); // 用户名
			String familyName = itemElement.elementText("FAMILY_NAME");
			String companyId = itemElement.elementText("COMPANY_ID");
			String companyCode = itemElement.elementText("COMPANY_CODE");
			String companyName = itemElement.elementText("COMPANY_NAME");
			String orgId = itemElement.elementText("ORGANIZATION_ID"); // 所属的组织机构ID
			String orgCode = itemElement.elementText("ORGANIZATION_CODE");// 所属的组织机构code
			String orgName = itemElement.elementText("ORGANIZATION_NAME"); // 所属的组织结构名称
			String parentOrgId = itemElement.elementText("PARENT_ORGANIZATION_ID");
			String parentOrgCode = itemElement.elementText("PARENT_ORGANIZATION_CODE");
			String parentOrgName = itemElement.elementText("PARENT_ORGANIZATION_NAME");
			String userEmail = itemElement.elementText("MAIL_ADDRESS"); // 用户email
			String effectiveStartDate = itemElement.elementText("EFFECTIVE_START_DATE"); // 用户有效期开始时间
			String effectiveEndDate = itemElement.elementText("EFFECTIVE_END_DATE"); // 用户有效期结束时间
			String userStatus = itemElement.elementText("USER_STATUS_CODE");
			String lastUpdateDate = itemElement.elementText("LAST_UPDATE_DATE");
			String lastUpdateLogin = itemElement.elementText("LAST_UPDATE_LOGIN");
			String employeeNumber = itemElement.elementText("EMPLOYEE_NUMBER");
			String attribute1 = itemElement.elementText("ATTRIBUTE1");
			String personType = "inner";

			WfpAfUserinfo userInfo = new WfpAfUserinfoImpl();
			userInfo.setPriKey(priKey);
			userInfo.setSystemCode(systemCode);
			userInfo.setUserId(userId);
			userInfo.setUserAccount(userAccount);
			userInfo.setGivenName(givenName);
			userInfo.setFamilyName(familyName);
			userInfo.setPersonType(personType);
			userInfo.setCompanyId(companyId);
			userInfo.setCompanyCode(companyCode);
			userInfo.setCompanyName(companyName);
			userInfo.setOrgId(orgId);
			userInfo.setOrgCode(orgCode);
			userInfo.setOrgName(orgName);
			userInfo.setParentOrgId(parentOrgId);
			userInfo.setParentOrgCode(parentOrgCode);
			userInfo.setParentOrgName(parentOrgName);
			userInfo.setUserEmail(userEmail);
			userInfo.setEffectiveStartDate(effectiveStartDate);
			userInfo.setEffectiveStartDate(effectiveStartDate);
			userInfo.setEffectiveEndDate(effectiveEndDate);
			userInfo.setUserStatus(userStatus);
			userInfo.setLastUpdateDate(lastUpdateDate);
			userInfo.setLastUpdateLogin(lastUpdateLogin);
			userInfo.setEmployeeNumber(employeeNumber);
			userInfo.setAttribute1(attribute1);

			return userInfo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	/**
	 * 私有方法,将Element Item(外部用户)转换成User对象
	 * 
	 * @param itemElement
	 */
	private WfpAfUserinfo parseOutsideUserObject(Element itemElement) throws Exception {
		try {
			String priKey = itemElement.elementText("PRI_KEY");
			String systemCode = itemElement.elementText("SYSTEM_CODE");
			String systemBelongCode = itemElement.elementText("SYSTEM_BELONG_CODE");
			String externalUserId = itemElement.elementText("EXTERNAL_USER_ID");
			String externalUserAccount = itemElement.elementText("EXTERNAL_USER_ACCOUNT");// 用户账号
			String userName = itemElement.elementText("USER_NAME");// 用户账号
			String provinceCode = itemElement.elementText("PROVINCE_CODE");
			String province = itemElement.elementText("PROVINCE");
			String unitName = itemElement.elementText("UNIT_NAME");
			String internalOrgCode = itemElement.elementText("INTERNAL_ORGANIZATION_CODE"); // 内部机构code
			String externalOrgCode = itemElement.elementText("EXTERNAL_ORGANIZATION_CODE"); // 外部机构code
			String phoneNumber = itemElement.elementText("PHONE_NUMBER"); // 所属的组织结构名称
			String emailAddress = itemElement.elementText("EMAIL_ADDRESS");
			String graduateInstitution = itemElement.elementText("GRADUATE_INSTITUTION");
			String position = itemElement.elementText("POSITION");
			String levelCode = itemElement.elementText("LEVEL_CODE");
			String level = itemElement.elementText("LEVEL");
			String isAssociated = itemElement.elementText("IS_ASSOCIATED");
			String associateUser = itemElement.elementText("ASSOCIATE_USER");
			String userStatusCode = itemElement.elementText("USER_STATUS_CODE");
			String workOrderNumber = itemElement.elementText("WORK_ORDER_NUMBER");
			String creationDate = itemElement.elementText("CREATION_DATE");
			String lastUpdateDate = itemElement.elementText("LAST_UPDATE_DATE");
			String attribute1 = itemElement.elementText("ATTRIBUTE1");
			String personType = "outside";

			WfpAfUserinfo userInfo = new WfpAfUserinfoImpl();
			userInfo.setUserAccount(externalUserAccount);
			userInfo.setPriKey(priKey);
			userInfo.setSystemCode(systemCode);
			userInfo.setSystemBelongCode(systemBelongCode);
			userInfo.setExternalUserId(externalUserId);
			userInfo.setExternalUserAccount(externalUserAccount);
			userInfo.setUserName(userName);
			userInfo.setGivenName(userName);
			userInfo.setProvince(province);
			userInfo.setPersonType(personType);// 外部用户outside
			userInfo.setProvinceCode(provinceCode);
			userInfo.setUnitName(unitName);
			userInfo.setInternalOrgCode(internalOrgCode);
			userInfo.setExternalOrgCode(externalOrgCode);
			userInfo.setPhoneNumber(phoneNumber);
			userInfo.setEmailAddress(emailAddress);
			userInfo.setGraduateInstitution(graduateInstitution);
			userInfo.setPosition(position);
			userInfo.setLevelCode(levelCode);
			userInfo.setUsLevel(level);
			userInfo.setIsAssociated(isAssociated);
			userInfo.setAssociateUser(associateUser);
			userInfo.setUserStatus(userStatusCode);
			userInfo.setWorkOrderNumber(workOrderNumber);
			userInfo.setCreationDate(creationDate);
			userInfo.setLastUpdateDate(lastUpdateDate);
			userInfo.setAttribute1(attribute1);

			return userInfo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	/**
	 * 私有方法,将获取Item中的用户的工作组
	 * 
	 * @param itemElement
	 */
	@SuppressWarnings("unchecked")
	private List<WfpAfUserposition> parseInnerUserPositionObject(Element itemElement, String userAccount) {
		List<WfpAfUserposition> positionList = new ArrayList<WfpAfUserposition>();

		// step1 : 首先找到WORK_ORG_GROUP 节点
		Element workGroupElement = itemElement.element("WORK_ORG_GROUP");

		// step2 : 然后获取WORK_ORG_GROUP_ITEM节点集合,并遍历
		List<Element> workGroupItemList = workGroupElement.elements("WORK_ORG_GROUP_ITEM");
		for (int i = 0; i < workGroupItemList.size(); i++) {
			Element workGroupItem = workGroupItemList.get(i);

			String orgCode = workGroupItem.element("ORGANIZATION_CODE").getText();
			String orgName = workGroupItem.element("ORGANIZATION_NAME").getText();
			String displayOrder = workGroupItem.element("DISPLAY_ORDER").getText();
			String dutyCode = workGroupItem.element("DUTY_CODE").getText();
			String dutyName = workGroupItem.element("DUTY_NAME").getText();
			String mainOrg = workGroupItem.element("MAIN_ORG").getText();

			WfpAfUserposition userPotition = new WfpAfUserpositionImpl();
			userPotition.setUserAccount(userAccount);
			userPotition.setOrgCode(orgCode);
			userPotition.setOrgName(orgName);
			userPotition.setDisplayOrder(displayOrder);
			userPotition.setDutyCode(dutyCode);
			userPotition.setDutyName(dutyName);
			userPotition.setMainOrg(mainOrg);

			positionList.add(userPotition);
		}

		return positionList;
	}

	/**
	 * 私有方法,将Element Item(组织机构)转换成Org对象
	 * 
	 * @param itemElement
	 */
	/**
	 * @param itemElement
	 * @return
	 * @throws Exception
	 */
	private WfpAfOrganization parseOrganizationObject(Element itemElement) throws Exception {
		try {
			String priKey = itemElement.elementText("PRI_KEY");
			String orgCode = itemElement.elementText("ORGANIZATION_CODE");
			String orgId = itemElement.elementText("ORGANIZATION_ID");
			String hrOrgCode = itemElement.elementText("HR_ORGANIZATION_CODE");
			String orgName = itemElement.elementText("ORGANIZATION_NAME");
			String companyCode = itemElement.elementText("COMPANY_CODE");
			String companyName = itemElement.elementText("COMPANY_NAME");
			String city = itemElement.elementText("CITY");
			String orgShortName = itemElement.elementText("ORG_SHORT_NAME");
			String erpOrgShortName = itemElement.elementText("ERPORG_SHORT_NAME");
			String orgDesc = itemElement.elementText("ORG_DESCRIPTION");
			String orgStyleCode = itemElement.elementText("ORG_STYLECODE");
			String orgStyle = itemElement.elementText("ORG_STYLE");
			String orgLevelCode = itemElement.elementText("ORG_LEVEL_CODE");
			String orgLevel = itemElement.elementText("ORG_LEVEL");
			String supervisorLeader = itemElement.elementText("SUPERVISOR_LEADER");
			String mainPrincipal = itemElement.elementText("MAIN_PRINCIPAL");
			if (mainPrincipal != null) {
				mainPrincipal = mainPrincipal.toLowerCase();
			}
			String manager = itemElement.elementText("MANAGER");
			String managerOrgId = itemElement.elementText("MANAGER_ORG_ID");
			String postalAddress = itemElement.elementText("POSTAL_ADDRESS");
			String postalCode = itemElement.elementText("POSTAL_CODE");
			String telePhoneNumber = itemElement.elementText("TELEPHONE_NUMBER");
			String faxNumber = itemElement.elementText("FAX_NUMEBR");
			String displayOrder = itemElement.elementText("DISPLAY_ORDER");
			String orgStatusCode = itemElement.elementText("ORG_STATUS_CODE");
			String orgStatus = itemElement.elementText("ORG_STATUS");
			String parentOrgCode = itemElement.elementText("PARENT_ORG_CODE");
			String parentOrgName = itemElement.elementText("PARENT_ORG_NAME");
			String classifyCode = itemElement.elementText("CLASSIFY_CODE");
			String classifyName = itemElement.elementText("CLASSIFY_NAME");
			String departmentManager = itemElement.elementText("DEPARTMNET_NAMNAGER");
			String businessDutyCode = itemElement.elementText("BUSINESS_DUTY_CODE");
			String businessDuty = itemElement.elementText("BUSINESS_DUTY");
			String mapId = itemElement.elementText("MAP_ID");
			String companyCCode = itemElement.elementText("COMPANY_CCODE");
			String companyDesp = itemElement.elementText("COMPANY_DESP");
			String cstCode = itemElement.elementText("CST_CODE");
			String cdtDesp = itemElement.elementText("CDT_DESP");
			String operationTypeCode = itemElement.elementText("OPERATION_TYPE_CODE");
			String operationType = itemElement.elementText("OPERATION_TYPE");
			String lastUpdateDate = itemElement.elementText("LAST_UPDATE_DATE");
			String attribute1 = itemElement.elementText("ATTRIBUTE1");
			String attribute2 = itemElement.elementText("ATTRIBUTE2");
			String attribute3 = itemElement.elementText("ATTRIBUTE3");
			String attribute4 = itemElement.elementText("ATTRIBUTE4");
			String attribute5 = itemElement.elementText("ATTRIBUTE5");

			// step2 : 获得该机构的ASSISTANT_OBJECT_ITEM list
			// modify 耿宏胜
			// 副职路径获取错误 ,增加了ASSISTANT_OBJECT的标签
			List<Element> assistantObjextItems = itemElement.element("ASSISTANT_OBJECT").elements(
					"ASSISTANT_OBJECT_ITEM");
			StringBuilder assistantParticipantStrBuilder = new StringBuilder(); // 机构assistant人员，以，分割
			for (Element assistantObjextItem : assistantObjextItems) {
				assistantParticipantStrBuilder.append(assistantObjextItem.elementText("ASSISTANT_PRINCIPAL")).append(
						",");

			}
			String assistantParticipantStr = assistantParticipantStrBuilder.length() == 0 ? ""
					: assistantParticipantStrBuilder.substring(0, assistantParticipantStrBuilder.length() - 1)
							.toLowerCase();

			// 限制Desc的字符长度
			if (orgDesc.length() > 250) {
				orgDesc = orgDesc.substring(0, 250) + "...";
			}

			WfpAfOrganization orgInfoBean = new WfpAfOrganizationImpl();
			orgInfoBean.setPriKey(priKey);
			orgInfoBean.setOrgCode(orgCode);
			orgInfoBean.setOrgId(orgId);
			orgInfoBean.setHrOrgCode(hrOrgCode);
			orgInfoBean.setOrgName(orgName);
			orgInfoBean.setCompanyCode(companyCode);
			orgInfoBean.setCompanyName(companyName);
			orgInfoBean.setCity(city);
			orgInfoBean.setOrgShortName(orgShortName);
			orgInfoBean.setErporgShortName(erpOrgShortName);
			orgInfoBean.setOrgDescription(orgDesc);
			orgInfoBean.setOrgStylecode(orgStyleCode);
			orgInfoBean.setOrgStyle(orgStyle);
			orgInfoBean.setOrgLevelCode(orgLevelCode);
			orgInfoBean.setOrgLevel(orgLevel);
			orgInfoBean.setSupervisorLeader(supervisorLeader);
			orgInfoBean.setMainPrincipal(mainPrincipal);
			orgInfoBean.setManager(manager);
			orgInfoBean.setManagerOrgId(managerOrgId);
			orgInfoBean.setPostalAddress(postalAddress);
			orgInfoBean.setPostalCode(postalCode);
			orgInfoBean.setTelephoneNumber(telePhoneNumber);
			orgInfoBean.setFaxNumber(faxNumber);
			orgInfoBean.setDisplayOrder(displayOrder);
			orgInfoBean.setOrgStatusCode(orgStatusCode);
			orgInfoBean.setOrgStatus(orgStatus);
			orgInfoBean.setParentOrgCode(parentOrgCode);
			orgInfoBean.setParentOrgName(parentOrgName);
			orgInfoBean.setClassifyCode(classifyCode);
			orgInfoBean.setClassifyName(classifyName);
			orgInfoBean.setDepartmentManager(departmentManager);
			orgInfoBean.setAssistantPrincipals(assistantParticipantStr);
			orgInfoBean.setBusinessDutyCode(businessDutyCode);
			orgInfoBean.setBusinessDuty(businessDuty);
			orgInfoBean.setMapId(mapId);
			orgInfoBean.setCompanyCcode(companyCCode);
			orgInfoBean.setCompanyDesp(companyDesp);
			orgInfoBean.setCstCode(cstCode);
			orgInfoBean.setCdtDesp(cdtDesp);
			orgInfoBean.setOperationTypeCode(operationTypeCode);
			orgInfoBean.setOperationType(operationType);
			orgInfoBean.setLastUpdateDate(lastUpdateDate);
			orgInfoBean.setAttribute1(attribute1);
			orgInfoBean.setAttribute2(attribute2);
			orgInfoBean.setAttribute3(attribute3);
			orgInfoBean.setAttribute4(attribute4);
			orgInfoBean.setAttribute5(attribute5);

			return orgInfoBean;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}
}
