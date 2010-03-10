package edu.illinois.mdpnp.conditions;

public class LessThan extends BinaryCondition {

	public LessThan(Comparable src, Comparable target) {
		super(src, target);
	}

	@Override
	public boolean evaluate() {
		return getSource().compareTo(getTarget()) < 0;
	}

	@Override
	public String getOperator() {
		return "<";
	}

}
