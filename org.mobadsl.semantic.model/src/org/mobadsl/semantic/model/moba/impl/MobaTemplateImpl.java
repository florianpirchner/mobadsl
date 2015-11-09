/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaTemplateImpl extends MobaApplicationFeatureImpl implements MobaTemplate {
	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected MobaApplication template;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (MobaApplication)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_TEMPLATE__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(MobaApplication newTemplate) {
		MobaApplication oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_TEMPLATE__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_TEMPLATE__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_TEMPLATE__TEMPLATE:
				setTemplate((MobaApplication)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_TEMPLATE__TEMPLATE:
				setTemplate((MobaApplication)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_TEMPLATE__TEMPLATE:
				return template != null;
		}
		return super.eIsSet(featureID);
	}

} //MobaTemplateImpl
