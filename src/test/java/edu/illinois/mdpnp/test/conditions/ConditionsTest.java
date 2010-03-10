package edu.illinois.mdpnp.test.conditions;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import edu.illinois.mdpnp.conditions.*;

/**
 * 
 * @author lee467
 * TestCase for Condition classes.
 * Temporary, would be more meaningful with domain objects.
 */
public class ConditionsTest {

	private BigDecimal bd1;
	private BigDecimal bd2;
	private BigDecimal bd3;

	@Before
	public void setUp() throws Exception {
		bd1 = new BigDecimal(1);
		bd2 = new BigDecimal(2);
		bd3 = new BigDecimal(3);
	}
	
	@Test
	public final void testGreaterThan() {
		Condition gt = new GreaterThan(bd1, bd2);
		assert(!gt.evaluate());
		gt = new GreaterThan(bd2, bd1);
		assert(gt.evaluate());
	}

	@Test
	public final void testGreaterThanOrEquals() {
		Condition gte = new GreaterThanOrEquals(bd2, bd2);
		assert(gte.evaluate());
		gte = new GreaterThanOrEquals(bd1, bd2);
		assert(!gte.evaluate());
		gte = new GreaterThanOrEquals(bd2, bd1);
		assert(gte.evaluate());
	}
	
	@Test
	public final void testLessThan() {
		Condition lt = new LessThan(bd1, bd2);
		assert(lt.evaluate());
		lt = new LessThan(bd2, bd1);
		assert(!lt.evaluate());
	}

	@Test
	public final void testLessThanOrEquals() {
		Condition lte = new LessThanOrEquals(bd2, bd2);
		assert(lte.evaluate());
		lte = new LessThanOrEquals(bd1, bd2);
		assert(lte.evaluate());
		lte = new LessThanOrEquals(bd2, bd1);
		assert(!lte.evaluate());
	}
	
	@Test
	public final void testEquals() {
		Condition e = new Equals(bd2, bd2);
		assert(e.evaluate());
		e = new Equals(bd2, bd1);
		assert(!e.evaluate());
	}
	
	@Test
	public final void testRange() {
		Condition r = new Range(bd1, bd3, bd2);
		assert(r.evaluate());
		r = new Range(bd1, bd2, bd3);
		assert(!r.evaluate());
	}
	
	@Test
	public final void testAnd() {
		Condition r = new Range(bd1, bd3, bd2);
		Condition lt = new LessThan(bd1, bd2);
		Condition a = new AndCondition(r, lt);
		assert(a.evaluate());
		lt = new LessThan(bd2, bd2);
		assert(!a.evaluate());
	}
	
	@Test
	public final void testOr() {
		Condition r = new Range(bd1, bd3, bd2);
		Condition lt = new LessThan(bd2, bd1);
		Condition o = new OrCondition(r, lt);
		assert(o.evaluate());
		r = new Range(bd1, bd2, bd3);
		assert(!o.evaluate());
	}
}
