package org.mobadsl.semantic.model.moba.util;

import org.mobadsl.semantic.model.moba.MobaLowerBound;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaUpperBound;

/**
 * Keeps lower and upper bound
 */
public class Bounds {

	private final MobaLowerBound lower;
	private final MobaUpperBound upper;

	public static Bounds createZeroToOne() {
		return new Bounds(MobaLowerBound.ZERO, MobaUpperBound.ONE);
	}

	public static Bounds createFor(MobaMultiplicityAble object) {
		if (object == null) {
			return new Bounds(MobaLowerBound.ZERO, MobaUpperBound.ONE);
		}

		return createFor(object.getMultiplicity());
	}

	public static Bounds createFor(MobaMuliplicity multiplicity) {

		if (multiplicity == null) {
			return new Bounds(MobaLowerBound.ZERO, MobaUpperBound.ONE);
		}

		MobaLowerBound lb = null;
		MobaUpperBound ub = null;

		if (multiplicity != null) {
			lb = multiplicity.getLower();
			ub = multiplicity.getUpper();
		}

		MobaLowerBound lower = MobaLowerBound.ZERO;
		MobaUpperBound upper = MobaUpperBound.ONE;

		if (lb != null) {
			if (ub != null && ub != MobaUpperBound.NULL) {
				// Lower and upper bound [x..y] where x = 0/1/?/+/* and y = 1/*
				switch (lb) {
				case ZERO: // [0..]
				case OPTIONAL: // [?..] -> same as [0..] -> should be warning
					lower = MobaLowerBound.ZERO;
					break;
				case ONE: // [1..]
				case ATLEASTONE: // [+..] -> same as [1..] -> should be warning
					lower = MobaLowerBound.ONE;
					break;
				case MANY: // [*..]
					lower = MobaLowerBound.MANY;
					// [*..*]
					// [*..1] -> error: upper must be greather than lower bound!
					break;
				}
				upper = ub;
			} else {
				// No upper bound.
				switch (lb) {
				case ZERO: // [0] -> makes only sense with upper bound
				case OPTIONAL: // [?]
					lower = MobaLowerBound.ZERO;
					upper = MobaUpperBound.ONE;
					break;
				case ONE: // [1] -> implies notnull
				case ATLEASTONE: // [+]
					lower = MobaLowerBound.ONE;
					upper = MobaUpperBound.ONE;
					break;
				case MANY: // [*]
					lower = MobaLowerBound.ZERO;
					upper = MobaUpperBound.MANY;
					break;
				default:
					lower = MobaLowerBound.ZERO;
					upper = MobaUpperBound.MANY;
					break;
				}
			}
		}

		return new Bounds(lower, upper);

	}

	public Bounds(MobaLowerBound lower, MobaUpperBound upper) {
		super();
		this.lower = lower;
		this.upper = upper;
	}

	public MobaLowerBound getLower() {
		return lower;
	}

	public MobaUpperBound getUpper() {
		return upper;
	}

	/**
	 * Returns true if the upper bound is many.
	 * 
	 * @return
	 */
	public boolean isToMany() {
		return upper == MobaUpperBound.MANY;
	}

	/**
	 * Returns true if the lower bound is one.
	 * 
	 * @return
	 */
	public boolean isRequired() {
		return lower == MobaLowerBound.ONE;
	}

	/**
	 * Returns true if the lower bound is zero.
	 * 
	 * @return
	 */
	public boolean isOptional() {
		return lower == MobaLowerBound.ZERO;
	}

}