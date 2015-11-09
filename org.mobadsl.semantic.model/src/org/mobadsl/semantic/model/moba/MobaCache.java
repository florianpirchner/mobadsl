/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Cache</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeString <em>Cache Type String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeConst <em>Cache Type Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyString <em>Cache Strategy String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyConst <em>Cache Strategy Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaCache()
 * @model
 * @generated
 */
public interface MobaCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Type String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type String</em>' attribute.
	 * @see #setCacheTypeString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaCache_CacheTypeString()
	 * @model
	 * @generated
	 */
	String getCacheTypeString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeString <em>Cache Type String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cache Type String</em>' attribute.
	 * @see #getCacheTypeString()
	 * @generated
	 */
	void setCacheTypeString(String value);

	/**
	 * Returns the value of the '<em><b>Cache Type Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Type Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type Const</em>' reference.
	 * @see #setCacheTypeConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaCache_CacheTypeConst()
	 * @model
	 * @generated
	 */
	MobaConstant getCacheTypeConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeConst <em>Cache Type Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cache Type Const</em>' reference.
	 * @see #getCacheTypeConst()
	 * @generated
	 */
	void setCacheTypeConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Cache Strategy String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Strategy String</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Strategy String</em>' attribute.
	 * @see #setCacheStrategyString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaCache_CacheStrategyString()
	 * @model
	 * @generated
	 */
	String getCacheStrategyString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyString <em>Cache Strategy String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cache Strategy String</em>' attribute.
	 * @see #getCacheStrategyString()
	 * @generated
	 */
	void setCacheStrategyString(String value);

	/**
	 * Returns the value of the '<em><b>Cache Strategy Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Strategy Const</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Strategy Const</em>' reference.
	 * @see #setCacheStrategyConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaCache_CacheStrategyConst()
	 * @model
	 * @generated
	 */
	MobaConstant getCacheStrategyConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyConst <em>Cache Strategy Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Cache Strategy Const</em>' reference.
	 * @see #getCacheStrategyConst()
	 * @generated
	 */
	void setCacheStrategyConst(MobaConstant value);

	/**
	 * Returns the key cacheType. From {@link #getCacheTypeString()} or
	 * {@link #getCacheTypeConst()}
	 * 
	 * @return
	 */
	String getCacheType();

	/**
	 * Returns the cache strategy. From {@link #getCacheStrategyString()} or
	 * {@link #getCacheStrategyConst()}
	 * 
	 * @return
	 */
	String getCacheStrategy();

} // MobaCache
