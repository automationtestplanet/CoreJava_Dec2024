package access.modifiers2;

import access.modifiers.AccessModifiers1;

public class Access_AccessModifersData2 extends AccessModifiers1 {

	public static void main(String[] args) {
		Access_AccessModifersData2 accssMod1 = new Access_AccessModifersData2(); // public class can be access with in
																					// the package

//		System.out.println(accssMod1.a);  // private variables can not access outside the package
		System.out.println(accssMod1.b); // public variables can be accessed outside the package
		System.out.println(accssMod1.str); // protected variables can be accessed outside the package when we extend the
											// class and create a object of child class
//		System.out.println(accssMod1.bool1); // default variables can not access outside the package

		accssMod1.addition(10, 20); // public method can be accessed with in the package
//		accssMod1.subtraction(10, 20); // default method can not access outside the package
		accssMod1.multiplication(10, 20); // protected method can be accessed outside the package when we extend extend
											// the class and create a object of child class
//		accssMod1.division(10, 20); // private method can not access outside the package
	}

}
