package oops.abstraction;

import calculator.AccessCalculator;

public class ImplementNewCalculator extends AccessCalculator implements NewCalculator{

	@Override
	public int modDivision(int a, int b) {
		return a/b;
	}

}
