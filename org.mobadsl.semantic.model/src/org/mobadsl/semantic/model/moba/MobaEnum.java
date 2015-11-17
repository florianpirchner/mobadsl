/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Enum</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEnum()
 * @model
 * @generated
 */
public interface MobaEnum extends MobaApplicationFeature {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaEnumLiteral}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEnum_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaEnumLiteral> getLiterals();

	/**
	 * Returns all literals including the super types one.
	 * 
	 * @return
	 */
	List<MobaEnumLiteral> getAllLiterals();
	
	/**
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaEnumLiteral> getGenLiterals();

	/**
	 * Returns all super types.
	 * 
	 * @return
	 * @throws RecursionException
	 */
	List<MobaEnum> getAllSuperTypes() throws RecursionException;

} // MobaEnum
