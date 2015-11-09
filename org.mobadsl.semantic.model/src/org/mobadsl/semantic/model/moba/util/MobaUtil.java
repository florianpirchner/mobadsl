package org.mobadsl.semantic.model.moba.util;

import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;

public class MobaUtil {

	/**
	 * Returns the bounds for the given provider.
	 * 
	 * @param object
	 * @return
	 */
	public static Bounds getBounds(MobaMultiplicityAble object) {
		return Bounds.createFor(object);
	}

}
