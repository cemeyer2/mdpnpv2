package edu.illinois.mdpnp.conditions;

public abstract class BinaryCondition extends Condition {

	protected Comparable source, target;
	
	public BinaryCondition(Comparable source, Comparable target)
	{
		this.source = source;
		this.target = target;
	}
	
	public abstract String getOperator();
	
	public Comparable getSource()
	{
		return source;
	}
	
	public Comparable getTarget()
	{
		return target;
	}

}
