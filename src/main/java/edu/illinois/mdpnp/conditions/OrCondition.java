package edu.illinois.mdpnp.conditions;

public class OrCondition extends Condition {

	private Condition l, r;
	
	public OrCondition(Condition l, Condition r) {
		this.l = l;
		this.r = r;
	}
	
	@Override
	public boolean evaluate() {
		return l.evaluate() || r.evaluate();
	}

}
