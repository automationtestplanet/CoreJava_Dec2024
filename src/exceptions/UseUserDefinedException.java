package exceptions;

public class UseUserDefinedException {

	public static int division(int a, int b) throws UserDefinedException {
		if (b == 0) {
			throw new UserDefinedException();
		} else {
			return a / b;
		}
	}

	public static void main(String[] args) throws UserDefinedException {

		division(10,0);

	}

}
