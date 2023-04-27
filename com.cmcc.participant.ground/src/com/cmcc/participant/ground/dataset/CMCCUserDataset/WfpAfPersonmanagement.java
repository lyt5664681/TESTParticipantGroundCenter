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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmId <em>PmId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmRoleId <em>PmRoleId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmRoleName <em>PmRoleName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmTenantid <em>PmTenantid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmProvinceCode <em>PmProvinceCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmCityCode <em>PmCityCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonId <em>PmPersonId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonName <em>PmPersonName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonState <em>PmPersonState</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmMechanism <em>PmMechanism</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmBusiness <em>PmBusiness</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmCreatetime <em>PmCreatetime</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmMechanismCode <em>PmMechanismCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmBusinessCode <em>PmBusinessCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmApprovalMechanism <em>PmApprovalMechanism</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmApprovalMechanismCode <em>PmApprovalMechanismCode</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface WfpAfPersonmanagement extends DataObject {

	public static final String QNAME = "com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement";

	public static final Type TYPE = TypeHelper.INSTANCE.getType("com.cmcc.participant.ground.dataset.CMCCUserDataset", "WfpAfPersonmanagement");

	public static final IObjectFactory<WfpAfPersonmanagement> FACTORY = new IObjectFactory<WfpAfPersonmanagement>() {
		public WfpAfPersonmanagement create() {
			return (WfpAfPersonmanagement) DataFactory.INSTANCE.create(TYPE);
		}
	};

	/**
	 * Returns the value of the '<em><b>PmId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmId</em>' attribute.
	 * @see #setPmId(java.lang.String)
	 */
	public String getPmId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmId <em>PmId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmId</em>' attribute.
	 * @see #getPmId()
	 */
	public void setPmId(String pmId);

	/**
	 * Returns the value of the '<em><b>PmRoleId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmRoleId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmRoleId</em>' attribute.
	 * @see #setPmRoleId(java.lang.String)
	 */
	public String getPmRoleId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmRoleId <em>PmRoleId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmRoleId</em>' attribute.
	 * @see #getPmRoleId()
	 */
	public void setPmRoleId(String pmRoleId);

	/**
	 * Returns the value of the '<em><b>PmRoleName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmRoleName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmRoleName</em>' attribute.
	 * @see #setPmRoleName(java.lang.String)
	 */
	public String getPmRoleName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmRoleName <em>PmRoleName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmRoleName</em>' attribute.
	 * @see #getPmRoleName()
	 */
	public void setPmRoleName(String pmRoleName);

	/**
	 * Returns the value of the '<em><b>PmTenantid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmTenantid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmTenantid</em>' attribute.
	 * @see #setPmTenantid(java.lang.String)
	 */
	public String getPmTenantid();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmTenantid <em>PmTenantid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmTenantid</em>' attribute.
	 * @see #getPmTenantid()
	 */
	public void setPmTenantid(String pmTenantid);

	/**
	 * Returns the value of the '<em><b>PmProvinceCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmProvinceCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmProvinceCode</em>' attribute.
	 * @see #setPmProvinceCode(java.lang.String)
	 */
	public String getPmProvinceCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmProvinceCode <em>PmProvinceCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmProvinceCode</em>' attribute.
	 * @see #getPmProvinceCode()
	 */
	public void setPmProvinceCode(String pmProvinceCode);

	/**
	 * Returns the value of the '<em><b>PmCityCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmCityCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmCityCode</em>' attribute.
	 * @see #setPmCityCode(java.lang.String)
	 */
	public String getPmCityCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmCityCode <em>PmCityCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmCityCode</em>' attribute.
	 * @see #getPmCityCode()
	 */
	public void setPmCityCode(String pmCityCode);

	/**
	 * Returns the value of the '<em><b>PmPersonId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmPersonId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmPersonId</em>' attribute.
	 * @see #setPmPersonId(java.lang.String)
	 */
	public String getPmPersonId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonId <em>PmPersonId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonId</em>' attribute.
	 * @see #getPmPersonId()
	 */
	public void setPmPersonId(String pmPersonId);

	/**
	 * Returns the value of the '<em><b>PmPersonName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmPersonName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmPersonName</em>' attribute.
	 * @see #setPmPersonName(java.lang.String)
	 */
	public String getPmPersonName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonName <em>PmPersonName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonName</em>' attribute.
	 * @see #getPmPersonName()
	 */
	public void setPmPersonName(String pmPersonName);

	/**
	 * Returns the value of the '<em><b>PmPersonState</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmPersonState</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmPersonState</em>' attribute.
	 * @see #setPmPersonState(java.lang.String)
	 */
	public String getPmPersonState();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmPersonState <em>PmPersonState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonState</em>' attribute.
	 * @see #getPmPersonState()
	 */
	public void setPmPersonState(String pmPersonState);

	/**
	 * Returns the value of the '<em><b>PmMechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmMechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmMechanism</em>' attribute.
	 * @see #setPmMechanism(java.lang.String)
	 */
	public String getPmMechanism();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmMechanism <em>PmMechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmMechanism</em>' attribute.
	 * @see #getPmMechanism()
	 */
	public void setPmMechanism(String pmMechanism);

	/**
	 * Returns the value of the '<em><b>PmBusiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmBusiness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmBusiness</em>' attribute.
	 * @see #setPmBusiness(java.lang.String)
	 */
	public String getPmBusiness();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmBusiness <em>PmBusiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmBusiness</em>' attribute.
	 * @see #getPmBusiness()
	 */
	public void setPmBusiness(String pmBusiness);

	/**
	 * Returns the value of the '<em><b>PmCreatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmCreatetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmCreatetime</em>' attribute.
	 * @see #setPmCreatetime(java.util.Date)
	 */
	public Date getPmCreatetime();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmCreatetime <em>PmCreatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmCreatetime</em>' attribute.
	 * @see #getPmCreatetime()
	 */
	public void setPmCreatetime(Date pmCreatetime);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute1 <em>Attribute1</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute2 <em>Attribute2</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute3 <em>Attribute3</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute4 <em>Attribute4</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5);

	/**
	 * Returns the value of the '<em><b>PmMechanismCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmMechanismCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmMechanismCode</em>' attribute.
	 * @see #setPmMechanismCode(java.lang.String)
	 */
	public String getPmMechanismCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmMechanismCode <em>PmMechanismCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmMechanismCode</em>' attribute.
	 * @see #getPmMechanismCode()
	 */
	public void setPmMechanismCode(String pmMechanismCode);

	/**
	 * Returns the value of the '<em><b>PmBusinessCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmBusinessCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmBusinessCode</em>' attribute.
	 * @see #setPmBusinessCode(java.lang.String)
	 */
	public String getPmBusinessCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmBusinessCode <em>PmBusinessCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmBusinessCode</em>' attribute.
	 * @see #getPmBusinessCode()
	 */
	public void setPmBusinessCode(String pmBusinessCode);

	/**
	 * Returns the value of the '<em><b>PmApprovalMechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmApprovalMechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmApprovalMechanism</em>' attribute.
	 * @see #setPmApprovalMechanism(java.lang.String)
	 */
	public String getPmApprovalMechanism();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmApprovalMechanism <em>PmApprovalMechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmApprovalMechanism</em>' attribute.
	 * @see #getPmApprovalMechanism()
	 */
	public void setPmApprovalMechanism(String pmApprovalMechanism);

	/**
	 * Returns the value of the '<em><b>PmApprovalMechanismCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PmApprovalMechanismCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PmApprovalMechanismCode</em>' attribute.
	 * @see #setPmApprovalMechanismCode(java.lang.String)
	 */
	public String getPmApprovalMechanismCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement#getPmApprovalMechanismCode <em>PmApprovalMechanismCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmApprovalMechanismCode</em>' attribute.
	 * @see #getPmApprovalMechanismCode()
	 */
	public void setPmApprovalMechanismCode(String pmApprovalMechanismCode);


}