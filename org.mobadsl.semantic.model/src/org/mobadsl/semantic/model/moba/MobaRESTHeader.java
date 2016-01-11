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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getNameString <em>Name String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getNameConst <em>Name Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueDouble <em>Value Double</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getName <em>Name</em>}</li>
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
	 * Returns the value of the '<em><b>Name String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name String</em>' attribute.
	 * @see #setNameString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_NameString()
	 * @model
	 * @generated
	 */
	String getNameString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getNameString <em>Name String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name String</em>' attribute.
	 * @see #getNameString()
	 * @generated
	 */
	void setNameString(String value);

	/**
	 * Returns the value of the '<em><b>Name Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Const</em>' reference.
	 * @see #setNameConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_NameConst()
	 * @model
	 * @generated
	 */
	MobaConstant getNameConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getNameConst <em>Name Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Const</em>' reference.
	 * @see #getNameConst()
	 * @generated
	 */
	void setNameConst(MobaConstant value);

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
	 * Returns the value of the '<em><b>Value Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Double</em>' attribute.
	 * @see #setValueDouble(Double)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_ValueDouble()
	 * @model
	 * @generated
	 */
	Double getValueDouble();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueDouble <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Double</em>' attribute.
	 * @see #getValueDouble()
	 * @generated
	 */
	void setValueDouble(Double value);

	/**
	 * Returns the value of the '<em><b>Value Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Int</em>' attribute.
	 * @see #setValueInt(Integer)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_ValueInt()
	 * @model
	 * @generated
	 */
	Integer getValueInt();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTHeader#getValueInt <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Int</em>' attribute.
	 * @see #getValueInt()
	 * @generated
	 */
	void setValueInt(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTHeader_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

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
