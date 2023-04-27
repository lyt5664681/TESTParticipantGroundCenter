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
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getPositionId <em>PositionId</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getUserAccount <em>UserAccount</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getOrgCode <em>OrgCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getOrgName <em>OrgName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDisplayOrder <em>DisplayOrder</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDutyCode <em>DutyCode</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDutyName <em>DutyName</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getMainOrg <em>MainOrg</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getCreatedBy <em>CreatedBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getCreationDate <em>CreationDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateBy <em>LastUpdateBy</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateDate <em>LastUpdateDate</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateLogin <em>LastUpdateLogin</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute3 <em>Attribute3</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute4 <em>Attribute4</em>}</li>
 *   <li>{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute5 <em>Attribute5</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface WfpAfUserposition extends DataObject {

	public static final String QNAME = "com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition";

	public static final Type TYPE = TypeHelper.INSTANCE.getType("com.cmcc.participant.ground.dataset.CMCCUserDataset", "WfpAfUserposition");

	public static final IObjectFactory<WfpAfUserposition> FACTORY = new IObjectFactory<WfpAfUserposition>() {
		public WfpAfUserposition create() {
			return (WfpAfUserposition) DataFactory.INSTANCE.create(TYPE);
		}
	};

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
	public long getPositionId();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getPositionId <em>PositionId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PositionId</em>' attribute.
	 * @see #getPositionId()
	 */
	public void setPositionId(long positionId);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getUserAccount <em>UserAccount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UserAccount</em>' attribute.
	 * @see #getUserAccount()
	 */
	public void setUserAccount(String userAccount);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getOrgCode <em>OrgCode</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getOrgName <em>OrgName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OrgName</em>' attribute.
	 * @see #getOrgName()
	 */
	public void setOrgName(String orgName);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDisplayOrder <em>DisplayOrder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DisplayOrder</em>' attribute.
	 * @see #getDisplayOrder()
	 */
	public void setDisplayOrder(String displayOrder);

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
	public String getDutyCode();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDutyCode <em>DutyCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DutyCode</em>' attribute.
	 * @see #getDutyCode()
	 */
	public void setDutyCode(String dutyCode);

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
	public String getDutyName();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getDutyName <em>DutyName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DutyName</em>' attribute.
	 * @see #getDutyName()
	 */
	public void setDutyName(String dutyName);

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
	public String getMainOrg();

	/**
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getMainOrg <em>MainOrg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MainOrg</em>' attribute.
	 * @see #getMainOrg()
	 */
	public void setMainOrg(String mainOrg);

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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getCreatedBy <em>CreatedBy</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getCreationDate <em>CreationDate</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateBy <em>LastUpdateBy</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateDate <em>LastUpdateDate</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getLastUpdateLogin <em>LastUpdateLogin</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute1 <em>Attribute1</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute2 <em>Attribute2</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute3 <em>Attribute3</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute4 <em>Attribute4</em>}' attribute.
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
	 * Sets the value of the '{@link com.cmcc.participant.ground.dataset.CMCCUserDataset.WfpAfUserposition#getAttribute5 <em>Attribute5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute5</em>' attribute.
	 * @see #getAttribute5()
	 */
	public void setAttribute5(String attribute5);


}