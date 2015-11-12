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
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaFutureConstraint;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaLowerBound;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMinConstraint;
import org.mobadsl.semantic.model.moba.MobaMinLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaNotNullConstraint;
import org.mobadsl.semantic.model.moba.MobaNullConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPastConstraint;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;
import org.mobadsl.semantic.model.moba.MobaRestCrud;
import org.mobadsl.semantic.model.moba.MobaRestCustom;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaUpperBound;

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
			case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE: return createMobaGeneratorMixinFeature();
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE: return createMobaGeneratorIDFeature();
			case MobaPackage.MOBA_DATA_TYPE: return createMobaDataType();
			case MobaPackage.MOBA_CONSTANT: return createMobaConstant();
			case MobaPackage.MOBA_CONSTANT_VALUE: return createMobaConstantValue();
			case MobaPackage.MOBA_PROPERTY: return createMobaProperty();
			case MobaPackage.MOBA_SETTINGS: return createMobaSettings();
			case MobaPackage.MOBA_CACHE: return createMobaCache();
			case MobaPackage.MOBA_ENTITY: return createMobaEntity();
			case MobaPackage.MOBA_ENTITY_INDEX: return createMobaEntityIndex();
			case MobaPackage.MOBA_DTO: return createMobaDto();
			case MobaPackage.MOBA_QUEUE: return createMobaQueue();
			case MobaPackage.MOBA_SERVICE: return createMobaService();
			case MobaPackage.MOBA_REST_CUSTOM: return createMobaRestCustom();
			case MobaPackage.MOBA_REST_CRUD: return createMobaRestCrud();
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE: return createMobaEntityAttribute();
			case MobaPackage.MOBA_ENTITY_REFERENCE: return createMobaEntityReference();
			case MobaPackage.MOBA_DTO_ATTRIBUTE: return createMobaDtoAttribute();
			case MobaPackage.MOBA_DTO_REFERENCE: return createMobaDtoReference();
			case MobaPackage.MOBA_QUEUE_REFERENCE: return createMobaQueueReference();
			case MobaPackage.MOBA_MULIPLICITY: return createMobaMuliplicity();
			case MobaPackage.MOBA_SETTINGS_ATTRIBUTE: return createMobaSettingsAttribute();
			case MobaPackage.MOBA_REGEXP_CONSTRAINT: return createMobaRegexpConstraint();
			case MobaPackage.MOBA_MIN_CONSTRAINT: return createMobaMinConstraint();
			case MobaPackage.MOBA_MAX_CONSTRAINT: return createMobaMaxConstraint();
			case MobaPackage.MOBA_FUTURE_CONSTRAINT: return createMobaFutureConstraint();
			case MobaPackage.MOBA_PAST_CONSTRAINT: return createMobaPastConstraint();
			case MobaPackage.MOBA_NOT_NULL_CONSTRAINT: return createMobaNotNullConstraint();
			case MobaPackage.MOBA_NULL_CONSTRAINT: return createMobaNullConstraint();
			case MobaPackage.MOBA_MIN_LENGTH_CONSTRAINT: return createMobaMinLengthConstraint();
			case MobaPackage.MOBA_MAX_LENGTH_CONSTRAINT: return createMobaMaxLengthConstraint();
			case MobaPackage.MOBA_DIGITS_CONSTRAINT: return createMobaDigitsConstraint();
			case MobaPackage.MOBA_ENUM: return createMobaEnum();
			case MobaPackage.MOBA_ENUM_LITERAL: return createMobaEnumLiteral();
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
	public MobaGeneratorMixinFeature createMobaGeneratorMixinFeature() {
		MobaGeneratorMixinFeatureImpl mobaGeneratorMixinFeature = new MobaGeneratorMixinFeatureImpl();
		return mobaGeneratorMixinFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeneratorIDFeature createMobaGeneratorIDFeature() {
		MobaGeneratorIDFeatureImpl mobaGeneratorIDFeature = new MobaGeneratorIDFeatureImpl();
		return mobaGeneratorIDFeature;
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
	public MobaConstantValue createMobaConstantValue() {
		MobaConstantValueImpl mobaConstantValue = new MobaConstantValueImpl();
		return mobaConstantValue;
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
	public MobaEntity createMobaEntity() {
		MobaEntityImpl mobaEntity = new MobaEntityImpl();
		return mobaEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityIndex createMobaEntityIndex() {
		MobaEntityIndexImpl mobaEntityIndex = new MobaEntityIndexImpl();
		return mobaEntityIndex;
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
	public MobaEntityAttribute createMobaEntityAttribute() {
		MobaEntityAttributeImpl mobaEntityAttribute = new MobaEntityAttributeImpl();
		return mobaEntityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityReference createMobaEntityReference() {
		MobaEntityReferenceImpl mobaEntityReference = new MobaEntityReferenceImpl();
		return mobaEntityReference;
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
	public MobaSettingsAttribute createMobaSettingsAttribute() {
		MobaSettingsAttributeImpl mobaSettingsAttribute = new MobaSettingsAttributeImpl();
		return mobaSettingsAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRegexpConstraint createMobaRegexpConstraint() {
		MobaRegexpConstraintImpl mobaRegexpConstraint = new MobaRegexpConstraintImpl();
		return mobaRegexpConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMinConstraint createMobaMinConstraint() {
		MobaMinConstraintImpl mobaMinConstraint = new MobaMinConstraintImpl();
		return mobaMinConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMaxConstraint createMobaMaxConstraint() {
		MobaMaxConstraintImpl mobaMaxConstraint = new MobaMaxConstraintImpl();
		return mobaMaxConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFutureConstraint createMobaFutureConstraint() {
		MobaFutureConstraintImpl mobaFutureConstraint = new MobaFutureConstraintImpl();
		return mobaFutureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPastConstraint createMobaPastConstraint() {
		MobaPastConstraintImpl mobaPastConstraint = new MobaPastConstraintImpl();
		return mobaPastConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNotNullConstraint createMobaNotNullConstraint() {
		MobaNotNullConstraintImpl mobaNotNullConstraint = new MobaNotNullConstraintImpl();
		return mobaNotNullConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNullConstraint createMobaNullConstraint() {
		MobaNullConstraintImpl mobaNullConstraint = new MobaNullConstraintImpl();
		return mobaNullConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMinLengthConstraint createMobaMinLengthConstraint() {
		MobaMinLengthConstraintImpl mobaMinLengthConstraint = new MobaMinLengthConstraintImpl();
		return mobaMinLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMaxLengthConstraint createMobaMaxLengthConstraint() {
		MobaMaxLengthConstraintImpl mobaMaxLengthConstraint = new MobaMaxLengthConstraintImpl();
		return mobaMaxLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDigitsConstraint createMobaDigitsConstraint() {
		MobaDigitsConstraintImpl mobaDigitsConstraint = new MobaDigitsConstraintImpl();
		return mobaDigitsConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEnum createMobaEnum() {
		MobaEnumImpl mobaEnum = new MobaEnumImpl();
		return mobaEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEnumLiteral createMobaEnumLiteral() {
		MobaEnumLiteralImpl mobaEnumLiteral = new MobaEnumLiteralImpl();
		return mobaEnumLiteral;
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
