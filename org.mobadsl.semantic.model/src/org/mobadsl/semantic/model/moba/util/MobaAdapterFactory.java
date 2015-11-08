/**
 */
package org.mobadsl.semantic.model.moba.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mobadsl.semantic.model.moba.*;

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
			public Adapter caseMobaGenerator(MobaGenerator object) {
				return createMobaGeneratorAdapter();
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
			public Adapter caseMobaPropertiesProvider(MobaPropertiesProvider object) {
				return createMobaPropertiesProviderAdapter();
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
			public Adapter caseMobaDto(MobaDto object) {
				return createMobaDtoAdapter();
			}
			@Override
			public Adapter caseMobaDtoIndex(MobaDtoIndex object) {
				return createMobaDtoIndexAdapter();
			}
			@Override
			public Adapter caseMobaPayload(MobaPayload object) {
				return createMobaPayloadAdapter();
			}
			@Override
			public Adapter caseMobaQueue(MobaQueue object) {
				return createMobaQueueAdapter();
			}
			@Override
			public Adapter caseMobaService(MobaService object) {
				return createMobaServiceAdapter();
			}
			@Override
			public Adapter caseMobaRestCustom(MobaRestCustom object) {
				return createMobaRestCustomAdapter();
			}
			@Override
			public Adapter caseMobaRestCrud(MobaRestCrud object) {
				return createMobaRestCrudAdapter();
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
			public Adapter caseMobaMultiplicityProvider(MobaMultiplicityProvider object) {
				return createMobaMultiplicityProviderAdapter();
			}
			@Override
			public Adapter caseMobaDtoReference(MobaDtoReference object) {
				return createMobaDtoReferenceAdapter();
			}
			@Override
			public Adapter caseMobaPayloadFeature(MobaPayloadFeature object) {
				return createMobaPayloadFeatureAdapter();
			}
			@Override
			public Adapter caseMobaPayloadAttribute(MobaPayloadAttribute object) {
				return createMobaPayloadAttributeAdapter();
			}
			@Override
			public Adapter caseMobaPayloadReference(MobaPayloadReference object) {
				return createMobaPayloadReferenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPropertiesProvider <em>Properties Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPropertiesProvider
	 * @generated
	 */
	public Adapter createMobaPropertiesProviderAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaDtoIndex <em>Dto Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoIndex
	 * @generated
	 */
	public Adapter createMobaDtoIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPayload
	 * @generated
	 */
	public Adapter createMobaPayloadAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaService
	 * @generated
	 */
	public Adapter createMobaServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRestCustom <em>Rest Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCustom
	 * @generated
	 */
	public Adapter createMobaRestCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaRestCrud <em>Rest Crud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCrud
	 * @generated
	 */
	public Adapter createMobaRestCrudAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityProvider <em>Multiplicity Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityProvider
	 * @generated
	 */
	public Adapter createMobaMultiplicityProviderAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPayloadFeature <em>Payload Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadFeature
	 * @generated
	 */
	public Adapter createMobaPayloadFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute <em>Payload Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute
	 * @generated
	 */
	public Adapter createMobaPayloadAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference <em>Payload Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference
	 * @generated
	 */
	public Adapter createMobaPayloadReferenceAdapter() {
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
