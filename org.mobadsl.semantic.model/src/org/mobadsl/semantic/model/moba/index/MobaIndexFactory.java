/**
 */
package org.mobadsl.semantic.model.moba.index;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage
 * @generated
 */
public interface MobaIndexFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobaIndexFactory eINSTANCE = org.mobadsl.semantic.model.moba.index.impl.MobaIndexFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Moba Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moba Index</em>'.
	 * @generated
	 */
	MobaIndex createMobaIndex();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	MobaIndexEntry createMobaIndexEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobaIndexPackage getMobaIndexPackage();

} //MobaIndexFactory
