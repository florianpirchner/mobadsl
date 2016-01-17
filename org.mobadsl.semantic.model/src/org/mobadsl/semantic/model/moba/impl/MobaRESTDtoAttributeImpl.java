/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTDtoAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Dto Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTDtoAttributeImpl#getDtoFeature <em>Dto Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTDtoAttributeImpl extends MobaRESTAbstractAttributeImpl implements MobaRESTDtoAttribute {
	/**
	 * The cached value of the '{@link #getDtoFeature() <em>Dto Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoFeature()
	 * @generated
	 * @ordered
	 */
	protected MobaDtoFeature dtoFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTDtoAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_DTO_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoFeature getDtoFeature() {
		if (dtoFeature != null && dtoFeature.eIsProxy()) {
			InternalEObject oldDtoFeature = (InternalEObject)dtoFeature;
			dtoFeature = (MobaDtoFeature)eResolveProxy(oldDtoFeature);
			if (dtoFeature != oldDtoFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE, oldDtoFeature, dtoFeature));
			}
		}
		return dtoFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoFeature basicGetDtoFeature() {
		return dtoFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtoFeature(MobaDtoFeature newDtoFeature) {
		MobaDtoFeature oldDtoFeature = dtoFeature;
		dtoFeature = newDtoFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE, oldDtoFeature, dtoFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE:
				if (resolve) return getDtoFeature();
				return basicGetDtoFeature();
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
			case MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE:
				setDtoFeature((MobaDtoFeature)newValue);
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
			case MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE:
				setDtoFeature((MobaDtoFeature)null);
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
			case MobaPackage.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE:
				return dtoFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //MobaRESTDtoAttributeImpl
