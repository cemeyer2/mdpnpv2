package edu.illinois.mdpnp.conditions;

public class LessThanOrEquals extends BinaryCondition {

	public LessThanOrEquals(Comparable src, Comparable target) {
		super(src, target);
	}

	@Override
	public boolean evaluate() {
		return getSource().compareTo(getTarget()) <= 0;
	}

	@Override
	public String getOperator() {
		return "<=";
	}
}