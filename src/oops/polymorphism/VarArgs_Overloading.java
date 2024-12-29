package oops.polymorphism;

public class VarArgs_Overloading {

//	public void addition(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public void addition(int a, int b, int c) {
//		System.out.println(a + b + c);
//	}
//
//	public void addition(int a, int b, int c, int d) {
//		System.out.println(a + b + c + d);
//	}
//
//	public void addition(int a, int b, int c, int d, int e) {
//		System.out.println(a + b + c + d + e);
//	}
	
	public void addition(int ...a) {
		int sum = 0;
		for(int eachNum:a) {
			sum += eachNum;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		VarArgs_Overloading varArgs = new VarArgs_Overloading();
		varArgs.addition(10, 20);
		varArgs.addition(10, 20, 30);
		varArgs.addition(10, 20, 30, 40);
		varArgs.addition(10, 20, 30, 40, 50);
		varArgs.addition(10, 20, 30, 40, 50,60);
		varArgs.addition(10, 20, 30, 40, 50,60,70);
		varArgs.addition(10, 20, 30, 40, 50,60,70,80);
		varArgs.addition(10, 20, 30, 40, 50,60,70,80,90);
		varArgs.addition(10, 20, 30, 40, 50,60,70,80,90,100);
		
	}

}
