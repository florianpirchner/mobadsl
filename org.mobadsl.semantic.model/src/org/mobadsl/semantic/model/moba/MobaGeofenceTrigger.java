/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geofence Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGeofenceTrigger#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeofenceTrigger()
 * @model
 * @generated
 */
public interface MobaGeofenceTrigger extends MobaTrigger {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaGeofenceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceEvent
	 * @see #setEventType(MobaGeofenceEvent)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeofenceTrigger_EventType()
	 * @model
	 * @generated
	 */
	MobaGeofenceEvent getEventType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaGeofenceTrigger#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceEvent
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(MobaGeofenceEvent value);

} // MobaGeofenceTrigger
