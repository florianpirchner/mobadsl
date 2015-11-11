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

import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * This is the item provider adapter for a {@link org.mobadsl.semantic.model.moba.MobaDataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaDataTypeItemProvider extends MobaApplicationFeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPrimitivePropertyDescriptor(object);
			addArrayPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addDateFormatStringPropertyDescriptor(object);
			addDateFormatConstPropertyDescriptor(object);
			addSuperTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MobaDataType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_name_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_primitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_primitive_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__PRIMITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Array feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_array_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_array_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__ARRAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_date_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_time_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_timestamp_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Format String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFormatStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_dateFormatString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_dateFormatString_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__DATE_FORMAT_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Format Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFormatConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_dateFormatConst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_dateFormatConst_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__DATE_FORMAT_CONST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaDataType_superType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaDataType_superType_feature", "_UI_MobaDataType_type"),
				 MobaPackage.Literals.MOBA_DATA_TYPE__SUPER_TYPE,
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
			childrenFeatures.add(MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES);
			childrenFeatures.add(MobaPackage.Literals.MOBA_CONSTRAINTABLE__CONSTRAINTS);
			childrenFeatures.add(MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST);
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
	 * This returns MobaDataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobaDataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MobaDataType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MobaDataType_type") :
			getString("_UI_MobaDataType_type") + " " + label;
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

		switch (notification.getFeatureID(MobaDataType.class)) {
			case MobaPackage.MOBA_DATA_TYPE__NAME:
			case MobaPackage.MOBA_DATA_TYPE__PRIMITIVE:
			case MobaPackage.MOBA_DATA_TYPE__ARRAY:
			case MobaPackage.MOBA_DATA_TYPE__DATE:
			case MobaPackage.MOBA_DATA_TYPE__TIME:
			case MobaPackage.MOBA_DATA_TYPE__TIMESTAMP:
			case MobaPackage.MOBA_DATA_TYPE__DATE_FORMAT_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MobaPackage.MOBA_DATA_TYPE__PROPERTIES:
			case MobaPackage.MOBA_DATA_TYPE__CONSTRAINTS:
			case MobaPackage.MOBA_DATA_TYPE__ENUM_AST:
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

		newChildDescriptors.add
			(createChildParameter
				(MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST,
				 MobaFactory.eINSTANCE.createMobaEnum()));
	}

}
