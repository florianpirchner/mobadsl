/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstraint;
import org.mobadsl.semantic.model.moba.MobaConstraintable;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isArray <em>Array</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isDate <em>Date</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isTime <em>Time</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getDateFormatString <em>Date Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getDateFormatConst <em>Date Format Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getEnumAST <em>Enum AST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaDataTypeImpl extends MobaApplicationFeatureImpl implements MobaDataType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaConstraint> constraints;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean primitive = PRIMITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDate() <em>Date</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDate()
	 * @generated
	 * @ordered
	 */
	protected boolean date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTime()
	 * @generated
	 * @ordered
	 */
	protected boolean time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMESTAMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimestamp()
	 * @generated
	 * @ordered
	 */
	protected boolean timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormatString() <em>Date Format String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormatString() <em>Date Format String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateFormatString()
	 * @generated
	 * @ordered
	 */
	protected String dateFormatString = DATE_FORMAT_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateFormatConst() <em>Date Format Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDateFormatConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant dateFormatConst;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaDataType superType;

	/**
	 * The cached value of the '{@link #getEnumAST() <em>Enum AST</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnumAST()
	 * @generated
	 * @ordered
	 */
	protected MobaEnum enumAST;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_DATA_TYPE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<MobaConstraint>(MobaConstraint.class, this, MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimitive() {
		return primitive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitive(boolean newPrimitive) {
		boolean oldPrimitive = primitive;
		primitive = newPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__PRIMITIVE, oldPrimitive, primitive));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(boolean newArray) {
		boolean oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(boolean newDate) {
		boolean oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFormatString() {
		return dateFormatString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormatString(String newDateFormatString) {
		String oldDateFormatString = dateFormatString;
		dateFormatString = newDateFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING, oldDateFormatString, dateFormatString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getDateFormatConst() {
		if (dateFormatConst != null && dateFormatConst.eIsProxy()) {
			InternalEObject oldDateFormatConst = (InternalEObject)dateFormatConst;
			dateFormatConst = (MobaConstant)eResolveProxy(oldDateFormatConst);
			if (dateFormatConst != oldDateFormatConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST, oldDateFormatConst, dateFormatConst));
			}
		}
		return dateFormatConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetDateFormatConst() {
		return dateFormatConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormatConst(MobaConstant newDateFormatConst) {
		MobaConstant oldDateFormatConst = dateFormatConst;
		dateFormatConst = newDateFormatConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST, oldDateFormatConst, dateFormatConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (MobaDataType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(MobaDataType newSuperType) {
		MobaDataType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEnum getEnumAST() {
		return enumAST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumAST(MobaEnum newEnumAST, NotificationChain msgs) {
		MobaEnum oldEnumAST = enumAST;
		enumAST = newEnumAST;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__ENUM_AST, oldEnumAST, newEnumAST);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumAST(MobaEnum newEnumAST) {
		if (newEnumAST != enumAST) {
			NotificationChain msgs = null;
			if (enumAST != null)
				msgs = ((InternalEObject)enumAST).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DATA_TYPE__ENUM_AST, null, msgs);
			if (newEnumAST != null)
				msgs = ((InternalEObject)newEnumAST).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DATA_TYPE__ENUM_AST, null, msgs);
			msgs = basicSetEnumAST(newEnumAST, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__ENUM_AST, newEnumAST, newEnumAST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(boolean newTime) {
		boolean oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(boolean newTimestamp) {
		boolean oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
				return basicSetEnumAST(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
				return getConstraints();
			case MobaPackage.MOBA_DATA_TYPE__NAME:
				return getName();
			case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
				return isPrimitive();
			case MobaPackage.MOBA_DATA_TYPE__ARRAY:
				return isArray();
			case MobaPackage.MOBA_DATA_TYPE__DATE:
				return isDate();
			case MobaPackage.MOBA_DATA_TYPE__TIME:
				return isTime();
			case MobaPackage.MOBA_DATA_TYPE__TIMESTAMP:
				return isTimestamp();
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
				return getDateFormatString();
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST:
				if (resolve) return getDateFormatConst();
				return basicGetDateFormatConst();
			case MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
				return getEnumAST();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends MobaConstraint>)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
				setPrimitive((Boolean)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__ARRAY:
				setArray((Boolean)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE:
				setDate((Boolean)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__TIME:
				setTime((Boolean)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__TIMESTAMP:
				setTimestamp((Boolean)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
				setDateFormatString((String)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST:
				setDateFormatConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE:
				setSuperType((MobaDataType)newValue);
				return;
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
				setEnumAST((MobaEnum)newValue);
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
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case MobaPackage.MOBA_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
				setPrimitive(PRIMITIVE_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__ARRAY:
				setArray(ARRAY_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
				setDateFormatString(DATE_FORMAT_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST:
				setDateFormatConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE:
				setSuperType((MobaDataType)null);
				return;
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
				setEnumAST((MobaEnum)null);
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
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case MobaPackage.MOBA_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
				return primitive != PRIMITIVE_EDEFAULT;
			case MobaPackage.MOBA_DATA_TYPE__ARRAY:
				return array != ARRAY_EDEFAULT;
			case MobaPackage.MOBA_DATA_TYPE__DATE:
				return date != DATE_EDEFAULT;
			case MobaPackage.MOBA_DATA_TYPE__TIME:
				return time != TIME_EDEFAULT;
			case MobaPackage.MOBA_DATA_TYPE__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
				return DATE_FORMAT_STRING_EDEFAULT == null ? dateFormatString != null : !DATE_FORMAT_STRING_EDEFAULT.equals(dateFormatString);
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONST:
				return dateFormatConst != null;
			case MobaPackage.MOBA_DATA_TYPE__SUPER_TYPE:
				return superType != null;
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
				return enumAST != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_DATA_TYPE__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MobaConstraintable.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS: return MobaPackage.MOBA_CONSTRAINTABLE__CONSTRAINTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES: return MobaPackage.MOBA_DATA_TYPE__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MobaConstraintable.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_CONSTRAINTABLE__CONSTRAINTS: return MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", primitive: ");
		result.append(primitive);
		result.append(", array: ");
		result.append(array);
		result.append(", date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", dateFormatString: ");
		result.append(dateFormatString);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDateFormat() {
		if (getDateFormatConst() != null) {
			return getDateFormatConst().getValue();
		}
		return getDateFormatString();
	}

	@Override
	public MobaDataType getRootType() {
		if (getSuperType() == null) {
			return this;
		}
		return getSuperType().getRootType();
	}

	@Override
	public boolean isRootType() {
		return getSuperType() == null;
	}

	@Override
	public boolean isEnum() {
		return getEnumAST() != null;
	}

	@Override
	public List<MobaConstraint> getAllConstraints() {
		List<MobaDataType> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, MobaConstraint.class,
				MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS);
	}

	@Override
	public List<MobaDataType> getAllSuperTypes() throws RecursionException {
		List<MobaDataType> result = MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_DATA_TYPE__SUPER_TYPE);
		return result;
	}

} // MobaDataTypeImpl
