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
 * A representation of the model object '<em><b>REST Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#isContentTypeHeader <em>Content Type Header</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#isRawHeader <em>Raw Header</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getKey <em>Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader()
 * @model
 * @generated
 */
public interface MobaRESTHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Type Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type Header</em>' attribute.
	 * @see #setContentTypeHeader(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_ContentTypeHeader()
	 * @model
	 * @generated
	 */
	boolean isContentTypeHeader();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#isContentTypeHeader <em>Content Type Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Header</em>' attribute.
	 * @see #isContentTypeHeader()
	 * @generated
	 */
	void setContentTypeHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Raw Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Header</em>' attribute.
	 * @see #setRawHeader(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_RawHeader()
	 * @model
	 * @generated
	 */
	boolean isRawHeader();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#isRawHeader <em>Raw Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Header</em>' attribute.
	 * @see #isRawHeader()
	 * @generated
	 */
	void setRawHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Key String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key String</em>' attribute.
	 * @see #setKeyString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_KeyString()
	 * @model
	 * @generated
	 */
	String getKeyString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getKeyString <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key String</em>' attribute.
	 * @see #getKeyString()
	 * @generated
	 */
	void setKeyString(String value);

	/**
	 * Returns the value of the '<em><b>Key Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Const</em>' reference.
	 * @see #setKeyConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_KeyConst()
	 * @model
	 * @generated
	 */
	MobaConstant getKeyConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getKeyConst <em>Key Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Const</em>' reference.
	 * @see #getKeyConst()
	 * @generated
	 */
	void setKeyConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_ValueString()
	 * @model
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Const</em>' reference.
	 * @see #setValueConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_ValueConst()
	 * @model
	 * @generated
	 */
	MobaConstant getValueConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueConst <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Const</em>' reference.
	 * @see #getValueConst()
	 * @generated
	 */
	void setValueConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_Key()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_Value()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Returns the {@link ValueType} of the set value.
	 * 
	 * @return
	 */
	ValueType getValueType();
	
} // MobaRESTHeader
