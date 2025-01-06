package oops.abstraction;

import calculator.Calculator;

public class UseNewCalculator {

	public static void main(String[] args) {
		NewCalculator newCalc = new AccessNewCalculator();
		System.out.println(newCalc.modDivision(10, 3));
		
		Calculator calc = newCalc;
		
		System.out.println(calc.addition(10, 20));
	}
}
