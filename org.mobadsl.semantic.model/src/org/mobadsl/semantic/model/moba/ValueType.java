package org.mobadsl.semantic.model.moba;

/**
 * The type of value contained in the constant value.
 * <ul>
 * <li>{@link #CONSTANT} means {@link MobaConstantValue#getValueConst()}
 * </li>
 * <li>{@link #STRING} means {@link MobaConstantValue#getValueString()}</li>
 * <li>{@link #NUMERIC} means {@link MobaConstantValue#getValueInt()}</li>
 * <li>{@link #DECIMAL} means {@link MobaConstantValue#getValueDouble()}</li>
 * </ul>
 */
public enum ValueType {
	CONSTANT, STRING, NUMERIC, DECIMAL
}
