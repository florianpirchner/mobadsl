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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPropertiesAble()
 * @model abstract="true"
 * @generated
 */
public interface MobaPropertiesAble extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaProperty}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
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

	/**
	 * Returns the generator specific properties for the current instance.
	 * Including the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed properties are replaces
	 * with their new representation. For instance, if the feature Property#key
	 * is defined in superType and in this instance, then the Property from this
	 * instance will be put at the original index from the equal Property in the
	 * superType.
	 * 
	 * @return
	 */
	List<MobaProperty> getGenProperties();

	/**
	 * Returns a list with all supertypes. The highest supertype is at the end
	 * of the list. <br>
	 * If no supertypes are available, return a mutable empty list.
	 * 
	 * @return
	 */
	<T extends EObject> List<T> getAllSuperTypes();

} // MobaPropertiesAble
