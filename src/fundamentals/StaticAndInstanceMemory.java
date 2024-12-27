package fundamentals;

public class StaticAndInstanceMemory {

	int a = 100;
	static int b = 200;

	void display1() {
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}

	static void display2() {
		System.out.println("B: "+b);

	}

	public static void main(String[] args) {
		System.out.println("----------------------Static Data---------------------");
		System.out.println(b);
		display2();
		
		StaticAndInstanceMemory insData1 = new StaticAndInstanceMemory();
		System.out.println("----------------------Static and Instance Data with Object1---------------------");
		System.out.println(insData1.a);
		System.out.println(insData1.b);
		insData1.display1();
		insData1.display2();
		
		
		StaticAndInstanceMemory insData2 = new StaticAndInstanceMemory();
		System.out.println("----------------------Static and Instance Data with Object2---------------------");
		insData2.a = 300;
		insData2.b = 400;
		insData2.display1();
		
		System.out.println("----------------------Static and Instance Data with Object1---------------------");
		insData1.display1();
	}

}
