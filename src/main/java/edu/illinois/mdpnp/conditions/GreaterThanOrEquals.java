package edu.illinois.mdpnp.conditions;

public class GreaterThanOrEquals extends BinaryCondition {

	public GreaterThanOrEquals(Comparable src, Comparable target) {
		super(src, target);
	}

	@Override
	public boolean evaluate() {
		return getSource().compareTo(getTarget()) >= 0;
	}

	@Override
	public String getOperator() {
		return ">=";
	}
}