/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset.impl;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization;
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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getPriKey <em>PriKey</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgId <em>OrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getHrOrgCode <em>HrOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCompanyCode <em>CompanyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCompanyName <em>CompanyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgShortName <em>OrgShortName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getErporgShortName <em>ErporgShortName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgDescription <em>OrgDescription</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgStylecode <em>OrgStylecode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgStyle <em>OrgStyle</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgLevelCode <em>OrgLevelCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgLevel <em>OrgLevel</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getSupervisorLeader <em>SupervisorLeader</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getMainPrincipal <em>MainPrincipal</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getManagerOrgId <em>ManagerOrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getPostalAddress <em>PostalAddress</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getPostalCode <em>PostalCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getTelephoneNumber <em>TelephoneNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getFaxNumber <em>FaxNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getDisplayOrder <em>DisplayOrder</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgStatusCode <em>OrgStatusCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOrgStatus <em>OrgStatus</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getParentOrgCode <em>ParentOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getParentOrgName <em>ParentOrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getClassifyCode <em>ClassifyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getClassifyName <em>ClassifyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getDepartmentManager <em>DepartmentManager</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getBusinessDutyCode <em>BusinessDutyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getBusinessDuty <em>BusinessDuty</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getMapId <em>MapId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCompanyCcode <em>CompanyCcode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCompanyDesp <em>CompanyDesp</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCstCode <em>CstCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCdtDesp <em>CdtDesp</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOperationTypeCode <em>OperationTypeCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getOperationType <em>OperationType</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAssistantPrincipals <em>AssistantPrincipals</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfOrganizationImpl#getAttribute5 <em>Attribute5</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements WfpAfOrganization;
 */

public class WfpAfOrganizationImpl extends ExtendedDataObjectImpl implements WfpAfOrganization {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ORGCODE = 0;
	public final static int INDEX_PRIKEY = 1;
	public final static int INDEX_ORGID = 2;
	public final static int INDEX_HRORGCODE = 3;
	public final static int INDEX_ORGNAME = 4;
	public final static int INDEX_COMPANYCODE = 5;
	public final static int INDEX_COMPANYNAME = 6;
	public final static int INDEX_CITY = 7;
	public final static int INDEX_ORGSHORTNAME = 8;
	public final static int INDEX_ERPORGSHORTNAME = 9;
	public final static int INDEX_ORGDESCRIPTION = 10;
	public final static int INDEX_ORGSTYLECODE = 11;
	public final static int INDEX_ORGSTYLE = 12;
	public final static int INDEX_ORGLEVELCODE = 13;
	public final static int INDEX_ORGLEVEL = 14;
	public final static int INDEX_SUPERVISORLEADER = 15;
	public final static int INDEX_MAINPRINCIPAL = 16;
	public final static int INDEX_MANAGER = 17;
	public final static int INDEX_MANAGERORGID = 18;
	public final static int INDEX_POSTALADDRESS = 19;
	public final static int INDEX_POSTALCODE = 20;
	public final static int INDEX_TELEPHONENUMBER = 21;
	public final static int INDEX_FAXNUMBER = 22;
	public final static int INDEX_DISPLAYORDER = 23;
	public final static int INDEX_ORGSTATUSCODE = 24;
	public final static int INDEX_ORGSTATUS = 25;
	public final static int INDEX_PARENTORGCODE = 26;
	public final static int INDEX_PARENTORGNAME = 27;
	public final static int INDEX_CLASSIFYCODE = 28;
	public final static int INDEX_CLASSIFYNAME = 29;
	public final static int INDEX_DEPARTMENTMANAGER = 30;
	public final static int INDEX_BUSINESSDUTYCODE = 31;
	public final static int INDEX_BUSINESSDUTY = 32;
	public final static int INDEX_MAPID = 33;
	public final static int INDEX_COMPANYCCODE = 34;
	public final static int INDEX_COMPANYDESP = 35;
	public final static int INDEX_CSTCODE = 36;
	public final static int INDEX_CDTDESP = 37;
	public final static int INDEX_OPERATIONTYPECODE = 38;
	public final static int INDEX_OPERATIONTYPE = 39;
	public final static int INDEX_ASSISTANTPRINCIPALS = 40;
	public final static int INDEX_CREATEDBY = 41;
	public final static int INDEX_CREATIONDATE = 42;
	public final static int INDEX_LASTUPDATEBY = 43;
	public final static int INDEX_LASTUPDATEDATE = 44;
	public final static int INDEX_LASTUPDATELOGIN = 45;
	public final static int INDEX_ATTRIBUTE1 = 46;
	public final static int INDEX_ATTRIBUTE2 = 47;
	public final static int INDEX_ATTRIBUTE3 = 48;
	public final static int INDEX_ATTRIBUTE4 = 49;
	public final static int INDEX_ATTRIBUTE5 = 50;
	public static final int SDO_PROPERTY_COUNT = 51;

	public static final int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfOrganizationImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfOrganizationImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
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
	 * Returns the value of the '<em><b>HrOrgCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HrOrgCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HrOrgCode</em>' attribute.
	 * @see #setHrOrgCode(java.lang.String)
	 */
	public String getHrOrgCode() {
		return DataUtil.toString(super.getByIndex(INDEX_HRORGCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getHrOrgCode <em>HrOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HrOrgCode</em>' attribute.
	 * @see #getHrOrgCode()
	 */
	public void setHrOrgCode(String hrOrgCode) {
		super.setByIndex(INDEX_HRORGCODE, hrOrgCode);
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
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(java.lang.String)
	 */
	public String getCity() {
		return DataUtil.toString(super.getByIndex(INDEX_CITY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 */
	public void setCity(String city) {
		super.setByIndex(INDEX_CITY, city);
	}

	/**
	 * Returns the value of the '<em><b>OrgShortName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgShortName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgShortName</em>' attribute.
	 * @see #setOrgShortName(java.lang.String)
	 */
	public String getOrgShortName() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGSHORTNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgShortName <em>OrgShortName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgShortName</em>' attribute.
	 * @see #getOrgShortName()
	 */
	public void setOrgShortName(String orgShortName) {
		super.setByIndex(INDEX_ORGSHORTNAME, orgShortName);
	}

	/**
	 * Returns the value of the '<em><b>ErporgShortName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ErporgShortName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ErporgShortName</em>' attribute.
	 * @see #setErporgShortName(java.lang.String)
	 */
	public String getErporgShortName() {
		return DataUtil.toString(super.getByIndex(INDEX_ERPORGSHORTNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getErporgShortName <em>ErporgShortName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ErporgShortName</em>' attribute.
	 * @see #getErporgShortName()
	 */
	public void setErporgShortName(String erporgShortName) {
		super.setByIndex(INDEX_ERPORGSHORTNAME, erporgShortName);
	}

	/**
	 * Returns the value of the '<em><b>OrgDescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgDescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgDescription</em>' attribute.
	 * @see #setOrgDescription(java.lang.String)
	 */
	public String getOrgDescription() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGDESCRIPTION, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgDescription <em>OrgDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgDescription</em>' attribute.
	 * @see #getOrgDescription()
	 */
	public void setOrgDescription(String orgDescription) {
		super.setByIndex(INDEX_ORGDESCRIPTION, orgDescription);
	}

	/**
	 * Returns the value of the '<em><b>OrgStylecode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgStylecode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgStylecode</em>' attribute.
	 * @see #setOrgStylecode(java.lang.String)
	 */
	public String getOrgStylecode() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGSTYLECODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgStylecode <em>OrgStylecode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStylecode</em>' attribute.
	 * @see #getOrgStylecode()
	 */
	public void setOrgStylecode(String orgStylecode) {
		super.setByIndex(INDEX_ORGSTYLECODE, orgStylecode);
	}

	/**
	 * Returns the value of the '<em><b>OrgStyle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgStyle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgStyle</em>' attribute.
	 * @see #setOrgStyle(java.lang.String)
	 */
	public String getOrgStyle() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGSTYLE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgStyle <em>OrgStyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStyle</em>' attribute.
	 * @see #getOrgStyle()
	 */
	public void setOrgStyle(String orgStyle) {
		super.setByIndex(INDEX_ORGSTYLE, orgStyle);
	}

	/**
	 * Returns the value of the '<em><b>OrgLevelCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgLevelCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgLevelCode</em>' attribute.
	 * @see #setOrgLevelCode(java.lang.String)
	 */
	public String getOrgLevelCode() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGLEVELCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgLevelCode <em>OrgLevelCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgLevelCode</em>' attribute.
	 * @see #getOrgLevelCode()
	 */
	public void setOrgLevelCode(String orgLevelCode) {
		super.setByIndex(INDEX_ORGLEVELCODE, orgLevelCode);
	}

	/**
	 * Returns the value of the '<em><b>OrgLevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgLevel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgLevel</em>' attribute.
	 * @see #setOrgLevel(java.lang.String)
	 */
	public String getOrgLevel() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGLEVEL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgLevel <em>OrgLevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgLevel</em>' attribute.
	 * @see #getOrgLevel()
	 */
	public void setOrgLevel(String orgLevel) {
		super.setByIndex(INDEX_ORGLEVEL, orgLevel);
	}

	/**
	 * Returns the value of the '<em><b>SupervisorLeader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SupervisorLeader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SupervisorLeader</em>' attribute.
	 * @see #setSupervisorLeader(java.lang.String)
	 */
	public String getSupervisorLeader() {
		return DataUtil.toString(super.getByIndex(INDEX_SUPERVISORLEADER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getSupervisorLeader <em>SupervisorLeader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SupervisorLeader</em>' attribute.
	 * @see #getSupervisorLeader()
	 */
	public void setSupervisorLeader(String supervisorLeader) {
		super.setByIndex(INDEX_SUPERVISORLEADER, supervisorLeader);
	}

	/**
	 * Returns the value of the '<em><b>MainPrincipal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MainPrincipal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MainPrincipal</em>' attribute.
	 * @see #setMainPrincipal(java.lang.String)
	 */
	public String getMainPrincipal() {
		return DataUtil.toString(super.getByIndex(INDEX_MAINPRINCIPAL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getMainPrincipal <em>MainPrincipal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MainPrincipal</em>' attribute.
	 * @see #getMainPrincipal()
	 */
	public void setMainPrincipal(String mainPrincipal) {
		super.setByIndex(INDEX_MAINPRINCIPAL, mainPrincipal);
	}

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(java.lang.String)
	 */
	public String getManager() {
		return DataUtil.toString(super.getByIndex(INDEX_MANAGER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 */
	public void setManager(String manager) {
		super.setByIndex(INDEX_MANAGER, manager);
	}

	/**
	 * Returns the value of the '<em><b>ManagerOrgId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ManagerOrgId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ManagerOrgId</em>' attribute.
	 * @see #setManagerOrgId(java.lang.String)
	 */
	public String getManagerOrgId() {
		return DataUtil.toString(super.getByIndex(INDEX_MANAGERORGID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getManagerOrgId <em>ManagerOrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ManagerOrgId</em>' attribute.
	 * @see #getManagerOrgId()
	 */
	public void setManagerOrgId(String managerOrgId) {
		super.setByIndex(INDEX_MANAGERORGID, managerOrgId);
	}

	/**
	 * Returns the value of the '<em><b>PostalAddress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PostalAddress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PostalAddress</em>' attribute.
	 * @see #setPostalAddress(java.lang.String)
	 */
	public String getPostalAddress() {
		return DataUtil.toString(super.getByIndex(INDEX_POSTALADDRESS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPostalAddress <em>PostalAddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PostalAddress</em>' attribute.
	 * @see #getPostalAddress()
	 */
	public void setPostalAddress(String postalAddress) {
		super.setByIndex(INDEX_POSTALADDRESS, postalAddress);
	}

	/**
	 * Returns the value of the '<em><b>PostalCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PostalCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PostalCode</em>' attribute.
	 * @see #setPostalCode(java.lang.String)
	 */
	public String getPostalCode() {
		return DataUtil.toString(super.getByIndex(INDEX_POSTALCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPostalCode <em>PostalCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PostalCode</em>' attribute.
	 * @see #getPostalCode()
	 */
	public void setPostalCode(String postalCode) {
		super.setByIndex(INDEX_POSTALCODE, postalCode);
	}

	/**
	 * Returns the value of the '<em><b>TelephoneNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TelephoneNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TelephoneNumber</em>' attribute.
	 * @see #setTelephoneNumber(java.lang.String)
	 */
	public String getTelephoneNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_TELEPHONENUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getTelephoneNumber <em>TelephoneNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TelephoneNumber</em>' attribute.
	 * @see #getTelephoneNumber()
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		super.setByIndex(INDEX_TELEPHONENUMBER, telephoneNumber);
	}

	/**
	 * Returns the value of the '<em><b>FaxNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FaxNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FaxNumber</em>' attribute.
	 * @see #setFaxNumber(java.lang.String)
	 */
	public String getFaxNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_FAXNUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getFaxNumber <em>FaxNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FaxNumber</em>' attribute.
	 * @see #getFaxNumber()
	 */
	public void setFaxNumber(String faxNumber) {
		super.setByIndex(INDEX_FAXNUMBER, faxNumber);
	}

	/**
	 * Returns the value of the '<em><b>DisplayOrder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DisplayOrder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DisplayOrder</em>' attribute.
	 * @see #setDisplayOrder(java.lang.String)
	 */
	public String getDisplayOrder() {
		return DataUtil.toString(super.getByIndex(INDEX_DISPLAYORDER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getDisplayOrder <em>DisplayOrder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DisplayOrder</em>' attribute.
	 * @see #getDisplayOrder()
	 */
	public void setDisplayOrder(String displayOrder) {
		super.setByIndex(INDEX_DISPLAYORDER, displayOrder);
	}

	/**
	 * Returns the value of the '<em><b>OrgStatusCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgStatusCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgStatusCode</em>' attribute.
	 * @see #setOrgStatusCode(java.lang.String)
	 */
	public String getOrgStatusCode() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGSTATUSCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgStatusCode <em>OrgStatusCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStatusCode</em>' attribute.
	 * @see #getOrgStatusCode()
	 */
	public void setOrgStatusCode(String orgStatusCode) {
		super.setByIndex(INDEX_ORGSTATUSCODE, orgStatusCode);
	}

	/**
	 * Returns the value of the '<em><b>OrgStatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OrgStatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OrgStatus</em>' attribute.
	 * @see #setOrgStatus(java.lang.String)
	 */
	public String getOrgStatus() {
		return DataUtil.toString(super.getByIndex(INDEX_ORGSTATUS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOrgStatus <em>OrgStatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStatus</em>' attribute.
	 * @see #getOrgStatus()
	 */
	public void setOrgStatus(String orgStatus) {
		super.setByIndex(INDEX_ORGSTATUS, orgStatus);
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
	 * Returns the value of the '<em><b>ClassifyCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ClassifyCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ClassifyCode</em>' attribute.
	 * @see #setClassifyCode(java.lang.String)
	 */
	public String getClassifyCode() {
		return DataUtil.toString(super.getByIndex(INDEX_CLASSIFYCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getClassifyCode <em>ClassifyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ClassifyCode</em>' attribute.
	 * @see #getClassifyCode()
	 */
	public void setClassifyCode(String classifyCode) {
		super.setByIndex(INDEX_CLASSIFYCODE, classifyCode);
	}

	/**
	 * Returns the value of the '<em><b>ClassifyName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ClassifyName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ClassifyName</em>' attribute.
	 * @see #setClassifyName(java.lang.String)
	 */
	public String getClassifyName() {
		return DataUtil.toString(super.getByIndex(INDEX_CLASSIFYNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getClassifyName <em>ClassifyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ClassifyName</em>' attribute.
	 * @see #getClassifyName()
	 */
	public void setClassifyName(String classifyName) {
		super.setByIndex(INDEX_CLASSIFYNAME, classifyName);
	}

	/**
	 * Returns the value of the '<em><b>DepartmentManager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DepartmentManager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DepartmentManager</em>' attribute.
	 * @see #setDepartmentManager(java.lang.String)
	 */
	public String getDepartmentManager() {
		return DataUtil.toString(super.getByIndex(INDEX_DEPARTMENTMANAGER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getDepartmentManager <em>DepartmentManager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DepartmentManager</em>' attribute.
	 * @see #getDepartmentManager()
	 */
	public void setDepartmentManager(String departmentManager) {
		super.setByIndex(INDEX_DEPARTMENTMANAGER, departmentManager);
	}

	/**
	 * Returns the value of the '<em><b>BusinessDutyCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BusinessDutyCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BusinessDutyCode</em>' attribute.
	 * @see #setBusinessDutyCode(java.lang.String)
	 */
	public String getBusinessDutyCode() {
		return DataUtil.toString(super.getByIndex(INDEX_BUSINESSDUTYCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getBusinessDutyCode <em>BusinessDutyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BusinessDutyCode</em>' attribute.
	 * @see #getBusinessDutyCode()
	 */
	public void setBusinessDutyCode(String businessDutyCode) {
		super.setByIndex(INDEX_BUSINESSDUTYCODE, businessDutyCode);
	}

	/**
	 * Returns the value of the '<em><b>BusinessDuty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BusinessDuty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BusinessDuty</em>' attribute.
	 * @see #setBusinessDuty(java.lang.String)
	 */
	public String getBusinessDuty() {
		return DataUtil.toString(super.getByIndex(INDEX_BUSINESSDUTY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getBusinessDuty <em>BusinessDuty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BusinessDuty</em>' attribute.
	 * @see #getBusinessDuty()
	 */
	public void setBusinessDuty(String businessDuty) {
		super.setByIndex(INDEX_BUSINESSDUTY, businessDuty);
	}

	/**
	 * Returns the value of the '<em><b>MapId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MapId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MapId</em>' attribute.
	 * @see #setMapId(java.lang.String)
	 */
	public String getMapId() {
		return DataUtil.toString(super.getByIndex(INDEX_MAPID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getMapId <em>MapId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MapId</em>' attribute.
	 * @see #getMapId()
	 */
	public void setMapId(String mapId) {
		super.setByIndex(INDEX_MAPID, mapId);
	}

	/**
	 * Returns the value of the '<em><b>CompanyCcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompanyCcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CompanyCcode</em>' attribute.
	 * @see #setCompanyCcode(java.lang.String)
	 */
	public String getCompanyCcode() {
		return DataUtil.toString(super.getByIndex(INDEX_COMPANYCCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCompanyCcode <em>CompanyCcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyCcode</em>' attribute.
	 * @see #getCompanyCcode()
	 */
	public void setCompanyCcode(String companyCcode) {
		super.setByIndex(INDEX_COMPANYCCODE, companyCcode);
	}

	/**
	 * Returns the value of the '<em><b>CompanyDesp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CompanyDesp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CompanyDesp</em>' attribute.
	 * @see #setCompanyDesp(java.lang.String)
	 */
	public String getCompanyDesp() {
		return DataUtil.toString(super.getByIndex(INDEX_COMPANYDESP, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCompanyDesp <em>CompanyDesp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyDesp</em>' attribute.
	 * @see #getCompanyDesp()
	 */
	public void setCompanyDesp(String companyDesp) {
		super.setByIndex(INDEX_COMPANYDESP, companyDesp);
	}

	/**
	 * Returns the value of the '<em><b>CstCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CstCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CstCode</em>' attribute.
	 * @see #setCstCode(java.lang.String)
	 */
	public String getCstCode() {
		return DataUtil.toString(super.getByIndex(INDEX_CSTCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCstCode <em>CstCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CstCode</em>' attribute.
	 * @see #getCstCode()
	 */
	public void setCstCode(String cstCode) {
		super.setByIndex(INDEX_CSTCODE, cstCode);
	}

	/**
	 * Returns the value of the '<em><b>CdtDesp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CdtDesp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CdtDesp</em>' attribute.
	 * @see #setCdtDesp(java.lang.String)
	 */
	public String getCdtDesp() {
		return DataUtil.toString(super.getByIndex(INDEX_CDTDESP, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getCdtDesp <em>CdtDesp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CdtDesp</em>' attribute.
	 * @see #getCdtDesp()
	 */
	public void setCdtDesp(String cdtDesp) {
		super.setByIndex(INDEX_CDTDESP, cdtDesp);
	}

	/**
	 * Returns the value of the '<em><b>OperationTypeCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OperationTypeCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OperationTypeCode</em>' attribute.
	 * @see #setOperationTypeCode(java.lang.String)
	 */
	public String getOperationTypeCode() {
		return DataUtil.toString(super.getByIndex(INDEX_OPERATIONTYPECODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOperationTypeCode <em>OperationTypeCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OperationTypeCode</em>' attribute.
	 * @see #getOperationTypeCode()
	 */
	public void setOperationTypeCode(String operationTypeCode) {
		super.setByIndex(INDEX_OPERATIONTYPECODE, operationTypeCode);
	}

	/**
	 * Returns the value of the '<em><b>OperationType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OperationType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OperationType</em>' attribute.
	 * @see #setOperationType(java.lang.String)
	 */
	public String getOperationType() {
		return DataUtil.toString(super.getByIndex(INDEX_OPERATIONTYPE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getOperationType <em>OperationType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OperationType</em>' attribute.
	 * @see #getOperationType()
	 */
	public void setOperationType(String operationType) {
		super.setByIndex(INDEX_OPERATIONTYPE, operationType);
	}

	/**
	 * Returns the value of the '<em><b>AssistantPrincipals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssistantPrincipals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssistantPrincipals</em>' attribute.
	 * @see #setAssistantPrincipals(java.lang.String)
	 */
	public String getAssistantPrincipals() {
		return DataUtil.toString(super.getByIndex(INDEX_ASSISTANTPRINCIPALS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssistantPrincipals <em>AssistantPrincipals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssistantPrincipals</em>' attribute.
	 * @see #getAssistantPrincipals()
	 */
	public void setAssistantPrincipals(String assistantPrincipals) {
		super.setByIndex(INDEX_ASSISTANTPRINCIPALS, assistantPrincipals);
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


}