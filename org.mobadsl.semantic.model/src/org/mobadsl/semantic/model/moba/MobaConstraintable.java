/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraintable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstraintable#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstraintable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MobaConstraintable extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstraintable_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaConstraint> getConstraints();

} // MobaConstraintable
