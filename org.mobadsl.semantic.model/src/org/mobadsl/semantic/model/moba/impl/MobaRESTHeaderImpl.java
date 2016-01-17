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
import org.mobadsl.semantic.model.moba.MobaRESTHeader;
import org.mobadsl.semantic.model.moba.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#isContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#isRawHeader <em>Raw Header</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTHeaderImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTHeaderImpl extends MinimalEObjectImpl.Container implements MobaRESTHeader {
	/**
	 * The default value of the '{@link #isContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTENT_TYPE_HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContentTypeHeader() <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentTypeHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean contentTypeHeader = CONTENT_TYPE_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #isRawHeader() <em>Raw Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRawHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RAW_HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRawHeader() <em>Raw Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRawHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean rawHeader = RAW_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyString() <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyString()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyString() <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyString()
	 * @generated
	 * @ordered
	 */
	protected String keyString = KEY_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyConst() <em>Key Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant keyConst;

	/**
	 * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected String valueString = VALUE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueConst() <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant valueConst;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContentTypeHeader() {
		return contentTypeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentTypeHeader(boolean newContentTypeHeader) {
		boolean oldContentTypeHeader = contentTypeHeader;
		contentTypeHeader = newContentTypeHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__CONTENT_TYPE_HEADER, oldContentTypeHeader, contentTypeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawHeader() {
		return rawHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawHeader(boolean newRawHeader) {
		boolean oldRawHeader = rawHeader;
		rawHeader = newRawHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__RAW_HEADER, oldRawHeader, rawHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyString() {
		return keyString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyString(String newKeyString) {
		String oldKeyString = keyString;
		keyString = newKeyString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__KEY_STRING, oldKeyString, keyString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getKeyConst() {
		if (keyConst != null && keyConst.eIsProxy()) {
			InternalEObject oldKeyConst = (InternalEObject)keyConst;
			keyConst = (MobaConstant)eResolveProxy(oldKeyConst);
			if (keyConst != oldKeyConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_HEADER__KEY_CONST, oldKeyConst, keyConst));
			}
		}
		return keyConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetKeyConst() {
		return keyConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyConst(MobaConstant newKeyConst) {
		MobaConstant oldKeyConst = keyConst;
		keyConst = newKeyConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__KEY_CONST, oldKeyConst, keyConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(String newValueString) {
		String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__VALUE_STRING, oldValueString, valueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getValueConst() {
		if (valueConst != null && valueConst.eIsProxy()) {
			InternalEObject oldValueConst = (InternalEObject)valueConst;
			valueConst = (MobaConstant)eResolveProxy(oldValueConst);
			if (valueConst != oldValueConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_HEADER__VALUE_CONST, oldValueConst, valueConst));
			}
		}
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetValueConst() {
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueConst(MobaConstant newValueConst) {
		MobaConstant oldValueConst = valueConst;
		valueConst = newValueConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_HEADER__VALUE_CONST, oldValueConst, valueConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getKey() {

		if (getKeyConst() != null) {
			return getKeyConst().getValue();
		}
		return getKeyString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getValue() {
		if (getValueConst() != null) {
			return getValueConst().getValue();
		}
		return getValueString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_HEADER__CONTENT_TYPE_HEADER:
				return isContentTypeHeader();
			case MobaPackage.MOBA_REST_HEADER__RAW_HEADER:
				return isRawHeader();
			case MobaPackage.MOBA_REST_HEADER__KEY_STRING:
				return getKeyString();
			case MobaPackage.MOBA_REST_HEADER__KEY_CONST:
				if (resolve) return getKeyConst();
				return basicGetKeyConst();
			case MobaPackage.MOBA_REST_HEADER__VALUE_STRING:
				return getValueString();
			case MobaPackage.MOBA_REST_HEADER__VALUE_CONST:
				if (resolve) return getValueConst();
				return basicGetValueConst();
			case MobaPackage.MOBA_REST_HEADER__KEY:
				return getKey();
			case MobaPackage.MOBA_REST_HEADER__VALUE:
				return getValue();
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
			case MobaPackage.MOBA_REST_HEADER__CONTENT_TYPE_HEADER:
				setContentTypeHeader((Boolean)newValue);
				return;
			case MobaPackage.MOBA_REST_HEADER__RAW_HEADER:
				setRawHeader((Boolean)newValue);
				return;
			case MobaPackage.MOBA_REST_HEADER__KEY_STRING:
				setKeyString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_HEADER__KEY_CONST:
				setKeyConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_REST_HEADER__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_HEADER__VALUE_CONST:
				setValueConst((MobaConstant)newValue);
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
			case MobaPackage.MOBA_REST_HEADER__CONTENT_TYPE_HEADER:
				setContentTypeHeader(CONTENT_TYPE_HEADER_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_HEADER__RAW_HEADER:
				setRawHeader(RAW_HEADER_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_HEADER__KEY_STRING:
				setKeyString(KEY_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_HEADER__KEY_CONST:
				setKeyConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_REST_HEADER__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_HEADER__VALUE_CONST:
				setValueConst((MobaConstant)null);
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
			case MobaPackage.MOBA_REST_HEADER__CONTENT_TYPE_HEADER:
				return contentTypeHeader != CONTENT_TYPE_HEADER_EDEFAULT;
			case MobaPackage.MOBA_REST_HEADER__RAW_HEADER:
				return rawHeader != RAW_HEADER_EDEFAULT;
			case MobaPackage.MOBA_REST_HEADER__KEY_STRING:
				return KEY_STRING_EDEFAULT == null ? keyString != null : !KEY_STRING_EDEFAULT.equals(keyString);
			case MobaPackage.MOBA_REST_HEADER__KEY_CONST:
				return keyConst != null;
			case MobaPackage.MOBA_REST_HEADER__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case MobaPackage.MOBA_REST_HEADER__VALUE_CONST:
				return valueConst != null;
			case MobaPackage.MOBA_REST_HEADER__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case MobaPackage.MOBA_REST_HEADER__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
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
		result.append(" (contentTypeHeader: ");
		result.append(contentTypeHeader);
		result.append(", rawHeader: ");
		result.append(rawHeader);
		result.append(", keyString: ");
		result.append(keyString);
		result.append(", valueString: ");
		result.append(valueString);
		result.append(')');
		return result.toString();
	}

	@Override
	public ValueType getValueType() {
		if (getValueConst() != null) {
			return ValueType.CONSTANT;
		} else {
			return ValueType.STRING;
		}
	}

} //MobaRESTHeaderImpl
