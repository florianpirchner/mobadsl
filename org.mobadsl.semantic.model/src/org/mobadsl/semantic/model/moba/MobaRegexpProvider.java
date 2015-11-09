/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regexp Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRegexpProvider#getRegexp <em>Regexp</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRegexpProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MobaRegexpProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRegexpProvider_Regexp()
	 * @model
	 * @generated
	 */
	String getRegexp();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRegexpProvider#getRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #getRegexp()
	 * @generated
	 */
	void setRegexp(String value);

} // MobaRegexpProvider
