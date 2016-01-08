/**
 */
package org.mobadsl.semantic.model.moba.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaSettingsEntityReference;

/**
 * This is the item provider adapter for a {@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaSettingsEntityReferenceItemProvider extends MobaSettingsFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettingsEntityReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCascadingPropertyDescriptor(object);
			addLazyPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cascading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCascadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaSettingsEntityReference_cascading_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaSettingsEntityReference_cascading_feature", "_UI_MobaSettingsEntityReference_type"),
				 MobaPackage.Literals.MOBA_SETTINGS_ENTITY_REFERENCE__CASCADING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lazy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLazyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaSettingsEntityReference_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaSettingsEntityReference_lazy_feature", "_UI_MobaSettingsEntityReference_type"),
				 MobaPackage.Literals.MOBA_SETTINGS_ENTITY_REFERENCE__LAZY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaSettingsEntityReference_transient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaSettingsEntityReference_transient_feature", "_UI_MobaSettingsEntityReference_type"),
				 MobaPackage.Literals.MOBA_SETTINGS_ENTITY_REFERENCE__TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaSettingsEntityReference_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaSettingsEntityReference_type_feature", "_UI_MobaSettingsEntityReference_type"),
				 MobaPackage.Literals.MOBA_SETTINGS_ENTITY_REFERENCE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MobaPackage.Literals.MOBA_MULTIPLICITY_ABLE__MULTIPLICITY);
			childrenFeatures.add(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MobaSettingsEntityReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobaSettingsEntityReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MobaSettingsEntityReference)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MobaSettingsEntityReference_type") :
			getString("_UI_MobaSettingsEntityReference_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MobaSettingsEntityReference.class)) {
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE__CASCADING:
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE__LAZY:
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE__TRANSIENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE__MULTIPLICITY:
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE__CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_MULTIPLICITY_ABLE__MULTIPLICITY,
				 MobaFactory.eINSTANCE.createMobaMuliplicity()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaRegexpConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaMinConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaMaxConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaFutureConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaPastConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaNotNullConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaNullConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaMinLengthConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaMaxLengthConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS,
				 MobaFactory.eINSTANCE.createMobaDigitsConstraint()));
	}

}