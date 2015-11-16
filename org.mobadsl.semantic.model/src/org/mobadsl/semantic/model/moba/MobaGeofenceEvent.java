/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Geofence Event</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeofenceEvent()
 * @model
 * @generated
 */
public enum MobaGeofenceEvent implements Enumerator {
	/**
	 * The '<em><b>ENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENTER(0, "ENTER", "ENTER"),

	/**
	 * The '<em><b>LEAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	LEAVE(1, "LEAVE", "LEAVE");

	/**
	 * The '<em><b>ENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTER_VALUE = 0;

	/**
	 * The '<em><b>LEAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Geofence Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MobaGeofenceEvent[] VALUES_ARRAY =
		new MobaGeofenceEvent[] {
			ENTER,
			LEAVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Geofence Event</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MobaGeofenceEvent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Geofence Event</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaGeofenceEvent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobaGeofenceEvent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geofence Event</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaGeofenceEvent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MobaGeofenceEvent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Geofence Event</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MobaGeofenceEvent get(int value) {
		switch (value) {
			case ENTER_VALUE: return ENTER;
			case LEAVE_VALUE: return LEAVE;
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
	private MobaGeofenceEvent(int value, String name, String literal) {
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
	
} //MobaGeofenceEvent
