/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constant Value Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValueFunction()
 * @model
 * @generated
 */
public enum MobaConstantValueFunction implements Enumerator {
	/**
	 * The '<em><b>TO LOWER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_LOWER_CASE(0, "TO_LOWER_CASE", "TO_LOWER_CASE"),

	/**
	 * The '<em><b>TO UPPER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_UPPER_CASE(1, "TO_UPPER_CASE", "TO_UPPER_CASE"),

	/**
	 * The '<em><b>TO FIRST UPPER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST_UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_FIRST_UPPER_CASE(2, "TO_FIRST_UPPER_CASE", "TO_FIRST_UPPER_CASE"),

	/**
	 * The '<em><b>TO FIRST LOWER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST_LOWER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	TO_FIRST_LOWER_CASE(3, "TO_FIRST_LOWER_CASE", "TO_FIRST_LOWER_CASE");

	/**
	 * The '<em><b>TO LOWER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO LOWER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_LOWER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_LOWER_CASE_VALUE = 0;

	/**
	 * The '<em><b>TO UPPER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO UPPER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_UPPER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_UPPER_CASE_VALUE = 1;

	/**
	 * The '<em><b>TO FIRST UPPER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO FIRST UPPER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST_UPPER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_FIRST_UPPER_CASE_VALUE = 2;

	/**
	 * The '<em><b>TO FIRST LOWER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO FIRST LOWER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST_LOWER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_FIRST_LOWER_CASE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Constant Value Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MobaConstantValueFunction[] VALUES_ARRAY =
		new MobaConstantValueFunction[] {
			TO_LOWER_CASE,
			TO_UPPER_CASE,
			TO_FIRST_UPPER_CASE,
			TO_FIRST_LOWER_CASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Constant Value Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MobaConstantValueFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constant Value Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaConstantValueFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobaConstantValueFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constant Value Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaConstantValueFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobaConstantValueFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constant Value Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaConstantValueFunction get(int value) {
		switch (value) {
			case TO_LOWER_CASE_VALUE: return TO_LOWER_CASE;
			case TO_UPPER_CASE_VALUE: return TO_UPPER_CASE;
			case TO_FIRST_UPPER_CASE_VALUE: return TO_FIRST_UPPER_CASE;
			case TO_FIRST_LOWER_CASE_VALUE: return TO_FIRST_LOWER_CASE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MobaConstantValueFunction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MobaConstantValueFunction
