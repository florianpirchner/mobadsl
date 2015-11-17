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

import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * This is the item provider adapter for a {@link org.mobadsl.semantic.model.moba.MobaEntityAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaEntityAttributeItemProvider extends MobaEntityFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addLazyPropertyDescriptor(object);
			addTransientPropertyDescriptor(object);
			addDomainKeyPropertyDescriptor(object);
			addDomainDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MobaEntityAttribute_lazy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaEntityAttribute_lazy_feature", "_UI_MobaEntityAttribute_type"),
				 MobaPackage.Literals.MOBA_ENTITY_ATTRIBUTE__LAZY,
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
				 getString("_UI_MobaEntityAttribute_transient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaEntityAttribute_transient_feature", "_UI_MobaEntityAttribute_type"),
				 MobaPackage.Literals.MOBA_ENTITY_ATTRIBUTE__TRANSIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaEntityAttribute_domainKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaEntityAttribute_domainKey_feature", "_UI_MobaEntityAttribute_type"),
				 MobaPackage.Literals.MOBA_ENTITY_ATTRIBUTE__DOMAIN_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaEntityAttribute_domainDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaEntityAttribute_domainDescription_feature", "_UI_MobaEntityAttribute_type"),
				 MobaPackage.Literals.MOBA_ENTITY_ATTRIBUTE__DOMAIN_DESCRIPTION,
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
				 getString("_UI_MobaEntityAttribute_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaEntityAttribute_type_feature", "_UI_MobaEntityAttribute_type"),
				 MobaPackage.Literals.MOBA_ENTITY_ATTRIBUTE__TYPE,
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
	 * This returns MobaEntityAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobaEntityAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MobaEntityAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MobaEntityAttribute_type") :
			getString("_UI_MobaEntityAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(MobaEntityAttribute.class)) {
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__LAZY:
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__TRANSIENT:
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__DOMAIN_KEY:
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__DOMAIN_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__MULTIPLICITY:
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE__CONSTRAINTS:
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
