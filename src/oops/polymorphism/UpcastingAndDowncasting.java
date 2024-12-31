package oops.polymorphism;

public class UpcastingAndDowncasting extends Calculator {

	public void modDivision(int a, int b) {
		System.out.println(a % b);
	}

	@Override
	public void addition(int a, int b) {
		System.out.println(a + b + 50);
	}

//	@Override  // static methods we can not override
	public static void addition(int a, int b, int c) {
		System.out.println(a + b + c + 50);
	}
	
	//Final method you can not override
//	public final void subtraction(int a, int b,int c) {
//		System.out.println(a-b-c);
//	}

	public static void main(String[] args) {
		UpcastingAndDowncasting upcast = new UpcastingAndDowncasting();
		System.out.println("-----------------Child Class Reference------------");
		upcast.addition(100, 200);
		upcast.subtraction(100, 200);
		upcast.modDivision(10, 3);

		byte b = 100; // smaller type
		int a = b; // bigger type

		Calculator calc = upcast; // smaller to bigger // Up-casting
		System.out.println("-----------------Parent Class Reference------------");
		calc.addition(100, 200); // overriding
		calc.subtraction(100, 200);
//		calc.modDivision(10, 3); // can not access, child class methods can not access
		// by parent class object

		int c = 100; // bigger type
		byte d = (byte) c; // smaller

		upcast = (UpcastingAndDowncasting) calc; // down-casting
		// here parent class reference can not directly assign to child reference

		Calculator calc2 = new UpcastingAndDowncasting(); // up-casting
		UpcastingAndDowncasting upcast2 = (UpcastingAndDowncasting) calc2; // down-casting

		Calculator calc3 = new Calculator();
//		UpcastingAndDowncasting upcast3 = (UpcastingAndDowncasting)calc3; // class cast error
//		upcast3.modDivision(10, 3);

		System.out.println("---------------------Static Override------------------------------");
		UpcastingAndDowncasting.addition(10, 20, 30);
		Calculator.addition(10, 20, 30); // static method we can not override

		UpcastingAndDowncasting.addition(10, 20, 30, 40);

	}

}
