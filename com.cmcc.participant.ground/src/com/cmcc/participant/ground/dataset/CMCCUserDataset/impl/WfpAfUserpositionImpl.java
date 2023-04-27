/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset.impl;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition;
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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getPositionId <em>PositionId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getUserAccount <em>UserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getDisplayOrder <em>DisplayOrder</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getDutyCode <em>DutyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getDutyName <em>DutyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getMainOrg <em>MainOrg</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfUserpositionImpl#getAttribute5 <em>Attribute5</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements WfpAfUserposition;
 */

public class WfpAfUserpositionImpl extends ExtendedDataObjectImpl implements WfpAfUserposition {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_POSITIONID = 0;
	public final static int INDEX_USERACCOUNT = 1;
	public final static int INDEX_ORGCODE = 2;
	public final static int INDEX_ORGNAME = 3;
	public final static int INDEX_DISPLAYORDER = 4;
	public final static int INDEX_DUTYCODE = 5;
	public final static int INDEX_DUTYNAME = 6;
	public final static int INDEX_MAINORG = 7;
	public final static int INDEX_CREATEDBY = 8;
	public final static int INDEX_CREATIONDATE = 9;
	public final static int INDEX_LASTUPDATEBY = 10;
	public final static int INDEX_LASTUPDATEDATE = 11;
	public final static int INDEX_LASTUPDATELOGIN = 12;
	public final static int INDEX_ATTRIBUTE1 = 13;
	public final static int INDEX_ATTRIBUTE2 = 14;
	public final static int INDEX_ATTRIBUTE3 = 15;
	public final static int INDEX_ATTRIBUTE4 = 16;
	public final static int INDEX_ATTRIBUTE5 = 17;
	public static final int SDO_PROPERTY_COUNT = 18;

	public static final int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfUserpositionImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfUserpositionImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
	}

	/**
	 * Returns the value of the '<em><b>PositionId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PositionId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PositionId</em>' attribute.
	 * @see #setPositionId(long)
	 */
	public long getPositionId() {
		return DataUtil.toLong(super.getByIndex(INDEX_POSITIONID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPositionId <em>PositionId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PositionId</em>' attribute.
	 * @see #getPositionId()
	 */
	public void setPositionId(long positionId) {
		super.setByIndex(INDEX_POSITIONID, positionId);
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
	 * Returns the value of the '<em><b>DutyCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DutyCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DutyCode</em>' attribute.
	 * @see #setDutyCode(java.lang.String)
	 */
	public String getDutyCode() {
		return DataUtil.toString(super.getByIndex(INDEX_DUTYCODE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getDutyCode <em>DutyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DutyCode</em>' attribute.
	 * @see #getDutyCode()
	 */
	public void setDutyCode(String dutyCode) {
		super.setByIndex(INDEX_DUTYCODE, dutyCode);
	}

	/**
	 * Returns the value of the '<em><b>DutyName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DutyName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DutyName</em>' attribute.
	 * @see #setDutyName(java.lang.String)
	 */
	public String getDutyName() {
		return DataUtil.toString(super.getByIndex(INDEX_DUTYNAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getDutyName <em>DutyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DutyName</em>' attribute.
	 * @see #getDutyName()
	 */
	public void setDutyName(String dutyName) {
		super.setByIndex(INDEX_DUTYNAME, dutyName);
	}

	/**
	 * Returns the value of the '<em><b>MainOrg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MainOrg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MainOrg</em>' attribute.
	 * @see #setMainOrg(java.lang.String)
	 */
	public String getMainOrg() {
		return DataUtil.toString(super.getByIndex(INDEX_MAINORG, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getMainOrg <em>MainOrg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MainOrg</em>' attribute.
	 * @see #getMainOrg()
	 */
	public void setMainOrg(String mainOrg) {
		super.setByIndex(INDEX_MAINORG, mainOrg);
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