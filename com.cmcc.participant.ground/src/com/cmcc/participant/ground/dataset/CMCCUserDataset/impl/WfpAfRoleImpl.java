/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.cmcc.participant.ground.dataset.CMCCUserDataset.impl;

import com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole;
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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoRoleId <em>RoRoleId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoProcessinstid <em>RoProcessinstid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoRoleName <em>RoRoleName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoTenantid <em>RoTenantid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoCreatetime <em>RoCreatetime</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoBusinessSystem <em>RoBusinessSystem</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoRolestate <em>RoRolestate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getPoReason <em>PoReason</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.impl.WfpAfRoleImpl#getRoId <em>RoId</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements WfpAfRole;
 */

public class WfpAfRoleImpl extends ExtendedDataObjectImpl implements WfpAfRole {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ROROLEID = 0;
	public final static int INDEX_ROPROCESSINSTID = 1;
	public final static int INDEX_ROROLENAME = 2;
	public final static int INDEX_ROTENANTID = 3;
	public final static int INDEX_ROCREATETIME = 4;
	public final static int INDEX_ROBUSINESSSYSTEM = 5;
	public final static int INDEX_ROROLESTATE = 6;
	public final static int INDEX_ATTRIBUTE1 = 7;
	public final static int INDEX_ATTRIBUTE2 = 8;
	public final static int INDEX_ATTRIBUTE3 = 9;
	public final static int INDEX_ATTRIBUTE4 = 10;
	public final static int INDEX_ATTRIBUTE5 = 11;
	public final static int INDEX_POREASON = 12;
	public final static int INDEX_ROID = 13;
	public static final int SDO_PROPERTY_COUNT = 14;

	public static final int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfRoleImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WfpAfRoleImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
	}

	/**
	 * Returns the value of the '<em><b>RoRoleId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoRoleId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoRoleId</em>' attribute.
	 * @see #setRoRoleId(java.lang.String)
	 */
	public String getRoRoleId() {
		return DataUtil.toString(super.getByIndex(INDEX_ROROLEID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoRoleId <em>RoRoleId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRoleId</em>' attribute.
	 * @see #getRoRoleId()
	 */
	public void setRoRoleId(String roRoleId) {
		super.setByIndex(INDEX_ROROLEID, roRoleId);
	}

	/**
	 * Returns the value of the '<em><b>RoProcessinstid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoProcessinstid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoProcessinstid</em>' attribute.
	 * @see #setRoProcessinstid(int)
	 */
	public int getRoProcessinstid() {
		return DataUtil.toInt(super.getByIndex(INDEX_ROPROCESSINSTID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoProcessinstid <em>RoProcessinstid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoProcessinstid</em>' attribute.
	 * @see #getRoProcessinstid()
	 */
	public void setRoProcessinstid(int roProcessinstid) {
		super.setByIndex(INDEX_ROPROCESSINSTID, roProcessinstid);
	}

	/**
	 * Returns the value of the '<em><b>RoRoleName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoRoleName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoRoleName</em>' attribute.
	 * @see #setRoRoleName(java.lang.String)
	 */
	public String getRoRoleName() {
		return DataUtil.toString(super.getByIndex(INDEX_ROROLENAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoRoleName <em>RoRoleName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRoleName</em>' attribute.
	 * @see #getRoRoleName()
	 */
	public void setRoRoleName(String roRoleName) {
		super.setByIndex(INDEX_ROROLENAME, roRoleName);
	}

	/**
	 * Returns the value of the '<em><b>RoTenantid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoTenantid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoTenantid</em>' attribute.
	 * @see #setRoTenantid(java.lang.String)
	 */
	public String getRoTenantid() {
		return DataUtil.toString(super.getByIndex(INDEX_ROTENANTID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoTenantid <em>RoTenantid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoTenantid</em>' attribute.
	 * @see #getRoTenantid()
	 */
	public void setRoTenantid(String roTenantid) {
		super.setByIndex(INDEX_ROTENANTID, roTenantid);
	}

	/**
	 * Returns the value of the '<em><b>RoCreatetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoCreatetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoCreatetime</em>' attribute.
	 * @see #setRoCreatetime(java.util.Date)
	 */
	public Date getRoCreatetime() {
		return DataUtil.toDate(super.getByIndex(INDEX_ROCREATETIME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoCreatetime <em>RoCreatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoCreatetime</em>' attribute.
	 * @see #getRoCreatetime()
	 */
	public void setRoCreatetime(Date roCreatetime) {
		super.setByIndex(INDEX_ROCREATETIME, roCreatetime);
	}

	/**
	 * Returns the value of the '<em><b>RoBusinessSystem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoBusinessSystem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoBusinessSystem</em>' attribute.
	 * @see #setRoBusinessSystem(java.lang.String)
	 */
	public String getRoBusinessSystem() {
		return DataUtil.toString(super.getByIndex(INDEX_ROBUSINESSSYSTEM, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoBusinessSystem <em>RoBusinessSystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoBusinessSystem</em>' attribute.
	 * @see #getRoBusinessSystem()
	 */
	public void setRoBusinessSystem(String roBusinessSystem) {
		super.setByIndex(INDEX_ROBUSINESSSYSTEM, roBusinessSystem);
	}

	/**
	 * Returns the value of the '<em><b>RoRolestate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoRolestate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoRolestate</em>' attribute.
	 * @see #setRoRolestate(java.lang.String)
	 */
	public String getRoRolestate() {
		return DataUtil.toString(super.getByIndex(INDEX_ROROLESTATE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoRolestate <em>RoRolestate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRolestate</em>' attribute.
	 * @see #getRoRolestate()
	 */
	public void setRoRolestate(String roRolestate) {
		super.setByIndex(INDEX_ROROLESTATE, roRolestate);
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
	 * Returns the value of the '<em><b>PoReason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PoReason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PoReason</em>' attribute.
	 * @see #setPoReason(java.lang.String)
	 */
	public String getPoReason() {
		return DataUtil.toString(super.getByIndex(INDEX_POREASON, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getPoReason <em>PoReason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PoReason</em>' attribute.
	 * @see #getPoReason()
	 */
	public void setPoReason(String poReason) {
		super.setByIndex(INDEX_POREASON, poReason);
	}

	/**
	 * Returns the value of the '<em><b>RoId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RoId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RoId</em>' attribute.
	 * @see #setRoId(java.lang.String)
	 */
	public String getRoId() {
		return DataUtil.toString(super.getByIndex(INDEX_ROID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getRoId <em>RoId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoId</em>' attribute.
	 * @see #getRoId()
	 */
	public void setRoId(String roId) {
		super.setByIndex(INDEX_ROID, roId);
	}


}