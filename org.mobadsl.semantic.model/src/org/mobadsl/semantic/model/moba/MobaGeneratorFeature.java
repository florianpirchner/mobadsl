/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Generator Feature</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorFeature()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MobaGeneratorFeature extends EObject {
	/**
	 * Returns the generator ID. From {@link #getGeneratorString()} or
	 * {@link #getGeneratorConst()}
	 * 
	 * @return
	 */
	String getGeneratorId();

} // MobaGeneratorFeature
