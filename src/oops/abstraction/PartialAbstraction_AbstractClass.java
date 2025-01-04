package oops.abstraction;

abstract public class PartialAbstraction_AbstractClass {

	public int addition(int a, int b) {
		return a + b;
	}

	/**
	 * Description: This method performs subtraction operation on two numbers and
	 * returns result
	 * 
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 * @return
	 */
	abstract public int subtraction(int a, int b);

	public static void main(String[] args) {
//		PartialAbstraction_AbstractClass asCls = new PartialAbstraction_AbstractClass(); // we can not create the object
																							// for abstract class
	}

}
