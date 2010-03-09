package edu.illinois.mdpnp.conditions;

public class GreaterThanOrEquals extends Condition {

	private Comparable src, target;
	public GreaterThanOrEquals(Comparable src, Comparable target) {
		this.src = src;
		this.target = target;
	}

	@Override
	public boolean evaluate() {
		return src.compareTo(target) >= 0;
	}
}