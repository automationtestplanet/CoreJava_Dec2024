package oops.encapsulation;

public class UseArithematicOperations {

//	public void addition(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public void subtraction(int a, int b) {
//		System.out.println(a - b);
//	}
//
//	public void multiplication(int a, int b) {
//		System.out.println(a * b);
//	}
//
//	public void division(int a, int b) {
//		System.out.println(a / b);
//	}
	
	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		arOp.addition(100, 200);
		arOp.subtraction(100, 200);
		arOp.multiplication(100, 200);
		arOp.division(100, 200);
		
		UseArithematicOperations useArOp = new UseArithematicOperations();
		
		useArOp.modDivision(10, 3);
	}

}
