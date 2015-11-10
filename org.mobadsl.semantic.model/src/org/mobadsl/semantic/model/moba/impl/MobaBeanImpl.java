/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaBean;
import org.mobadsl.semantic.model.moba.MobaBeanAttribute;
import org.mobadsl.semantic.model.moba.MobaBeanFeature;
import org.mobadsl.semantic.model.moba.MobaBeanIndex;
import org.mobadsl.semantic.model.moba.MobaBeanReference;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dto</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getCache
 * <em>Cache</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getFeatures
 * <em>Features</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaBeanImpl#getIndex
 * <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaBeanImpl extends MobaDataImpl implements MobaBean {
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
	protected MobaBean superType;

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
	protected EList<MobaBeanFeature> features;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected MobaBeanIndex index;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_BEAN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_BEAN__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaBean getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaBean) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_BEAN__SUPER_TYPE,
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
	public MobaBean basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaBean newSuperType) {
		MobaBean oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__SUPER_TYPE, oldSuperType,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__CACHE,
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
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_BEAN__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject) newCache).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_BEAN__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaBeanFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaBeanFeature>(MobaBeanFeature.class, this,
					MobaPackage.MOBA_BEAN__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaBeanIndex getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIndex(MobaBeanIndex newIndex, NotificationChain msgs) {
		MobaBeanIndex oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__INDEX,
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
	public void setIndex(MobaBeanIndex newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject) index).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_BEAN__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject) newIndex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_BEAN__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_BEAN__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_BEAN__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_BEAN__CACHE:
			return basicSetCache(null, msgs);
		case MobaPackage.MOBA_BEAN__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case MobaPackage.MOBA_BEAN__INDEX:
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
		case MobaPackage.MOBA_BEAN__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_BEAN__NAME:
			return getName();
		case MobaPackage.MOBA_BEAN__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_BEAN__CACHE:
			return getCache();
		case MobaPackage.MOBA_BEAN__FEATURES:
			return getFeatures();
		case MobaPackage.MOBA_BEAN__INDEX:
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
		case MobaPackage.MOBA_BEAN__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_BEAN__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_BEAN__SUPER_TYPE:
			setSuperType((MobaBean) newValue);
			return;
		case MobaPackage.MOBA_BEAN__CACHE:
			setCache((MobaCache) newValue);
			return;
		case MobaPackage.MOBA_BEAN__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends MobaBeanFeature>) newValue);
			return;
		case MobaPackage.MOBA_BEAN__INDEX:
			setIndex((MobaBeanIndex) newValue);
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
		case MobaPackage.MOBA_BEAN__PROPERTIES:
			getProperties().clear();
			return;
		case MobaPackage.MOBA_BEAN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_BEAN__SUPER_TYPE:
			setSuperType((MobaBean) null);
			return;
		case MobaPackage.MOBA_BEAN__CACHE:
			setCache((MobaCache) null);
			return;
		case MobaPackage.MOBA_BEAN__FEATURES:
			getFeatures().clear();
			return;
		case MobaPackage.MOBA_BEAN__INDEX:
			setIndex((MobaBeanIndex) null);
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
		case MobaPackage.MOBA_BEAN__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_BEAN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_BEAN__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_BEAN__CACHE:
			return cache != null;
		case MobaPackage.MOBA_BEAN__FEATURES:
			return features != null && !features.isEmpty();
		case MobaPackage.MOBA_BEAN__INDEX:
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
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
			case MobaPackage.MOBA_BEAN__PROPERTIES:
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
				return MobaPackage.MOBA_BEAN__PROPERTIES;
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
	public List<MobaBeanAttribute> getAttributes() {
		return collect(MobaBeanAttribute.class);
	}

	@Override
	public List<MobaBeanReference> getReferences() {
		return collect(MobaBeanReference.class);
	}

	@Override
	public List<MobaBeanFeature> getAllFeatures() {
		return collectAll(this, MobaBeanFeature.class);
	}

	@Override
	public List<MobaBeanAttribute> getAllAttributes() {
		return collectAll(this, MobaBeanAttribute.class);
	}

	@Override
	public List<MobaBeanReference> getAllReferences() {
		return collectAll(this, MobaBeanReference.class);
	}

	protected <T extends EObject> List<T> collect(Class<T> clazz) {
		return MobaUtil.getAllFeatures(this, clazz, MobaPackage.Literals.MOBA_BEAN__FEATURES);
	}

	protected <T extends EObject> List<T> collectAll(MobaBean instance, Class<T> clazz) {

		List<MobaBean> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, MobaPackage.Literals.MOBA_BEAN__FEATURES);
	}

	protected <T extends EObject> List<T> collectGen(MobaBean instance, Class<T> clazz) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaBean> getAllSuperTypes() throws RecursionException {
		List<MobaBean> result = MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_BEAN__SUPER_TYPE);
		return result;
	}

	@Override
	public List<MobaBeanFeature> getGenFeatures() {
		return collectGen(this, MobaBeanFeature.class);
	}

	@Override
	public List<MobaBeanAttribute> getGenAttributes() {
		return collectGen(this, MobaBeanAttribute.class);
	}

	@Override
	public List<MobaBeanReference> getGenReferences() {
		return collectGen(this, MobaBeanReference.class);
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		List<MobaBean> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, MobaProperty.class,
				MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES);
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return MobaUtil.getGenFeatures(getAllProperties(), MobaPackage.Literals.MOBA_PROPERTY__KEY);
	}
} // MobaDtoImpl
