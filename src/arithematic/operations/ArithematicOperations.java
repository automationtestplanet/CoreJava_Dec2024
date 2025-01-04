package arithematic.operations;

abstract public class ArithematicOperations {

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
	 */
	abstract public int subtraction(int a, int b);

	/**
	 * Description: This method performs multiplication operation on two numbers and
	 * returns result
	 * 
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 */
	abstract public int multiplication(int a, int b);

	public int division(int a, int b) {
		return a / b;
	}
}
