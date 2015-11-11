/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator ID Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl#getGeneratorConst <em>Generator Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl#getGeneratorString <em>Generator String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaGeneratorIDFeatureImpl extends MinimalEObjectImpl.Container implements MobaGeneratorIDFeature {
	/**
	 * The cached value of the '{@link #getGeneratorConst() <em>Generator Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant generatorConst;

	/**
	 * The default value of the '{@link #getGeneratorString() <em>Generator String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorString()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorString() <em>Generator String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorString()
	 * @generated
	 * @ordered
	 */
	protected String generatorString = GENERATOR_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorIDFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_GENERATOR_ID_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getGeneratorConst() {
		if (generatorConst != null && generatorConst.eIsProxy()) {
			InternalEObject oldGeneratorConst = (InternalEObject)generatorConst;
			generatorConst = (MobaConstant)eResolveProxy(oldGeneratorConst);
			if (generatorConst != oldGeneratorConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST, oldGeneratorConst, generatorConst));
			}
		}
		return generatorConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetGeneratorConst() {
		return generatorConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorConst(MobaConstant newGeneratorConst) {
		MobaConstant oldGeneratorConst = generatorConst;
		generatorConst = newGeneratorConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST, oldGeneratorConst, generatorConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorString() {
		return generatorString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorString(String newGeneratorString) {
		String oldGeneratorString = generatorString;
		generatorString = newGeneratorString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING, oldGeneratorString, generatorString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST:
				if (resolve) return getGeneratorConst();
				return basicGetGeneratorConst();
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING:
				return getGeneratorString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST:
				setGeneratorConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING:
				setGeneratorString((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST:
				setGeneratorConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING:
				setGeneratorString(GENERATOR_STRING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST:
				return generatorConst != null;
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING:
				return GENERATOR_STRING_EDEFAULT == null ? generatorString != null : !GENERATOR_STRING_EDEFAULT.equals(generatorString);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generatorString: ");
		result.append(generatorString);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getGeneratorId() {
		if(getGeneratorConst() != null) {
			return getGeneratorConst().getValue();
		}
		return getGeneratorString();
	}

} //MobaGeneratorIDFeatureImpl