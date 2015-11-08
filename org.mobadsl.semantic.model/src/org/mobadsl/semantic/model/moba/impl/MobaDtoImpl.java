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
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoIndex;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaPropertiesProvider;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.RecursionException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dto</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getCache
 * <em>Cache</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getFeatures
 * <em>Features</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl#getIndex
 * <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaDtoImpl extends MobaDataImpl implements MobaDto {
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
	protected MobaDto superType;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected MobaCache cache;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaDtoFeature> features;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected MobaDtoIndex index;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaDtoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_DTO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_DTO__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaDto getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaDto) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_DTO__SUPER_TYPE,
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
	public MobaDto basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaDto newSuperType) {
		MobaDto oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__SUPER_TYPE, oldSuperType,
					superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaCache getCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCache(MobaCache newCache, NotificationChain msgs) {
		MobaCache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__CACHE,
					oldCache, newCache);
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
	public void setCache(MobaCache newCache) {
		if (newCache != cache) {
			NotificationChain msgs = null;
			if (cache != null)
				msgs = ((InternalEObject) cache).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DTO__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject) newCache).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DTO__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaDtoFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaDtoFeature>(MobaDtoFeature.class, this,
					MobaPackage.MOBA_DTO__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaDtoIndex getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIndex(MobaDtoIndex newIndex, NotificationChain msgs) {
		MobaDtoIndex oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__INDEX,
					oldIndex, newIndex);
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
	public void setIndex(MobaDtoIndex newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject) index).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DTO__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject) newIndex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_DTO__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DTO__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_DTO__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_DTO__CACHE:
			return basicSetCache(null, msgs);
		case MobaPackage.MOBA_DTO__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_DTO__INDEX:
			return basicSetIndex(null, msgs);
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
		case MobaPackage.MOBA_DTO__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_DTO__NAME:
			return getName();
		case MobaPackage.MOBA_DTO__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_DTO__CACHE:
			return getCache();
		case MobaPackage.MOBA_DTO__FEATURES:
			return getFeatures();
		case MobaPackage.MOBA_DTO__INDEX:
			return getIndex();
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
		case MobaPackage.MOBA_DTO__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_DTO__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_DTO__SUPER_TYPE:
			setSuperType((MobaDto) newValue);
			return;
		case MobaPackage.MOBA_DTO__CACHE:
			setCache((MobaCache) newValue);
			return;
		case MobaPackage.MOBA_DTO__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends MobaDtoFeature>) newValue);
			return;
		case MobaPackage.MOBA_DTO__INDEX:
			setIndex((MobaDtoIndex) newValue);
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
		case MobaPackage.MOBA_DTO__PROPERTIES:
			getProperties().clear();
			return;
		case MobaPackage.MOBA_DTO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_DTO__SUPER_TYPE:
			setSuperType((MobaDto) null);
			return;
		case MobaPackage.MOBA_DTO__CACHE:
			setCache((MobaCache) null);
			return;
		case MobaPackage.MOBA_DTO__FEATURES:
			getFeatures().clear();
			return;
		case MobaPackage.MOBA_DTO__INDEX:
			setIndex((MobaDtoIndex) null);
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
		case MobaPackage.MOBA_DTO__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_DTO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_DTO__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_DTO__CACHE:
			return cache != null;
		case MobaPackage.MOBA_DTO__FEATURES:
			return features != null && !features.isEmpty();
		case MobaPackage.MOBA_DTO__INDEX:
			return index != null;
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
			case MobaPackage.MOBA_DTO__PROPERTIES:
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
				return MobaPackage.MOBA_DTO__PROPERTIES;
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
	public List<MobaDtoAttribute> getAttributes() {
		return collect(MobaDtoAttribute.class);
	}

	@Override
	public List<MobaDtoReference> getReferences() {
		return collect(MobaDtoReference.class);
	}

	@Override
	public List<MobaDtoFeature> getAllFeatures() {
		return collectAll(this, MobaDtoFeature.class);
	}

	@Override
	public List<MobaDtoAttribute> getAllAttributes() {
		return collectAll(this, MobaDtoAttribute.class);
	}

	@Override
	public List<MobaDtoReference> getAllReferences() {
		return collectAll(this, MobaDtoReference.class);
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaDto instance, Class<T> clazz) {

		// throws exception if recursive
		List<MobaDto> superTypes = getAllSuperTypes();

		List<T> result = new ArrayList<>();
		// add current
		result.addAll(instance.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList()));

		// add supertypes
		for (MobaDto superType : superTypes) {
			result.addAll(superType.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass()))
					.map(e -> (T) e).collect(Collectors.<T> toList()));
		}

		return result;
	}

	@Override
	public List<MobaDto> getAllSuperTypes() throws RecursionException {
		List<MobaDto> result = new ArrayList<>();
		doGetAllSuperTypes(this, result);

		return result;
	}

	private void doGetAllSuperTypes(MobaDto type, List<MobaDto> result) {
		
		MobaDto superType = type.getSuperType();
		
		if (superType == null) {
			return;
		}
		
		if (result.contains(superType)) {
			throw new RecursionException(type, superType);
		}
		result.add(superType);

		doGetAllSuperTypes(superType, result);
	}

} // MobaDtoImpl
