/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.ValueType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>REST Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueDouble <em>Value Double</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getFormatConst <em>Format Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTAttributeImpl extends MobaRESTAbstractAttributeImpl implements MobaRESTAttribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MobaDataType type;

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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

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
	 * The default value of the '{@link #getValueDouble() <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_DOUBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDouble() <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected Double valueDouble = VALUE_DOUBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected Integer valueInt = VALUE_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormatConst() <em>Format Const</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFormatConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant formatConst;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MobaDataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MobaDataType newType) {
		MobaDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING, oldKeyString, keyString));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST, oldKeyConst, keyConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST, oldKeyConst, keyConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING, oldValueString, valueString));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST, oldValueConst, valueConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST, oldValueConst, valueConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValueDouble() {
		return valueDouble;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDouble(Double newValueDouble) {
		Double oldValueDouble = valueDouble;
		valueDouble = newValueDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE, oldValueDouble, valueDouble));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValueInt() {
		return valueInt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInt(Integer newValueInt) {
		Integer oldValueInt = valueInt;
		valueInt = newValueInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT, oldValueInt, valueInt));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getKey() {
		if (getKeyConst() != null) {
			return getKeyConst().getValue();
		}
		return getKeyString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getValue() {
		if (getValueConst() != null) {
			return getValueConst().getValue();
		}
		return getValueString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING, oldFormatString, formatString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getFormatConst() {
		if (formatConst != null && formatConst.eIsProxy()) {
			InternalEObject oldFormatConst = (InternalEObject)formatConst;
			formatConst = (MobaConstant)eResolveProxy(oldFormatConst);
			if (formatConst != oldFormatConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST, oldFormatConst, formatConst));
			}
		}
		return formatConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetFormatConst() {
		return formatConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatConst(MobaConstant newFormatConst) {
		MobaConstant oldFormatConst = formatConst;
		formatConst = newFormatConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST, oldFormatConst, formatConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING:
				return getKeyString();
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST:
				if (resolve) return getKeyConst();
				return basicGetKeyConst();
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY:
				return getKey();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				return getValueString();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				if (resolve) return getValueConst();
				return basicGetValueConst();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				return getValueDouble();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				return getValueInt();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE:
				return getValue();
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING:
				return getFormatString();
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST:
				if (resolve) return getFormatConst();
				return basicGetFormatConst();
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__TYPE:
				setType((MobaDataType)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING:
				setKeyString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST:
				setKeyConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				setValueConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				setValueDouble((Double)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				setValueInt((Integer)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING:
				setFormatString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST:
				setFormatConst((MobaConstant)newValue);
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__TYPE:
				setType((MobaDataType)null);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING:
				setKeyString(KEY_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST:
				setKeyConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				setValueConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				setValueDouble(VALUE_DOUBLE_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				setValueInt(VALUE_INT_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING:
				setFormatString(FORMAT_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST:
				setFormatConst((MobaConstant)null);
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__TYPE:
				return type != null;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING:
				return KEY_STRING_EDEFAULT == null ? keyString != null : !KEY_STRING_EDEFAULT.equals(keyString);
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_CONST:
				return keyConst != null;
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				return valueConst != null;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				return VALUE_DOUBLE_EDEFAULT == null ? valueDouble != null : !VALUE_DOUBLE_EDEFAULT.equals(valueDouble);
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				return VALUE_INT_EDEFAULT == null ? valueInt != null : !VALUE_INT_EDEFAULT.equals(valueInt);
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING:
				return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_CONST:
				return formatConst != null;
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
		result.append(", valueDouble: ");
		result.append(valueDouble);
		result.append(", valueInt: ");
		result.append(valueInt);
		result.append(", formatString: ");
		result.append(formatString);
		result.append(')');
		return result.toString();
	}

	@Override
	public ValueType getValueType() {
		if (getValueConst() != null) {
			return ValueType.CONSTANT;
		} else if (getValueInt() != null) {
			return ValueType.NUMERIC;
		} else if (getValueDouble() != null) {
			return ValueType.DECIMAL;
		} else {
			return ValueType.STRING;
		}
	}

	@Override
	public String getFormat() {
		if (getFormatConst() != null) {
			return getFormatConst().getValue();
		}

		if (getFormatString() != null && !getFormatString().equals("")) {
			return getFormatString();
		}

		if (getType() != null && getType().isDate()) {
			return getType().getDateFormat();
		}

		return null;
	}

} // MobaRESTAttributeImpl
