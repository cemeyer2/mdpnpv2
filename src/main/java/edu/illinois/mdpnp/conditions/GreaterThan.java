package edu.illinois.mdpnp.conditions;

public class GreaterThan extends Condition {

	private Comparable src, target;
	public GreaterThan(Comparable src, Comparable target) {
		this.src = src;
		this.target = target;
	}

	@Override
	public boolean evaluate() {
		return src.compareTo(target) > 0;
	}

}
