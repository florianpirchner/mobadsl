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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaApplicationImpl extends MinimalEObjectImpl.Container implements MobaApplication {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_APPLICATION__PROPERTIES);
		}
		return properties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_APPLICATION__VERSION, oldVersion, version));
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_APPLICATION__ID:
				return getId();
			case MobaPackage.MOBA_APPLICATION__NAME:
				return getName();
			case MobaPackage.MOBA_APPLICATION__VERSION:
				return getVersion();
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_APPLICATION__VERSION:
				setVersion((String)newValue);
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_APPLICATION__ID:
				return isSetId();
			case MobaPackage.MOBA_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MobaPackage.MOBA_APPLICATION__FEATURES:
				return features != null && !features.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
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
	public List<MobaEntity> getDtos() {
		return collect(MobaEntity.class);
	}

	@Override
	public List<MobaDto> getPayloads() {
		return collect(MobaDto.class);
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
	public List<MobaService> getRESTs() {
		return collect(MobaService.class);
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
	public List<MobaService> getAllREST() {
		return collectAll(this, MobaService.class);
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
	public List<MobaProperty> getAllProperties() {
		return getProperties();
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return getProperties();
	}

	@Override
	public String getId() {
		return getName() + ":" + getVersion();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isSetId() {
		return getId() != null;
	}

} // MobaApplicationImpl
