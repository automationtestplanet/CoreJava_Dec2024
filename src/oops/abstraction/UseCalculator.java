package oops.abstraction;

import calculator.AccessCalculator;
import calculator.Calculator;
//import calculator.ImplementCalculator; // It is not a public class can not import.

public class UseCalculator {

	public static void main(String[] args) {
//		Calculator calc = new Calculator(); // We can not create Object of Interface
//		ImplementCalculator implCalc = new ImplementCalculator();  // non-public, can not import

		Calculator calc = new AccessCalculator();

		System.out.println(calc.addition(10, 20));
		System.out.println(calc.subtraction(10, 20));
		System.out.println(calc.multiplication(10, 20));
		System.out.println(calc.division(10, 20));

	}

}
