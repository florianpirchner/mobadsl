/**
 */
package org.mobadsl.semantic.model.moba.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.mobadsl.semantic.model.moba.MobaAppInstallTrigger;
import org.mobadsl.semantic.model.moba.MobaAppUpdateTrigger;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaBluetoothModule;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstraint;
import org.mobadsl.semantic.model.moba.MobaConstraintable;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEmailTrigger;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaFeature;
import org.mobadsl.semantic.model.moba.MobaFriend;
import org.mobadsl.semantic.model.moba.MobaFriendsAble;
import org.mobadsl.semantic.model.moba.MobaFutureConstraint;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorSlot;
import org.mobadsl.semantic.model.moba.MobaGeofenceTrigger;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMinConstraint;
import org.mobadsl.semantic.model.moba.MobaMinLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaModelFeature;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaNFCModule;
import org.mobadsl.semantic.model.moba.MobaNotNullConstraint;
import org.mobadsl.semantic.model.moba.MobaNullConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPastConstraint;
import org.mobadsl.semantic.model.moba.MobaProject;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaPushModule;
import org.mobadsl.semantic.model.moba.MobaPushTrigger;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;
import org.mobadsl.semantic.model.moba.MobaSMSTrigger;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaSettingsFeature;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTimerTrigger;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaTrigger;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage
 * @generated
 */
public class MobaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MobaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaSwitch<Adapter> modelSwitch =
		new MobaSwitch<Adapter>() {
			@Override
			public Adapter caseMobaModel(MobaModel object) {
				return createMobaModelAdapter();
			}
			@Override
			public Adapter caseMobaModelFeature(MobaModelFeature object) {
				return createMobaModelFeatureAdapter();
			}
			@Override
			public Adapter caseMobaProject(MobaProject object) {
				return createMobaProjectAdapter();
			}
			@Override
			public Adapter caseMobaApplication(MobaApplication object) {
				return createMobaApplicationAdapter();
			}
			@Override
			public Adapter caseMobaApplicationFeature(MobaApplicationFeature object) {
				return createMobaApplicationFeatureAdapter();
			}
			@Override
			public Adapter caseMobaTemplate(MobaTemplate object) {
				return createMobaTemplateAdapter();
			}
			@Override
			public Adapter caseMobaServer(MobaServer object) {
				return createMobaServerAdapter();
			}
			@Override
			public Adapter caseMobaAuthorization(MobaAuthorization object) {
				return createMobaAuthorizationAdapter();
			}
			@Override
			public Adapter caseMobaTransportSerializationType(MobaTransportSerializationType object) {
				return createMobaTransportSerializationTypeAdapter();
			}
			@Override
			public Adapter caseMobaGenerator(MobaGenerator object) {
				return createMobaGeneratorAdapter();
			}
			@Override
			public Adapter caseMobaGeneratorFeature(MobaGeneratorFeature object) {
				return createMobaGeneratorFeatureAdapter();
			}
			@Override
			public Adapter caseMobaGeneratorMixinFeature(MobaGeneratorMixinFeature object) {
				return createMobaGeneratorMixinFeatureAdapter();
			}
			@Override
			public Adapter caseMobaGeneratorIDFeature(MobaGeneratorIDFeature object) {
				return createMobaGeneratorIDFeatureAdapter();
			}
			@Override
			public Adapter caseMobaGeneratorSlot(MobaGeneratorSlot object) {
				return createMobaGeneratorSlotAdapter();
			}
			@Override
			public Adapter caseMobaDataType(MobaDataType object) {
				return createMobaDataTypeAdapter();
			}
			@Override
			public Adapter caseMobaConstant(MobaConstant object) {
				return createMobaConstantAdapter();
			}
			@Override
			public Adapter caseMobaConstantValue(MobaConstantValue object) {
				return createMobaConstantValueAdapter();
			}
			@Override
			public Adapter caseMobaPropertiesAble(MobaPropertiesAble object) {
				return createMobaPropertiesAbleAdapter();
			}
			@Override
			public Adapter caseMobaProperty(MobaProperty object) {
				return createMobaPropertyAdapter();
			}
			@Override
			public Adapter caseMobaData(MobaData object) {
				return createMobaDataAdapter();
			}
			@Override
			public Adapter caseMobaSettings(MobaSettings object) {
				return createMobaSettingsAdapter();
			}
			@Override
			public Adapter caseMobaCache(MobaCache object) {
				return createMobaCacheAdapter();
			}
			@Override
			public Adapter caseMobaEntity(MobaEntity object) {
				return createMobaEntityAdapter();
			}
			@Override
			public Adapter caseMobaEntityIndex(MobaEntityIndex object) {
				return createMobaEntityIndexAdapter();
			}
			@Override
			public Adapter caseMobaDto(MobaDto object) {
				return createMobaDtoAdapter();
			}
			@Override
			public Adapter caseMobaQueue(MobaQueue object) {
				return createMobaQueueAdapter();
			}
			@Override
			public Adapter caseMobaREST(MobaREST object) {
				return createMobaRESTAdapter();
			}
			@Override
			public Adapter caseMobaRESTPayloadDefinition(MobaRESTPayloadDefinition object) {
				return createMobaRESTPayloadDefinitionAdapter();
			}
			@Override
			public Adapter caseMobaRESTAttribute(MobaRESTAttribute object) {
				return createMobaRESTAttributeAdapter();
			}
			@Override
			public Adapter caseMobaRESTCustomService(MobaRESTCustomService object) {
				return createMobaRESTCustomServiceAdapter();
			}
			@Override
			public Adapter caseMobaRESTWorkflow(MobaRESTWorkflow object) {
				return createMobaRESTWorkflowAdapter();
			}
			@Override
			public Adapter caseMobaRESTCrud(MobaRESTCrud object) {
				return createMobaRESTCrudAdapter();
			}
			@Override
			public Adapter caseMobaFeature(MobaFeature object) {
				return createMobaFeatureAdapter();
			}
			@Override
			public Adapter caseMobaEntityFeature(MobaEntityFeature object) {
				return createMobaEntityFeatureAdapter();
			}
			@Override
			public Adapter caseMobaEntityAttribute(MobaEntityAttribute object) {
				return createMobaEntityAttributeAdapter();
			}
			@Override
			public Adapter caseMobaMultiplicityAble(MobaMultiplicityAble object) {
				return createMobaMultiplicityAbleAdapter();
			}
			@Override
			public Adapter caseMobaEntityReference(MobaEntityReference object) {
				return createMobaEntityReferenceAdapter();
			}
			@Override
			public Adapter caseMobaDtoFeature(MobaDtoFeature object) {
				return createMobaDtoFeatureAdapter();
			}
			@Override
			public Adapter caseMobaDtoAttribute(MobaDtoAttribute object) {
				return createMobaDtoAttributeAdapter();
			}
			@Override
			public Adapter caseMobaDtoReference(MobaDtoReference object) {
				return createMobaDtoReferenceAdapter();
			}
			@Override
			public Adapter caseMobaQueueFeature(MobaQueueFeature object) {
				return createMobaQueueFeatureAdapter();
			}
			@Override
			public Adapter caseMobaQueueReference(MobaQueueReference object) {
				return createMobaQueueReferenceAdapter();
			}
			@Override
			public Adapter caseMobaMuliplicity(MobaMuliplicity object) {
				return createMobaMuliplicityAdapter();
			}
			@Override
			public Adapter caseMobaSettingsFeature(MobaSettingsFeature object) {
				return createMobaSettingsFeatureAdapter();
			}
			@Override
			public Adapter caseMobaSettingsAttribute(MobaSettingsAttribute object) {
				return createMobaSettingsAttributeAdapter();
			}
			@Override
			public Adapter caseMobaConstraintable(MobaConstraintable object) {
				return createMobaConstraintableAdapter();
			}
			@Override
			public Adapter caseMobaConstraint(MobaConstraint object) {
				return createMobaConstraintAdapter();
			}
			@Override
			public Adapter caseMobaRegexpConstraint(MobaRegexpConstraint object) {
				return createMobaRegexpConstraintAdapter();
			}
			@Override
			public Adapter caseMobaMinConstraint(MobaMinConstraint object) {
				return createMobaMinConstraintAdapter();
			}
			@Override
			public Adapter caseMobaMaxConstraint(MobaMaxConstraint object) {
				return createMobaMaxConstraintAdapter();
			}
			@Override
			public Adapter caseMobaFutureConstraint(MobaFutureConstraint object) {
				return createMobaFutureConstraintAdapter();
			}
			@Override
			public Adapter caseMobaPastConstraint(MobaPastConstraint object) {
				return createMobaPastConstraintAdapter();
			}
			@Override
			public Adapter caseMobaNotNullConstraint(MobaNotNullConstraint object) {
				return createMobaNotNullConstraintAdapter();
			}
			@Override
			public Adapter caseMobaNullConstraint(MobaNullConstraint object) {
				return createMobaNullConstraintAdapter();
			}
			@Override
			public Adapter caseMobaMinLengthConstraint(MobaMinLengthConstraint object) {
				return createMobaMinLengthConstraintAdapter();
			}
			@Override
			public Adapter caseMobaMaxLengthConstraint(MobaMaxLengthConstraint object) {
				return createMobaMaxLengthConstraintAdapter();
			}
			@Override
			public Adapter caseMobaDigitsConstraint(MobaDigitsConstraint object) {
				return createMobaDigitsConstraintAdapter();
			}
			@Override
			public Adapter caseMobaEnum(MobaEnum object) {
				return createMobaEnumAdapter();
			}
			@Override
			public Adapter caseMobaEnumLiteral(MobaEnumLiteral object) {
				return createMobaEnumLiteralAdapter();
			}
			@Override
			public Adapter caseMobaTrigger(MobaTrigger object) {
				return createMobaTriggerAdapter();
			}
			@Override
			public Adapter caseMobaAppInstallTrigger(MobaAppInstallTrigger object) {
				return createMobaAppInstallTriggerAdapter();
			}
			@Override
			public Adapter caseMobaAppUpdateTrigger(MobaAppUpdateTrigger object) {
				return createMobaAppUpdateTriggerAdapter();
			}
			@Override
			public Adapter caseMobaSMSTrigger(MobaSMSTrigger object) {
				return createMobaSMSTriggerAdapter();
			}
			@Override
			public Adapter caseMobaDeviceStartupTrigger(MobaDeviceStartupTrigger object) {
				return createMobaDeviceStartupTriggerAdapter();
			}
			@Override
			public Adapter caseMobaEmailTrigger(MobaEmailTrigger object) {
				return createMobaEmailTriggerAdapter();
			}
			@Override
			public Adapter caseMobaTimerTrigger(MobaTimerTrigger object) {
				return createMobaTimerTriggerAdapter();
			}
			@Override
			public Adapter caseMobaPushTrigger(MobaPushTrigger object) {
				return createMobaPushTriggerAdapter();
			}
			@Override
			public Adapter caseMobaGeofenceTrigger(MobaGeofenceTrigger object) {
				return createMobaGeofenceTriggerAdapter();
			}
			@Override
			public Adapter caseMobaFriend(MobaFriend object) {
				return createMobaFriendAdapter();
			}
			@Override
			public Adapter caseMobaFriendsAble(MobaFriendsAble object) {
				return createMobaFriendsAbleAdapter();
			}
			@Override
			public Adapter caseMobaExternalModule(MobaExternalModule object) {
				return createMobaExternalModuleAdapter();
			}
			@Override
			public Adapter caseMobaBluetoothModule(MobaBluetoothModule object) {
				return createMobaBluetoothModuleAdapter();
			}
			@Override
			public Adapter caseMobaNFCModule(MobaNFCModule object) {
				return createMobaNFCModuleAdapter();
			}
			@Override
			public Adapter caseMobaPushModule(MobaPushModule object) {
				return createMobaPushModuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaModel
	 * @generated
	 */
	public Adapter createMobaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaModelFeature <em>Model Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaModelFeature
	 * @generated
	 */
	public Adapter createMobaModelFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaProject
	 * @generated
	 */
	public Adapter createMobaProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication
	 * @generated
	 */
	public Adapter createMobaApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaApplicationFeature <em>Application Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaApplicationFeature
	 * @generated
	 */
	public Adapter createMobaApplicationFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaTemplate
	 * @generated
	 */
	public Adapter createMobaTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaServer
	 * @generated
	 */
	public Adapter createMobaServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaAuthorization
	 * @generated
	 */
	public Adapter createMobaAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaTransportSerializationType <em>Transport Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaTransportSerializationType
	 * @generated
	 */
	public Adapter createMobaTransportSerializationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGenerator
	 * @generated
	 */
	public Adapter createMobaGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature <em>Generator Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorFeature
	 * @generated
	 */
	public Adapter createMobaGeneratorFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature <em>Generator Mixin Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature
	 * @generated
	 */
	public Adapter createMobaGeneratorMixinFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature <em>Generator ID Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
	 * @generated
	 */
	public Adapter createMobaGeneratorIDFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType
	 * @generated
	 */
	public Adapter createMobaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaConstant
	 * @generated
	 */
	public Adapter createMobaConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue
	 * @generated
	 */
	public Adapter createMobaConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble <em>Properties Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPropertiesAble
	 * @generated
	 */
	public Adapter createMobaPropertiesAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty
	 * @generated
	 */
	public Adapter createMobaPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaData
	 * @generated
	 */
	public Adapter createMobaDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings
	 * @generated
	 */
	public Adapter createMobaSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaCache
	 * @generated
	 */
	public Adapter createMobaCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity
	 * @generated
	 */
	public Adapter createMobaEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEntityIndex <em>Entity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityIndex
	 * @generated
	 */
	public Adapter createMobaEntityIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDto
	 * @generated
	 */
	public Adapter createMobaDtoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaQueue
	 * @generated
	 */
	public Adapter createMobaQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaREST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaREST
	 * @generated
	 */
	public Adapter createMobaRESTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition <em>REST Payload Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition
	 * @generated
	 */
	public Adapter createMobaRESTPayloadDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute <em>REST Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute
	 * @generated
	 */
	public Adapter createMobaRESTAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService <em>REST Custom Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCustomService
	 * @generated
	 */
	public Adapter createMobaRESTCustomServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow <em>REST Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTWorkflow
	 * @generated
	 */
	public Adapter createMobaRESTWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRESTCrud <em>REST Crud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCrud
	 * @generated
	 */
	public Adapter createMobaRESTCrudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaFeature
	 * @generated
	 */
	public Adapter createMobaFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEntityFeature <em>Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityFeature
	 * @generated
	 */
	public Adapter createMobaEntityFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute
	 * @generated
	 */
	public Adapter createMobaEntityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble <em>Multiplicity Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble
	 * @generated
	 */
	public Adapter createMobaMultiplicityAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference
	 * @generated
	 */
	public Adapter createMobaEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDtoFeature <em>Dto Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoFeature
	 * @generated
	 */
	public Adapter createMobaDtoFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute <em>Dto Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute
	 * @generated
	 */
	public Adapter createMobaDtoAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDtoReference <em>Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference
	 * @generated
	 */
	public Adapter createMobaDtoReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaQueueFeature <em>Queue Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueFeature
	 * @generated
	 */
	public Adapter createMobaQueueFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaQueueReference <em>Queue Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference
	 * @generated
	 */
	public Adapter createMobaQueueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity <em>Muliplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMuliplicity
	 * @generated
	 */
	public Adapter createMobaMuliplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaSettingsFeature <em>Settings Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsFeature
	 * @generated
	 */
	public Adapter createMobaSettingsFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute <em>Settings Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute
	 * @generated
	 */
	public Adapter createMobaSettingsAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaConstraintable <em>Constraintable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaConstraintable
	 * @generated
	 */
	public Adapter createMobaConstraintableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaConstraint
	 * @generated
	 */
	public Adapter createMobaConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint <em>Regexp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRegexpConstraint
	 * @generated
	 */
	public Adapter createMobaRegexpConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint <em>Min Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMinConstraint
	 * @generated
	 */
	public Adapter createMobaMinConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMaxConstraint <em>Max Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxConstraint
	 * @generated
	 */
	public Adapter createMobaMaxConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaFutureConstraint <em>Future Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaFutureConstraint
	 * @generated
	 */
	public Adapter createMobaFutureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPastConstraint <em>Past Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPastConstraint
	 * @generated
	 */
	public Adapter createMobaPastConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaNotNullConstraint <em>Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaNotNullConstraint
	 * @generated
	 */
	public Adapter createMobaNotNullConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaNullConstraint <em>Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaNullConstraint
	 * @generated
	 */
	public Adapter createMobaNullConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint <em>Min Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMinLengthConstraint
	 * @generated
	 */
	public Adapter createMobaMinLengthConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint <em>Max Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint
	 * @generated
	 */
	public Adapter createMobaMaxLengthConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint <em>Digits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint
	 * @generated
	 */
	public Adapter createMobaDigitsConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEnum
	 * @generated
	 */
	public Adapter createMobaEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEnumLiteral
	 * @generated
	 */
	public Adapter createMobaEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaTrigger
	 * @generated
	 */
	public Adapter createMobaTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaAppInstallTrigger <em>App Install Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaAppInstallTrigger
	 * @generated
	 */
	public Adapter createMobaAppInstallTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaAppUpdateTrigger <em>App Update Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaAppUpdateTrigger
	 * @generated
	 */
	public Adapter createMobaAppUpdateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaSMSTrigger <em>SMS Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaSMSTrigger
	 * @generated
	 */
	public Adapter createMobaSMSTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger <em>Device Startup Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger
	 * @generated
	 */
	public Adapter createMobaDeviceStartupTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaEmailTrigger <em>Email Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaEmailTrigger
	 * @generated
	 */
	public Adapter createMobaEmailTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaTimerTrigger <em>Timer Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaTimerTrigger
	 * @generated
	 */
	public Adapter createMobaTimerTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPushTrigger
	 * @generated
	 */
	public Adapter createMobaPushTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGeofenceTrigger <em>Geofence Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceTrigger
	 * @generated
	 */
	public Adapter createMobaGeofenceTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorSlot <em>Generator Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorSlot
	 * @generated
	 */
	public Adapter createMobaGeneratorSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaFriend
	 * @generated
	 */
	public Adapter createMobaFriendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaFriendsAble <em>Friends Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaFriendsAble
	 * @generated
	 */
	public Adapter createMobaFriendsAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaExternalModule <em>External Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaExternalModule
	 * @generated
	 */
	public Adapter createMobaExternalModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaBluetoothModule <em>Bluetooth Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaBluetoothModule
	 * @generated
	 */
	public Adapter createMobaBluetoothModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaNFCModule <em>NFC Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModule
	 * @generated
	 */
	public Adapter createMobaNFCModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPushModule <em>Push Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPushModule
	 * @generated
	 */
	public Adapter createMobaPushModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MobaAdapterFactory
