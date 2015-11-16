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
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaPackage;
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
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaEntityImpl extends MobaDataImpl implements MobaEntity {
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
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaEntity superType;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected MobaCache cache;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaEntityFeature> features;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected MobaEntityIndex index;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntity getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (MobaEntity)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_ENTITY__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntity basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(MobaEntity newSuperType) {
		MobaEntity oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaCache getCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCache(MobaCache newCache, NotificationChain msgs) {
		MobaCache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__CACHE, oldCache, newCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(MobaCache newCache) {
		if (newCache != cache) {
			NotificationChain msgs = null;
			if (cache != null)
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_ENTITY__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_ENTITY__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaEntityFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaEntityFeature>(MobaEntityFeature.class, this, MobaPackage.MOBA_ENTITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityIndex getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(MobaEntityIndex newIndex, NotificationChain msgs) {
		MobaEntityIndex oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(MobaEntityIndex newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_ENTITY__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_ENTITY__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_ENTITY__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_ENTITY__CACHE:
				return basicSetCache(null, msgs);
			case MobaPackage.MOBA_ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_ENTITY__INDEX:
				return basicSetIndex(null, msgs);
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
			case MobaPackage.MOBA_ENTITY__NAME:
				return getName();
			case MobaPackage.MOBA_ENTITY__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case MobaPackage.MOBA_ENTITY__CACHE:
				return getCache();
			case MobaPackage.MOBA_ENTITY__FEATURES:
				return getFeatures();
			case MobaPackage.MOBA_ENTITY__INDEX:
				return getIndex();
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
			case MobaPackage.MOBA_ENTITY__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_ENTITY__SUPER_TYPE:
				setSuperType((MobaEntity)newValue);
				return;
			case MobaPackage.MOBA_ENTITY__CACHE:
				setCache((MobaCache)newValue);
				return;
			case MobaPackage.MOBA_ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaEntityFeature>)newValue);
				return;
			case MobaPackage.MOBA_ENTITY__INDEX:
				setIndex((MobaEntityIndex)newValue);
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
			case MobaPackage.MOBA_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_ENTITY__SUPER_TYPE:
				setSuperType((MobaEntity)null);
				return;
			case MobaPackage.MOBA_ENTITY__CACHE:
				setCache((MobaCache)null);
				return;
			case MobaPackage.MOBA_ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case MobaPackage.MOBA_ENTITY__INDEX:
				setIndex((MobaEntityIndex)null);
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
			case MobaPackage.MOBA_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_ENTITY__SUPER_TYPE:
				return superType != null;
			case MobaPackage.MOBA_ENTITY__CACHE:
				return cache != null;
			case MobaPackage.MOBA_ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case MobaPackage.MOBA_ENTITY__INDEX:
				return index != null;
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
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaEntityAttribute> getAttributes() {
		return collect(MobaEntityAttribute.class);
	}

	@Override
	public List<MobaEntityReference> getReferences() {
		return collect(MobaEntityReference.class);
	}

	@Override
	public List<MobaEntityFeature> getAllFeatures() {
		return collectAll(this, MobaEntityFeature.class);
	}

	@Override
	public List<MobaEntityAttribute> getAllAttributes() {
		return collectAll(this, MobaEntityAttribute.class);
	}

	@Override
	public List<MobaEntityReference> getAllReferences() {
		return collectAll(this, MobaEntityReference.class);
	}

	protected <T extends EObject> List<T> collect(Class<T> clazz) {
		return MobaUtil.getAllFeatures(this, clazz, MobaPackage.Literals.MOBA_ENTITY__FEATURES);
	}

	protected <T extends EObject> List<T> collectAll(MobaEntity instance, Class<T> clazz) {

		List<MobaEntity> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, MobaPackage.Literals.MOBA_ENTITY__FEATURES);
	}

	protected <T extends EObject> List<T> collectGen(MobaEntity instance, Class<T> clazz) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaEntity> getAllSuperTypes() throws RecursionException {
		List<MobaEntity> result = MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_ENTITY__SUPER_TYPE);
		return result;
	}

	@Override
	public List<MobaEntityFeature> getGenFeatures() {
		return collectGen(this, MobaEntityFeature.class);
	}

	@Override
	public List<MobaEntityAttribute> getGenAttributes() {
		return collectGen(this, MobaEntityAttribute.class);
	}

	@Override
	public List<MobaEntityReference> getGenReferences() {
		return collectGen(this, MobaEntityReference.class);
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		List<MobaEntity> types = getAllSuperTypes();
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
