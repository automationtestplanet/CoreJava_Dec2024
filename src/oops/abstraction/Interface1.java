package oops.abstraction;

public interface Interface1 {
	
//	int a;  // By default all the global variables are public static and final 
	String str = "Hello";
	
//	int addition(int a,int b) {  // error
//		
//	}
	
//	abstract public int addition(int a,int b);
	int addition(int a,int b);  // by default all the methods inside the interface are abstract and public
	
	static int subtraction(int a, int b) { // static methods we can not override
		return a-b;
	}
	
	default int multiplication(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		System.out.println(Interface1.str);
//		Interface1.str = "Java";  // Final Variable value can not be changed
		
//		multiplication(10,20); // default methods are not static methods
		
//		Interface1.multiplication(10,20); // default methods are not static methods
		
//		Interface1 inf1 = new Interface1(); // we create the object of Interface
	}
}
