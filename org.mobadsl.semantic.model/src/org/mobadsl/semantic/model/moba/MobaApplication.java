/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getDefaultCache <em>Default Cache</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication()
 * @model
 * @generated
 */
public interface MobaApplication extends MobaModelFeature {
	/**
	 * Returns the value of the '<em><b>Default Cache</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cache</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Cache</em>' reference.
	 * @see #setDefaultCache(MobaCache)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication_DefaultCache()
	 * @model
	 * @generated
	 */
	MobaCache getDefaultCache();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaApplication#getDefaultCache <em>Default Cache</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Default Cache</em>' reference.
	 * @see #getDefaultCache()
	 * @generated
	 */
	void setDefaultCache(MobaCache value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaApplicationFeature}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaApplicationFeature> getFeatures();

	/**
	 * Returns the moba constants for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaConstant> getConstants();

	/**
	 * Returns the moba datas for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaData> getDatas();

	/**
	 * Returns the moba caches for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaCache> getCaches();

	/**
	 * Returns the moba dtos for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDto> getDtos();

	/**
	 * Returns the moba queues for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaQueue> getQueues();

	/**
	 * Returns the moba datatypes for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDataType> getDataTypes();

	/**
	 * Returns the moba gernerators for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaGenerator> getGenerators();

	/**
	 * Returns the moba services for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaREST> getRESTs();

	/**
	 * Returns the moba restCustom services for the current application.
	 * Excluding the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCustomService> getRestCustomServices();

	/**
	 * Returns the moba restCrud services for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCrud> getRESTCruds();

	/**
	 * Returns the moba settings for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaSettings> getSettings();

	/**
	 * Returns the moba datas for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTemplate> getTemplates();

	/**
	 * Returns the moba transportSerializationType for the current application.
	 * 
	 * @return
	 */
	List<MobaTransportSerializationType> getTransportSerializationTypes();

	/**
	 * Returns the moba persistenceType for the current application.
	 * 
	 * @return
	 */
	List<MobaPersistenceType> getPersistenceTypes();

	/**
	 * Returns the moba external modules for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaExternalModule> getExternalModules();

	/**
	 * Returns the moba generator slots for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaGeneratorSlot> getGeneratorSlots();

	/**
	 * Returns the moba triggers for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTrigger> getTriggers();

	/**
	 * Returns the moba servers for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaServer> getServers();

	// all features
	List<MobaApplicationFeature> getAllFeatures();

	// gen
	/**
	 * Returns the moba constants for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaConstant> getGenConstants();

	/**
	 * Returns the moba datas for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaData> getGenDatas();

	/**
	 * Returns the moba caches for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaCache> getGenCaches();

	/**
	 * Returns the moba dtos for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDto> getGenDtos();

	/**
	 * Returns the moba queues for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaQueue> getGenQueues();

	/**
	 * Returns the moba datatypes for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDataType> getGenDataTypes();

	/**
	 * Returns the moba gernerators for the current application.
	 * 
	 * @return
	 */
	List<MobaGenerator> getGenGenerators();

	/**
	 * Returns the moba transportSerializationType for the current application.
	 * 
	 * @return
	 */
	List<MobaTransportSerializationType> getGenTransportSerializationTypes();

	/**
	 * Returns the moba persistenceType for the current application.
	 * 
	 * @return
	 */
	List<MobaPersistenceType> getGenPersistenceTypes();

	/**
	 * Returns the moba services for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaREST> getGenRESTs();

	/**
	 * Returns the moba restCustom services for the current application.
	 * Excluding the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCustomService> getGenRestCustomServices();

	/**
	 * Returns the moba restCrud services for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCrud> getGenRESTCruds();

	/**
	 * Returns the moba settings for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaSettings> getGenSettings();

	/**
	 * Returns the moba datas for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTemplate> getGenTemplates();

	/**
	 * Returns the moba external modules for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaExternalModule> getGenExternalModules();

	/**
	 * Returns the moba generator slots for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaGeneratorSlot> getGenGeneratorSlots();

	/**
	 * Returns the moba triggers for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTrigger> getGenTriggers();

	// all features
	List<MobaApplicationFeature> getGenFeatures();

	/**
	 * Returns the moba constants for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaConstant> getAllConstants();

	/**
	 * Returns the moba datas for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaData> getAllDatas();

	/**
	 * Returns the moba caches for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaCache> getAllCaches();

	/**
	 * Returns the moba dtos for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDto> getAllDtos();

	/**
	 * Returns the moba payloads for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaEntity> getAllEntities();

	/**
	 * Returns the moba queues for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaQueue> getAllQueues();

	/**
	 * Returns the moba datatypes for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDataType> getAllDataTypes();

	/**
	 * Returns the moba gernerators for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaGenerator> getAllGenerators();

	/**
	 * Returns the moba services for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaREST> getAllREST();

	/**
	 * Returns the moba restCustom services for the current application.
	 * Including the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCustomService> getAllRESTCustomServices();

	/**
	 * Returns the moba restCrud services for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaRESTCrud> getAllRESTCruds();

	/**
	 * Returns the moba settings for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaSettings> getAllSettings();

	/**
	 * Returns the moba datas for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTemplate> getAllTemplates();

	/**
	 * Returns the moba authorizations for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaAuthorization> getAllAuthorizations();

	/**
	 * Returns the moba transportSerializationType for the current application.
	 * Including the "used templates".
	 * 
	 * @return
	 */
	List<MobaTransportSerializationType> getAllTransportSerializationTypes();

	/**
	 * Returns the moba persistenceType for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaPersistenceType> getAllPersistenceTypes();

	/**
	 * Returns the active generator.
	 * 
	 * @return
	 */
	MobaGenerator getActiveGenerator();

	/**
	 * Returns the active settings.
	 * 
	 * @return
	 */
	MobaSettings getActiveSettings();

	/**
	 * Returns the moba external modules for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaExternalModule> getAllExternalModules();

	/**
	 * Returns the moba generator slots for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaGeneratorSlot> getAllGeneratorSlots();

	/**
	 * Returns the moba triggers for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaTrigger> getAllTriggers();

	/**
	 * Returns the moba servers for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	public List<MobaServer> getAllServers();

	/**
	 * Returns the moba servers for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	public List<MobaServer> getGenServers();

} // MobaApplication
