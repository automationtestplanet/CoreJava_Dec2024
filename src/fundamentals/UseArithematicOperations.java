package fundamentals;

import arithematic.operations.AccessArithematicOperations;
import arithematic.operations.ArithematicOperations;
//import arithematic.operations.ImplementArithemtaicOperations; // it is not a public class

public class UseArithematicOperations {

	public static void main(String[] args) {
//		 ArithematicOperations ariOp = new ArithematicOperations();  // We can not create object of Abstract class
//		ArithematicOperations ariOp = new ImplementArithemtaicOperations();  // can not create object with out importing

		ArithematicOperations accArop = new AccessArithematicOperations();

		System.out.println(accArop.addition(10, 20));
		System.out.println(accArop.subtraction(10, 20));
		System.out.println(accArop.multiplication(10, 20));
		System.out.println(accArop.division(10, 20));

	}

}
