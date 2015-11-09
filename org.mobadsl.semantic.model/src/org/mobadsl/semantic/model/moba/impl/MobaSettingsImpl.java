/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaSettingsFeature;
import org.mobadsl.semantic.model.moba.RecursionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Settings</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaSettingsImpl extends MobaApplicationFeatureImpl implements MobaSettings {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaSettings superType;

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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaSettingsFeature> features;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_SETTINGS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettings getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (MobaSettings)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_SETTINGS__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettings basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(MobaSettings newSuperType) {
		MobaSettings oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SETTINGS__SUPER_TYPE, oldSuperType, superType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SETTINGS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaSettingsFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaSettingsFeature>(MobaSettingsFeature.class, this, MobaPackage.MOBA_SETTINGS__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_SETTINGS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_SETTINGS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case MobaPackage.MOBA_SETTINGS__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_SETTINGS__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case MobaPackage.MOBA_SETTINGS__NAME:
				return getName();
			case MobaPackage.MOBA_SETTINGS__FEATURES:
				return getFeatures();
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
			case MobaPackage.MOBA_SETTINGS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_SETTINGS__SUPER_TYPE:
				setSuperType((MobaSettings)newValue);
				return;
			case MobaPackage.MOBA_SETTINGS__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_SETTINGS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaSettingsFeature>)newValue);
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
			case MobaPackage.MOBA_SETTINGS__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_SETTINGS__SUPER_TYPE:
				setSuperType((MobaSettings)null);
				return;
			case MobaPackage.MOBA_SETTINGS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_SETTINGS__FEATURES:
				getFeatures().clear();
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
			case MobaPackage.MOBA_SETTINGS__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_SETTINGS__SUPER_TYPE:
				return superType != null;
			case MobaPackage.MOBA_SETTINGS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_SETTINGS__FEATURES:
				return features != null && !features.isEmpty();
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
				case MobaPackage.MOBA_SETTINGS__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
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
				case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES: return MobaPackage.MOBA_SETTINGS__PROPERTIES;
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
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaSettingsAttribute> getAttributes() {
		return collect(MobaSettingsAttribute.class);
	}

	@Override
	public List<MobaSettingsFeature> getAllFeatures() {
		return collectAll(this, MobaSettingsFeature.class);
	}

	@Override
	public List<MobaSettingsAttribute> getAllAttributes() {
		return collectAll(this, MobaSettingsAttribute.class);
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaSettings instance, Class<T> clazz) {

		// throws exception if recursive
		List<MobaSettings> superTypes = getAllSuperTypes();

		List<T> result = new ArrayList<>();
		// add current
		result.addAll(instance.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList()));

		// add supertypes
		for (MobaSettings superType : superTypes) {
			result.addAll(superType.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass()))
					.map(e -> (T) e).collect(Collectors.<T> toList()));
		}

		return result;
	}

	@Override
	public List<MobaSettings> getAllSuperTypes() throws RecursionException {
		List<MobaSettings> result = new ArrayList<>();
		doGetAllSuperTypes(this, result);

		return result;
	}

	private void doGetAllSuperTypes(MobaSettings type, List<MobaSettings> result) {

		MobaSettings superType = type.getSuperType();

		if (superType == null) {
			return;
		}

		if (result.contains(superType)) {
			throw new RecursionException(type, superType);
		}
		result.add(superType);

		doGetAllSuperTypes(superType, result);
	}

} // MobaSettingsImpl
