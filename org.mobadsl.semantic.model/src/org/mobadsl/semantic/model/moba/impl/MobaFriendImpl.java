/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaFriend;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaFriendImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaFriendImpl#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaFriendImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaFriendImpl extends MinimalEObjectImpl.Container implements MobaFriend {
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
	protected MobaFriendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_FRIEND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_FRIEND__VALUE_STRING, oldValueString, valueString));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_FRIEND__VALUE_CONST, oldValueConst, valueConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_FRIEND__VALUE_CONST, oldValueConst, valueConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		if(getValueConst() != null) {
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
			case MobaPackage.MOBA_FRIEND__VALUE_STRING:
				return getValueString();
			case MobaPackage.MOBA_FRIEND__VALUE_CONST:
				if (resolve) return getValueConst();
				return basicGetValueConst();
			case MobaPackage.MOBA_FRIEND__VALUE:
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
			case MobaPackage.MOBA_FRIEND__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case MobaPackage.MOBA_FRIEND__VALUE_CONST:
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
			case MobaPackage.MOBA_FRIEND__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_FRIEND__VALUE_CONST:
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
			case MobaPackage.MOBA_FRIEND__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case MobaPackage.MOBA_FRIEND__VALUE_CONST:
				return valueConst != null;
			case MobaPackage.MOBA_FRIEND__VALUE:
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
		result.append(" (valueString: ");
		result.append(valueString);
		result.append(')');
		return result.toString();
	}

} //MobaFriendImpl
