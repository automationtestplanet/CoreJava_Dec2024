package exceptions;

public class ExceptionExample {

	public static void division(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void subtraction(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void addition(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) throws InterruptedException{

		System.out.println("Program Division Execution Started");
		
		try {		
			division(10, 0);
		}catch(ArithmeticException ae) {
			
		}

		System.out.println("Program Division Execution Ended");
		
//		Thread.sleep(10000);
		
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException ie) {
//			
//		}
		
		System.out.println("Program subtraction Execution Started");

		subtraction(10, 20);

		System.out.println("Program Subtraction Execution Ended");
		
		System.out.println("Program addition Execution Started");

		addition(10, 20);

		System.out.println("Program addition Execution Ended");
		
		
//		a int = 100;  // syntax errors we need to correct before execution
		
		
	}

}
