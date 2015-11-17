/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friends Able</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaFriendsAble#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaFriendsAble()
 * @model abstract="true"
 * @generated
 */
public interface MobaFriendsAble extends MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Friends</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaFriend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaFriendsAble_Friends()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaFriend> getFriends();

	/**
	 * Returns all friends with respect to supertypes.
	 * @return
	 */
	List<MobaFriend> getAllFriends();
	
	/**
	 * Returns a list with friends, that is grouped by #value. 
	 * @return
	 */
	List<MobaFriend> getGenFriends();
	
	/**
	 * Returns a list with all supertypes. The highest supertype is at the end
	 * of the list. <br>
	 * If no supertypes are available, return a mutable empty list.
	 * 
	 * @return
	 */
	<T extends EObject> List<T> getAllSuperTypes();
	
} // MobaFriendsAble
