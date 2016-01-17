/**
 */
package org.mobadsl.semantic.model.moba.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;

/**
 * This is the item provider adapter for a {@link org.mobadsl.semantic.model.moba.MobaRESTAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaRESTAttributeItemProvider 
	extends MobaRESTAbstractAttributeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addKeyStringPropertyDescriptor(object);
			addKeyConstPropertyDescriptor(object);
			addKeyPropertyDescriptor(object);
			addValueStringPropertyDescriptor(object);
			addValueConstPropertyDescriptor(object);
			addValueDoublePropertyDescriptor(object);
			addValueIntPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addFormatStringPropertyDescriptor(object);
			addFormatConstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MobaRESTAttribute_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_type_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_keyString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_keyString_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_keyConst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_keyConst_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY_CONST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_key_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_valueString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_valueString_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_valueConst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_valueConst_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_CONST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Double feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueDoublePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_valueDouble_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_valueDouble_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_valueInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_valueInt_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_value_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_formatString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_formatString_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__FORMAT_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobaRESTAttribute_formatConst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobaRESTAttribute_formatConst_feature", "_UI_MobaRESTAttribute_type"),
				 MobaPackage.Literals.MOBA_REST_ATTRIBUTE__FORMAT_CONST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns MobaRESTAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MobaRESTAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MobaRESTAttribute)object).getAliasString();
		return label == null || label.length() == 0 ?
			getString("_UI_MobaRESTAttribute_type") :
			getString("_UI_MobaRESTAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(MobaRESTAttribute.class)) {
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY_STRING:
			case MobaPackage.MOBA_REST_ATTRIBUTE__KEY:
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_STRING:
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_DOUBLE:
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE_INT:
			case MobaPackage.MOBA_REST_ATTRIBUTE__VALUE:
			case MobaPackage.MOBA_REST_ATTRIBUTE__FORMAT_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
