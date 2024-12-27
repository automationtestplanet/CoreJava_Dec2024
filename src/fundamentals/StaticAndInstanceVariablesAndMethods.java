package fundamentals;

public class StaticAndInstanceVariablesAndMethods {
	
	int a = 100;
	static int b = 200;
	
	void display1() {
		System.out.println(a);
		System.out.println(b);
		display2();
		
		int y = 400;
	}
	
	static void display2() {
//		System.out.println(a);  // can not access instance variables directly into static methods
		System.out.println(b);
//		display1();  // can not access instance methods directly into static methods;
		display2();
		
		int x = 300;
		
//		System.out.println(statcIns.a); // here statcIns is a local variable, we an not access 
//		statcIns.display1();
		
		StaticAndInstanceVariablesAndMethods statcIns1 = new StaticAndInstanceVariablesAndMethods();
		System.out.println(statcIns1.a); // here statcIns is a local variable, we an not access 
		statcIns1.display1();
	}

	public static void main(String[] args) {
//		System.out.println(a);  // can not access instance variables directly into static methods
		System.out.println(b);
//		display1();  // can not access instance methods directly into static methods;
		display2();
		
//		System.out.println(x);  //local variables
//		System.out.println(y); // local variables
		
		StaticAndInstanceVariablesAndMethods statcIns1 = new StaticAndInstanceVariablesAndMethods();
		
		System.out.println(statcIns1.a);
		statcIns1.display1();
		
		StaticAndInstanceVariablesAndMethods statcIns2 = new StaticAndInstanceVariablesAndMethods();
		
		StaticAndInstanceVariablesAndMethods statcIns3 = new StaticAndInstanceVariablesAndMethods();
		
		
	}

}
