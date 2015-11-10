/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getKey <em>Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProperty()
 * @model
 * @generated
 */
public interface MobaProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Key String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key String</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key String</em>' attribute.
	 * @see #setKeyString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProperty_KeyString()
	 * @model
	 * @generated
	 */
	String getKeyString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyString <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Key String</em>' attribute.
	 * @see #getKeyString()
	 * @generated
	 */
	void setKeyString(String value);

	/**
	 * Returns the value of the '<em><b>Key Const</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Const</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key Const</em>' reference.
	 * @see #setKeyConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProperty_KeyConst()
	 * @model
	 * @generated
	 */
	MobaConstant getKeyConst();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyConst
	 * <em>Key Const</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Key Const</em>' reference.
	 * @see #getKeyConst()
	 * @generated
	 */
	void setKeyConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProperty_ValueString()
	 * @model
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Value Const</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Const</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Const</em>' reference.
	 * @see #setValueConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProperty_ValueConst()
	 * @model
	 * @generated
	 */
	MobaConstant getValueConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueConst <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value Const</em>' reference.
	 * @see #getValueConst()
	 * @generated
	 */
	void setValueConst(MobaConstant value);

	/**
	 * Returns the key value. From {@link #getKeyString()} or
	 * {@link #getKeyConst()}
	 * 
	 * @return
	 */
	String getKey();

	/**
	 * Returns the value. From {@link #getValueString()} or
	 * {@link #getValueConst()}
	 * 
	 * @return
	 */
	String getValue();
	
	/**
	 * Returns the keyString as String representation if {@link #getKeyString()} is available. Or
	 * {@link #getKeyConst().getName()} otherwise.
	 * 
	 * @return
	 */
	String getKeyStringOrConstantName();

	/**
	 * Returns the valueString as String representation if {@link #getValueString()} is available. Or
	 * {@link #getValueConst().getName()} otherwise.
	 * 
	 * @return
	 */
	String getValueStringOrConstantName();

} // MobaProperty
