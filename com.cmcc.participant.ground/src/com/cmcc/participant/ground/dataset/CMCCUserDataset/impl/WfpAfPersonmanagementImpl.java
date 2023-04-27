/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset.impl;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfPersonmanagement;
import com.primeton.ext.data.sdo.DataUtil;
import com.primeton.ext.data.sdo.ExtendedDataObjectImpl;

import commonj.sdo.Type;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmId <em>PmId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmRoleId <em>PmRoleId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmRoleName <em>PmRoleName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmTenantid <em>PmTenantid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmProvinceCode <em>PmProvinceCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmCityCode <em>PmCityCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmPersonId <em>PmPersonId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmPersonName <em>PmPersonName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmPersonState <em>PmPersonState</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmMechanism <em>PmMechanism</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmBusiness <em>PmBusiness</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmCreatetime <em>PmCreatetime</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmMechanismCode <em>PmMechanismCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmBusinessCode <em>PmBusinessCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmApprovalMechanism <em>PmApprovalMechanism</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfPersonmanagementImpl#getPmApprovalMechanismCode <em>PmApprovalMechanismCode</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements WfpAfPersonmanagement;
 */

public class WfpAfPersonmanagementImpl extends ExtendedDataObjectImpl implements WfpAfPersonmanagement {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_PMID = 0;
	public final static int INDEX_PMROLEID = 1;
	public final static int INDEX_PMROLENAME = 2;
	public final static int INDEX_PMTENANTID = 3;
	public final static int INDEX_PMPROVINCECODE = 4;
	public final static int INDEX_PMCITYCODE = 5;
	public final static int INDEX_PMPERSONID = 6;
	public final static int INDEX_PMPERSONNAME = 7;
	public final static int INDEX_PMPERSONSTATE = 8;
	public final static int INDEX_PMMECHANISM = 9;
	public final static int INDEX_PMBUSINESS = 10;
	public final static int INDEX_PMCREATETIME = 11;
	public final static int INDEX_ATTRIBUTE1 = 12;
	public final static int INDEX_ATTRIBUTE2 = 13;
	public final static int INDEX_ATTRIBUTE3 = 14;
	public final static int INDEX_ATTRIBUTE4 = 15;
	public final static int INDEX_ATTRIBUTE5 = 16;
	public final static int INDEX_PMMECHANISMCODE = 17;
	public final static int INDEX_PMBUSINESSCODE = 18;
	public final static int INDEX_PMAPPROVALMECHANISM = 19;
	public final static int INDEX_PMAPPROVALMECHANISMCODE = 20;
	public static final int SDO_PROPERTY_COUNT = 21;

	public static final int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfPersonmanagementImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfPersonmanagementImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
	}

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
	public String getPmId() {
		return DataUtil.toString(super.getByIndex(INDEX_PMID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmId <em>PmId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmId</em>' attribute.
	 * @see #getPmId()
	 */
	public void setPmId(String pmId) {
		super.setByIndex(INDEX_PMID, pmId);
	}

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
	public String getPmRoleId() {
		return DataUtil.toString(super.getByIndex(INDEX_PMROLEID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmRoleId <em>PmRoleId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmRoleId</em>' attribute.
	 * @see #getPmRoleId()
	 */
	public void setPmRoleId(String pmRoleId) {
		super.setByIndex(INDEX_PMROLEID, pmRoleId);
	}

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
	public String getPmRoleName() {
		return DataUtil.toString(super.getByIndex(INDEX_PMROLENAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmRoleName <em>PmRoleName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmRoleName</em>' attribute.
	 * @see #getPmRoleName()
	 */
	public void setPmRoleName(String pmRoleName) {
		super.setByIndex(INDEX_PMROLENAME, pmRoleName);
	}

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
	public String getPmTenantid() {
		return DataUtil.toString(super.getByIndex(INDEX_PMTENANTID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmTenantid <em>PmTenantid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmTenantid</em>' attribute.
	 * @see #getPmTenantid()
	 */
	public void setPmTenantid(String pmTenantid) {
		super.setByIndex(INDEX_PMTENANTID, pmTenantid);
	}

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
	public String getPmProvinceCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PMPROVINCECODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmProvinceCode <em>PmProvinceCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmProvinceCode</em>' attribute.
	 * @see #getPmProvinceCode()
	 */
	public void setPmProvinceCode(String pmProvinceCode) {
		super.setByIndex(INDEX_PMPROVINCECODE, pmProvinceCode);
	}

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
	public String getPmCityCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PMCITYCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmCityCode <em>PmCityCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmCityCode</em>' attribute.
	 * @see #getPmCityCode()
	 */
	public void setPmCityCode(String pmCityCode) {
		super.setByIndex(INDEX_PMCITYCODE, pmCityCode);
	}

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
	public String getPmPersonId() {
		return DataUtil.toString(super.getByIndex(INDEX_PMPERSONID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmPersonId <em>PmPersonId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonId</em>' attribute.
	 * @see #getPmPersonId()
	 */
	public void setPmPersonId(String pmPersonId) {
		super.setByIndex(INDEX_PMPERSONID, pmPersonId);
	}

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
	public String getPmPersonName() {
		return DataUtil.toString(super.getByIndex(INDEX_PMPERSONNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmPersonName <em>PmPersonName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonName</em>' attribute.
	 * @see #getPmPersonName()
	 */
	public void setPmPersonName(String pmPersonName) {
		super.setByIndex(INDEX_PMPERSONNAME, pmPersonName);
	}

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
	public String getPmPersonState() {
		return DataUtil.toString(super.getByIndex(INDEX_PMPERSONSTATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmPersonState <em>PmPersonState</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmPersonState</em>' attribute.
	 * @see #getPmPersonState()
	 */
	public void setPmPersonState(String pmPersonState) {
		super.setByIndex(INDEX_PMPERSONSTATE, pmPersonState);
	}

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
	public String getPmMechanism() {
		return DataUtil.toString(super.getByIndex(INDEX_PMMECHANISM, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmMechanism <em>PmMechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmMechanism</em>' attribute.
	 * @see #getPmMechanism()
	 */
	public void setPmMechanism(String pmMechanism) {
		super.setByIndex(INDEX_PMMECHANISM, pmMechanism);
	}

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
	public String getPmBusiness() {
		return DataUtil.toString(super.getByIndex(INDEX_PMBUSINESS, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmBusiness <em>PmBusiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmBusiness</em>' attribute.
	 * @see #getPmBusiness()
	 */
	public void setPmBusiness(String pmBusiness) {
		super.setByIndex(INDEX_PMBUSINESS, pmBusiness);
	}

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
	public Date getPmCreatetime() {
		return DataUtil.toDate(super.getByIndex(INDEX_PMCREATETIME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmCreatetime <em>PmCreatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmCreatetime</em>' attribute.
	 * @see #getPmCreatetime()
	 */
	public void setPmCreatetime(Date pmCreatetime) {
		super.setByIndex(INDEX_PMCREATETIME, pmCreatetime);
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
	public String getPmMechanismCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PMMECHANISMCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmMechanismCode <em>PmMechanismCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmMechanismCode</em>' attribute.
	 * @see #getPmMechanismCode()
	 */
	public void setPmMechanismCode(String pmMechanismCode) {
		super.setByIndex(INDEX_PMMECHANISMCODE, pmMechanismCode);
	}

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
	public String getPmBusinessCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PMBUSINESSCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmBusinessCode <em>PmBusinessCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmBusinessCode</em>' attribute.
	 * @see #getPmBusinessCode()
	 */
	public void setPmBusinessCode(String pmBusinessCode) {
		super.setByIndex(INDEX_PMBUSINESSCODE, pmBusinessCode);
	}

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
	public String getPmApprovalMechanism() {
		return DataUtil.toString(super.getByIndex(INDEX_PMAPPROVALMECHANISM, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmApprovalMechanism <em>PmApprovalMechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmApprovalMechanism</em>' attribute.
	 * @see #getPmApprovalMechanism()
	 */
	public void setPmApprovalMechanism(String pmApprovalMechanism) {
		super.setByIndex(INDEX_PMAPPROVALMECHANISM, pmApprovalMechanism);
	}

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
	public String getPmApprovalMechanismCode() {
		return DataUtil.toString(super.getByIndex(INDEX_PMAPPROVALMECHANISMCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPmApprovalMechanismCode <em>PmApprovalMechanismCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PmApprovalMechanismCode</em>' attribute.
	 * @see #getPmApprovalMechanismCode()
	 */
	public void setPmApprovalMechanismCode(String pmApprovalMechanismCode) {
		super.setByIndex(INDEX_PMAPPROVALMECHANISMCODE, pmApprovalMechanismCode);
	}


}