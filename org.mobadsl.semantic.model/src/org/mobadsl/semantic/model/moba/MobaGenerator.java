/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Generator</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGenerator#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGenerator#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGenerator#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGenerator()
 * @model
 * @generated
 */
public interface MobaGenerator extends MobaApplicationFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGenerator_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaGenerator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGenerator_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaGeneratorFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGenerator_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaGenerator#isActive
	 * <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns all generator features including the features of all mixins and
	 * the mixins of mixins. But the mixing-feature itself will be not added. So
	 * only generatorID-features are left.<br>
	 * A mixin will only become processed once to avoid cycles.
	 * 
	 * @return
	 */
	List<MobaGeneratorIDFeature> getAllGeneratorIdFeatures();

	/**
	 * Returns all generator features including the features of all mixins and
	 * the mixins of mixins. But the mixing-feature itself will be not added. So
	 * only generatorID-features are left.
	 * 
	 * @return
	 */
	List<MobaGeneratorMixinFeature> getAllGeneratoMixinFeatures();

	/**
	 * Returns all generator features including the features of all mixins and
	 * the mixins of mixins. But the mixing-feature itself will be not added. So
	 * only generatorID-features are left.
	 * 
	 * @return
	 */
	List<MobaGeneratorFeature> getAllFeatures();

	/**
	 * Returns all generator ids from features including the features of all
	 * mixins and the mixins of mixins.
	 * 
	 * @return
	 */
	List<String> getAllGeneratorIds();

} // MobaGenerator
