package edu.illinois.mdpnp.conditions;

public class AndCondition extends Condition {

	private Condition l, r;
	
	public AndCondition(Condition l, Condition r) {
		this.l = l;
		this.r = r;
	}
	
	@Override
	public boolean evaluate() {
		return l.evaluate() && r.evaluate();
	}

}
