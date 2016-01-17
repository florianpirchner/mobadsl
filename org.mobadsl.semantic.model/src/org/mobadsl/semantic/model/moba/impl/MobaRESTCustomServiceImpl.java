/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTMethods;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>REST Custom Service</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl#getMultipartParameters <em>Multipart Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTCustomServiceImpl extends MobaRESTImpl implements MobaRESTCustomService {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final MobaRESTMethods OPERATION_EDEFAULT = MobaRESTMethods.GET;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTMethods operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaRESTAbstractAttribute> parameters;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTCustomService superType;

	/**
	 * The cached value of the '{@link #getMultipartParameters()
	 * <em>Multipart Parameters</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMultipartParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaRESTAbstractAttribute> multipartParameters;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTCustomServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTMethods getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(MobaRESTMethods newOperation) {
		MobaRESTMethods oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_CUSTOM_SERVICE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaRESTAbstractAttribute> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MobaRESTAbstractAttribute>(MobaRESTAbstractAttribute.class, this, MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTCustomService getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (MobaRESTCustomService)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTCustomService basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(MobaRESTCustomService newSuperType) {
		MobaRESTCustomService oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaRESTAbstractAttribute> getMultipartParameters() {
		if (multipartParameters == null) {
			multipartParameters = new EObjectContainmentEList<MobaRESTAbstractAttribute>(MobaRESTAbstractAttribute.class, this, MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS);
		}
		return multipartParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS:
				return ((InternalEList<?>)getMultipartParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__OPERATION:
				return getOperation();
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS:
				return getParameters();
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS:
				return getMultipartParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__OPERATION:
				setOperation((MobaRESTMethods)newValue);
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MobaRESTAbstractAttribute>)newValue);
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE:
				setSuperType((MobaRESTCustomService)newValue);
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS:
				getMultipartParameters().clear();
				getMultipartParameters().addAll((Collection<? extends MobaRESTAbstractAttribute>)newValue);
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
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS:
				getParameters().clear();
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE:
				setSuperType((MobaRESTCustomService)null);
				return;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS:
				getMultipartParameters().clear();
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
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE:
				return superType != null;
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS:
				return multipartParameters != null && !multipartParameters.isEmpty();
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaRESTCustomService> getAllSuperTypes() throws RecursionException {
		List<MobaRESTCustomService> result = MobaUtil.getAllSuperTypes(this,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE);
		return result;
	}

	@Override
	public List<MobaRESTAbstractAttribute> getAllParameters() {
		return collectAll(this, MobaRESTAbstractAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__PARAMETERS);
	}

	@Override
	public List<MobaRESTAbstractAttribute> getAllMultipartParameters() {
		return collectAll(this, MobaRESTAbstractAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS);
	}

	@Override
	public List<MobaRESTDtoAttribute> getAllMultipartDtoAttributes() {
		return collectAll(this, MobaRESTDtoAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS);
	}

	@Override
	public List<MobaRESTAttribute> getAllMultipartAttributes() {
		return collectAll(this, MobaRESTAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS);
	}

	@Override
	public List<MobaRESTAttribute> getGenMultipartAttributes() {
		return collectGen(this, MobaRESTAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS,
				MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY);
	}

	@Override
	public List<MobaRESTDtoAttribute> getGenMultipartDtoAttributes() {
		return collectGen(this, MobaRESTDtoAttribute.class,
				MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__MULTIPART_PARAMETERS,
				MobaPackage.Literals.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE);
	}

	@Override
	public List<MobaRESTDtoAttribute> getAllParameterDtoAttributes() {
		return collectAll(this, MobaRESTDtoAttribute.class, MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__PARAMETERS);
	}

	@Override
	public List<MobaRESTDtoAttribute> getGenParameterDtoAttributes() {
		return collectGen(this, MobaRESTDtoAttribute.class, MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__PARAMETERS,
				MobaPackage.Literals.MOBA_REST_DTO_ATTRIBUTE__DTO_FEATURE);
	}

	@Override
	public List<MobaRESTAttribute> getAllParameterAttributes() {
		return collectAll(this, MobaRESTAttribute.class, MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__PARAMETERS);
	}

	@Override
	public List<MobaRESTAttribute> getGenParameterAttributes() {
		return collectGen(this, MobaRESTAttribute.class, MobaPackage.Literals.MOBA_REST_CUSTOM_SERVICE__PARAMETERS,
				MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY);
	}
} // MobaRESTCustomServiceImpl
