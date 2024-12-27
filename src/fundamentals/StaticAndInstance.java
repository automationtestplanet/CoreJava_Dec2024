package fundamentals;

public class StaticAndInstance {

	static int a = 100; // static
	int b = 200; // instance

	static void display1() { // static
		System.out.println(a);
	}

	void display2() { // instance
		System.out.println(b);
	}

	public static void main(String[] args) {

		System.out.println(a);
		display1();

		StaticAndInstance statIns = new StaticAndInstance();
		System.out.println(statIns.b);
		statIns.display2();
	}

}
