/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstantValueFunction;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.ValueType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Constant Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getValueString
 * <em>Value String</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getValueConst
 * <em>Value Const</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getValueConstFunctions
 * <em>Value Const Functions</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#isValueConstToLowerCase
 * <em>Value Const To Lower Case</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getTail
 * <em>Tail</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getValueInt
 * <em>Value Int</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl#getValueDouble
 * <em>Value Double</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaConstantValueImpl extends MinimalEObjectImpl.Container implements MobaConstantValue {
	/**
	 * The default value of the '{@link #getValueString() <em>Value String</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected String valueString = VALUE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueConst() <em>Value Const</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant valueConst;

	/**
	 * The cached value of the '{@link #getValueConstFunctions()
	 * <em>Value Const Functions</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueConstFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaConstantValueFunction> valueConstFunctions;

	/**
	 * The default value of the '{@link #isValueConstToLowerCase()
	 * <em>Value Const To Lower Case</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isValueConstToLowerCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_CONST_TO_LOWER_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValueConstToLowerCase()
	 * <em>Value Const To Lower Case</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isValueConstToLowerCase()
	 * @generated
	 * @ordered
	 */
	protected boolean valueConstToLowerCase = VALUE_CONST_TO_LOWER_CASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTail() <em>Tail</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTail()
	 * @generated
	 * @ordered
	 */
	protected MobaConstantValue tail;

	/**
	 * The default value of the '{@link #getValueInt() <em>Value Int</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueInt() <em>Value Int</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueInt()
	 * @generated
	 * @ordered
	 */
	protected Integer valueInt = VALUE_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDouble() <em>Value Double</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double VALUE_DOUBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueDouble() <em>Value Double</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueDouble()
	 * @generated
	 * @ordered
	 */
	protected Double valueDouble = VALUE_DOUBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaConstantValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_CONSTANT_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueString(String newValueString) {
		String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT_VALUE__VALUE_STRING,
					oldValueString, valueString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaConstant getValueConst() {
		if (valueConst != null && valueConst.eIsProxy()) {
			InternalEObject oldValueConst = (InternalEObject) valueConst;
			valueConst = (MobaConstant) eResolveProxy(oldValueConst);
			if (valueConst != oldValueConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST, oldValueConst, valueConst));
			}
		}
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaConstant basicGetValueConst() {
		return valueConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueConst(MobaConstant newValueConst) {
		MobaConstant oldValueConst = valueConst;
		valueConst = newValueConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST,
					oldValueConst, valueConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaConstantValueFunction> getValueConstFunctions() {
		if (valueConstFunctions == null) {
			valueConstFunctions = new EDataTypeUniqueEList<MobaConstantValueFunction>(MobaConstantValueFunction.class,
					this, MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_FUNCTIONS);
		}
		return valueConstFunctions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isValueConstToLowerCase() {
		return valueConstToLowerCase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueConstToLowerCase(boolean newValueConstToLowerCase) {
		boolean oldValueConstToLowerCase = valueConstToLowerCase;
		valueConstToLowerCase = newValueConstToLowerCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_TO_LOWER_CASE, oldValueConstToLowerCase,
					valueConstToLowerCase));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaConstantValue getTail() {
		return tail;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTail(MobaConstantValue newTail, NotificationChain msgs) {
		MobaConstantValue oldTail = tail;
		tail = newTail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MobaPackage.MOBA_CONSTANT_VALUE__TAIL, oldTail, newTail);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTail(MobaConstantValue newTail) {
		if (newTail != tail) {
			NotificationChain msgs = null;
			if (tail != null)
				msgs = ((InternalEObject) tail).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_CONSTANT_VALUE__TAIL, null, msgs);
			if (newTail != null)
				msgs = ((InternalEObject) newTail).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_CONSTANT_VALUE__TAIL, null, msgs);
			msgs = basicSetTail(newTail, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT_VALUE__TAIL, newTail,
					newTail));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Integer getValueInt() {
		return valueInt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueInt(Integer newValueInt) {
		Integer oldValueInt = valueInt;
		valueInt = newValueInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT_VALUE__VALUE_INT,
					oldValueInt, valueInt));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double getValueDouble() {
		return valueDouble;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueDouble(Double newValueDouble) {
		Double oldValueDouble = valueDouble;
		valueDouble = newValueDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT_VALUE__VALUE_DOUBLE,
					oldValueDouble, valueDouble));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_CONSTANT_VALUE__TAIL:
			return basicSetTail(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_STRING:
			return getValueString();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST:
			if (resolve)
				return getValueConst();
			return basicGetValueConst();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_FUNCTIONS:
			return getValueConstFunctions();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_TO_LOWER_CASE:
			return isValueConstToLowerCase();
		case MobaPackage.MOBA_CONSTANT_VALUE__TAIL:
			return getTail();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_INT:
			return getValueInt();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_DOUBLE:
			return getValueDouble();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_STRING:
			setValueString((String) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST:
			setValueConst((MobaConstant) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_FUNCTIONS:
			getValueConstFunctions().clear();
			getValueConstFunctions().addAll((Collection<? extends MobaConstantValueFunction>) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_TO_LOWER_CASE:
			setValueConstToLowerCase((Boolean) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__TAIL:
			setTail((MobaConstantValue) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_INT:
			setValueInt((Integer) newValue);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_DOUBLE:
			setValueDouble((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_STRING:
			setValueString(VALUE_STRING_EDEFAULT);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST:
			setValueConst((MobaConstant) null);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_FUNCTIONS:
			getValueConstFunctions().clear();
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_TO_LOWER_CASE:
			setValueConstToLowerCase(VALUE_CONST_TO_LOWER_CASE_EDEFAULT);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__TAIL:
			setTail((MobaConstantValue) null);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_INT:
			setValueInt(VALUE_INT_EDEFAULT);
			return;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_DOUBLE:
			setValueDouble(VALUE_DOUBLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_STRING:
			return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST:
			return valueConst != null;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_FUNCTIONS:
			return valueConstFunctions != null && !valueConstFunctions.isEmpty();
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_CONST_TO_LOWER_CASE:
			return valueConstToLowerCase != VALUE_CONST_TO_LOWER_CASE_EDEFAULT;
		case MobaPackage.MOBA_CONSTANT_VALUE__TAIL:
			return tail != null;
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_INT:
			return VALUE_INT_EDEFAULT == null ? valueInt != null : !VALUE_INT_EDEFAULT.equals(valueInt);
		case MobaPackage.MOBA_CONSTANT_VALUE__VALUE_DOUBLE:
			return VALUE_DOUBLE_EDEFAULT == null ? valueDouble != null : !VALUE_DOUBLE_EDEFAULT.equals(valueDouble);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueString: ");
		result.append(valueString);
		result.append(", valueConstFunctions: ");
		result.append(valueConstFunctions);
		result.append(", valueConstToLowerCase: ");
		result.append(valueConstToLowerCase);
		result.append(", valueInt: ");
		result.append(valueInt);
		result.append(", valueDouble: ");
		result.append(valueDouble);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getValue() {
		StringBuilder b = new StringBuilder();
		b.append(getValueSimple());
		if (getTail() != null) {
			b.append(tail.getValue());
		}
		return b.toString();
	}

	@Override
	public String getValueSimple() {

		String value = null;
		if (getValueConst() != null) {
			value = getValueConst().getValue();
			for (MobaConstantValueFunction function : getValueConstFunctions()) {
				switch (function) {
				case TO_FIRST_LOWER_CASE:
					value = toFirstLowerCase(value);
					break;
				case TO_FIRST_UPPER_CASE:
					value = toFirstUpperCase(value);
					break;
				case TO_LOWER_CASE:
					value = toLowerCase(value);
					break;
				case TO_UPPER_CASE:
					value = toUpperCase(value);
					break;
				}
			}
		} else if (getValueInt() != null) {
			value = Integer.toString(getValueInt());
		} else if (getValueDouble() != null) {
			value = Double.toString(getValueDouble());
		} else {
			value = getValueString();
		}

		return value;
	}

	private String toUpperCase(String value) {
		if (!isValueNotEmpty(value)) {
			return value;
		}
		return value.toUpperCase();
	}

	private String toLowerCase(String value) {
		if (!isValueNotEmpty(value)) {
			return value;
		}
		return value.toLowerCase();
	}

	private String toFirstUpperCase(String value) {
		if (!isValueNotEmpty(value)) {
			return value;
		}
		String firstCharacter = value.substring(0, 1);
		return firstCharacter.toUpperCase() + value.substring(1);
	}

	private String toFirstLowerCase(String value) {
		if (!isValueNotEmpty(value)) {
			return value;
		}
		String firstCharacter = value.substring(0, 1);
		return firstCharacter.toLowerCase() + value.substring(1);
	}

	private boolean isValueNotEmpty(String value) {
		return value != null && !value.isEmpty();
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

} // MobaConstantValueImpl
