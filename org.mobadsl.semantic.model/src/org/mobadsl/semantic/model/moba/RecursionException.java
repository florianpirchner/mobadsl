package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * Is thrown, if a type has recursive dependencies to its super types. 
 */
@SuppressWarnings("serial")
public class RecursionException extends RuntimeException {

	private final EObject source;
	private final EObject superType;

	public RecursionException(EObject source, EObject superType) {
		super();
		this.source = source;
		this.superType = superType;
	}

	public EObject getSource() {
		return source;
	}

	public EObject getSuperType() {
		return superType;
	}

}
