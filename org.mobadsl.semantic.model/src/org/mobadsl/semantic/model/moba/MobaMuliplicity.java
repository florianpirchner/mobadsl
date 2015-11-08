/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;
import org.mobadsl.semantic.model.moba.util.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Muliplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMuliplicity()
 * @model
 * @generated
 */
public interface MobaMuliplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaLowerBound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
	 * @see #setLower(MobaLowerBound)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMuliplicity_Lower()
	 * @model
	 * @generated
	 */
	MobaLowerBound getLower();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
	 * @see #getLower()
	 * @generated
	 */
	void setLower(MobaLowerBound value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaUpperBound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
	 * @see #setUpper(MobaUpperBound)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMuliplicity_Upper()
	 * @model
	 * @generated
	 */
	MobaUpperBound getUpper();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(MobaUpperBound value);
	
	/**
	 * Returns the bounds helper class which gives fast access to the type of multiplicity.
	 * @return
	 */
	Bounds getBounds();

} // MobaMuliplicity
