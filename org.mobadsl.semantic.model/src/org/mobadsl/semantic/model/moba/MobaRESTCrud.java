/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Crud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCrud()
 * @model
 * @generated
 */
public interface MobaRESTCrud extends MobaREST, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaRESTOperations}.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaRESTOperations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute list.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTOperations
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCrud_Operations()
	 * @model
	 * @generated
	 */
	EList<MobaRESTOperations> getOperations();

} // MobaRESTCrud
