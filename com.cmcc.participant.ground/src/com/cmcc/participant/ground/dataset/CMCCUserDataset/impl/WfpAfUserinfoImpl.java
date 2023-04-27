/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset.impl;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserinfo;
import com.primeton.ext.data.sdo.DataUtil;
import com.primeton.ext.data.sdo.ExtendedDataObjectImpl;

import commonj.sdo.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUserAccount <em>UserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getPriKey <em>PriKey</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getSystemCode <em>SystemCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getSystemBelongCode <em>SystemBelongCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUserId <em>UserId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getExternalUserId <em>ExternalUserId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getExternalUserAccount <em>ExternalUserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getPersonType <em>PersonType</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUserName <em>UserName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getGivenName <em>GivenName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getProvinceCode <em>ProvinceCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUnitName <em>UnitName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getFamilyName <em>FamilyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getInternalOrgCode <em>InternalOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getExternalOrgCode <em>ExternalOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getPhoneNumber <em>PhoneNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getEmailAddress <em>EmailAddress</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getGraduateInstitution <em>GraduateInstitution</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getLevelCode <em>LevelCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUsLevel <em>UsLevel</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getIsAssociated <em>IsAssociated</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAssociateUser <em>AssociateUser</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getWorkOrderNumber <em>WorkOrderNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getCompanyId <em>CompanyId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getCompanyCode <em>CompanyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getCompanyName <em>CompanyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getOrgId <em>OrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getParentOrgId <em>ParentOrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getParentOrgCode <em>ParentOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getParentOrgName <em>ParentOrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUserEmail <em>UserEmail</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getEffectiveStartDate <em>EffectiveStartDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getEffectiveEndDate <em>EffectiveEndDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getUserStatus <em>UserStatus</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserinfoImpl#getEmployeeNumber <em>EmployeeNumber</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements WfpAfUserinfo;
 */

public class WfpAfUserinfoImpl extends ExtendedDataObjectImpl implements WfpAfUserinfo {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_USERACCOUNT = 0;
	public final static int INDEX_PRIKEY = 1;
	public final static int INDEX_SYSTEMCODE = 2;
	public final static int INDEX_SYSTEMBELONGCODE = 3;
	public final static int INDEX_USERID = 4;
	public final static int INDEX_EXTERNALUSERID = 5;
	public final static int INDEX_EXTERNALUSERACCOUNT = 6;
	public final static int INDEX_PERSONTYPE = 7;
	public final static int INDEX_USERNAME = 8;
	public final static int INDEX_GIVENNAME = 9;
	public final static int INDEX_PROVINCECODE = 10;
	public final static int INDEX_PROVINCE = 11;
	public final static int INDEX_UNITNAME = 12;
	public final static int INDEX_FAMILYNAME = 13;
	public final static int INDEX_INTERNALORGCODE = 14;
	public final static int INDEX_EXTERNALORGCODE = 15;
	public final static int INDEX_PHONENUMBER = 16;
	public final static int INDEX_EMAILADDRESS = 17;
	public final static int INDEX_GRADUATEINSTITUTION = 18;
	public final static int INDEX_POSITION = 19;
	public final static int INDEX_LEVELCODE = 20;
	public final static int INDEX_USLEVEL = 21;
	public final static int INDEX_ISASSOCIATED = 22;
	public final static int INDEX_ASSOCIATEUSER = 23;
	public final static int INDEX_WORKORDERNUMBER = 24;
	public final static int INDEX_COMPANYID = 25;
	public final static int INDEX_COMPANYCODE = 26;
	public final static int INDEX_COMPANYNAME = 27;
	public final static int INDEX_ORGID = 28;
	public final static int INDEX_ORGCODE = 29;
	public final static int INDEX_ORGNAME = 30;
	public final static int INDEX_PARENTORGID = 31;
	public final static int INDEX_PARENTORGCODE = 32;
	public final static int INDEX_PARENTORGNAME = 33;
	public final static int INDEX_USEREMAIL = 34;
	public final static int INDEX_EFFECTIVESTARTDATE = 35;
	public final static int INDEX_EFFECTIVEENDDATE = 36;
	public final static int INDEX_USERSTATUS = 37;
	public final static int INDEX_CREATEDBY = 38;
	public final static int INDEX_CREATIONDATE = 39;
	public final static int INDEX_LASTUPDATEBY = 40;
	public final static int INDEX_LASTUPDATEDATE = 41;
	public final static int INDEX_LASTUPDATELOGIN = 42;
	public final static int INDEX_ATTRIBUTE1 = 43;
	public final static int INDEX_ATTRIBUTE2 = 44;
	public final static int INDEX_ATTRIBUTE3 = 45;
	public final static int INDEX_ATTRIBUTE4 = 46;
	public final static int INDEX_ATTRIBUTE5 = 47;
	public final static int INDEX_EMPLOYEENUMBER = 48;
	public static final int SDO_PROPERTY_COUNT = 49;

	public static final int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfUserinfoImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfUserinfoImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
	}

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
	public String getUserAccount() {
		return DataUtil.toString(super.getByIndex(INDEX_USERACCOUNT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUserAccount <em>UserAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserAccount</em>' attribute.
	 * @see #getUserAccount()
	 */
	public void setUserAccount(String userAccount) {
		super.setByIndex(INDEX_USERACCOUNT, userAccount);
	}

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
	public String getPriKey() {
		return DataUtil.toString(super.getByIndex(INDEX_PRIKEY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPriKey <em>PriKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PriKey</em>' attribute.
	 * @see #getPriKey()
	 */
	public void setPriKey(String priKey) {
		super.setByIndex(INDEX_PRIKEY, priKey);
	}

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
	public String getSystemCode() {
		return DataUtil.toString(super.getByIndex(INDEX_SYSTEMCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getSystemCode <em>SystemCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SystemCode</em>' attribute.
	 * @see #getSystemCode()
	 */
	public void setSystemCode(String systemCode) {
		super.setByIndex(INDEX_SYSTEMCODE, systemCode);
	}

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
	public String getSystemBelongCode() {
		return DataUtil.toString(super.getByIndex(INDEX_SYSTEMBELONGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getSystemBelongCode <em>SystemBelongCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SystemBelongCode</em>' attribute.
	 * @see #getSystemBelongCode()
	 */
	public void setSystemBelongCode(String systemBelongCode) {
		super.setByIndex(INDEX_SYSTEMBELONGCODE, systemBelongCode);
	}

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
	public String getUserId() {
		return DataUtil.toString(super.getByIndex(INDEX_USERID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUserId <em>UserId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserId</em>' attribute.
	 * @see #getUserId()
	 */
	public void setUserId(String userId) {
		super.setByIndex(INDEX_USERID, userId);
	}

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
	public String getExternalUserId() {
		return DataUtil.toString(super.getByIndex(INDEX_EXTERNALUSERID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getExternalUserId <em>ExternalUserId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalUserId</em>' attribute.
	 * @see #getExternalUserId()
	 */
	public void setExternalUserId(String externalUserId) {
		super.setByIndex(INDEX_EXTERNALUSERID, externalUserId);
	}

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
	public String getExternalUserAccount() {
		return DataUtil.toString(super.getByIndex(INDEX_EXTERNALUSERACCOUNT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getExternalUserAccount <em>ExternalUserAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalUserAccount</em>' attribute.
	 * @see #getExternalUserAccount()
	 */
	public void setExternalUserAccount(String externalUserAccount) {
		super.setByIndex(INDEX_EXTERNALUSERACCOUNT, externalUserAccount);
	}

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
	public String getPersonType() {
		return DataUtil.toString(super.getByIndex(INDEX_PERSONTYPE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPersonType <em>PersonType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PersonType</em>' attribute.
	 * @see #getPersonType()
	 */
	public void setPersonType(String personType) {
		super.setByIndex(INDEX_PERSONTYPE, personType);
	}

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
	public String getUserName() {
		return DataUtil.toString(super.getByIndex(INDEX_USERNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUserName <em>UserName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserName</em>' attribute.
	 * @see #getUserName()
	 */
	public void setUserName(String userName) {
		super.setByIndex(INDEX_USERNAME, userName);
	}

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
	public String getGivenName() {
		return DataUtil.toString(super.getByIndex(INDEX_GIVENNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getGivenName <em>GivenName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GivenName</em>' attribute.
	 * @see #getGivenName()
	 */
	public void setGivenName(String givenName) {
		super.setByIndex(INDEX_GIVENNAME, givenName);
	}

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
	public String getProvinceCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PROVINCECODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getProvinceCode <em>ProvinceCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ProvinceCode</em>' attribute.
	 * @see #getProvinceCode()
	 */
	public void setProvinceCode(String provinceCode) {
		super.setByIndex(INDEX_PROVINCECODE, provinceCode);
	}

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
	public String getProvince() {
		return DataUtil.toString(super.getByIndex(INDEX_PROVINCE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getProvince <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Province</em>' attribute.
	 * @see #getProvince()
	 */
	public void setProvince(String province) {
		super.setByIndex(INDEX_PROVINCE, province);
	}

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
	public String getUnitName() {
		return DataUtil.toString(super.getByIndex(INDEX_UNITNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUnitName <em>UnitName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UnitName</em>' attribute.
	 * @see #getUnitName()
	 */
	public void setUnitName(String unitName) {
		super.setByIndex(INDEX_UNITNAME, unitName);
	}

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
	public String getFamilyName() {
		return DataUtil.toString(super.getByIndex(INDEX_FAMILYNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getFamilyName <em>FamilyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FamilyName</em>' attribute.
	 * @see #getFamilyName()
	 */
	public void setFamilyName(String familyName) {
		super.setByIndex(INDEX_FAMILYNAME, familyName);
	}

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
	public String getInternalOrgCode() {
		return DataUtil.toString(super.getByIndex(INDEX_INTERNALORGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getInternalOrgCode <em>InternalOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>InternalOrgCode</em>' attribute.
	 * @see #getInternalOrgCode()
	 */
	public void setInternalOrgCode(String internalOrgCode) {
		super.setByIndex(INDEX_INTERNALORGCODE, internalOrgCode);
	}

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
	public String getExternalOrgCode() {
		return DataUtil.toString(super.getByIndex(INDEX_EXTERNALORGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getExternalOrgCode <em>ExternalOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ExternalOrgCode</em>' attribute.
	 * @see #getExternalOrgCode()
	 */
	public void setExternalOrgCode(String externalOrgCode) {
		super.setByIndex(INDEX_EXTERNALORGCODE, externalOrgCode);
	}

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
	public String getPhoneNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_PHONENUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPhoneNumber <em>PhoneNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PhoneNumber</em>' attribute.
	 * @see #getPhoneNumber()
	 */
	public void setPhoneNumber(String phoneNumber) {
		super.setByIndex(INDEX_PHONENUMBER, phoneNumber);
	}

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
	public String getEmailAddress() {
		return DataUtil.toString(super.getByIndex(INDEX_EMAILADDRESS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getEmailAddress <em>EmailAddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EmailAddress</em>' attribute.
	 * @see #getEmailAddress()
	 */
	public void setEmailAddress(String emailAddress) {
		super.setByIndex(INDEX_EMAILADDRESS, emailAddress);
	}

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
	public String getGraduateInstitution() {
		return DataUtil.toString(super.getByIndex(INDEX_GRADUATEINSTITUTION, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getGraduateInstitution <em>GraduateInstitution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GraduateInstitution</em>' attribute.
	 * @see #getGraduateInstitution()
	 */
	public void setGraduateInstitution(String graduateInstitution) {
		super.setByIndex(INDEX_GRADUATEINSTITUTION, graduateInstitution);
	}

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
	public String getPosition() {
		return DataUtil.toString(super.getByIndex(INDEX_POSITION, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 */
	public void setPosition(String position) {
		super.setByIndex(INDEX_POSITION, position);
	}

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
	public String getLevelCode() {
		return DataUtil.toString(super.getByIndex(INDEX_LEVELCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getLevelCode <em>LevelCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LevelCode</em>' attribute.
	 * @see #getLevelCode()
	 */
	public void setLevelCode(String levelCode) {
		super.setByIndex(INDEX_LEVELCODE, levelCode);
	}

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
	public String getUsLevel() {
		return DataUtil.toString(super.getByIndex(INDEX_USLEVEL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUsLevel <em>UsLevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UsLevel</em>' attribute.
	 * @see #getUsLevel()
	 */
	public void setUsLevel(String usLevel) {
		super.setByIndex(INDEX_USLEVEL, usLevel);
	}

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
	public String getIsAssociated() {
		return DataUtil.toString(super.getByIndex(INDEX_ISASSOCIATED, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getIsAssociated <em>IsAssociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IsAssociated</em>' attribute.
	 * @see #getIsAssociated()
	 */
	public void setIsAssociated(String isAssociated) {
		super.setByIndex(INDEX_ISASSOCIATED, isAssociated);
	}

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
	public String getAssociateUser() {
		return DataUtil.toString(super.getByIndex(INDEX_ASSOCIATEUSER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssociateUser <em>AssociateUser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssociateUser</em>' attribute.
	 * @see #getAssociateUser()
	 */
	public void setAssociateUser(String associateUser) {
		super.setByIndex(INDEX_ASSOCIATEUSER, associateUser);
	}

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
	public String getWorkOrderNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_WORKORDERNUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getWorkOrderNumber <em>WorkOrderNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WorkOrderNumber</em>' attribute.
	 * @see #getWorkOrderNumber()
	 */
	public void setWorkOrderNumber(String workOrderNumber) {
		super.setByIndex(INDEX_WORKORDERNUMBER, workOrderNumber);
	}

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
	public String getCompanyId() {
		return DataUtil.toString(super.getByIndex(INDEX_COMPANYID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCompanyId <em>CompanyId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyId</em>' attribute.
	 * @see #getCompanyId()
	 */
	public void setCompanyId(String companyId) {
		super.setByIndex(INDEX_COMPANYID, companyId);
	}

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
	public String getCompanyCode() {
		return DataUtil.toString(super.getByIndex(INDEX_COMPANYCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCompanyCode <em>CompanyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyCode</em>' attribute.
	 * @see #getCompanyCode()
	 */
	public void setCompanyCode(String companyCode) {
		super.setByIndex(INDEX_COMPANYCODE, companyCode);
	}

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
	public String getCompanyName() {
		return DataUtil.toString(super.getByIndex(INDEX_COMPANYNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCompanyName <em>CompanyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyName</em>' attribute.
	 * @see #getCompanyName()
	 */
	public void setCompanyName(String companyName) {
		super.setByIndex(INDEX_COMPANYNAME, companyName);
	}

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
	public String getOrgId() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgId <em>OrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgId</em>' attribute.
	 * @see #getOrgId()
	 */
	public void setOrgId(String orgId) {
		super.setByIndex(INDEX_ORGID, orgId);
	}

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
	public String getOrgCode() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgCode <em>OrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgCode</em>' attribute.
	 * @see #getOrgCode()
	 */
	public void setOrgCode(String orgCode) {
		super.setByIndex(INDEX_ORGCODE, orgCode);
	}

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
	public String getOrgName() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgName <em>OrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgName</em>' attribute.
	 * @see #getOrgName()
	 */
	public void setOrgName(String orgName) {
		super.setByIndex(INDEX_ORGNAME, orgName);
	}

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
	public String getParentOrgId() {
		return DataUtil.toString(super.getByIndex(INDEX_PARENTORGID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParentOrgId <em>ParentOrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgId</em>' attribute.
	 * @see #getParentOrgId()
	 */
	public void setParentOrgId(String parentOrgId) {
		super.setByIndex(INDEX_PARENTORGID, parentOrgId);
	}

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
	public String getParentOrgCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PARENTORGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParentOrgCode <em>ParentOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgCode</em>' attribute.
	 * @see #getParentOrgCode()
	 */
	public void setParentOrgCode(String parentOrgCode) {
		super.setByIndex(INDEX_PARENTORGCODE, parentOrgCode);
	}

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
	public String getParentOrgName() {
		return DataUtil.toString(super.getByIndex(INDEX_PARENTORGNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParentOrgName <em>ParentOrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgName</em>' attribute.
	 * @see #getParentOrgName()
	 */
	public void setParentOrgName(String parentOrgName) {
		super.setByIndex(INDEX_PARENTORGNAME, parentOrgName);
	}

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
	public String getUserEmail() {
		return DataUtil.toString(super.getByIndex(INDEX_USEREMAIL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUserEmail <em>UserEmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserEmail</em>' attribute.
	 * @see #getUserEmail()
	 */
	public void setUserEmail(String userEmail) {
		super.setByIndex(INDEX_USEREMAIL, userEmail);
	}

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
	public String getEffectiveStartDate() {
		return DataUtil.toString(super.getByIndex(INDEX_EFFECTIVESTARTDATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getEffectiveStartDate <em>EffectiveStartDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EffectiveStartDate</em>' attribute.
	 * @see #getEffectiveStartDate()
	 */
	public void setEffectiveStartDate(String effectiveStartDate) {
		super.setByIndex(INDEX_EFFECTIVESTARTDATE, effectiveStartDate);
	}

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
	public String getEffectiveEndDate() {
		return DataUtil.toString(super.getByIndex(INDEX_EFFECTIVEENDDATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getEffectiveEndDate <em>EffectiveEndDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EffectiveEndDate</em>' attribute.
	 * @see #getEffectiveEndDate()
	 */
	public void setEffectiveEndDate(String effectiveEndDate) {
		super.setByIndex(INDEX_EFFECTIVEENDDATE, effectiveEndDate);
	}

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
	public String getUserStatus() {
		return DataUtil.toString(super.getByIndex(INDEX_USERSTATUS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getUserStatus <em>UserStatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserStatus</em>' attribute.
	 * @see #getUserStatus()
	 */
	public void setUserStatus(String userStatus) {
		super.setByIndex(INDEX_USERSTATUS, userStatus);
	}

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
	public String getCreatedBy() {
		return DataUtil.toString(super.getByIndex(INDEX_CREATEDBY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCreatedBy <em>CreatedBy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CreatedBy</em>' attribute.
	 * @see #getCreatedBy()
	 */
	public void setCreatedBy(String createdBy) {
		super.setByIndex(INDEX_CREATEDBY, createdBy);
	}

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
	public String getCreationDate() {
		return DataUtil.toString(super.getByIndex(INDEX_CREATIONDATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCreationDate <em>CreationDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CreationDate</em>' attribute.
	 * @see #getCreationDate()
	 */
	public void setCreationDate(String creationDate) {
		super.setByIndex(INDEX_CREATIONDATE, creationDate);
	}

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
	public String getLastUpdateBy() {
		return DataUtil.toString(super.getByIndex(INDEX_LASTUPDATEBY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getLastUpdateBy <em>LastUpdateBy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateBy</em>' attribute.
	 * @see #getLastUpdateBy()
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		super.setByIndex(INDEX_LASTUPDATEBY, lastUpdateBy);
	}

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
	public String getLastUpdateDate() {
		return DataUtil.toString(super.getByIndex(INDEX_LASTUPDATEDATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getLastUpdateDate <em>LastUpdateDate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateDate</em>' attribute.
	 * @see #getLastUpdateDate()
	 */
	public void setLastUpdateDate(String lastUpdateDate) {
		super.setByIndex(INDEX_LASTUPDATEDATE, lastUpdateDate);
	}

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
	public String getLastUpdateLogin() {
		return DataUtil.toString(super.getByIndex(INDEX_LASTUPDATELOGIN, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getLastUpdateLogin <em>LastUpdateLogin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LastUpdateLogin</em>' attribute.
	 * @see #getLastUpdateLogin()
	 */
	public void setLastUpdateLogin(String lastUpdateLogin) {
		super.setByIndex(INDEX_LASTUPDATELOGIN, lastUpdateLogin);
	}

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
	public String getAttribute1() {
		return DataUtil.toString(super.getByIndex(INDEX_ATTRIBUTE1, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAttribute1 <em>Attribute1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute1</em>' attribute.
	 * @see #getAttribute1()
	 */
	public void setAttribute1(String attribute1) {
		super.setByIndex(INDEX_ATTRIBUTE1, attribute1);
	}

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
	public String getAttribute2() {
		return DataUtil.toString(super.getByIndex(INDEX_ATTRIBUTE2, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAttribute2 <em>Attribute2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute2</em>' attribute.
	 * @see #getAttribute2()
	 */
	public void setAttribute2(String attribute2) {
		super.setByIndex(INDEX_ATTRIBUTE2, attribute2);
	}

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
	public String getAttribute3() {
		return DataUtil.toString(super.getByIndex(INDEX_ATTRIBUTE3, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAttribute3 <em>Attribute3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute3</em>' attribute.
	 * @see #getAttribute3()
	 */
	public void setAttribute3(String attribute3) {
		super.setByIndex(INDEX_ATTRIBUTE3, attribute3);
	}

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
	public String getAttribute4() {
		return DataUtil.toString(super.getByIndex(INDEX_ATTRIBUTE4, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAttribute4 <em>Attribute4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute4</em>' attribute.
	 * @see #getAttribute4()
	 */
	public void setAttribute4(String attribute4) {
		super.setByIndex(INDEX_ATTRIBUTE4, attribute4);
	}

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
	public String getAttribute5() {
		return DataUtil.toString(super.getByIndex(INDEX_ATTRIBUTE5, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5) {
		super.setByIndex(INDEX_ATTRIBUTE5, attribute5);
	}

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
	public String getEmployeeNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_EMPLOYEENUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getEmployeeNumber <em>EmployeeNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EmployeeNumber</em>' attribute.
	 * @see #getEmployeeNumber()
	 */
	public void setEmployeeNumber(String employeeNumber) {
		super.setByIndex(INDEX_EMPLOYEENUMBER, employeeNumber);
	}


}