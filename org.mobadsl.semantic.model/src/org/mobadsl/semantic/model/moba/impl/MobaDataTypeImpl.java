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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesProvider;
import org.mobadsl.semantic.model.moba.MobaProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isPrimitive
 * <em>Primitive</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isArray
 * <em>Array</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#isDate
 * <em>Date</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getDateFormatString
 * <em>Date Format String</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl#getDateFormatConstant
 * <em>Date Format Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaDataTypeImpl extends MobaApplicationFeatureImpl implements MobaDataType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimitive() <em>Primitive</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean primitive = PRIMITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * The default value of the '{@link #getDateFormatString()
	 * <em>Date Format String</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDateFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFormatString()
	 * <em>Date Format String</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDateFormatString()
	 * @generated
	 * @ordered
	 */
	protected String dateFormatString = DATE_FORMAT_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateFormatConstant()
	 * <em>Date Format Constant</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDateFormatConstant()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant dateFormatConstant;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_DATA_TYPE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public boolean isPrimitive() {
		return primitive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrimitive(boolean newPrimitive) {
		boolean oldPrimitive = primitive;
		primitive = newPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__PRIMITIVE, oldPrimitive,
					primitive));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public boolean isDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	public String getDateFormatString() {
		return dateFormatString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDateFormatString(String newDateFormatString) {
		String oldDateFormatString = dateFormatString;
		dateFormatString = newDateFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING,
					oldDateFormatString, dateFormatString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaConstant getDateFormatConstant() {
		if (dateFormatConstant != null && dateFormatConstant.eIsProxy()) {
			InternalEObject oldDateFormatConstant = (InternalEObject) dateFormatConstant;
			dateFormatConstant = (MobaConstant) eResolveProxy(oldDateFormatConstant);
			if (dateFormatConstant != oldDateFormatConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT, oldDateFormatConstant,
							dateFormatConstant));
			}
		}
		return dateFormatConstant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaConstant basicGetDateFormatConstant() {
		return dateFormatConstant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDateFormatConstant(MobaConstant newDateFormatConstant) {
		MobaConstant oldDateFormatConstant = dateFormatConstant;
		dateFormatConstant = newDateFormatConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT,
					oldDateFormatConstant, dateFormatConstant));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
		case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_DATA_TYPE__NAME:
			return getName();
		case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
			return isPrimitive();
		case MobaPackage.MOBA_DATA_TYPE__ARRAY:
			return isArray();
		case MobaPackage.MOBA_DATA_TYPE__DATE:
			return isDate();
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
			return getDateFormatString();
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT:
			if (resolve)
				return getDateFormatConstant();
			return basicGetDateFormatConstant();
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
		case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
			setPrimitive((Boolean) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__ARRAY:
			setArray((Boolean) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__DATE:
			setDate((Boolean) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
			setDateFormatString((String) newValue);
			return;
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT:
			setDateFormatConstant((MobaConstant) newValue);
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
		case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			getProperties().clear();
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
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
			setDateFormatString(DATE_FORMAT_STRING_EDEFAULT);
			return;
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT:
			setDateFormatConstant((MobaConstant) null);
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
		case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_DATA_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
			return primitive != PRIMITIVE_EDEFAULT;
		case MobaPackage.MOBA_DATA_TYPE__ARRAY:
			return array != ARRAY_EDEFAULT;
		case MobaPackage.MOBA_DATA_TYPE__DATE:
			return date != DATE_EDEFAULT;
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
			return DATE_FORMAT_STRING_EDEFAULT == null ? dateFormatString != null
					: !DATE_FORMAT_STRING_EDEFAULT.equals(dateFormatString);
		case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT:
			return dateFormatConstant != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesProvider.class) {
			switch (derivedFeatureID) {
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
				return MobaPackage.MOBA_PROPERTIES_PROVIDER__PROPERTIES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesProvider.class) {
			switch (baseFeatureID) {
			case MobaPackage.MOBA_PROPERTIES_PROVIDER__PROPERTIES:
				return MobaPackage.MOBA_DATA_TYPE__PROPERTIES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", primitive: ");
		result.append(primitive);
		result.append(", array: ");
		result.append(array);
		result.append(", date: ");
		result.append(date);
		result.append(", dateFormatString: ");
		result.append(dateFormatString);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDateFormat() {
		if (getDateFormatConstant() != null) {
			return getDateFormatConstant().getValue();
		}
		return getDateFormatString();
	}

} // MobaDataTypeImpl
