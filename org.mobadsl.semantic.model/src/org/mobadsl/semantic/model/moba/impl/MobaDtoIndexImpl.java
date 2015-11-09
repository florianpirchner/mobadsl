/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoIndex;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dto Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDtoIndexImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaDtoIndexImpl extends MinimalEObjectImpl.Container implements MobaDtoIndex {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaDtoAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDtoIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_DTO_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaDtoAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<MobaDtoAttribute>(MobaDtoAttribute.class, this, MobaPackage.MOBA_DTO_INDEX__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_DTO_INDEX__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_DTO_INDEX__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MobaDtoAttribute>)newValue);
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
			case MobaPackage.MOBA_DTO_INDEX__ATTRIBUTES:
				getAttributes().clear();
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
			case MobaPackage.MOBA_DTO_INDEX__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MobaDtoIndexImpl
