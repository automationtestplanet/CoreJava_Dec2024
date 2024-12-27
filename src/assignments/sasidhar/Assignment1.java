package assignments.sasidhar;

import java.util.Scanner;

// Write a program to reverse a string without reversing the special characters position
	// Input: "ab@cde%fg"
	// Output: "gf@edc%ba"

public class Assignment1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string: "); 
		String Input = scn.nextLine();
		scn.close();
		System.out.print("INPUT ="+Input+"\n"); 
		String Output = reverseString(Input);
		System.out.println("OUTPUT ="+Output);
	}
	public static String reverseString(String Input) {
		char[] Characters = Input.toCharArray();
		
		int L= 0;
		int R= Characters.length - 1;
		
		while(L<R) {
			if(!Character.isLetterOrDigit(Characters[L])) {
				L++;
			} else if(!Character.isLetterOrDigit(Characters[R])){
				R--;
			}
			else {
				char temp = Characters[L];
				Characters[L] = Characters[R];
				Characters[R] = temp;
				L++;
                R--;
			}
		}
		return new String(Characters);
	}

}

