/**
 */
package org.mobadsl.semantic.model.moba.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.mobadsl.semantic.model.moba.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage
 * @generated
 */
public class MobaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSwitch() {
		if (modelPackage == null) {
			modelPackage = MobaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MobaPackage.MOBA_APPLICATION: {
				MobaApplication mobaApplication = (MobaApplication)theEObject;
				T result = caseMobaApplication(mobaApplication);
				if (result == null) result = caseMobaPropertiesProvider(mobaApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_APPLICATION_FEATURE: {
				MobaApplicationFeature mobaApplicationFeature = (MobaApplicationFeature)theEObject;
				T result = caseMobaApplicationFeature(mobaApplicationFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_TEMPLATE: {
				MobaTemplate mobaTemplate = (MobaTemplate)theEObject;
				T result = caseMobaTemplate(mobaTemplate);
				if (result == null) result = caseMobaApplicationFeature(mobaTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR: {
				MobaGenerator mobaGenerator = (MobaGenerator)theEObject;
				T result = caseMobaGenerator(mobaGenerator);
				if (result == null) result = caseMobaApplicationFeature(mobaGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DATA_TYPE: {
				MobaDataType mobaDataType = (MobaDataType)theEObject;
				T result = caseMobaDataType(mobaDataType);
				if (result == null) result = caseMobaApplicationFeature(mobaDataType);
				if (result == null) result = caseMobaPropertiesProvider(mobaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CONSTANT: {
				MobaConstant mobaConstant = (MobaConstant)theEObject;
				T result = caseMobaConstant(mobaConstant);
				if (result == null) result = caseMobaApplicationFeature(mobaConstant);
				if (result == null) result = caseMobaPropertiesProvider(mobaConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PROPERTIES_PROVIDER: {
				MobaPropertiesProvider mobaPropertiesProvider = (MobaPropertiesProvider)theEObject;
				T result = caseMobaPropertiesProvider(mobaPropertiesProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PROPERTY: {
				MobaProperty mobaProperty = (MobaProperty)theEObject;
				T result = caseMobaProperty(mobaProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DATA: {
				MobaData mobaData = (MobaData)theEObject;
				T result = caseMobaData(mobaData);
				if (result == null) result = caseMobaApplicationFeature(mobaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SETTINGS: {
				MobaSettings mobaSettings = (MobaSettings)theEObject;
				T result = caseMobaSettings(mobaSettings);
				if (result == null) result = caseMobaApplicationFeature(mobaSettings);
				if (result == null) result = caseMobaPropertiesProvider(mobaSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CACHE: {
				MobaCache mobaCache = (MobaCache)theEObject;
				T result = caseMobaCache(mobaCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO: {
				MobaDto mobaDto = (MobaDto)theEObject;
				T result = caseMobaDto(mobaDto);
				if (result == null) result = caseMobaData(mobaDto);
				if (result == null) result = caseMobaPropertiesProvider(mobaDto);
				if (result == null) result = caseMobaApplicationFeature(mobaDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_INDEX: {
				MobaDtoIndex mobaDtoIndex = (MobaDtoIndex)theEObject;
				T result = caseMobaDtoIndex(mobaDtoIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PAYLOAD: {
				MobaPayload mobaPayload = (MobaPayload)theEObject;
				T result = caseMobaPayload(mobaPayload);
				if (result == null) result = caseMobaData(mobaPayload);
				if (result == null) result = caseMobaPropertiesProvider(mobaPayload);
				if (result == null) result = caseMobaApplicationFeature(mobaPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE: {
				MobaQueue mobaQueue = (MobaQueue)theEObject;
				T result = caseMobaQueue(mobaQueue);
				if (result == null) result = caseMobaData(mobaQueue);
				if (result == null) result = caseMobaPropertiesProvider(mobaQueue);
				if (result == null) result = caseMobaApplicationFeature(mobaQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SERVICE: {
				MobaService mobaService = (MobaService)theEObject;
				T result = caseMobaService(mobaService);
				if (result == null) result = caseMobaApplicationFeature(mobaService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_CUSTOM: {
				MobaRestCustom mobaRestCustom = (MobaRestCustom)theEObject;
				T result = caseMobaRestCustom(mobaRestCustom);
				if (result == null) result = caseMobaService(mobaRestCustom);
				if (result == null) result = caseMobaPropertiesProvider(mobaRestCustom);
				if (result == null) result = caseMobaApplicationFeature(mobaRestCustom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_CRUD: {
				MobaRestCrud mobaRestCrud = (MobaRestCrud)theEObject;
				T result = caseMobaRestCrud(mobaRestCrud);
				if (result == null) result = caseMobaService(mobaRestCrud);
				if (result == null) result = caseMobaPropertiesProvider(mobaRestCrud);
				if (result == null) result = caseMobaApplicationFeature(mobaRestCrud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_FEATURE: {
				MobaFeature mobaFeature = (MobaFeature)theEObject;
				T result = caseMobaFeature(mobaFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_FEATURE: {
				MobaDtoFeature mobaDtoFeature = (MobaDtoFeature)theEObject;
				T result = caseMobaDtoFeature(mobaDtoFeature);
				if (result == null) result = caseMobaFeature(mobaDtoFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_ATTRIBUTE: {
				MobaDtoAttribute mobaDtoAttribute = (MobaDtoAttribute)theEObject;
				T result = caseMobaDtoAttribute(mobaDtoAttribute);
				if (result == null) result = caseMobaDtoFeature(mobaDtoAttribute);
				if (result == null) result = caseMobaMultiplicityProvider(mobaDtoAttribute);
				if (result == null) result = caseMobaPropertiesProvider(mobaDtoAttribute);
				if (result == null) result = caseMobaFeature(mobaDtoAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MULTIPLICITY_PROVIDER: {
				MobaMultiplicityProvider mobaMultiplicityProvider = (MobaMultiplicityProvider)theEObject;
				T result = caseMobaMultiplicityProvider(mobaMultiplicityProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_REFERENCE: {
				MobaDtoReference mobaDtoReference = (MobaDtoReference)theEObject;
				T result = caseMobaDtoReference(mobaDtoReference);
				if (result == null) result = caseMobaDtoFeature(mobaDtoReference);
				if (result == null) result = caseMobaMultiplicityProvider(mobaDtoReference);
				if (result == null) result = caseMobaPropertiesProvider(mobaDtoReference);
				if (result == null) result = caseMobaFeature(mobaDtoReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PAYLOAD_FEATURE: {
				MobaPayloadFeature mobaPayloadFeature = (MobaPayloadFeature)theEObject;
				T result = caseMobaPayloadFeature(mobaPayloadFeature);
				if (result == null) result = caseMobaFeature(mobaPayloadFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE: {
				MobaPayloadAttribute mobaPayloadAttribute = (MobaPayloadAttribute)theEObject;
				T result = caseMobaPayloadAttribute(mobaPayloadAttribute);
				if (result == null) result = caseMobaPayloadFeature(mobaPayloadAttribute);
				if (result == null) result = caseMobaMultiplicityProvider(mobaPayloadAttribute);
				if (result == null) result = caseMobaPropertiesProvider(mobaPayloadAttribute);
				if (result == null) result = caseMobaFeature(mobaPayloadAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PAYLOAD_REFERENCE: {
				MobaPayloadReference mobaPayloadReference = (MobaPayloadReference)theEObject;
				T result = caseMobaPayloadReference(mobaPayloadReference);
				if (result == null) result = caseMobaPayloadFeature(mobaPayloadReference);
				if (result == null) result = caseMobaMultiplicityProvider(mobaPayloadReference);
				if (result == null) result = caseMobaPropertiesProvider(mobaPayloadReference);
				if (result == null) result = caseMobaFeature(mobaPayloadReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE_FEATURE: {
				MobaQueueFeature mobaQueueFeature = (MobaQueueFeature)theEObject;
				T result = caseMobaQueueFeature(mobaQueueFeature);
				if (result == null) result = caseMobaFeature(mobaQueueFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE_REFERENCE: {
				MobaQueueReference mobaQueueReference = (MobaQueueReference)theEObject;
				T result = caseMobaQueueReference(mobaQueueReference);
				if (result == null) result = caseMobaQueueFeature(mobaQueueReference);
				if (result == null) result = caseMobaMultiplicityProvider(mobaQueueReference);
				if (result == null) result = caseMobaPropertiesProvider(mobaQueueReference);
				if (result == null) result = caseMobaFeature(mobaQueueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MULIPLICITY: {
				MobaMuliplicity mobaMuliplicity = (MobaMuliplicity)theEObject;
				T result = caseMobaMuliplicity(mobaMuliplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaApplication(MobaApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaApplicationFeature(MobaApplicationFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaTemplate(MobaTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGenerator(MobaGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDataType(MobaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaConstant(MobaConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPropertiesProvider(MobaPropertiesProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaProperty(MobaProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaData(MobaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSettings(MobaSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaCache(MobaCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDto(MobaDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoIndex(MobaDtoIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPayload(MobaPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueue(MobaQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaService(MobaService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRestCustom(MobaRestCustom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Crud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Crud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRestCrud(MobaRestCrud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaFeature(MobaFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoFeature(MobaDtoFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoAttribute(MobaDtoAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMultiplicityProvider(MobaMultiplicityProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoReference(MobaDtoReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPayloadFeature(MobaPayloadFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPayloadAttribute(MobaPayloadAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPayloadReference(MobaPayloadReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueueFeature(MobaQueueFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueueReference(MobaQueueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Muliplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Muliplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMuliplicity(MobaMuliplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MobaSwitch
