package oops.abstraction;

import calculator.AccessCalculator;

public class ImplementNewCalculator extends AccessCalculator implements NewCalculator{

	
	int a=0;
	int b = a+2;
	@Override
	public int modDivision(int a, int b) {
		return a/b;
	}

	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(str);
	}
}
