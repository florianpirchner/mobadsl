/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl#getGeneratorString <em>Generator String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl#getGeneratorConst <em>Generator Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaGeneratorImpl extends MobaApplicationFeatureImpl implements MobaGenerator {
	/**
	 * The default value of the '{@link #getGeneratorString() <em>Generator String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGeneratorString()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorString() <em>Generator String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGeneratorString()
	 * @generated
	 * @ordered
	 */
	protected String generatorString = GENERATOR_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneratorConst() <em>Generator Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGeneratorConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant generatorConst;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorString() {
		return generatorString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorString(String newGeneratorString) {
		String oldGeneratorString = generatorString;
		generatorString = newGeneratorString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR__GENERATOR_STRING, oldGeneratorString, generatorString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getGeneratorConst() {
		if (generatorConst != null && generatorConst.eIsProxy()) {
			InternalEObject oldGeneratorConst = (InternalEObject)generatorConst;
			generatorConst = (MobaConstant)eResolveProxy(oldGeneratorConst);
			if (generatorConst != oldGeneratorConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_GENERATOR__GENERATOR_CONST, oldGeneratorConst, generatorConst));
			}
		}
		return generatorConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetGeneratorConst() {
		return generatorConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorConst(MobaConstant newGeneratorConst) {
		MobaConstant oldGeneratorConst = generatorConst;
		generatorConst = newGeneratorConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR__GENERATOR_CONST, oldGeneratorConst, generatorConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR__GENERATOR_STRING:
				return getGeneratorString();
			case MobaPackage.MOBA_GENERATOR__GENERATOR_CONST:
				if (resolve) return getGeneratorConst();
				return basicGetGeneratorConst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR__GENERATOR_STRING:
				setGeneratorString((String)newValue);
				return;
			case MobaPackage.MOBA_GENERATOR__GENERATOR_CONST:
				setGeneratorConst((MobaConstant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR__GENERATOR_STRING:
				setGeneratorString(GENERATOR_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_GENERATOR__GENERATOR_CONST:
				setGeneratorConst((MobaConstant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR__GENERATOR_STRING:
				return GENERATOR_STRING_EDEFAULT == null ? generatorString != null : !GENERATOR_STRING_EDEFAULT.equals(generatorString);
			case MobaPackage.MOBA_GENERATOR__GENERATOR_CONST:
				return generatorConst != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (getGeneratorConst() != null) {
			return getGeneratorConst().getValue();
		}
		return getGeneratorString();
	}

} // MobaGeneratorImpl
