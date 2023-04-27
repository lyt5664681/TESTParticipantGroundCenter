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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPriKey <em>PriKey</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgId <em>OrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getHrOrgCode <em>HrOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyCode <em>CompanyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyName <em>CompanyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCity <em>City</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgShortName <em>OrgShortName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getErporgShortName <em>ErporgShortName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgDescription <em>OrgDescription</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStylecode <em>OrgStylecode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStyle <em>OrgStyle</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgLevelCode <em>OrgLevelCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgLevel <em>OrgLevel</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getSupervisorLeader <em>SupervisorLeader</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getMainPrincipal <em>MainPrincipal</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getManager <em>Manager</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getManagerOrgId <em>ManagerOrgId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPostalAddress <em>PostalAddress</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPostalCode <em>PostalCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getTelephoneNumber <em>TelephoneNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getFaxNumber <em>FaxNumber</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getDisplayOrder <em>DisplayOrder</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStatusCode <em>OrgStatusCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStatus <em>OrgStatus</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getParentOrgCode <em>ParentOrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getParentOrgName <em>ParentOrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getClassifyCode <em>ClassifyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getClassifyName <em>ClassifyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getDepartmentManager <em>DepartmentManager</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getBusinessDutyCode <em>BusinessDutyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getBusinessDuty <em>BusinessDuty</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getMapId <em>MapId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyCcode <em>CompanyCcode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyDesp <em>CompanyDesp</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCstCode <em>CstCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCdtDesp <em>CdtDesp</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOperationTypeCode <em>OperationTypeCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOperationType <em>OperationType</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAssistantPrincipals <em>AssistantPrincipals</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute5 <em>Attribute5</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface WfpAfOrganization extends DataObject {

	public static final String QNAME = "com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization";

	public static final Type TYPE = TypeHelper.INSTANCE.getType("com.cmcc.participant.ground.dataset.CMCCUserDataset", "WfpAfOrganization");

	public static final IObjectFactory<WfpAfOrganization> FACTORY = new IObjectFactory<WfpAfOrganization>() {
		public WfpAfOrganization create() {
			return (WfpAfOrganization) DataFactory.INSTANCE.create(TYPE);
		}
	};

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgCode <em>OrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgCode</em>' attribute.
	 * @see #getOrgCode()
	 */
	public void setOrgCode(String orgCode);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPriKey <em>PriKey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PriKey</em>' attribute.
	 * @see #getPriKey()
	 */
	public void setPriKey(String priKey);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgId <em>OrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgId</em>' attribute.
	 * @see #getOrgId()
	 */
	public void setOrgId(String orgId);

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
	public String getHrOrgCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getHrOrgCode <em>HrOrgCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HrOrgCode</em>' attribute.
	 * @see #getHrOrgCode()
	 */
	public void setHrOrgCode(String hrOrgCode);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgName <em>OrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgName</em>' attribute.
	 * @see #getOrgName()
	 */
	public void setOrgName(String orgName);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyCode <em>CompanyCode</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyName <em>CompanyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyName</em>' attribute.
	 * @see #getCompanyName()
	 */
	public void setCompanyName(String companyName);

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
	public String getCity();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 */
	public void setCity(String city);

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
	public String getOrgShortName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgShortName <em>OrgShortName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgShortName</em>' attribute.
	 * @see #getOrgShortName()
	 */
	public void setOrgShortName(String orgShortName);

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
	public String getErporgShortName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getErporgShortName <em>ErporgShortName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ErporgShortName</em>' attribute.
	 * @see #getErporgShortName()
	 */
	public void setErporgShortName(String erporgShortName);

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
	public String getOrgDescription();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgDescription <em>OrgDescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgDescription</em>' attribute.
	 * @see #getOrgDescription()
	 */
	public void setOrgDescription(String orgDescription);

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
	public String getOrgStylecode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStylecode <em>OrgStylecode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStylecode</em>' attribute.
	 * @see #getOrgStylecode()
	 */
	public void setOrgStylecode(String orgStylecode);

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
	public String getOrgStyle();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStyle <em>OrgStyle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStyle</em>' attribute.
	 * @see #getOrgStyle()
	 */
	public void setOrgStyle(String orgStyle);

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
	public String getOrgLevelCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgLevelCode <em>OrgLevelCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgLevelCode</em>' attribute.
	 * @see #getOrgLevelCode()
	 */
	public void setOrgLevelCode(String orgLevelCode);

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
	public String getOrgLevel();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgLevel <em>OrgLevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgLevel</em>' attribute.
	 * @see #getOrgLevel()
	 */
	public void setOrgLevel(String orgLevel);

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
	public String getSupervisorLeader();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getSupervisorLeader <em>SupervisorLeader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SupervisorLeader</em>' attribute.
	 * @see #getSupervisorLeader()
	 */
	public void setSupervisorLeader(String supervisorLeader);

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
	public String getMainPrincipal();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getMainPrincipal <em>MainPrincipal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MainPrincipal</em>' attribute.
	 * @see #getMainPrincipal()
	 */
	public void setMainPrincipal(String mainPrincipal);

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
	public String getManager();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 */
	public void setManager(String manager);

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
	public String getManagerOrgId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getManagerOrgId <em>ManagerOrgId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ManagerOrgId</em>' attribute.
	 * @see #getManagerOrgId()
	 */
	public void setManagerOrgId(String managerOrgId);

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
	public String getPostalAddress();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPostalAddress <em>PostalAddress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PostalAddress</em>' attribute.
	 * @see #getPostalAddress()
	 */
	public void setPostalAddress(String postalAddress);

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
	public String getPostalCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getPostalCode <em>PostalCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PostalCode</em>' attribute.
	 * @see #getPostalCode()
	 */
	public void setPostalCode(String postalCode);

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
	public String getTelephoneNumber();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getTelephoneNumber <em>TelephoneNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TelephoneNumber</em>' attribute.
	 * @see #getTelephoneNumber()
	 */
	public void setTelephoneNumber(String telephoneNumber);

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
	public String getFaxNumber();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getFaxNumber <em>FaxNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FaxNumber</em>' attribute.
	 * @see #getFaxNumber()
	 */
	public void setFaxNumber(String faxNumber);

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
	public String getDisplayOrder();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getDisplayOrder <em>DisplayOrder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DisplayOrder</em>' attribute.
	 * @see #getDisplayOrder()
	 */
	public void setDisplayOrder(String displayOrder);

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
	public String getOrgStatusCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStatusCode <em>OrgStatusCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStatusCode</em>' attribute.
	 * @see #getOrgStatusCode()
	 */
	public void setOrgStatusCode(String orgStatusCode);

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
	public String getOrgStatus();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOrgStatus <em>OrgStatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgStatus</em>' attribute.
	 * @see #getOrgStatus()
	 */
	public void setOrgStatus(String orgStatus);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getParentOrgCode <em>ParentOrgCode</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getParentOrgName <em>ParentOrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ParentOrgName</em>' attribute.
	 * @see #getParentOrgName()
	 */
	public void setParentOrgName(String parentOrgName);

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
	public String getClassifyCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getClassifyCode <em>ClassifyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ClassifyCode</em>' attribute.
	 * @see #getClassifyCode()
	 */
	public void setClassifyCode(String classifyCode);

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
	public String getClassifyName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getClassifyName <em>ClassifyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ClassifyName</em>' attribute.
	 * @see #getClassifyName()
	 */
	public void setClassifyName(String classifyName);

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
	public String getDepartmentManager();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getDepartmentManager <em>DepartmentManager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DepartmentManager</em>' attribute.
	 * @see #getDepartmentManager()
	 */
	public void setDepartmentManager(String departmentManager);

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
	public String getBusinessDutyCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getBusinessDutyCode <em>BusinessDutyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BusinessDutyCode</em>' attribute.
	 * @see #getBusinessDutyCode()
	 */
	public void setBusinessDutyCode(String businessDutyCode);

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
	public String getBusinessDuty();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getBusinessDuty <em>BusinessDuty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BusinessDuty</em>' attribute.
	 * @see #getBusinessDuty()
	 */
	public void setBusinessDuty(String businessDuty);

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
	public String getMapId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getMapId <em>MapId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MapId</em>' attribute.
	 * @see #getMapId()
	 */
	public void setMapId(String mapId);

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
	public String getCompanyCcode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyCcode <em>CompanyCcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyCcode</em>' attribute.
	 * @see #getCompanyCcode()
	 */
	public void setCompanyCcode(String companyCcode);

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
	public String getCompanyDesp();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCompanyDesp <em>CompanyDesp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CompanyDesp</em>' attribute.
	 * @see #getCompanyDesp()
	 */
	public void setCompanyDesp(String companyDesp);

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
	public String getCstCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCstCode <em>CstCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CstCode</em>' attribute.
	 * @see #getCstCode()
	 */
	public void setCstCode(String cstCode);

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
	public String getCdtDesp();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCdtDesp <em>CdtDesp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CdtDesp</em>' attribute.
	 * @see #getCdtDesp()
	 */
	public void setCdtDesp(String cdtDesp);

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
	public String getOperationTypeCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOperationTypeCode <em>OperationTypeCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OperationTypeCode</em>' attribute.
	 * @see #getOperationTypeCode()
	 */
	public void setOperationTypeCode(String operationTypeCode);

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
	public String getOperationType();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getOperationType <em>OperationType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OperationType</em>' attribute.
	 * @see #getOperationType()
	 */
	public void setOperationType(String operationType);

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
	public String getAssistantPrincipals();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAssistantPrincipals <em>AssistantPrincipals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssistantPrincipals</em>' attribute.
	 * @see #getAssistantPrincipals()
	 */
	public void setAssistantPrincipals(String assistantPrincipals);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCreatedBy <em>CreatedBy</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getCreationDate <em>CreationDate</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateBy <em>LastUpdateBy</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateDate <em>LastUpdateDate</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getLastUpdateLogin <em>LastUpdateLogin</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute1 <em>Attribute1</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute2 <em>Attribute2</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute3 <em>Attribute3</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute4 <em>Attribute4</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfOrganization#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5);


}