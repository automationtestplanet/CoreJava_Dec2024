package oops.polymorphism;

public class Calculator {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public void division(int a, int b) {
		System.out.println(a / b);
	}
	
	public int evaluateExpression(int a,int b,int c, int d, int e, int f) {		
		return a+b*c-d/e&f;
	}

}
