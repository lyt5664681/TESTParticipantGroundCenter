/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset;

import com.eos.data.sdo.IObjectFactory;

import commonj.sdo.DataObject;
import commonj.sdo.Type;
import commonj.sdo.helper.DataFactory;
import commonj.sdo.helper.TypeHelper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserAccount <em>UserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPriKey <em>PriKey</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getSystemCode <em>SystemCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getSystemBelongCode <em>SystemBelongCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserId <em>UserId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalUserId <em>ExternalUserId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalUserAccount <em>ExternalUserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPersonType <em>PersonType</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserName <em>UserName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getGivenName <em>GivenName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getProvinceCode <em>ProvinceCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getProvince <em>Province</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUnitName <em>UnitName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getFamilyName <em>FamilyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getInternalOrgCode <em>InternalOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalOrgCode <em>ExternalOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPhoneNumber <em>PhoneNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEmailAddress <em>EmailAddress</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getGraduateInstitution <em>GraduateInstitution</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPosition <em>Position</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLevelCode <em>LevelCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUsLevel <em>UsLevel</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getIsAssociated <em>IsAssociated</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAssociateUser <em>AssociateUser</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getWorkOrderNumber <em>WorkOrderNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyId <em>CompanyId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyCode <em>CompanyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyName <em>CompanyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgId <em>OrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgId <em>ParentOrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgCode <em>ParentOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgName <em>ParentOrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserEmail <em>UserEmail</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEffectiveStartDate <em>EffectiveStartDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEffectiveEndDate <em>EffectiveEndDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserStatus <em>UserStatus</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEmployeeNumber <em>EmployeeNumber</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface WfpAfUserinfo extends DataObject {

	public static final String QNAME = "com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo";

	public static final Type TYPE = TypeHelper.INSTANCE.getType("com.cmcc.participant.ground.dataset.CMCCUserDataset", "WfpAfUserinfo");

	public static final IObjectFactory<WfpAfUserinfo> FACTORY = new IObjectFactory<WfpAfUserinfo>() {
		public WfpAfUserinfo create() {
			return (WfpAfUserinfo) DataFactory.INSTANCE.create(TYPE);
		}
	};

	/**
	 * Returns the value of the '<em><b>UserAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UserAccount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UserAccount</em>' attribute.
	 * @see #setUserAccount(java.lang.String)
	 */
	public String getUserAccount();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserAccount <em>UserAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserAccount</em>' attribute.
	 * @see #getUserAccount()
	 */
	public void setUserAccount(String userAccount);

	/**
	 * Returns the value of the '<em><b>PriKey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PriKey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PriKey</em>' attribute.
	 * @see #setPriKey(java.lang.String)
	 */
	public String getPriKey();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPriKey <em>PriKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PriKey</em>' attribute.
	 * @see #getPriKey()
	 */
	public void setPriKey(String priKey);

	/**
	 * Returns the value of the '<em><b>SystemCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SystemCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SystemCode</em>' attribute.
	 * @see #setSystemCode(java.lang.String)
	 */
	public String getSystemCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getSystemCode <em>SystemCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SystemCode</em>' attribute.
	 * @see #getSystemCode()
	 */
	public void setSystemCode(String systemCode);

	/**
	 * Returns the value of the '<em><b>SystemBelongCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SystemBelongCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SystemBelongCode</em>' attribute.
	 * @see #setSystemBelongCode(java.lang.String)
	 */
	public String getSystemBelongCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getSystemBelongCode <em>SystemBelongCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SystemBelongCode</em>' attribute.
	 * @see #getSystemBelongCode()
	 */
	public void setSystemBelongCode(String systemBelongCode);

	/**
	 * Returns the value of the '<em><b>UserId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UserId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UserId</em>' attribute.
	 * @see #setUserId(java.lang.String)
	 */
	public String getUserId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserId <em>UserId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserId</em>' attribute.
	 * @see #getUserId()
	 */
	public void setUserId(String userId);

	/**
	 * Returns the value of the '<em><b>ExternalUserId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ExternalUserId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ExternalUserId</em>' attribute.
	 * @see #setExternalUserId(java.lang.String)
	 */
	public String getExternalUserId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalUserId <em>ExternalUserId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalUserId</em>' attribute.
	 * @see #getExternalUserId()
	 */
	public void setExternalUserId(String externalUserId);

	/**
	 * Returns the value of the '<em><b>ExternalUserAccount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ExternalUserAccount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ExternalUserAccount</em>' attribute.
	 * @see #setExternalUserAccount(java.lang.String)
	 */
	public String getExternalUserAccount();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalUserAccount <em>ExternalUserAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalUserAccount</em>' attribute.
	 * @see #getExternalUserAccount()
	 */
	public void setExternalUserAccount(String externalUserAccount);

	/**
	 * Returns the value of the '<em><b>PersonType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PersonType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PersonType</em>' attribute.
	 * @see #setPersonType(java.lang.String)
	 */
	public String getPersonType();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPersonType <em>PersonType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PersonType</em>' attribute.
	 * @see #getPersonType()
	 */
	public void setPersonType(String personType);

	/**
	 * Returns the value of the '<em><b>UserName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UserName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UserName</em>' attribute.
	 * @see #setUserName(java.lang.String)
	 */
	public String getUserName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserName <em>UserName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserName</em>' attribute.
	 * @see #getUserName()
	 */
	public void setUserName(String userName);

	/**
	 * Returns the value of the '<em><b>GivenName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GivenName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GivenName</em>' attribute.
	 * @see #setGivenName(java.lang.String)
	 */
	public String getGivenName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getGivenName <em>GivenName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GivenName</em>' attribute.
	 * @see #getGivenName()
	 */
	public void setGivenName(String givenName);

	/**
	 * Returns the value of the '<em><b>ProvinceCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ProvinceCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ProvinceCode</em>' attribute.
	 * @see #setProvinceCode(java.lang.String)
	 */
	public String getProvinceCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getProvinceCode <em>ProvinceCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ProvinceCode</em>' attribute.
	 * @see #getProvinceCode()
	 */
	public void setProvinceCode(String provinceCode);

	/**
	 * Returns the value of the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Province</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Province</em>' attribute.
	 * @see #setProvince(java.lang.String)
	 */
	public String getProvince();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getProvince <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Province</em>' attribute.
	 * @see #getProvince()
	 */
	public void setProvince(String province);

	/**
	 * Returns the value of the '<em><b>UnitName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UnitName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UnitName</em>' attribute.
	 * @see #setUnitName(java.lang.String)
	 */
	public String getUnitName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUnitName <em>UnitName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UnitName</em>' attribute.
	 * @see #getUnitName()
	 */
	public void setUnitName(String unitName);

	/**
	 * Returns the value of the '<em><b>FamilyName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FamilyName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FamilyName</em>' attribute.
	 * @see #setFamilyName(java.lang.String)
	 */
	public String getFamilyName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getFamilyName <em>FamilyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FamilyName</em>' attribute.
	 * @see #getFamilyName()
	 */
	public void setFamilyName(String familyName);

	/**
	 * Returns the value of the '<em><b>InternalOrgCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>InternalOrgCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>InternalOrgCode</em>' attribute.
	 * @see #setInternalOrgCode(java.lang.String)
	 */
	public String getInternalOrgCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getInternalOrgCode <em>InternalOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>InternalOrgCode</em>' attribute.
	 * @see #getInternalOrgCode()
	 */
	public void setInternalOrgCode(String internalOrgCode);

	/**
	 * Returns the value of the '<em><b>ExternalOrgCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ExternalOrgCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ExternalOrgCode</em>' attribute.
	 * @see #setExternalOrgCode(java.lang.String)
	 */
	public String getExternalOrgCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getExternalOrgCode <em>ExternalOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalOrgCode</em>' attribute.
	 * @see #getExternalOrgCode()
	 */
	public void setExternalOrgCode(String externalOrgCode);

	/**
	 * Returns the value of the '<em><b>PhoneNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PhoneNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PhoneNumber</em>' attribute.
	 * @see #setPhoneNumber(java.lang.String)
	 */
	public String getPhoneNumber();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPhoneNumber <em>PhoneNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PhoneNumber</em>' attribute.
	 * @see #getPhoneNumber()
	 */
	public void setPhoneNumber(String phoneNumber);

	/**
	 * Returns the value of the '<em><b>EmailAddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EmailAddress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EmailAddress</em>' attribute.
	 * @see #setEmailAddress(java.lang.String)
	 */
	public String getEmailAddress();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEmailAddress <em>EmailAddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EmailAddress</em>' attribute.
	 * @see #getEmailAddress()
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the value of the '<em><b>GraduateInstitution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GraduateInstitution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GraduateInstitution</em>' attribute.
	 * @see #setGraduateInstitution(java.lang.String)
	 */
	public String getGraduateInstitution();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getGraduateInstitution <em>GraduateInstitution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GraduateInstitution</em>' attribute.
	 * @see #getGraduateInstitution()
	 */
	public void setGraduateInstitution(String graduateInstitution);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(java.lang.String)
	 */
	public String getPosition();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 */
	public void setPosition(String position);

	/**
	 * Returns the value of the '<em><b>LevelCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LevelCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LevelCode</em>' attribute.
	 * @see #setLevelCode(java.lang.String)
	 */
	public String getLevelCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLevelCode <em>LevelCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LevelCode</em>' attribute.
	 * @see #getLevelCode()
	 */
	public void setLevelCode(String levelCode);

	/**
	 * Returns the value of the '<em><b>UsLevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UsLevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UsLevel</em>' attribute.
	 * @see #setUsLevel(java.lang.String)
	 */
	public String getUsLevel();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUsLevel <em>UsLevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UsLevel</em>' attribute.
	 * @see #getUsLevel()
	 */
	public void setUsLevel(String usLevel);

	/**
	 * Returns the value of the '<em><b>IsAssociated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IsAssociated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IsAssociated</em>' attribute.
	 * @see #setIsAssociated(java.lang.String)
	 */
	public String getIsAssociated();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getIsAssociated <em>IsAssociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IsAssociated</em>' attribute.
	 * @see #getIsAssociated()
	 */
	public void setIsAssociated(String isAssociated);

	/**
	 * Returns the value of the '<em><b>AssociateUser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssociateUser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssociateUser</em>' attribute.
	 * @see #setAssociateUser(java.lang.String)
	 */
	public String getAssociateUser();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAssociateUser <em>AssociateUser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssociateUser</em>' attribute.
	 * @see #getAssociateUser()
	 */
	public void setAssociateUser(String associateUser);

	/**
	 * Returns the value of the '<em><b>WorkOrderNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WorkOrderNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WorkOrderNumber</em>' attribute.
	 * @see #setWorkOrderNumber(java.lang.String)
	 */
	public String getWorkOrderNumber();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getWorkOrderNumber <em>WorkOrderNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WorkOrderNumber</em>' attribute.
	 * @see #getWorkOrderNumber()
	 */
	public void setWorkOrderNumber(String workOrderNumber);

	/**
	 * Returns the value of the '<em><b>CompanyId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompanyId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CompanyId</em>' attribute.
	 * @see #setCompanyId(java.lang.String)
	 */
	public String getCompanyId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyId <em>CompanyId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyId</em>' attribute.
	 * @see #getCompanyId()
	 */
	public void setCompanyId(String companyId);

	/**
	 * Returns the value of the '<em><b>CompanyCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompanyCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CompanyCode</em>' attribute.
	 * @see #setCompanyCode(java.lang.String)
	 */
	public String getCompanyCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyCode <em>CompanyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyCode</em>' attribute.
	 * @see #getCompanyCode()
	 */
	public void setCompanyCode(String companyCode);

	/**
	 * Returns the value of the '<em><b>CompanyName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompanyName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CompanyName</em>' attribute.
	 * @see #setCompanyName(java.lang.String)
	 */
	public String getCompanyName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCompanyName <em>CompanyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyName</em>' attribute.
	 * @see #getCompanyName()
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the value of the '<em><b>OrgId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgId</em>' attribute.
	 * @see #setOrgId(java.lang.String)
	 */
	public String getOrgId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgId <em>OrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgId</em>' attribute.
	 * @see #getOrgId()
	 */
	public void setOrgId(String orgId);

	/**
	 * Returns the value of the '<em><b>OrgCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgCode</em>' attribute.
	 * @see #setOrgCode(java.lang.String)
	 */
	public String getOrgCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgCode <em>OrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgCode</em>' attribute.
	 * @see #getOrgCode()
	 */
	public void setOrgCode(String orgCode);

	/**
	 * Returns the value of the '<em><b>OrgName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgName</em>' attribute.
	 * @see #setOrgName(java.lang.String)
	 */
	public String getOrgName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getOrgName <em>OrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgName</em>' attribute.
	 * @see #getOrgName()
	 */
	public void setOrgName(String orgName);

	/**
	 * Returns the value of the '<em><b>ParentOrgId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ParentOrgId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ParentOrgId</em>' attribute.
	 * @see #setParentOrgId(java.lang.String)
	 */
	public String getParentOrgId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgId <em>ParentOrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgId</em>' attribute.
	 * @see #getParentOrgId()
	 */
	public void setParentOrgId(String parentOrgId);

	/**
	 * Returns the value of the '<em><b>ParentOrgCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ParentOrgCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ParentOrgCode</em>' attribute.
	 * @see #setParentOrgCode(java.lang.String)
	 */
	public String getParentOrgCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgCode <em>ParentOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgCode</em>' attribute.
	 * @see #getParentOrgCode()
	 */
	public void setParentOrgCode(String parentOrgCode);

	/**
	 * Returns the value of the '<em><b>ParentOrgName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ParentOrgName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ParentOrgName</em>' attribute.
	 * @see #setParentOrgName(java.lang.String)
	 */
	public String getParentOrgName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getParentOrgName <em>ParentOrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgName</em>' attribute.
	 * @see #getParentOrgName()
	 */
	public void setParentOrgName(String parentOrgName);

	/**
	 * Returns the value of the '<em><b>UserEmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UserEmail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UserEmail</em>' attribute.
	 * @see #setUserEmail(java.lang.String)
	 */
	public String getUserEmail();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserEmail <em>UserEmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserEmail</em>' attribute.
	 * @see #getUserEmail()
	 */
	public void setUserEmail(String userEmail);

	/**
	 * Returns the value of the '<em><b>EffectiveStartDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EffectiveStartDate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EffectiveStartDate</em>' attribute.
	 * @see #setEffectiveStartDate(java.lang.String)
	 */
	public String getEffectiveStartDate();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEffectiveStartDate <em>EffectiveStartDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EffectiveStartDate</em>' attribute.
	 * @see #getEffectiveStartDate()
	 */
	public void setEffectiveStartDate(String effectiveStartDate);

	/**
	 * Returns the value of the '<em><b>EffectiveEndDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EffectiveEndDate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EffectiveEndDate</em>' attribute.
	 * @see #setEffectiveEndDate(java.lang.String)
	 */
	public String getEffectiveEndDate();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEffectiveEndDate <em>EffectiveEndDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EffectiveEndDate</em>' attribute.
	 * @see #getEffectiveEndDate()
	 */
	public void setEffectiveEndDate(String effectiveEndDate);

	/**
	 * Returns the value of the '<em><b>UserStatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UserStatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UserStatus</em>' attribute.
	 * @see #setUserStatus(java.lang.String)
	 */
	public String getUserStatus();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getUserStatus <em>UserStatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserStatus</em>' attribute.
	 * @see #getUserStatus()
	 */
	public void setUserStatus(String userStatus);

	/**
	 * Returns the value of the '<em><b>CreatedBy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CreatedBy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CreatedBy</em>' attribute.
	 * @see #setCreatedBy(java.lang.String)
	 */
	public String getCreatedBy();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCreatedBy <em>CreatedBy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CreatedBy</em>' attribute.
	 * @see #getCreatedBy()
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the value of the '<em><b>CreationDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CreationDate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CreationDate</em>' attribute.
	 * @see #setCreationDate(java.lang.String)
	 */
	public String getCreationDate();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getCreationDate <em>CreationDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CreationDate</em>' attribute.
	 * @see #getCreationDate()
	 */
	public void setCreationDate(String creationDate);

	/**
	 * Returns the value of the '<em><b>LastUpdateBy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LastUpdateBy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LastUpdateBy</em>' attribute.
	 * @see #setLastUpdateBy(java.lang.String)
	 */
	public String getLastUpdateBy();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateBy <em>LastUpdateBy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateBy</em>' attribute.
	 * @see #getLastUpdateBy()
	 */
	public void setLastUpdateBy(String lastUpdateBy);

	/**
	 * Returns the value of the '<em><b>LastUpdateDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LastUpdateDate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LastUpdateDate</em>' attribute.
	 * @see #setLastUpdateDate(java.lang.String)
	 */
	public String getLastUpdateDate();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateDate <em>LastUpdateDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateDate</em>' attribute.
	 * @see #getLastUpdateDate()
	 */
	public void setLastUpdateDate(String lastUpdateDate);

	/**
	 * Returns the value of the '<em><b>LastUpdateLogin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LastUpdateLogin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LastUpdateLogin</em>' attribute.
	 * @see #setLastUpdateLogin(java.lang.String)
	 */
	public String getLastUpdateLogin();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getLastUpdateLogin <em>LastUpdateLogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateLogin</em>' attribute.
	 * @see #getLastUpdateLogin()
	 */
	public void setLastUpdateLogin(String lastUpdateLogin);

	/**
	 * Returns the value of the '<em><b>Attribute1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute1</em>' attribute.
	 * @see #setAttribute1(java.lang.String)
	 */
	public String getAttribute1();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute1 <em>Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute1</em>' attribute.
	 * @see #getAttribute1()
	 */
	public void setAttribute1(String attribute1);

	/**
	 * Returns the value of the '<em><b>Attribute2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute2</em>' attribute.
	 * @see #setAttribute2(java.lang.String)
	 */
	public String getAttribute2();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute2 <em>Attribute2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute2</em>' attribute.
	 * @see #getAttribute2()
	 */
	public void setAttribute2(String attribute2);

	/**
	 * Returns the value of the '<em><b>Attribute3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute3</em>' attribute.
	 * @see #setAttribute3(java.lang.String)
	 */
	public String getAttribute3();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute3 <em>Attribute3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute3</em>' attribute.
	 * @see #getAttribute3()
	 */
	public void setAttribute3(String attribute3);

	/**
	 * Returns the value of the '<em><b>Attribute4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute4</em>' attribute.
	 * @see #setAttribute4(java.lang.String)
	 */
	public String getAttribute4();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute4 <em>Attribute4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute4</em>' attribute.
	 * @see #getAttribute4()
	 */
	public void setAttribute4(String attribute4);

	/**
	 * Returns the value of the '<em><b>Attribute5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute5</em>' attribute.
	 * @see #setAttribute5(java.lang.String)
	 */
	public String getAttribute5();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5);

	/**
	 * Returns the value of the '<em><b>EmployeeNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EmployeeNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EmployeeNumber</em>' attribute.
	 * @see #setEmployeeNumber(java.lang.String)
	 */
	public String getEmployeeNumber();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo#getEmployeeNumber <em>EmployeeNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EmployeeNumber</em>' attribute.
	 * @see #getEmployeeNumber()
	 */
	public void setEmployeeNumber(String employeeNumber);


}