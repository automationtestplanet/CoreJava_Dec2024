package oops.inheritance;

public class NewCalculator extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}
	
	public static void main(String[] args) {

		NewCalculator newCalc = new NewCalculator();
		
		newCalc.addition(100, 200);
		newCalc.subtraction(100, 200);
		newCalc.multiplication(100, 200);
		newCalc.division(100, 200);		
		newCalc.modDivision(10, 3);
	}

}
