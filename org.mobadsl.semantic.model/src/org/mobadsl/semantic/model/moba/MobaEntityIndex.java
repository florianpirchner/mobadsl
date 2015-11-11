/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityIndex#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityIndex()
 * @model
 * @generated
 */
public interface MobaEntityIndex extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaEntityAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityIndex_Attributes()
	 * @model
	 * @generated
	 */
	EList<MobaEntityAttribute> getAttributes();

} // MobaDtoIndex