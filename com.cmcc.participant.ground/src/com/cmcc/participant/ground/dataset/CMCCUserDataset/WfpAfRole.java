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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRoleId <em>RoRoleId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoProcessinstid <em>RoProcessinstid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRoleName <em>RoRoleName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoTenantid <em>RoTenantid</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoCreatetime <em>RoCreatetime</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoBusinessSystem <em>RoBusinessSystem</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRolestate <em>RoRolestate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute5 <em>Attribute5</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getPoReason <em>PoReason</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoId <em>RoId</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface WfpAfRole extends DataObject {

	public static final String QNAME = "com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole";

	public static final Type TYPE = TypeHelper.INSTANCE.getType("com.cmcc.participant.ground.dataset.CMCCUserDataset", "WfpAfRole");

	public static final IObjectFactory<WfpAfRole> FACTORY = new IObjectFactory<WfpAfRole>() {
		public WfpAfRole create() {
			return (WfpAfRole) DataFactory.INSTANCE.create(TYPE);
		}
	};

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
	public String getRoRoleId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRoleId <em>RoRoleId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRoleId</em>' attribute.
	 * @see #getRoRoleId()
	 */
	public void setRoRoleId(String roRoleId);

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
	public int getRoProcessinstid();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoProcessinstid <em>RoProcessinstid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoProcessinstid</em>' attribute.
	 * @see #getRoProcessinstid()
	 */
	public void setRoProcessinstid(int roProcessinstid);

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
	public String getRoRoleName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRoleName <em>RoRoleName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRoleName</em>' attribute.
	 * @see #getRoRoleName()
	 */
	public void setRoRoleName(String roRoleName);

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
	public String getRoTenantid();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoTenantid <em>RoTenantid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoTenantid</em>' attribute.
	 * @see #getRoTenantid()
	 */
	public void setRoTenantid(String roTenantid);

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
	public Date getRoCreatetime();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoCreatetime <em>RoCreatetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoCreatetime</em>' attribute.
	 * @see #getRoCreatetime()
	 */
	public void setRoCreatetime(Date roCreatetime);

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
	public String getRoBusinessSystem();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoBusinessSystem <em>RoBusinessSystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoBusinessSystem</em>' attribute.
	 * @see #getRoBusinessSystem()
	 */
	public void setRoBusinessSystem(String roBusinessSystem);

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
	public String getRoRolestate();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoRolestate <em>RoRolestate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoRolestate</em>' attribute.
	 * @see #getRoRolestate()
	 */
	public void setRoRolestate(String roRolestate);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute1 <em>Attribute1</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute2 <em>Attribute2</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute3 <em>Attribute3</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute4 <em>Attribute4</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5);

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
	public String getPoReason();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getPoReason <em>PoReason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PoReason</em>' attribute.
	 * @see #getPoReason()
	 */
	public void setPoReason(String poReason);

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
	public String getRoId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfRole#getRoId <em>RoId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RoId</em>' attribute.
	 * @see #getRoId()
	 */
	public void setRoId(String roId);


}