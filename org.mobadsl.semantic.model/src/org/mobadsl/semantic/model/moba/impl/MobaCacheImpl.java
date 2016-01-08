/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPersistenceType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cache</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheTypeString <em>Cache Type String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheTypeConst <em>Cache Type Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheStrategyString <em>Cache Strategy String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheStrategyConst <em>Cache Strategy Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheIntervalInt <em>Cache Interval Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCacheIntervalConst <em>Cache Interval Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl#getCachePersistence <em>Cache Persistence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaCacheImpl extends MobaApplicationFeatureImpl implements MobaCache {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheTypeString() <em>Cache Type String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheTypeString()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_TYPE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheTypeString() <em>Cache Type String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheTypeString()
	 * @generated
	 * @ordered
	 */
	protected String cacheTypeString = CACHE_TYPE_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCacheTypeConst() <em>Cache Type Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheTypeConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant cacheTypeConst;

	/**
	 * The default value of the '{@link #getCacheStrategyString() <em>Cache Strategy String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheStrategyString()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_STRATEGY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheStrategyString() <em>Cache Strategy String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheStrategyString()
	 * @generated
	 * @ordered
	 */
	protected String cacheStrategyString = CACHE_STRATEGY_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCacheStrategyConst() <em>Cache Strategy Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheStrategyConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant cacheStrategyConst;

	/**
	 * The default value of the '{@link #getCacheIntervalInt() <em>Cache Interval Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheIntervalInt()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_INTERVAL_INT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getCacheIntervalInt() <em>Cache Interval Int</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheIntervalInt()
	 * @generated
	 * @ordered
	 */
	protected int cacheIntervalInt = CACHE_INTERVAL_INT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCacheIntervalConst() <em>Cache Interval Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCacheIntervalConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant cacheIntervalConst;

	/**
	 * The cached value of the '{@link #getCachePersistence() <em>Cache Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachePersistence()
	 * @generated
	 * @ordered
	 */
	protected MobaPersistenceType cachePersistence;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheTypeString() {
		return cacheTypeString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheTypeString(String newCacheTypeString) {
		String oldCacheTypeString = cacheTypeString;
		cacheTypeString = newCacheTypeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_TYPE_STRING, oldCacheTypeString, cacheTypeString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getCacheTypeConst() {
		if (cacheTypeConst != null && cacheTypeConst.eIsProxy()) {
			InternalEObject oldCacheTypeConst = (InternalEObject)cacheTypeConst;
			cacheTypeConst = (MobaConstant)eResolveProxy(oldCacheTypeConst);
			if (cacheTypeConst != oldCacheTypeConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST, oldCacheTypeConst, cacheTypeConst));
			}
		}
		return cacheTypeConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetCacheTypeConst() {
		return cacheTypeConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheTypeConst(MobaConstant newCacheTypeConst) {
		MobaConstant oldCacheTypeConst = cacheTypeConst;
		cacheTypeConst = newCacheTypeConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST, oldCacheTypeConst, cacheTypeConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheStrategyString() {
		return cacheStrategyString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheStrategyString(String newCacheStrategyString) {
		String oldCacheStrategyString = cacheStrategyString;
		cacheStrategyString = newCacheStrategyString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_STRATEGY_STRING, oldCacheStrategyString, cacheStrategyString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getCacheStrategyConst() {
		if (cacheStrategyConst != null && cacheStrategyConst.eIsProxy()) {
			InternalEObject oldCacheStrategyConst = (InternalEObject)cacheStrategyConst;
			cacheStrategyConst = (MobaConstant)eResolveProxy(oldCacheStrategyConst);
			if (cacheStrategyConst != oldCacheStrategyConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST, oldCacheStrategyConst, cacheStrategyConst));
			}
		}
		return cacheStrategyConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetCacheStrategyConst() {
		return cacheStrategyConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheStrategyConst(MobaConstant newCacheStrategyConst) {
		MobaConstant oldCacheStrategyConst = cacheStrategyConst;
		cacheStrategyConst = newCacheStrategyConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST, oldCacheStrategyConst, cacheStrategyConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCacheIntervalInt() {
		return cacheIntervalInt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheIntervalInt(int newCacheIntervalInt) {
		int oldCacheIntervalInt = cacheIntervalInt;
		cacheIntervalInt = newCacheIntervalInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_INTERVAL_INT, oldCacheIntervalInt, cacheIntervalInt));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getCacheIntervalConst() {
		if (cacheIntervalConst != null && cacheIntervalConst.eIsProxy()) {
			InternalEObject oldCacheIntervalConst = (InternalEObject)cacheIntervalConst;
			cacheIntervalConst = (MobaConstant)eResolveProxy(oldCacheIntervalConst);
			if (cacheIntervalConst != oldCacheIntervalConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST, oldCacheIntervalConst, cacheIntervalConst));
			}
		}
		return cacheIntervalConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetCacheIntervalConst() {
		return cacheIntervalConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheIntervalConst(MobaConstant newCacheIntervalConst) {
		MobaConstant oldCacheIntervalConst = cacheIntervalConst;
		cacheIntervalConst = newCacheIntervalConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST, oldCacheIntervalConst, cacheIntervalConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPersistenceType getCachePersistence() {
		if (cachePersistence != null && cachePersistence.eIsProxy()) {
			InternalEObject oldCachePersistence = (InternalEObject)cachePersistence;
			cachePersistence = (MobaPersistenceType)eResolveProxy(oldCachePersistence);
			if (cachePersistence != oldCachePersistence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE, oldCachePersistence, cachePersistence));
			}
		}
		return cachePersistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPersistenceType basicGetCachePersistence() {
		return cachePersistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachePersistence(MobaPersistenceType newCachePersistence) {
		MobaPersistenceType oldCachePersistence = cachePersistence;
		cachePersistence = newCachePersistence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE, oldCachePersistence, cachePersistence));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_CACHE__NAME:
				return getName();
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_STRING:
				return getCacheTypeString();
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST:
				if (resolve) return getCacheTypeConst();
				return basicGetCacheTypeConst();
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_STRING:
				return getCacheStrategyString();
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST:
				if (resolve) return getCacheStrategyConst();
				return basicGetCacheStrategyConst();
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_INT:
				return getCacheIntervalInt();
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST:
				if (resolve) return getCacheIntervalConst();
				return basicGetCacheIntervalConst();
			case MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE:
				if (resolve) return getCachePersistence();
				return basicGetCachePersistence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_CACHE__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_STRING:
				setCacheTypeString((String)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST:
				setCacheTypeConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_STRING:
				setCacheStrategyString((String)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST:
				setCacheStrategyConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_INT:
				setCacheIntervalInt((Integer)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST:
				setCacheIntervalConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE:
				setCachePersistence((MobaPersistenceType)newValue);
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
			case MobaPackage.MOBA_CACHE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_STRING:
				setCacheTypeString(CACHE_TYPE_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST:
				setCacheTypeConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_STRING:
				setCacheStrategyString(CACHE_STRATEGY_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST:
				setCacheStrategyConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_INT:
				setCacheIntervalInt(CACHE_INTERVAL_INT_EDEFAULT);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST:
				setCacheIntervalConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE:
				setCachePersistence((MobaPersistenceType)null);
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
			case MobaPackage.MOBA_CACHE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_STRING:
				return CACHE_TYPE_STRING_EDEFAULT == null ? cacheTypeString != null : !CACHE_TYPE_STRING_EDEFAULT.equals(cacheTypeString);
			case MobaPackage.MOBA_CACHE__CACHE_TYPE_CONST:
				return cacheTypeConst != null;
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_STRING:
				return CACHE_STRATEGY_STRING_EDEFAULT == null ? cacheStrategyString != null : !CACHE_STRATEGY_STRING_EDEFAULT.equals(cacheStrategyString);
			case MobaPackage.MOBA_CACHE__CACHE_STRATEGY_CONST:
				return cacheStrategyConst != null;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_INT:
				return cacheIntervalInt != CACHE_INTERVAL_INT_EDEFAULT;
			case MobaPackage.MOBA_CACHE__CACHE_INTERVAL_CONST:
				return cacheIntervalConst != null;
			case MobaPackage.MOBA_CACHE__CACHE_PERSISTENCE:
				return cachePersistence != null;
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
		result.append(", cacheTypeString: ");
		result.append(cacheTypeString);
		result.append(", cacheStrategyString: ");
		result.append(cacheStrategyString);
		result.append(", cacheIntervalInt: ");
		result.append(cacheIntervalInt);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getCacheType() {
		if (getCacheTypeConst() != null) {
			return getCacheTypeConst().getValue();
		}
		return getCacheTypeString();
	}

	@Override
	public String getCacheStrategy() {
		if (getCacheStrategyConst() != null) {
			return getCacheStrategyConst().getValue();
		}
		return getCacheStrategyString();
	}

	@Override
	public int getCacheInterval() {
		if (getCacheIntervalConst() != null) {
			return getCacheIntervalConst().getValueAST().getValueInt();
		}
		return getCacheIntervalInt();
	}

	@Override
	public <T extends EObject> List<T> getAllSuperTypes() {
		return new ArrayList<T>();
	}

} // MobaCacheImpl
