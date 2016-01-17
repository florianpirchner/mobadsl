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
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Dto Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTDtoAttribute#getDtoFeature <em>Dto Feature</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTDtoAttribute()
 * @model
 * @generated
 */
public interface MobaRESTDtoAttribute extends MobaRESTAbstractAttribute {
	/**
	 * Returns the value of the '<em><b>Dto Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto Feature</em>' reference.
	 * @see #setDtoFeature(MobaDtoFeature)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTDtoAttribute_DtoFeature()
	 * @model
	 * @generated
	 */
	MobaDtoFeature getDtoFeature();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTDtoAttribute#getDtoFeature <em>Dto Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto Feature</em>' reference.
	 * @see #getDtoFeature()
	 * @generated
	 */
	void setDtoFeature(MobaDtoFeature value);

} // MobaRESTDtoAttribute
