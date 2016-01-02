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
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Queue</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getCache
 * <em>Cache</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl#getFeatures
 * <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaQueueImpl extends MobaDataImpl implements MobaQueue {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MobaPackage.MOBA_QUEUE__CACHE, oldCache, newCache);
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
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_QUEUE__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject) newCache).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_QUEUE__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_QUEUE__CACHE, newCache, newCache));
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
		case MobaPackage.MOBA_QUEUE__CACHE:
			return basicSetCache(null, msgs);
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
		case MobaPackage.MOBA_QUEUE__NAME:
			return getName();
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_QUEUE__CACHE:
			return getCache();
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
		case MobaPackage.MOBA_QUEUE__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			setSuperType((MobaQueue) newValue);
			return;
		case MobaPackage.MOBA_QUEUE__CACHE:
			setCache((MobaCache) newValue);
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
		case MobaPackage.MOBA_QUEUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			setSuperType((MobaQueue) null);
			return;
		case MobaPackage.MOBA_QUEUE__CACHE:
			setCache((MobaCache) null);
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
		case MobaPackage.MOBA_QUEUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_QUEUE__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_QUEUE__CACHE:
			return cache != null;
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

	protected <T> List<T> collect(Class<T> clazz) {
		return MobaUtil.getAllFeatures(this, clazz, MobaPackage.Literals.MOBA_QUEUE__FEATURES);
	}

	protected <T> List<T> collectAll(MobaQueue instance, Class<T> clazz) {
		List<MobaQueue> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, MobaPackage.Literals.MOBA_QUEUE__FEATURES);
	}

	protected <T extends EObject> List<T> collectGen(MobaQueue instance, Class<T> clazz) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaQueue> getAllSuperTypes() throws RecursionException {
		List<MobaQueue> result = MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_QUEUE__SUPER_TYPE);
		return result;
	}

	@Override
	public List<MobaQueueFeature> getGenFeatures() {
		return MobaUtil.getGenFeatures(getAllFeatures(), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaQueueReference> getGenReferences() {
		return MobaUtil.getGenFeatures(getAllReferences(), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public MobaCache getGenCache() {
		if (getCache() != null) {
			return getCache();
		}
		return ((MobaApplication) eContainer()).getCache();
	}
} // MobaQueueImpl
