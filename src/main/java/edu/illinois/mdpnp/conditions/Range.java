/**
 * 
 */
package edu.illinois.mdpnp.conditions;

import java.math.BigDecimal;

/**
 * @author lee467
 * attempt at defining a condition/rule helper class
 */
public class Range extends Condition{
	private BigDecimal minimum;
	private BigDecimal maximum;
	private BigDecimal value;

	public Range(BigDecimal value, BigDecimal minimum, BigDecimal maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.value = value;
	}

	@Override
	public boolean evaluate() {
		return new GreaterThanOrEquals(value, minimum).evaluate() 
			&& new LessThanOrEquals(value, maximum).evaluate();
	}

}
