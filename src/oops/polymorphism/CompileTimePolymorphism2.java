package oops.polymorphism;

public class CompileTimePolymorphism2 extends CompileTimePolymorphism {

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	public void addition(String a, String b, String c, String d) {
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism2 compPol2 = new CompileTimePolymorphism2();
		compPol2.addition(10, 20);
		compPol2.addition(10, 20,30);
		compPol2.addition(10, 20.5F);
		compPol2.addition(10.5F, 20);
		compPol2.addition(10.5F, 20.5F);
		compPol2.addition("Hello", "Java");
		compPol2.addition("Hello","This", "Java");
		compPol2.addition("Hello", 10);
		compPol2.addition(10, "Java");
		compPol2.addition('A', "Java");
		compPol2.addition("Hello", 'A');
		compPol2.addition(10, 20, 30, 40);
		compPol2.addition("Hello", "this", "is", "java");
	}

}
