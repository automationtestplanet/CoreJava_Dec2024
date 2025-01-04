package access.modifiers;

public class AccessModifiers1 {

	private int a = 100;
	public int b = 200;
	protected String str = "Hello";
	boolean bool1 = true;

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	protected void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	private void division(int a, int b) {
		System.out.println(a / b);
	}
}
