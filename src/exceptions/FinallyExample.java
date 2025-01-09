package exceptions;

public class FinallyExample {

	public static int getValue1FromDatabase() {
		return 10;
	}

	public static int getValue2FromDatabase() {
		return 1;
	}

	public static int getValue() {
		try {
			return 100;
		} catch (Exception e) {
			return 200;
		} finally {
			System.out.println("Value Returned");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Database Connection is Opened");

			int a = getValue1FromDatabase();
			int b = getValue2FromDatabase();
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Database Connection is closed");
		}

		System.out.println(getValue());

	}

}
