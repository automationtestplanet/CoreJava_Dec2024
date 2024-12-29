package oops.inheritance;

public class AccessCalculator {

	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}
	
	public static void main(String[] args) {
		Calculator clac = new Calculator();
		clac.addition(100, 200);
		clac.subtraction(100, 200);
		clac.multiplication(100, 200);
		clac.division(100, 200);
		
		AccessCalculator accCalc = new AccessCalculator();
		
//		accCalc.addition(100, 200);
//		accCalc.subtraction(100, 200);
//		accCalc.multiplication(100, 200);
//		accCalc.division(100, 200);
		
		accCalc.modDivision(10, 3);
	}

}
