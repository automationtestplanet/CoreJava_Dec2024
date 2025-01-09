package exceptions;

public class ExceptionExample2 {

	public static int division(int a, int b) {
		return a / b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Program Execution started");
		int result1 = 0;
		int result2 = 0;
		try {
			result1 = division(10, 0); // exception			
			result2 = subtraction(100, result1);
			System.out.println(addition(result1, result2));
		} catch (ArithmeticException ae) {

		}

		System.out.println("Continue the execution");
	}

}
