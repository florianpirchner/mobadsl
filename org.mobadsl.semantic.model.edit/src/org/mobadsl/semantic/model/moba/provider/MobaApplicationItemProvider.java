/**
 */
package org.mobadsl.semantic.model.moba.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * This is the item provider adapter for a {@link org.mobadsl.semantic.model.moba.MobaApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaApplicationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaApplication_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaApplication_id_feature", "_UI_MobaApplication_type"),
				 MobaPackage.Literals.MOBA_APPLICATION__ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaApplication_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaApplication_name_feature", "_UI_MobaApplication_type"),
				 MobaPackage.Literals.MOBA_APPLICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaApplication_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaApplication_version_feature", "_UI_MobaApplication_type"),
				 MobaPackage.Literals.MOBA_APPLICATION__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES);
			childrenFeatures.add(MobaPackage.Literals.MOBA_APPLICATION__FEATURES);
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
	 * This returns MobaApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobaApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MobaApplication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MobaApplication_type") :
			getString("_UI_MobaApplication_type") + " " + label;
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

		switch (notification.getFeatureID(MobaApplication.class)) {
			case MobaPackage.MOBA_APPLICATION__ID:
			case MobaPackage.MOBA_APPLICATION__NAME:
			case MobaPackage.MOBA_APPLICATION__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
				(MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES,
				 MobaFactory.eINSTANCE.createMobaProperty()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaServer()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaAuthorization()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaConstant()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaSettings()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaEntity()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaDto()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaQueue()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaRESTCustomService()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaRESTWorkflow()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaRESTCrud()));

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
				 MobaFactory.eINSTANCE.createMobaEnum()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MobaEditPlugin.INSTANCE;
	}

}
