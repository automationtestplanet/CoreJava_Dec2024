package exceptions;

public class ExceptionExample5 {

	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		String str = null;
		int[] intArr = { 10, 20, 30 };

		System.out.println(str);
		System.out.println(intArr[0]);
		System.out.println(division(10, 3));

		str = "Hello";
		int index = 0;
		try {
			System.out.println(str.toUpperCase());
			System.out.println(intArr[index]);
			System.out.println(division(10, 0));
		} catch (Exception ne) {
			System.out.println(ne.getMessage());
		}

//		ArithmeticException ae = new ArithmeticException();		
//		RuntimeException re= ae;
//		Exception e = new ArithmeticException();

		str = "JAVA";
		index = 1;
		try {
			System.out.println(str.toUpperCase());
			System.out.println(intArr[index]);
			System.out.println(division(10, 0));
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		str = "Hello Java";
		index = 2;
		try {
			System.out.println(str.toUpperCase());
			System.out.println(intArr[index]);
			System.out.println(division(10, 0));
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
