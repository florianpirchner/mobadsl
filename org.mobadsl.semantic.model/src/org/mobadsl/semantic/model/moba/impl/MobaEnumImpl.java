/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
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
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.RecursionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enum</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl#getLiterals
 * <em>Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaEnumImpl extends MobaApplicationFeatureImpl implements MobaEnum {
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
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaEnum superType;

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
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaEnumLiteral> literals;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_ENUM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_ENUM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaEnum getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaEnum) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_ENUM__SUPER_TYPE,
							oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaEnum basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaEnum newSuperType) {
		MobaEnum oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENUM__SUPER_TYPE, oldSuperType,
					superType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaEnumLiteral> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentEList<MobaEnumLiteral>(MobaEnumLiteral.class, this,
					MobaPackage.MOBA_ENUM__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_ENUM__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_ENUM__LITERALS:
			return ((InternalEList<?>) getLiterals()).basicRemove(otherEnd, msgs);
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
		case MobaPackage.MOBA_ENUM__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_ENUM__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_ENUM__NAME:
			return getName();
		case MobaPackage.MOBA_ENUM__LITERALS:
			return getLiterals();
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
		case MobaPackage.MOBA_ENUM__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_ENUM__SUPER_TYPE:
			setSuperType((MobaEnum) newValue);
			return;
		case MobaPackage.MOBA_ENUM__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_ENUM__LITERALS:
			getLiterals().clear();
			getLiterals().addAll((Collection<? extends MobaEnumLiteral>) newValue);
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
		case MobaPackage.MOBA_ENUM__PROPERTIES:
			getProperties().clear();
			return;
		case MobaPackage.MOBA_ENUM__SUPER_TYPE:
			setSuperType((MobaEnum) null);
			return;
		case MobaPackage.MOBA_ENUM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_ENUM__LITERALS:
			getLiterals().clear();
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
		case MobaPackage.MOBA_ENUM__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_ENUM__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_ENUM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_ENUM__LITERALS:
			return literals != null && !literals.isEmpty();
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
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
			case MobaPackage.MOBA_ENUM__PROPERTIES:
				return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
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
		if (baseClass == MobaPropertiesAble.class) {
			switch (baseFeatureID) {
			case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES:
				return MobaPackage.MOBA_ENUM__PROPERTIES;
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
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaEnumLiteral> getAllLiterals() {
		List<MobaEnumLiteral> result = new ArrayList<>();
		getAllSuperTypes().stream().forEach(e -> result.addAll(e.getLiterals()));
		return result;
	}

	@Override
	public List<MobaEnum> getAllSuperTypes() throws RecursionException {
		List<MobaEnum> result = new ArrayList<>();
		doGetAllSuperTypes(this, result);
		return result;
	}

	private void doGetAllSuperTypes(MobaEnum type, List<MobaEnum> result) {

		MobaEnum superType = type.getSuperType();

		if (superType == null) {
			return;
		}

		if (result.contains(superType)) {
			throw new RecursionException(type, superType);
		}
		result.add(superType);

		doGetAllSuperTypes(superType, result);
	}

} // MobaEnumImpl
