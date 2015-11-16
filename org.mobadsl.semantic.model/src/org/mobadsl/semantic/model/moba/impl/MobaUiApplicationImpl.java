/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaUiApplication;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Ui Application</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class MobaUiApplicationImpl extends MobaApplicationImpl implements MobaUiApplication {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaUiApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_UI_APPLICATION;
	}

	@Override
	public <T extends EObject> List<T> getAllSuperTypes() {
		return new ArrayList<>();
	}

} // MobaUiApplicationImpl
