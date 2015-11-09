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
 * <li>{@link org.mobadsl.semantic.model.moba.MobaEnum#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaEnum#getName <em>Name</em>}
 * </li>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaEnum#getLiterals
 * <em>Literals</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEnum()
 * @model
 * @generated
 */
public interface MobaEnum extends MobaApplicationFeature, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaEnum)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEnum_SuperType()
	 * @model
	 * @generated
	 */
	MobaEnum getSuperType();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaEnum#getSuperType
	 * <em>Super Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaEnum value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEnum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaEnum#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns all super types.
	 * 
	 * @return
	 * @throws RecursionException
	 */
	List<MobaEnum> getAllSuperTypes() throws RecursionException;

} // MobaEnum
