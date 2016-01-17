/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Abstract Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAbstractAttributeImpl#getAliasString <em>Alias String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAbstractAttributeImpl#getAliasConst <em>Alias Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAbstractAttributeImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAbstractAttributeImpl#isAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MobaRESTAbstractAttributeImpl extends MinimalEObjectImpl.Container implements MobaRESTAbstractAttribute {
	/**
	 * The default value of the '{@link #getAliasString() <em>Alias String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasString()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasString() <em>Alias String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasString()
	 * @generated
	 * @ordered
	 */
	protected String aliasString = ALIAS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasConst() <em>Alias Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant aliasConst;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTACHMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttachment()
	 * @generated
	 * @ordered
	 */
	protected boolean attachment = ATTACHMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTAbstractAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_ABSTRACT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasString() {
		return aliasString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasString(String newAliasString) {
		String oldAliasString = aliasString;
		aliasString = newAliasString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_STRING, oldAliasString, aliasString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getAliasConst() {
		if (aliasConst != null && aliasConst.eIsProxy()) {
			InternalEObject oldAliasConst = (InternalEObject)aliasConst;
			aliasConst = (MobaConstant)eResolveProxy(oldAliasConst);
			if (aliasConst != oldAliasConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST, oldAliasConst, aliasConst));
			}
		}
		return aliasConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetAliasConst() {
		return aliasConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasConst(MobaConstant newAliasConst) {
		MobaConstant oldAliasConst = aliasConst;
		aliasConst = newAliasConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST, oldAliasConst, aliasConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getAlias() {
		if (getAliasConst() != null) {
			return getAliasConst().getValue();
		}
		return getAliasString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(boolean newAttachment) {
		boolean oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_STRING:
				return getAliasString();
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST:
				if (resolve) return getAliasConst();
				return basicGetAliasConst();
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS:
				return getAlias();
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ATTACHMENT:
				return isAttachment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_STRING:
				setAliasString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST:
				setAliasConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ATTACHMENT:
				setAttachment((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_STRING:
				setAliasString(ALIAS_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST:
				setAliasConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ATTACHMENT:
				setAttachment(ATTACHMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_STRING:
				return ALIAS_STRING_EDEFAULT == null ? aliasString != null : !ALIAS_STRING_EDEFAULT.equals(aliasString);
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS_CONST:
				return aliasConst != null;
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
			case MobaPackage.MOBA_REST_ABSTRACT_ATTRIBUTE__ATTACHMENT:
				return attachment != ATTACHMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (aliasString: ");
		result.append(aliasString);
		result.append(", attachment: ");
		result.append(attachment);
		result.append(')');
		return result.toString();
	}

} //MobaRESTAbstractAttributeImpl
