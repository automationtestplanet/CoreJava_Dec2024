package oops.abstraction.functional.interfaces;

public class AccessFunctionalInterface {

	public static void main(String[] args) {

		FunctionalInterface1 funInf1 = new FunctionalInterface1() {
			@Override
			public void addition(int a, int b) {
				System.out.println(a + b);
			}
		};
		funInf1.addition(10, 20);

		FunctionalInterface1 funInf2 = (a, b) -> { // lambda expression
			System.out.println(a + b);
		};		
		funInf2.addition(100, 200);
		
		
		FunctionalInterface1 funInf3 = (a, b) -> System.out.println(a + b);
		
		
		funInf3.addition(1000, 2000);
	}

}
