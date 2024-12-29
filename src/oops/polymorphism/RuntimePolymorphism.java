package oops.polymorphism;

public class RuntimePolymorphism extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}
	
	public void addition(int a, int b) {
		System.out.println(a + b + 50);
	 }
	
	public int evaluateExpression(int a,int b,int c, int d, int e, int f) {		
		return super.evaluateExpression(a,b,c,d,e,f) + 500;
	}


	public static void main(String[] args) {

		RuntimePolymorphism runpol = new RuntimePolymorphism();

		runpol.addition(100, 200);
		runpol.subtraction(100, 200);
		runpol.multiplication(100, 200);
		runpol.division(100, 200);
		runpol.modDivision(10, 3);
		
		int result = runpol.evaluateExpression(10, 20, 30, 40, 50, 60);
		System.out.println(result);
	}

}
