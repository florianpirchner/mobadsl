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
import org.mobadsl.semantic.model.moba.MobaPropertiesProvider;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.RecursionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Queue</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getFeatures
 * <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaQueueImpl extends MobaDataImpl implements MobaQueue {
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
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaQueue superType;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaQueueFeature> features;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_QUEUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_QUEUE__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_QUEUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaQueue getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaQueue) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_QUEUE__SUPER_TYPE,
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
	public MobaQueue basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaQueue newSuperType) {
		MobaQueue oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_QUEUE__SUPER_TYPE, oldSuperType,
					superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaQueueFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaQueueFeature>(MobaQueueFeature.class, this,
					MobaPackage.MOBA_QUEUE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_QUEUE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_QUEUE__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
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
		case MobaPackage.MOBA_QUEUE__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_QUEUE__NAME:
			return getName();
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_QUEUE__FEATURES:
			return getFeatures();
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
		case MobaPackage.MOBA_QUEUE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_QUEUE__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			setSuperType((MobaQueue) newValue);
			return;
		case MobaPackage.MOBA_QUEUE__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends MobaQueueFeature>) newValue);
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
		case MobaPackage.MOBA_QUEUE__PROPERTIES:
			getProperties().clear();
			return;
		case MobaPackage.MOBA_QUEUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			setSuperType((MobaQueue) null);
			return;
		case MobaPackage.MOBA_QUEUE__FEATURES:
			getFeatures().clear();
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
		case MobaPackage.MOBA_QUEUE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_QUEUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_QUEUE__FEATURES:
			return features != null && !features.isEmpty();
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
			case MobaPackage.MOBA_QUEUE__PROPERTIES:
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
				return MobaPackage.MOBA_QUEUE__PROPERTIES;
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
	public List<MobaQueueReference> getReferences() {
		return collect(MobaQueueReference.class);
	}

	@Override
	public List<MobaQueueFeature> getAllFeatures() {
		return collectAll(this, MobaQueueFeature.class);
	}

	@Override
	public List<MobaQueueReference> getAllReferences() {
		return collectAll(this, MobaQueueReference.class);
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaQueue instance, Class<T> clazz) {

		// throws exception if recursive
		List<MobaQueue> superTypes = getAllSuperTypes();

		List<T> result = new ArrayList<>();
		// add current
		result.addAll(instance.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList()));

		// add supertypes
		for (MobaQueue superType : superTypes) {
			result.addAll(superType.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass()))
					.map(e -> (T) e).collect(Collectors.<T> toList()));
		}

		return result;
	}

	@Override
	public List<MobaQueue> getAllSuperTypes() throws RecursionException {
		List<MobaQueue> result = new ArrayList<>();
		doGetAllSuperTypes(this, result);

		return result;
	}

	private void doGetAllSuperTypes(MobaQueue type, List<MobaQueue> result) {

		MobaQueue superType = type.getSuperType();

		if (superType == null) {
			return;
		}

		if (result.contains(superType)) {
			throw new RecursionException(type, superType);
		}
		result.add(superType);

		doGetAllSuperTypes(superType, result);
	}

} // MobaQueueImpl
