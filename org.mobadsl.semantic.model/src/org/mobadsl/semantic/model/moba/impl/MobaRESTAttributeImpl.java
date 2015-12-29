/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getNameString <em>Name String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getNameConst <em>Name Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueDouble <em>Value Double</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl#getFormatConst <em>Format Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTAttributeImpl extends MinimalEObjectImpl.Container implements MobaRESTAttribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MobaDataType type;

	/**
	 * The default value of the '{@link #getNameString() <em>Name String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNameString()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameString() <em>Name String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNameString()
	 * @generated
	 * @ordered
	 */
	protected String nameString = NAME_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameConst() <em>Name Const</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNameConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant nameConst;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_DOUBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDouble() <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected Double valueDouble = VALUE_DOUBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected Integer valueInt = VALUE_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormatConst() <em>Format Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameString() {
		return nameString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameString(String newNameString) {
		String oldNameString = nameString;
		nameString = newNameString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__NAME_STRING, oldNameString, nameString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getNameConst() {
		if (nameConst != null && nameConst.eIsProxy()) {
			InternalEObject oldNameConst = (InternalEObject)nameConst;
			nameConst = (MobaConstant)eResolveProxy(oldNameConst);
			if (nameConst != oldNameConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST, oldNameConst, nameConst));
			}
		}
		return nameConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetNameConst() {
		return nameConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConst(MobaConstant newNameConst) {
		MobaConstant oldNameConst = nameConst;
		nameConst = newNameConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST, oldNameConst, nameConst));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getValueDouble() {
		return valueDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDouble(Double newValueDouble) {
		Double oldValueDouble = valueDouble;
		valueDouble = newValueDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE, oldValueDouble, valueDouble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValueInt() {
		return valueInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public String getName() {
		if (getNameConst() != null) {
			return getNameConst().getValue();
		}
		return getNameString();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING, oldFormatString, formatString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetFormatConst() {
		return formatConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_STRING:
				return getNameString();
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST:
				if (resolve) return getNameConst();
				return basicGetNameConst();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				return getValueString();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				if (resolve) return getValueConst();
				return basicGetValueConst();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				return getValueDouble();
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				return getValueInt();
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME:
				return getName();
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_STRING:
				setNameString((String)newValue);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST:
				setNameConst((MobaConstant)newValue);
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_STRING:
				setNameString(NAME_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST:
				setNameConst((MobaConstant)null);
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
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_STRING:
				return NAME_STRING_EDEFAULT == null ? nameString != null : !NAME_STRING_EDEFAULT.equals(nameString);
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME_CONST:
				return nameConst != null;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_CONST:
				return valueConst != null;
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
				return VALUE_DOUBLE_EDEFAULT == null ? valueDouble != null : !VALUE_DOUBLE_EDEFAULT.equals(valueDouble);
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
				return VALUE_INT_EDEFAULT == null ? valueInt != null : !VALUE_INT_EDEFAULT.equals(valueInt);
			case MobaPackage.MOBA_REST_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
		result.append(" (nameString: ");
		result.append(nameString);
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
