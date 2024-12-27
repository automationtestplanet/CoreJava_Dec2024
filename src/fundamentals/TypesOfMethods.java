package fundamentals;

public class TypesOfMethods {
	
	public static void addition(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	
	public static int subtraction(int a, int b) {
		return a-b;
	}
	
	public static void multiplication() {
		System.out.println(10*20);
	}
	
	public static int division() {
		return 10/3;
	}

	public static void main(String[] args) {
		addition(10,20);
		addition(100,200);
		addition(1000,2000);
		
		int result1 = subtraction(10, 7);
		System.out.println(result1);
		
		int result2 = division();
		System.out.println(result2);

	}

}
