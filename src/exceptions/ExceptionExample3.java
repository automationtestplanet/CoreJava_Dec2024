package exceptions;

public class ExceptionExample3 {

	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		try {
			division(10, 0);
			throw new ArithmeticException();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			System.out.println(ae.toString());
			System.out.println(ae.getCause());
		}
		
		
//		ArithmeticException ae1 = new ArithmeticException();

	}

}

