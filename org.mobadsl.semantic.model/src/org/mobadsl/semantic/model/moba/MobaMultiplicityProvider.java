/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;
import org.mobadsl.semantic.model.moba.util.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaMultiplicityProvider#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMultiplicityProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MobaMultiplicityProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(MobaMuliplicity)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMultiplicityProvider_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	MobaMuliplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityProvider#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MobaMuliplicity value);

} // MobaMultiplicityProvider
