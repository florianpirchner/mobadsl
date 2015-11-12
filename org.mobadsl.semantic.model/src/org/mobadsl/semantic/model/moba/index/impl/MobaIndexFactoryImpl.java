/**
 */
package org.mobadsl.semantic.model.moba.index.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.mobadsl.semantic.model.moba.index.*;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.mobadsl.semantic.model.moba.index.MobaIndexFactory;
import org.mobadsl.semantic.model.moba.index.MobaIndexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaIndexFactoryImpl extends EFactoryImpl implements MobaIndexFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobaIndexFactory init() {
		try {
			MobaIndexFactory theMobaIndexFactory = (MobaIndexFactory)EPackage.Registry.INSTANCE.getEFactory(MobaIndexPackage.eNS_URI);
			if (theMobaIndexFactory != null) {
				return theMobaIndexFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobaIndexFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaIndexFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobaIndexPackage.MOBA_INDEX: return createMobaIndex();
			case MobaIndexPackage.MOBA_INDEX_ENTRY: return createMobaIndexEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaIndex createMobaIndex() {
		MobaIndexImpl mobaIndex = new MobaIndexImpl();
		return mobaIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaIndexEntry createMobaIndexEntry() {
		MobaIndexEntryImpl mobaIndexEntry = new MobaIndexEntryImpl();
		return mobaIndexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaIndexPackage getMobaIndexPackage() {
		return (MobaIndexPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobaIndexPackage getPackage() {
		return MobaIndexPackage.eINSTANCE;
	}

} //MobaIndexFactoryImpl
