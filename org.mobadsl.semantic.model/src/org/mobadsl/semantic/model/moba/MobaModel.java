/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaModel#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaModel()
 * @model
 * @generated
 */
public interface MobaModel extends MobaFriendsAble {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaModelFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaModel_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaModelFeature> getFeatures();

} // MobaModel
