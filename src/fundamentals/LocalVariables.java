package fundamentals;

public class LocalVariables {
	
	public static void addition() {
//		System.out.println(a+b);  // unable to access A and B values from Main method
	}
	
	public static void subtraction() {
		int c = 300; int d = 400;
		System.out.println(c-d);
	}
	
	public static void multiplication() {		
//		System.out.println(c*d);  // unable to access C and D values from Subtraction method
	}
	
	public static void division(int e,int f) {		
		System.out.println(e/f);
	}
	
	public static void modularDivision() {		
//		System.out.println(e/f);  // unable to access division method parameters
	}

	public static void main(String[] args) {
		int a =100; 
		int b = 200;
	}

}
