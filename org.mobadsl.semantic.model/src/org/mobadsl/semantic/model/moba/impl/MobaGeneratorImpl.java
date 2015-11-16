/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaGeneratorImpl extends MobaApplicationFeatureImpl implements MobaGenerator {
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
	protected EList<MobaGeneratorFeature> features;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaGeneratorFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaGeneratorFeature>(MobaGeneratorFeature.class, this, MobaPackage.MOBA_GENERATOR__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR__FEATURES:
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
			case MobaPackage.MOBA_GENERATOR__NAME:
				return getName();
			case MobaPackage.MOBA_GENERATOR__FEATURES:
				return getFeatures();
			case MobaPackage.MOBA_GENERATOR__ACTIVE:
				return isActive();
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
			case MobaPackage.MOBA_GENERATOR__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_GENERATOR__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaGeneratorFeature>)newValue);
				return;
			case MobaPackage.MOBA_GENERATOR__ACTIVE:
				setActive((Boolean)newValue);
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
			case MobaPackage.MOBA_GENERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_GENERATOR__FEATURES:
				getFeatures().clear();
				return;
			case MobaPackage.MOBA_GENERATOR__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case MobaPackage.MOBA_GENERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_GENERATOR__FEATURES:
				return features != null && !features.isEmpty();
			case MobaPackage.MOBA_GENERATOR__ACTIVE:
				return active != ACTIVE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaGenerator instance, Class<T> clazz, Set<EObject> processed) {
		List<T> result = new ArrayList<>();
		if(instance == null) {
			return result;
		}
		
		for (MobaGeneratorFeature feature : instance.getFeatures()) {
			// only add to result, if the feature is of type clazz
			if (clazz.isAssignableFrom(feature.getClass())) {
				result.add((T) feature);
			}

			// if the feature is a mixin feature, then resolve the feature
			if (feature instanceof MobaGeneratorMixinFeature) {
				// avoid cycles in their dependencies
				if (!processed.contains(feature)) {
					processed.add(feature);
					MobaGenerator nextGenerator = ((MobaGeneratorMixinFeature) feature).getGeneratorRef();
					result.addAll(collectAll(nextGenerator, clazz, processed));
				}
			}
		}

		return result;
	}

	@Override
	public List<MobaGeneratorMixinFeature> getAllGeneratoMixinFeatures() {
		return collectAll(this, MobaGeneratorMixinFeature.class, new HashSet<>());
	}

	@Override
	public List<MobaGeneratorFeature> getAllFeatures() {
		return collectAll(this, MobaGeneratorFeature.class, new HashSet<>());
	}

	@Override
	public List<MobaGeneratorIDFeature> getAllGeneratorIdFeatures() {
		return collectAll(this, MobaGeneratorIDFeature.class, new HashSet<>());
	}

	@Override
	public List<String> getAllGeneratorVersionedIds() {
		List<String> result = new ArrayList<>();
		for (MobaGeneratorIDFeature feature : getAllGeneratorIdFeatures()) {
			result.add(feature.getGeneratorVersionedId());
		}
		return result;
	}

	@Override
	public String getVersionedId() {
		MobaApplication app = (MobaApplication) eContainer();
		return MobaUtil.toGeneratorVersionedId(getName(), app.getVersion());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MobaGenerator> getAllSuperTypes() {
		return new ArrayList<>();
	}
	
} // MobaGeneratorImpl
