package oops.abstraction;

public class AccessInterface1 implements Interface1 {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

//		Interface1 inf1 = new Interface1(); // we can not create object for interface
		
		Interface1 inf1 = new AccessInterface1();
		System.out.println(inf1.addition(10,20));
		System.out.println(inf1.multiplication(10,20));
		
		System.out.println(Interface1.subtraction(10, 5));
	}

}
