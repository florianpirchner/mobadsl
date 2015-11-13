/**
 */
package org.mobadsl.semantic.model.moba.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mobadsl.semantic.model.moba.util.MobaAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaItemProviderAdapterFactory extends MobaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaApplicationItemProvider mobaApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaApplicationAdapter() {
		if (mobaApplicationItemProvider == null) {
			mobaApplicationItemProvider = new MobaApplicationItemProvider(this);
		}

		return mobaApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaTemplateItemProvider mobaTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaTemplateAdapter() {
		if (mobaTemplateItemProvider == null) {
			mobaTemplateItemProvider = new MobaTemplateItemProvider(this);
		}

		return mobaTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaServerItemProvider mobaServerItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaServerAdapter() {
		if (mobaServerItemProvider == null) {
			mobaServerItemProvider = new MobaServerItemProvider(this);
		}

		return mobaServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaAuthorization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaAuthorizationItemProvider mobaAuthorizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaAuthorization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaAuthorizationAdapter() {
		if (mobaAuthorizationItemProvider == null) {
			mobaAuthorizationItemProvider = new MobaAuthorizationItemProvider(this);
		}

		return mobaAuthorizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaTransportSerializationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaTransportSerializationTypeItemProvider mobaTransportSerializationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaTransportSerializationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaTransportSerializationTypeAdapter() {
		if (mobaTransportSerializationTypeItemProvider == null) {
			mobaTransportSerializationTypeItemProvider = new MobaTransportSerializationTypeItemProvider(this);
		}

		return mobaTransportSerializationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaGenerator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorItemProvider mobaGeneratorItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaGenerator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaGeneratorAdapter() {
		if (mobaGeneratorItemProvider == null) {
			mobaGeneratorItemProvider = new MobaGeneratorItemProvider(this);
		}

		return mobaGeneratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorMixinFeatureItemProvider mobaGeneratorMixinFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaGeneratorMixinFeatureAdapter() {
		if (mobaGeneratorMixinFeatureItemProvider == null) {
			mobaGeneratorMixinFeatureItemProvider = new MobaGeneratorMixinFeatureItemProvider(this);
		}

		return mobaGeneratorMixinFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorIDFeatureItemProvider mobaGeneratorIDFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaGeneratorIDFeatureAdapter() {
		if (mobaGeneratorIDFeatureItemProvider == null) {
			mobaGeneratorIDFeatureItemProvider = new MobaGeneratorIDFeatureItemProvider(this);
		}

		return mobaGeneratorIDFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDataTypeItemProvider mobaDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaDataTypeAdapter() {
		if (mobaDataTypeItemProvider == null) {
			mobaDataTypeItemProvider = new MobaDataTypeItemProvider(this);
		}

		return mobaDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaConstantItemProvider mobaConstantItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaConstantAdapter() {
		if (mobaConstantItemProvider == null) {
			mobaConstantItemProvider = new MobaConstantItemProvider(this);
		}

		return mobaConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaConstantValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaConstantValueItemProvider mobaConstantValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaConstantValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaConstantValueAdapter() {
		if (mobaConstantValueItemProvider == null) {
			mobaConstantValueItemProvider = new MobaConstantValueItemProvider(this);
		}

		return mobaConstantValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPropertyItemProvider mobaPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaPropertyAdapter() {
		if (mobaPropertyItemProvider == null) {
			mobaPropertyItemProvider = new MobaPropertyItemProvider(this);
		}

		return mobaPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaSettings} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaSettingsItemProvider mobaSettingsItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaSettings}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaSettingsAdapter() {
		if (mobaSettingsItemProvider == null) {
			mobaSettingsItemProvider = new MobaSettingsItemProvider(this);
		}

		return mobaSettingsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaCache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaCacheItemProvider mobaCacheItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaCache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaCacheAdapter() {
		if (mobaCacheItemProvider == null) {
			mobaCacheItemProvider = new MobaCacheItemProvider(this);
		}

		return mobaCacheItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEntityItemProvider mobaEntityItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEntityAdapter() {
		if (mobaEntityItemProvider == null) {
			mobaEntityItemProvider = new MobaEntityItemProvider(this);
		}

		return mobaEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEntityIndex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEntityIndexItemProvider mobaEntityIndexItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEntityIndex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEntityIndexAdapter() {
		if (mobaEntityIndexItemProvider == null) {
			mobaEntityIndexItemProvider = new MobaEntityIndexItemProvider(this);
		}

		return mobaEntityIndexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaDto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDtoItemProvider mobaDtoItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaDto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaDtoAdapter() {
		if (mobaDtoItemProvider == null) {
			mobaDtoItemProvider = new MobaDtoItemProvider(this);
		}

		return mobaDtoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaQueue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaQueueItemProvider mobaQueueItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaQueue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaQueueAdapter() {
		if (mobaQueueItemProvider == null) {
			mobaQueueItemProvider = new MobaQueueItemProvider(this);
		}

		return mobaQueueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTPayloadDefinitionItemProvider mobaRESTPayloadDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRESTPayloadDefinitionAdapter() {
		if (mobaRESTPayloadDefinitionItemProvider == null) {
			mobaRESTPayloadDefinitionItemProvider = new MobaRESTPayloadDefinitionItemProvider(this);
		}

		return mobaRESTPayloadDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRESTAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTAttributeItemProvider mobaRESTAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRESTAttributeAdapter() {
		if (mobaRESTAttributeItemProvider == null) {
			mobaRESTAttributeItemProvider = new MobaRESTAttributeItemProvider(this);
		}

		return mobaRESTAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTCustomServiceItemProvider mobaRESTCustomServiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRESTCustomServiceAdapter() {
		if (mobaRESTCustomServiceItemProvider == null) {
			mobaRESTCustomServiceItemProvider = new MobaRESTCustomServiceItemProvider(this);
		}

		return mobaRESTCustomServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTWorkflowItemProvider mobaRESTWorkflowItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRESTWorkflowAdapter() {
		if (mobaRESTWorkflowItemProvider == null) {
			mobaRESTWorkflowItemProvider = new MobaRESTWorkflowItemProvider(this);
		}

		return mobaRESTWorkflowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRESTCrud} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTCrudItemProvider mobaRESTCrudItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTCrud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRESTCrudAdapter() {
		if (mobaRESTCrudItemProvider == null) {
			mobaRESTCrudItemProvider = new MobaRESTCrudItemProvider(this);
		}

		return mobaRESTCrudItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEntityAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEntityAttributeItemProvider mobaEntityAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEntityAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEntityAttributeAdapter() {
		if (mobaEntityAttributeItemProvider == null) {
			mobaEntityAttributeItemProvider = new MobaEntityAttributeItemProvider(this);
		}

		return mobaEntityAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEntityReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEntityReferenceItemProvider mobaEntityReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEntityReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEntityReferenceAdapter() {
		if (mobaEntityReferenceItemProvider == null) {
			mobaEntityReferenceItemProvider = new MobaEntityReferenceItemProvider(this);
		}

		return mobaEntityReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaDtoAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDtoAttributeItemProvider mobaDtoAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaDtoAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaDtoAttributeAdapter() {
		if (mobaDtoAttributeItemProvider == null) {
			mobaDtoAttributeItemProvider = new MobaDtoAttributeItemProvider(this);
		}

		return mobaDtoAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaDtoReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDtoReferenceItemProvider mobaDtoReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaDtoReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaDtoReferenceAdapter() {
		if (mobaDtoReferenceItemProvider == null) {
			mobaDtoReferenceItemProvider = new MobaDtoReferenceItemProvider(this);
		}

		return mobaDtoReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaQueueReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaQueueReferenceItemProvider mobaQueueReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaQueueReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaQueueReferenceAdapter() {
		if (mobaQueueReferenceItemProvider == null) {
			mobaQueueReferenceItemProvider = new MobaQueueReferenceItemProvider(this);
		}

		return mobaQueueReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaMuliplicity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMuliplicityItemProvider mobaMuliplicityItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaMuliplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaMuliplicityAdapter() {
		if (mobaMuliplicityItemProvider == null) {
			mobaMuliplicityItemProvider = new MobaMuliplicityItemProvider(this);
		}

		return mobaMuliplicityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaSettingsAttributeItemProvider mobaSettingsAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaSettingsAttributeAdapter() {
		if (mobaSettingsAttributeItemProvider == null) {
			mobaSettingsAttributeItemProvider = new MobaSettingsAttributeItemProvider(this);
		}

		return mobaSettingsAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRegexpConstraintItemProvider mobaRegexpConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaRegexpConstraintAdapter() {
		if (mobaRegexpConstraintItemProvider == null) {
			mobaRegexpConstraintItemProvider = new MobaRegexpConstraintItemProvider(this);
		}

		return mobaRegexpConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaMinConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMinConstraintItemProvider mobaMinConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaMinConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaMinConstraintAdapter() {
		if (mobaMinConstraintItemProvider == null) {
			mobaMinConstraintItemProvider = new MobaMinConstraintItemProvider(this);
		}

		return mobaMinConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaMaxConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMaxConstraintItemProvider mobaMaxConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaMaxConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaMaxConstraintAdapter() {
		if (mobaMaxConstraintItemProvider == null) {
			mobaMaxConstraintItemProvider = new MobaMaxConstraintItemProvider(this);
		}

		return mobaMaxConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaFutureConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaFutureConstraintItemProvider mobaFutureConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaFutureConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaFutureConstraintAdapter() {
		if (mobaFutureConstraintItemProvider == null) {
			mobaFutureConstraintItemProvider = new MobaFutureConstraintItemProvider(this);
		}

		return mobaFutureConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaPastConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPastConstraintItemProvider mobaPastConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaPastConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaPastConstraintAdapter() {
		if (mobaPastConstraintItemProvider == null) {
			mobaPastConstraintItemProvider = new MobaPastConstraintItemProvider(this);
		}

		return mobaPastConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaNotNullConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaNotNullConstraintItemProvider mobaNotNullConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaNotNullConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaNotNullConstraintAdapter() {
		if (mobaNotNullConstraintItemProvider == null) {
			mobaNotNullConstraintItemProvider = new MobaNotNullConstraintItemProvider(this);
		}

		return mobaNotNullConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaNullConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaNullConstraintItemProvider mobaNullConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaNullConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaNullConstraintAdapter() {
		if (mobaNullConstraintItemProvider == null) {
			mobaNullConstraintItemProvider = new MobaNullConstraintItemProvider(this);
		}

		return mobaNullConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMinLengthConstraintItemProvider mobaMinLengthConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaMinLengthConstraintAdapter() {
		if (mobaMinLengthConstraintItemProvider == null) {
			mobaMinLengthConstraintItemProvider = new MobaMinLengthConstraintItemProvider(this);
		}

		return mobaMinLengthConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMaxLengthConstraintItemProvider mobaMaxLengthConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaMaxLengthConstraintAdapter() {
		if (mobaMaxLengthConstraintItemProvider == null) {
			mobaMaxLengthConstraintItemProvider = new MobaMaxLengthConstraintItemProvider(this);
		}

		return mobaMaxLengthConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDigitsConstraintItemProvider mobaDigitsConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaDigitsConstraintAdapter() {
		if (mobaDigitsConstraintItemProvider == null) {
			mobaDigitsConstraintItemProvider = new MobaDigitsConstraintItemProvider(this);
		}

		return mobaDigitsConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEnum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEnumItemProvider mobaEnumItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEnumAdapter() {
		if (mobaEnumItemProvider == null) {
			mobaEnumItemProvider = new MobaEnumItemProvider(this);
		}

		return mobaEnumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mobadsl.semantic.model.moba.MobaEnumLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaEnumLiteralItemProvider mobaEnumLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.mobadsl.semantic.model.moba.MobaEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobaEnumLiteralAdapter() {
		if (mobaEnumLiteralItemProvider == null) {
			mobaEnumLiteralItemProvider = new MobaEnumLiteralItemProvider(this);
		}

		return mobaEnumLiteralItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mobaApplicationItemProvider != null) mobaApplicationItemProvider.dispose();
		if (mobaTemplateItemProvider != null) mobaTemplateItemProvider.dispose();
		if (mobaServerItemProvider != null) mobaServerItemProvider.dispose();
		if (mobaAuthorizationItemProvider != null) mobaAuthorizationItemProvider.dispose();
		if (mobaTransportSerializationTypeItemProvider != null) mobaTransportSerializationTypeItemProvider.dispose();
		if (mobaGeneratorItemProvider != null) mobaGeneratorItemProvider.dispose();
		if (mobaGeneratorMixinFeatureItemProvider != null) mobaGeneratorMixinFeatureItemProvider.dispose();
		if (mobaGeneratorIDFeatureItemProvider != null) mobaGeneratorIDFeatureItemProvider.dispose();
		if (mobaDataTypeItemProvider != null) mobaDataTypeItemProvider.dispose();
		if (mobaConstantItemProvider != null) mobaConstantItemProvider.dispose();
		if (mobaConstantValueItemProvider != null) mobaConstantValueItemProvider.dispose();
		if (mobaPropertyItemProvider != null) mobaPropertyItemProvider.dispose();
		if (mobaSettingsItemProvider != null) mobaSettingsItemProvider.dispose();
		if (mobaCacheItemProvider != null) mobaCacheItemProvider.dispose();
		if (mobaEntityItemProvider != null) mobaEntityItemProvider.dispose();
		if (mobaEntityIndexItemProvider != null) mobaEntityIndexItemProvider.dispose();
		if (mobaDtoItemProvider != null) mobaDtoItemProvider.dispose();
		if (mobaQueueItemProvider != null) mobaQueueItemProvider.dispose();
		if (mobaRESTPayloadDefinitionItemProvider != null) mobaRESTPayloadDefinitionItemProvider.dispose();
		if (mobaRESTAttributeItemProvider != null) mobaRESTAttributeItemProvider.dispose();
		if (mobaRESTCustomServiceItemProvider != null) mobaRESTCustomServiceItemProvider.dispose();
		if (mobaRESTWorkflowItemProvider != null) mobaRESTWorkflowItemProvider.dispose();
		if (mobaRESTCrudItemProvider != null) mobaRESTCrudItemProvider.dispose();
		if (mobaEntityAttributeItemProvider != null) mobaEntityAttributeItemProvider.dispose();
		if (mobaEntityReferenceItemProvider != null) mobaEntityReferenceItemProvider.dispose();
		if (mobaDtoAttributeItemProvider != null) mobaDtoAttributeItemProvider.dispose();
		if (mobaDtoReferenceItemProvider != null) mobaDtoReferenceItemProvider.dispose();
		if (mobaQueueReferenceItemProvider != null) mobaQueueReferenceItemProvider.dispose();
		if (mobaMuliplicityItemProvider != null) mobaMuliplicityItemProvider.dispose();
		if (mobaSettingsAttributeItemProvider != null) mobaSettingsAttributeItemProvider.dispose();
		if (mobaRegexpConstraintItemProvider != null) mobaRegexpConstraintItemProvider.dispose();
		if (mobaMinConstraintItemProvider != null) mobaMinConstraintItemProvider.dispose();
		if (mobaMaxConstraintItemProvider != null) mobaMaxConstraintItemProvider.dispose();
		if (mobaFutureConstraintItemProvider != null) mobaFutureConstraintItemProvider.dispose();
		if (mobaPastConstraintItemProvider != null) mobaPastConstraintItemProvider.dispose();
		if (mobaNotNullConstraintItemProvider != null) mobaNotNullConstraintItemProvider.dispose();
		if (mobaNullConstraintItemProvider != null) mobaNullConstraintItemProvider.dispose();
		if (mobaMinLengthConstraintItemProvider != null) mobaMinLengthConstraintItemProvider.dispose();
		if (mobaMaxLengthConstraintItemProvider != null) mobaMaxLengthConstraintItemProvider.dispose();
		if (mobaDigitsConstraintItemProvider != null) mobaDigitsConstraintItemProvider.dispose();
		if (mobaEnumItemProvider != null) mobaEnumItemProvider.dispose();
		if (mobaEnumLiteralItemProvider != null) mobaEnumLiteralItemProvider.dispose();
	}

}
