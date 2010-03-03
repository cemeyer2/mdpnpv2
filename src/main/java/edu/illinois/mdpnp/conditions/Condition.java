package edu.illinois.mdpnp.conditions;

public abstract class Condition {
	
	public enum ConditionOperator {
		greaterThanOrEquals {
			boolean evaluate(Comparable src, Comparable target){ 
				return src.compareTo(target) >= 0; 
			}
		},
		lessThanOrEquals {
			boolean evaluate(Comparable src, Comparable target) {
				return src.compareTo(target) <= 0;
			}
		},
		greaterThan {
			boolean evaluate(Comparable src, Comparable target){ 
				return src.compareTo(target) > 0; 
			}
		},
		lessThan {
			boolean evaluate(Comparable src, Comparable target) {
				return src.compareTo(target) < 0;
			}
		},
		equals {
			boolean evaluate(Comparable src, Comparable target) {
				return src.compareTo(target) == 0;
			}
		};
		
		/**
		 * target is constant, src is domain object e.g. heartrate
		 */
		abstract boolean evaluate(Comparable src, Comparable target);
	}
	
	/**
	 * target is constant, src is domain object e.g. heartrate
	 */
	//public abstract boolean evaluate(Comparable src, Comparable target);	
}
