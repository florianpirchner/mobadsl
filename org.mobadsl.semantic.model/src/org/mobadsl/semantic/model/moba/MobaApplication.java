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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getId <em>Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaApplication#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication()
 * @model
 * @generated
 */
public interface MobaApplication extends MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication_Id()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaApplication_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaApplication#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * Returns the moba dtos for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaEntity> getDtos();

	/**
	 * Returns the moba payloads for the current application. Excluding the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDto> getPayloads();

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
	List<MobaService> getServices();

	/**
	 * Returns the moba restCustom services for the current application.
	 * Excluding the "used templates".
	 * 
	 * @return
	 */
	List<MobaRestCustom> getRestCustoms();

	/**
	 * Returns the moba restCrud services for the current application. Excluding
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaRestCrud> getRestCruds();

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

	// all features
	List<MobaApplicationFeature> getAllFeatures();

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
	 * Returns the moba dtos for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaEntity> getAllDtos();

	/**
	 * Returns the moba payloads for the current application. Including the
	 * "used templates".
	 * 
	 * @return
	 */
	List<MobaDto> getAllPayloads();

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
	List<MobaService> getAllServices();

	/**
	 * Returns the moba restCustom services for the current application.
	 * Including the "used templates".
	 * 
	 * @return
	 */
	List<MobaRestCustom> getAllRestCustoms();

	/**
	 * Returns the moba restCrud services for the current application. Including
	 * the "used templates".
	 * 
	 * @return
	 */
	List<MobaRestCrud> getAllRestCruds();

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
	 * Returns whether the value of the '{@link org.mobadsl.semantic.model.moba.MobaApplication#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #getId()
	 * @generated
	 */
	boolean isSetId();

} // MobaApplication
