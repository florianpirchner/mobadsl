/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl#getValueConst <em>Value Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaPropertyImpl extends MinimalEObjectImpl.Container implements MobaProperty {
	/**
	 * The default value of the '{@link #getKeyString() <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKeyString()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyString() <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKeyString()
	 * @generated
	 * @ordered
	 */
	protected String keyString = KEY_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyConst() <em>Key Const</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getKeyConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant keyConst;

	/**
	 * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected String valueString = VALUE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueConst() <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant valueConst;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyString() {
		return keyString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyString(String newKeyString) {
		String oldKeyString = keyString;
		keyString = newKeyString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROPERTY__KEY_STRING, oldKeyString, keyString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getKeyConst() {
		if (keyConst != null && keyConst.eIsProxy()) {
			InternalEObject oldKeyConst = (InternalEObject)keyConst;
			keyConst = (MobaConstant)eResolveProxy(oldKeyConst);
			if (keyConst != oldKeyConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PROPERTY__KEY_CONST, oldKeyConst, keyConst));
			}
		}
		return keyConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetKeyConst() {
		return keyConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyConst(MobaConstant newKeyConst) {
		MobaConstant oldKeyConst = keyConst;
		keyConst = newKeyConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROPERTY__KEY_CONST, oldKeyConst, keyConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(String newValueString) {
		String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROPERTY__VALUE_STRING, oldValueString, valueString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getValueConst() {
		if (valueConst != null && valueConst.eIsProxy()) {
			InternalEObject oldValueConst = (InternalEObject)valueConst;
			valueConst = (MobaConstant)eResolveProxy(oldValueConst);
			if (valueConst != oldValueConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PROPERTY__VALUE_CONST, oldValueConst, valueConst));
			}
		}
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetValueConst() {
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueConst(MobaConstant newValueConst) {
		MobaConstant oldValueConst = valueConst;
		valueConst = newValueConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROPERTY__VALUE_CONST, oldValueConst, valueConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_PROPERTY__KEY_STRING:
				return getKeyString();
			case MobaPackage.MOBA_PROPERTY__KEY_CONST:
				if (resolve) return getKeyConst();
				return basicGetKeyConst();
			case MobaPackage.MOBA_PROPERTY__VALUE_STRING:
				return getValueString();
			case MobaPackage.MOBA_PROPERTY__VALUE_CONST:
				if (resolve) return getValueConst();
				return basicGetValueConst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_PROPERTY__KEY_STRING:
				setKeyString((String)newValue);
				return;
			case MobaPackage.MOBA_PROPERTY__KEY_CONST:
				setKeyConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_PROPERTY__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case MobaPackage.MOBA_PROPERTY__VALUE_CONST:
				setValueConst((MobaConstant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_PROPERTY__KEY_STRING:
				setKeyString(KEY_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_PROPERTY__KEY_CONST:
				setKeyConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_PROPERTY__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_PROPERTY__VALUE_CONST:
				setValueConst((MobaConstant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_PROPERTY__KEY_STRING:
				return KEY_STRING_EDEFAULT == null ? keyString != null : !KEY_STRING_EDEFAULT.equals(keyString);
			case MobaPackage.MOBA_PROPERTY__KEY_CONST:
				return keyConst != null;
			case MobaPackage.MOBA_PROPERTY__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case MobaPackage.MOBA_PROPERTY__VALUE_CONST:
				return valueConst != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (keyString: ");
		result.append(keyString);
		result.append(", valueString: ");
		result.append(valueString);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getKey() {
		if (getKeyConst() != null) {
			return getKeyConst().getValue();
		}
		return getKeyString();
	}

	@Override
	public String getValue() {
		if (getValueConst() != null) {
			return getValueConst().getValue();
		}
		return getValueString();
	}

	@Override
	public String getKeyStringOrConstantName() {
		if (getKeyConst() != null) {
			return getKeyConst().getName();
		}
		return getKeyString();
	}

	@Override
	public String getValueStringOrConstantName() {
		if (getValueConst() != null) {
			return getValueConst().getName();
		}
		return getValueString();
	}

} // MobaPropertyImpl
