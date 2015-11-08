package org.mobadsl.semantic.model.moba.util;

import org.mobadsl.semantic.model.moba.MobaMultiplicityProvider;

public class MobaUtil {

	/**
	 * Returns the bounds for the given provider.
	 * 
	 * @param provider
	 * @return
	 */
	public static Bounds getBounds(MobaMultiplicityProvider provider) {
		return Bounds.createFor(provider);
	}

}
