package oops.abstraction;

import calculator.Calculator;

public interface NewCalculator extends Calculator {

	/**
	 * Description: performs modular division operation on two variables
	 * 
	 * @param a
	 * @param b
	 * @return integer value
	 */
	int modDivision(int a, int b);
}
