/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaModel#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaModel#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaModel()
 * @model
 * @generated
 */
public interface MobaModel extends MobaFriendsAble {
	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaModel_Copyright()
	 * @model
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaModel#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

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
	
	/**
	 * Returns the moba applications contained in this model.
	 * @return
	 */
	List<MobaApplication> getApplications();
	
	/**
	 * Returns the moba projects contained in this model.
	 * @return
	 */
	List<MobaProject> getProjects();

} // MobaModel
