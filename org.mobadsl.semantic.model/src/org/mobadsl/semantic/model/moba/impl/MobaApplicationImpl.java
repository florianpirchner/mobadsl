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
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorSlot;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPersistenceType;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaTrigger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaApplicationImpl extends MobaModelFeatureImpl implements MobaApplication {
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
	protected EList<MobaApplicationFeature> features;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_APPLICATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_APPLICATION__CACHE, oldCache, newCache);
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
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_APPLICATION__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_APPLICATION__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_APPLICATION__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaApplicationFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaApplicationFeature>(MobaApplicationFeature.class, this, MobaPackage.MOBA_APPLICATION__FEATURES);
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
			case MobaPackage.MOBA_APPLICATION__CACHE:
				return basicSetCache(null, msgs);
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__CACHE:
				return getCache();
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__CACHE:
				setCache((MobaCache)newValue);
				return;
			case MobaPackage.MOBA_APPLICATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaApplicationFeature>)newValue);
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
			case MobaPackage.MOBA_APPLICATION__CACHE:
				setCache((MobaCache)null);
				return;
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__CACHE:
				return cache != null;
			case MobaPackage.MOBA_APPLICATION__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	protected <T> List<T> collectAll(MobaApplication instance, Class<T> clazz) {
		return collectAll(instance, clazz, new HashSet<>());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaApplication instance, Class<T> clazz, Set<EObject> processed) {
		List<T> result = new ArrayList<>();
		result.addAll(instance.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList()));

		for (MobaTemplate template : instance.getTemplates()) {
			// avoid cycles
			if (!processed.contains(template)) {
				processed.add(template);
				result.addAll(collectAll(template.getTemplate(), clazz, processed));
			}
		}

		return result;
	}

	@Override
	public List<MobaConstant> getConstants() {
		return collect(MobaConstant.class);
	}

	@Override
	public List<MobaData> getDatas() {
		return collect(MobaData.class);
	}

	@Override
	public List<MobaDto> getDtos() {
		return collect(MobaDto.class);
	}

	@Override
	public List<MobaTransportSerializationType> getTransportSerializationTypes() {
		return collect(MobaTransportSerializationType.class);
	}

	@Override
	public List<MobaPersistenceType> getPersistenceTypes() {
		return collect(MobaPersistenceType.class);
	}

	@Override
	public List<MobaQueue> getQueues() {
		return collect(MobaQueue.class);
	}

	@Override
	public List<MobaDataType> getDataTypes() {
		return collect(MobaDataType.class);
	}

	@Override
	public List<MobaGenerator> getGenerators() {
		return collect(MobaGenerator.class);
	}

	@Override
	public List<MobaREST> getRESTs() {
		return collect(MobaREST.class);
	}

	@Override
	public List<MobaRESTCustomService> getRestCustomServices() {
		return collect(MobaRESTCustomService.class);
	}

	@Override
	public List<MobaRESTCrud> getRESTCruds() {
		return collect(MobaRESTCrud.class);
	}

	@Override
	public List<MobaSettings> getSettings() {
		return collect(MobaSettings.class);
	}

	@Override
	public List<MobaTemplate> getTemplates() {
		return collect(MobaTemplate.class);
	}

	@Override
	public List<MobaApplicationFeature> getAllFeatures() {
		return collectAll(this, MobaApplicationFeature.class);
	}

	@Override
	public List<MobaConstant> getAllConstants() {
		return collectAll(this, MobaConstant.class);
	}

	@Override
	public List<MobaData> getAllDatas() {
		return collectAll(this, MobaData.class);
	}

	@Override
	public List<MobaDto> getAllDtos() {
		return collectAll(this, MobaDto.class);
	}

	@Override
	public List<MobaEntity> getAllEntities() {
		return collectAll(this, MobaEntity.class);
	}

	@Override
	public List<MobaQueue> getAllQueues() {
		return collectAll(this, MobaQueue.class);
	}

	@Override
	public List<MobaDataType> getAllDataTypes() {
		return collectAll(this, MobaDataType.class);
	}

	@Override
	public List<MobaGenerator> getAllGenerators() {
		return collectAll(this, MobaGenerator.class);
	}

	@Override
	public List<MobaREST> getAllREST() {
		return collectAll(this, MobaREST.class);
	}

	@Override
	public List<MobaRESTCustomService> getAllRESTCustomServices() {
		return collectAll(this, MobaRESTCustomService.class);
	}

	@Override
	public List<MobaRESTCrud> getAllRESTCruds() {
		return collectAll(this, MobaRESTCrud.class);
	}

	@Override
	public List<MobaSettings> getAllSettings() {
		return collectAll(this, MobaSettings.class);
	}

	@Override
	public List<MobaTemplate> getAllTemplates() {
		return collectAll(this, MobaTemplate.class);
	}

	@Override
	public List<MobaAuthorization> getAllAuthorizations() {
		return collectAll(this, MobaAuthorization.class);
	}

	@Override
	public List<MobaTransportSerializationType> getAllTransportSerializationTypes() {
		return collectAll(this, MobaTransportSerializationType.class);
	}

	@Override
	public List<MobaPersistenceType> getAllPersistenceTypes() {
		return collectAll(this, MobaPersistenceType.class);
	}

	@Override
	public List<MobaExternalModule> getExternalModules() {
		return collect(MobaExternalModule.class);
	}

	@Override
	public List<MobaGeneratorSlot> getGeneratorSlots() {
		return collect(MobaGeneratorSlot.class);
	}

	@Override
	public List<MobaTrigger> getTriggers() {
		return collect(MobaTrigger.class);
	}

	@Override
	public List<MobaServer> getServers() {
		return collect(MobaServer.class);
	}

	@Override
	public List<MobaExternalModule> getAllExternalModules() {
		return collectAll(this, MobaExternalModule.class);
	}

	@Override
	public List<MobaGeneratorSlot> getAllGeneratorSlots() {
		return collectAll(this, MobaGeneratorSlot.class);
	}

	@Override
	public List<MobaTrigger> getAllTriggers() {
		return collectAll(this, MobaTrigger.class);
	}

	@Override
	public List<MobaServer> getAllServers() {
		return collectAll(this, MobaServer.class);
	}

	@Override
	public List<MobaConstant> getGenConstants() {
		return getConstants();
	}

	@Override
	public List<MobaData> getGenDatas() {
		return getDatas();
	}

	@Override
	public List<MobaDto> getGenDtos() {
		return getDtos();
	}

	@Override
	public List<MobaQueue> getGenQueues() {
		return getQueues();
	}

	@Override
	public List<MobaDataType> getGenDataTypes() {
		return getDataTypes();
	}

	@Override
	public List<MobaGenerator> getGenGenerators() {
		return getGenerators();
	}

	@Override
	public List<MobaREST> getGenRESTs() {
		return getRESTs();
	}

	@Override
	public List<MobaRESTCustomService> getGenRestCustomServices() {
		return getRestCustomServices();
	}

	@Override
	public List<MobaRESTCrud> getGenRESTCruds() {
		return getRESTCruds();
	}

	@Override
	public List<MobaSettings> getGenSettings() {
		return getSettings();
	}

	@Override
	public List<MobaTemplate> getGenTemplates() {
		return getTemplates();
	}

	@Override
	public List<MobaExternalModule> getGenExternalModules() {
		return getExternalModules();
	}

	@Override
	public List<MobaTransportSerializationType> getGenTransportSerializationTypes() {
		return getTransportSerializationTypes();
	}

	@Override
	public List<MobaPersistenceType> getGenPersistenceTypes() {
		return getPersistenceTypes();
	}

	@Override
	public List<MobaGeneratorSlot> getGenGeneratorSlots() {
		return getGeneratorSlots();
	}

	@Override
	public List<MobaTrigger> getGenTriggers() {
		return getTriggers();
	}

	@Override
	public List<MobaApplicationFeature> getGenFeatures() {
		return getFeatures();
	}

	@Override
	public List<MobaServer> getGenServers() {
		return getServers();
	}

	@Override
	public MobaGenerator getActiveGenerator() {
		List<MobaGenerator> generators = getGenerators();
		if (generators.isEmpty()) {
			return null;
		}

		if (generators.size() == 1) {
			return generators.get(0);
		}

		return generators.stream().filter(e -> e.isActive()).findFirst().orElse(null);
	}

	@Override
	public MobaSettings getActiveSettings() {
		List<MobaSettings> settings = getSettings();
		if (settings.isEmpty()) {
			return null;
		}

		if (settings.size() == 1) {
			return settings.get(0);
		}

		return settings.stream().filter(e -> e.isActive()).findFirst().orElse(null);
	}

	@Override
	public <T extends EObject> List<T> getAllSuperTypes() {
		return new ArrayList<>();
	}

} // MobaApplicationImpl
