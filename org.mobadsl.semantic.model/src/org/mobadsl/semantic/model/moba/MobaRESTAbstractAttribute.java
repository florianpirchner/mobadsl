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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Abstract Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#getAliasString <em>Alias String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#getAliasConst <em>Alias Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#isAttachment <em>Attachment</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAbstractAttribute()
 * @model abstract="true"
 * @generated
 */
public interface MobaRESTAbstractAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias String</em>' attribute.
	 * @see #setAliasString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAbstractAttribute_AliasString()
	 * @model
	 * @generated
	 */
	String getAliasString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#getAliasString <em>Alias String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias String</em>' attribute.
	 * @see #getAliasString()
	 * @generated
	 */
	void setAliasString(String value);

	/**
	 * Returns the value of the '<em><b>Alias Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Const</em>' reference.
	 * @see #setAliasConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAbstractAttribute_AliasConst()
	 * @model
	 * @generated
	 */
	MobaConstant getAliasConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#getAliasConst <em>Alias Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Const</em>' reference.
	 * @see #getAliasConst()
	 * @generated
	 */
	void setAliasConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAbstractAttribute_Alias()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' attribute.
	 * @see #setAttachment(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAbstractAttribute_Attachment()
	 * @model
	 * @generated
	 */
	boolean isAttachment();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute#isAttachment <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' attribute.
	 * @see #isAttachment()
	 * @generated
	 */
	void setAttachment(boolean value);

} // MobaRESTAbstractAttribute
