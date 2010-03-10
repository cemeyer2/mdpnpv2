package edu.illinois.mdpnp.conditions;

import org.svenson.JSONProperty;

public abstract class BinaryCondition extends Condition {

	protected Comparable source, target;
	
	public BinaryCondition(Comparable source, Comparable target)
	{
		this.source = source;
		this.target = target;
	}
	
	@JSONProperty(value="operator")
	public abstract String getOperator();
	
	@JSONProperty(value="source")
	public Comparable getSource()
	{
		return source;
	}
	
	@JSONProperty(value="target")
	public Comparable getTarget()
	{
		return target;
	}

}
