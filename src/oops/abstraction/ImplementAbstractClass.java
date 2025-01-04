package oops.abstraction;

public class ImplementAbstractClass extends PartialAbstraction_AbstractClass {

	@Override
	public int subtraction(int a, int b) {		
		return a-b;
	}
	
	
	public static void main(String[] args) {
		PartialAbstraction_AbstractClass absCLs = new ImplementAbstractClass();  // up-casting
		
		System.out.println(absCLs.subtraction(30, 3));

	}


}
