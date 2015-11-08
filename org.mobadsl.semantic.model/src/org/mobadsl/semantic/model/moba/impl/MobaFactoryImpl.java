/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mobadsl.semantic.model.moba.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaFactoryImpl extends EFactoryImpl implements MobaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobaFactory init() {
		try {
			MobaFactory theMobaFactory = (MobaFactory)EPackage.Registry.INSTANCE.getEFactory(MobaPackage.eNS_URI);
			if (theMobaFactory != null) {
				return theMobaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobaPackage.MOBA_APPLICATION: return createMobaApplication();
			case MobaPackage.MOBA_TEMPLATE: return createMobaTemplate();
			case MobaPackage.MOBA_GENERATOR: return createMobaGenerator();
			case MobaPackage.MOBA_DATA_TYPE: return createMobaDataType();
			case MobaPackage.MOBA_CONSTANT: return createMobaConstant();
			case MobaPackage.MOBA_PROPERTY: return createMobaProperty();
			case MobaPackage.MOBA_SETTINGS: return createMobaSettings();
			case MobaPackage.MOBA_CACHE: return createMobaCache();
			case MobaPackage.MOBA_DTO: return createMobaDto();
			case MobaPackage.MOBA_DTO_INDEX: return createMobaDtoIndex();
			case MobaPackage.MOBA_PAYLOAD: return createMobaPayload();
			case MobaPackage.MOBA_QUEUE: return createMobaQueue();
			case MobaPackage.MOBA_SERVICE: return createMobaService();
			case MobaPackage.MOBA_REST_CUSTOM: return createMobaRestCustom();
			case MobaPackage.MOBA_REST_CRUD: return createMobaRestCrud();
			case MobaPackage.MOBA_DTO_ATTRIBUTE: return createMobaDtoAttribute();
			case MobaPackage.MOBA_DTO_REFERENCE: return createMobaDtoReference();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE: return createMobaPayloadAttribute();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE: return createMobaPayloadReference();
			case MobaPackage.MOBA_QUEUE_REFERENCE: return createMobaQueueReference();
			case MobaPackage.MOBA_MULIPLICITY: return createMobaMuliplicity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MobaPackage.MOBA_LOWER_BOUND:
				return createMobaLowerBoundFromString(eDataType, initialValue);
			case MobaPackage.MOBA_UPPER_BOUND:
				return createMobaUpperBoundFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MobaPackage.MOBA_LOWER_BOUND:
				return convertMobaLowerBoundToString(eDataType, instanceValue);
			case MobaPackage.MOBA_UPPER_BOUND:
				return convertMobaUpperBoundToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication createMobaApplication() {
		MobaApplicationImpl mobaApplication = new MobaApplicationImpl();
		return mobaApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTemplate createMobaTemplate() {
		MobaTemplateImpl mobaTemplate = new MobaTemplateImpl();
		return mobaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGenerator createMobaGenerator() {
		MobaGeneratorImpl mobaGenerator = new MobaGeneratorImpl();
		return mobaGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType createMobaDataType() {
		MobaDataTypeImpl mobaDataType = new MobaDataTypeImpl();
		return mobaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant createMobaConstant() {
		MobaConstantImpl mobaConstant = new MobaConstantImpl();
		return mobaConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaProperty createMobaProperty() {
		MobaPropertyImpl mobaProperty = new MobaPropertyImpl();
		return mobaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettings createMobaSettings() {
		MobaSettingsImpl mobaSettings = new MobaSettingsImpl();
		return mobaSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaCache createMobaCache() {
		MobaCacheImpl mobaCache = new MobaCacheImpl();
		return mobaCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto createMobaDto() {
		MobaDtoImpl mobaDto = new MobaDtoImpl();
		return mobaDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoIndex createMobaDtoIndex() {
		MobaDtoIndexImpl mobaDtoIndex = new MobaDtoIndexImpl();
		return mobaDtoIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayload createMobaPayload() {
		MobaPayloadImpl mobaPayload = new MobaPayloadImpl();
		return mobaPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaQueue createMobaQueue() {
		MobaQueueImpl mobaQueue = new MobaQueueImpl();
		return mobaQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaService createMobaService() {
		MobaServiceImpl mobaService = new MobaServiceImpl();
		return mobaService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRestCustom createMobaRestCustom() {
		MobaRestCustomImpl mobaRestCustom = new MobaRestCustomImpl();
		return mobaRestCustom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRestCrud createMobaRestCrud() {
		MobaRestCrudImpl mobaRestCrud = new MobaRestCrudImpl();
		return mobaRestCrud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoAttribute createMobaDtoAttribute() {
		MobaDtoAttributeImpl mobaDtoAttribute = new MobaDtoAttributeImpl();
		return mobaDtoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoReference createMobaDtoReference() {
		MobaDtoReferenceImpl mobaDtoReference = new MobaDtoReferenceImpl();
		return mobaDtoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayloadAttribute createMobaPayloadAttribute() {
		MobaPayloadAttributeImpl mobaPayloadAttribute = new MobaPayloadAttributeImpl();
		return mobaPayloadAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayloadReference createMobaPayloadReference() {
		MobaPayloadReferenceImpl mobaPayloadReference = new MobaPayloadReferenceImpl();
		return mobaPayloadReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaQueueReference createMobaQueueReference() {
		MobaQueueReferenceImpl mobaQueueReference = new MobaQueueReferenceImpl();
		return mobaQueueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMuliplicity createMobaMuliplicity() {
		MobaMuliplicityImpl mobaMuliplicity = new MobaMuliplicityImpl();
		return mobaMuliplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaLowerBound createMobaLowerBoundFromString(EDataType eDataType, String initialValue) {
		MobaLowerBound result = MobaLowerBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaLowerBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaUpperBound createMobaUpperBoundFromString(EDataType eDataType, String initialValue) {
		MobaUpperBound result = MobaUpperBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaUpperBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPackage getMobaPackage() {
		return (MobaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobaPackage getPackage() {
		return MobaPackage.eINSTANCE;
	}

} //MobaFactoryImpl
