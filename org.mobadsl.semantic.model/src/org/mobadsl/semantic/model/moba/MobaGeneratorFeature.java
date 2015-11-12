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
	 * Returns the generator versioned ID. It follows the pattern
	 * {FQN}:{VERSION}. From {@link #getGeneratorString()} or
	 * {@link #getGeneratorConst()}
	 * 
	 * @return
	 */
	String getGeneratorVersionedId();

	/**
	 * Returns the version of the generator.
	 * 
	 * @return
	 */
	String getVersion();

	/**
	 * Returns the id of the generator.
	 * 
	 * @return
	 */
	String getId();

} // MobaGeneratorFeature
