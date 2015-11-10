/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Properties Able</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble#getProperties
 * <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPropertiesAble()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MobaPropertiesAble extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaProperty}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' containment reference
	 *         list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPropertiesAble_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaProperty> getProperties();

	/**
	 * Returns all properties. Even for the supertypes if available. If no
	 * supertypes are available, then {@link #getProperties()} is returned.
	 * 
	 * @return
	 */
	List<MobaProperty> getAllProperties();

} // MobaPropertiesAble
