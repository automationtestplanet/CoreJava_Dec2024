package oops.polymorphism;

public class CompileTimePolymorphism {

	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b);
	}
	
	public void addition(int a, float b) {
		System.out.println(a+b);
	}
	
	public void addition(float a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(float a, float b) {
		System.out.println(a+b);
	}
	
	public void addition(String a, String b) {
		System.out.println(a+b);
	}
	
	public void addition(String a, String b, String c) {
		System.out.println(a+b+c);
	}
	
	public void addition(String a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(int a, String b) {
		System.out.println(a+b);
	}
	
	public void addition(char a, String b) {
		System.out.println(a+b);
	}
	
	public void addition(String a, char b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism compPol = new CompileTimePolymorphism();
		compPol.addition(10, 20);
		compPol.addition(10, 20,30);
		compPol.addition(10, 20.5F);
		compPol.addition(10.5F, 20);
		compPol.addition(10.5F, 20.5F);
		compPol.addition("Hello", "Java");
		compPol.addition("Hello","This", "Java");
		compPol.addition("Hello", 10);
		compPol.addition(10, "Java");
		compPol.addition('A', "Java");
		compPol.addition("Hello", 'A');
		
	}

}
