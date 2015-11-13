/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTWorkflow()
 * @model
 * @generated
 */
public interface MobaRESTWorkflow extends MobaREST, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaREST}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTWorkflow_Services()
	 * @model
	 * @generated
	 */
	EList<MobaREST> getServices();

} // MobaRESTWorkflow
