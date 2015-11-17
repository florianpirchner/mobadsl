/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBackgroundApplication#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBackgroundApplication()
 * @model
 * @generated
 */
public interface MobaBackgroundApplication extends MobaApplication {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBackgroundApplication_Triggers()
	 * @model
	 * @generated
	 */
	EList<MobaTrigger> getTriggers();

} // MobaBackgroundApplication
