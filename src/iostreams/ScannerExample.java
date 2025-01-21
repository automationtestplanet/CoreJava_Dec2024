package iostreams;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer value");
		int int1 = sc.nextInt();
		
		System.out.println("Enter Boolean value");
		boolean bool = sc.nextBoolean();
		
		System.out.println("Enter Float value");
		float float1 = sc.nextFloat();
		
		System.out.println("Enter String value");
		String str1 = sc.next();

		System.out.println(int1);
		System.out.println(bool);
		System.out.println(float1);
		System.out.println(str1);

	}

}
