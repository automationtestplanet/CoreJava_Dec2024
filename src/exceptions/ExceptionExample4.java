package exceptions;

public class ExceptionExample4 {

	public static int division(int a, int b) {
		try {
			return a / b;
		}catch(ArithmeticException ae) {
			return a/1;
		}
	}

	public static void main(String[] args) {		
		System.out.println(division(10,0));
	}

}
