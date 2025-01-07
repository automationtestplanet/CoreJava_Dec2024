package oops.abstraction.functional.interfaces;

public class AccessFunctionalInterfaces {

	public static void main(String[] args) {
		
		FunctionalInterface1 fun1 = (a,b)-> System.out.println(a+b);
		fun1.addition(100, 200);		
		
		FunctionalInterface2 fun2 = ()-> System.out.println(100);
		fun2.addition();
		
		FunctionalInterface3 fun3 = (a,b)-> {return a+b;};
		System.out.println(fun3.addition(1000, 2000));
		
		FunctionalInterface3 fun3_3 = (a,b)-> a+b;
		System.out.println(fun3_3.addition(1000, 2000));
		
		FunctionalInterface4 fun4 = () -> 200;
		System.out.println(fun4.addition());
		
		FunctionalInterface5 fun5 = (a)-> a;
		System.out.println(fun5.addition(300));
		
		FunctionalInterface5 fun5_5 = a-> a;
		System.out.println(fun5_5.addition(300));
		
		FunctionalInterface6 fun6 = (a)-> System.out.println(a);
		fun6.addition(400);
		
		FunctionalInterface6 fun6_6 = a-> System.out.println(a);
		fun6_6.addition(400);

	}

}
