package fundamentals;

public class InterviewQuestions {

	// Write a program to Swap two numbers using third variables
	public static void swapTwoNumbersWithThirdVariable(int a, int b) {
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
	}

	// Write a program to Swap two numbers without using third variables
	public static void swapTwoNumbersWithoutThirdVariable(int a, int b) {
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
		a = a + b; // a = 300;
		b = a - b; // b = 300-200 = 100;
		a = a - b; // a = 300 - 100 = 200;
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
	}

	// Write a program to Swap two strings without using third variables
	public static void swapTwoStringsWithoutThirdVariable(String str1, String str2) {
		System.out.println("Str1 value: " + str1);
		System.out.println("Str2 value: " + str2);
		str1 = str1 + str2; // HelloJava
		str2 = str1.replaceAll(str2, ""); // Hello
		str1 = str1.replaceAll(str2, ""); // Java
		System.out.println("Str1 value: " + str1);
		System.out.println("Str2 value: " + str2);
	}

	// Write a program to to check whether the number is prime or not
	public static void checkNumberPrimeOrNot(int number) {
		int count = 0;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(number + " is Prime");
		} else {
			System.out.println(number + " is not Prime");
		}
	}

	// Write a program to check whether the number is Palindrome or not
	// 454 -> 454, 121 -> 121
	public static void checkNumberPalindromeOrNot(int number) {
		int actualNum = number;
		int revNum = 0;
		while (number > 0) {
			int remainder = number % 10; // 4 5 4
			revNum = (revNum * 10) + remainder; // 4 45 454
			number = number / 10; // 45 4 0
		}
		if (actualNum == revNum) {
			System.out.println(actualNum + " is Palindrome");
		} else {
			System.out.println(actualNum + " is not Palindrome");
		}
	}

	// Write a program to check whether the number is Armstrong number o not
	// 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
	public static void checkNumberArmstrongOrNot(int number) {
		int actualNum = number;
		int revNum = 0;
		while (number > 0) {
			int remainder = number % 10; // 3 5 1
			revNum = revNum + (remainder * remainder * remainder); // 27 152 153
			number = number / 10; // 15 1 0
		}
		if (actualNum == revNum) {
			System.out.println(actualNum + " is Armstrong number");
		} else {
			System.out.println(actualNum + " is not Armstrong number");
		}
	}

	// Write a program to print given string in a reverse order
	public static void printStringReverse(String str) {
		String revStr = "";
//		for(int i=str.length()-1; i>=0; i--) {
//			revStr = revStr + str.charAt(i);
//		}	
		for (char eachChar : str.toCharArray()) { // olleH
			revStr = eachChar + revStr;
		}
		System.out.println(revStr);
	}

	// Write a program to check whether the String is Palindrome or not
	public static void checkStringPalindromeOrNot(String str) {
		String revStr = "";
//		for(int i=str.length()-1; i>=0; i--) {
//			revStr = revStr + str.charAt(i);
//		}
		for (char eachChar : str.toCharArray()) { // olleH
			revStr = eachChar + revStr;
		}
		if (revStr.equals(str)) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
	}

	// Write a program to print fibonacci series
	// 0,1, 1, 2, 3, 5, 8, 13, 21
	public static void printFiboacciSeries() {
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b + " ");
			int c = b;
			b = a + b;
			a = c;
		}
		System.out.println("");
	}

	// Write a program to sort integer array in ascending Order
	public static void sortAnArrayInAscendingOrder(int[] intArr) {
		// 5,1,3,4,2 -> 1,2,3,4,5
		// 1,3,4,2,5
		// 1,2,4,3,5
		// 1,2,,3,4,5
		for (int eachNumber : intArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		for (int eachNumber : intArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
	}

	// Write a program to sort integer array in ascending Order
	public static void sortAnArrayInDescendingOrder(int[] intArr) {
		for (int eachNumber : intArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
		for (int eachNumber : intArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
	}

	// Write a program to sort character array
	public static void sortCharArrayInAscendingOrder(char[] charArr) {
		// 5,1,3,4,2 -> 1,2,3,4,5
		// 1,3,4,2,5
		// 1,2,4,3,5
		// 1,2,,3,4,5
		for (char eachNumber : charArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if ((int) charArr[i] > (int) charArr[j]) {
					char temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		for (char eachNumber : charArr) {
			System.out.print(eachNumber + " ");
		}
		System.out.println();
	}

	// Write a program to print Right Pyramid Pattern
	public static void printRightPyramid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	// Write a program to print Right Pyramid Pattern
	public static void printReverseRightPyramid() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	// Write a program to print left Pyramid Pattern
	public static void printLeftPyramid() {
		int num = 5;
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= num; k++) {
				System.out.print(" ");
			}
			num--;

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	// Write a program to print reverse left Pyramid Pattern
	public static void printReverseLeftPyramid() {
		int num = 1;
		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= num; k++) {
				System.out.print(" ");
			}
			num++;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	// Write a program to print Full Pyramid Pattern
	public static void printFullPyramid() {
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= num; k++) {
				System.out.print(" ");
			}
			num--;

			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}

	// Write a program to print reverse Pyramid Pattern
	public static void printReverseFullPyramid() {
		int num = 1;
		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= num; k++) {
				System.out.print(" ");
			}
			num++;
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

	// Write a program to print unique characters from string
	// Ex: str = "hello" -> helo
	public static void printUniqueCharacters(String str) {
		while(str.length() > 0) {		
			System.out.print(str.charAt(0));
			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}
		System.out.println();

	}

	// Write a program to print non-repeting characters from a string
	// Ex: str = "hello" -> heo
	public static void printNonRepeatingCharacters(String str) {
		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println();

	}

	// Write a program to print repeating characters from a string
	// ex: str = "hello" -> l
	public static void printRepeatingCharacters(String str) {
		for (char ch : str.toCharArray()) {
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
		System.out.println();

	}

	// Write a program to print each character count from a string
	// ex: str = "hello" -> h-1, e-1, l-2, o-1
	public static void printEachCharacterCountCharacters(String str) {
		while(str.length() > 0) {			
			char char1 = str.charAt(0);
			int count = 0;
			
			for(char char2 : str.toCharArray()) {
				if(char1 == char2 ) {
					count++;
				}
			}
			System.out.println(char1+" : "+count);
			str = str.replaceAll(String.valueOf(char1), "");
		}
	}
	

	// Write program to extract numbers from a string and make the sum
	// ex: str = "hello15967java%#^#" -> 15967 -> 1 + 5 + 9 + 6 + 7 = 28
	public static void extractNumbersFromStringAndMakeSum(String str) {
		
		int num = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		int sum = 0;
		while(num > 0) {			
			sum = sum + (num %10);
			num = num /10;			
		}
		System.out.println(sum);
	}
	

	// Write a program to print Vowels and consonants count from the string
	// Ex: str = "hello" -> eo - 2, hll-3
	public static void printVowelsAndConsonantsCount(String str) {
		
		int vowelsCnt = 0;
		int consonantsCnt = 0;
		String vowelStr = "";
		String consonantStr = "";
		
		for(char eachChar : str.toCharArray()) {
			if("aeiou".contains(String.valueOf(eachChar))) {
				vowelsCnt++;
				vowelStr = vowelStr + eachChar;
			}else {
				consonantsCnt++;
				consonantStr = consonantStr + eachChar;
			}
		}
		
		System.out.println(vowelStr+" : "+ vowelsCnt);
		System.out.println(consonantStr+" : "+ consonantsCnt);
	}
	

	// write a program to print sum of all numbers from array
	// Ex: {3,2,5,4,1} -> 3+2+5+4+1 = 15;
	public static void printSumOfNumbersFrmArra(int[] intArr) {
		int sum = 0;
		for(int eachNum : intArr) {
			sum +=eachNum;
		}
		System.out.println(sum);
	}

	// Wirte a program to print sum of all digits until a single number
	// ex: a = 657849 -> 6+5+7+8+4+9 = 39 -> 3 +9 = 12 -> 1+2 = 3
	public static void printSumOfNumbersUptoSungleDigit(int num) {
		int sum=0;;
		String numStr = String.valueOf(num);
		while(numStr.length() > 1) {
			sum = 0;
			for(char eachChar : numStr.toCharArray()) {
				sum = sum + (eachChar -'0');
			}
			numStr = String.valueOf(sum);
		}		
		System.out.println(sum);
	}

	public static void main(String[] args) {

		System.out.println("-------------Swap two numbers using third variables----------------");
		swapTwoNumbersWithThirdVariable(100, 200);

		System.out.println("-------------Swap two numbers without using third variables----------------");
		swapTwoNumbersWithoutThirdVariable(100, 200);

		System.out.println("-------------Swap two strings without using third variables ----------------");
		swapTwoStringsWithoutThirdVariable("Hello", "Java");

		System.out.println("-------------Swap two strings without using third variables ----------------");
		checkNumberPrimeOrNot(1245678);

		System.out.println("-------------check whether the number is Palindrome or not ----------------");
		checkNumberPalindromeOrNot(123321);

		System.out.println("-------------check whether the number is Armstrong or not ----------------");
		checkNumberArmstrongOrNot(153);

		System.out.println("-------------Print String in Reverse Order ----------------");
		printStringReverse("Hello");

		System.out.println("-------------Check String in Palindrome or Not ----------------");
		checkStringPalindromeOrNot("malayalam");

		System.out.println("-------------Print Fibonacci Series ----------------");
		printFiboacciSeries();

		System.out.println("-------------Sort an Array in Ascending Order----------------");
		int[] intArr = { 5, 1, 3, 4, 2 };
		sortAnArrayInAscendingOrder(intArr);

		System.out.println("-------------Sort an Array in Descending Order----------------");
		int[] intArr2 = { 10, 6, 8, 9, 7 };
		sortAnArrayInDescendingOrder(intArr2);
		
		System.out.println("-------------Sort an Char Array in ascending Order----------------");
		String str = "java";
		sortCharArrayInAscendingOrder(str.toCharArray());
		
		System.out.println("-------------Print Right Pyramid----------------");
		printRightPyramid();
		
		System.out.println("-------------Print Left Pyramid----------------");
		printLeftPyramid();
		
		System.out.println("-------------Print Reverse Right Pyramid----------------");
		printReverseRightPyramid();
		
		System.out.println("-------------Print Reverse Left Pyramid----------------");
		printReverseLeftPyramid();
		
		System.out.println("-------------Print Full Pyramid----------------");
		printFullPyramid();
		
		System.out.println("-------------Print Reverse Full Pyramid----------------");
		printReverseFullPyramid();
		
		System.out.println("-------------Print Unique chracters from string----------------");
		printUniqueCharacters("hello");
		
		System.out.println("-------------Print Non-repeating chracters from string----------------");
		printNonRepeatingCharacters("hello");
		
		System.out.println("-------------Print repeating chracters from string----------------");
		printRepeatingCharacters("hello");
		
		System.out.println("-------------Print each chracter count----------------");
		printEachCharacterCountCharacters("hello");
		
		System.out.println("-------------extract Numbers From String And Make Sum----------------");
		extractNumbersFromStringAndMakeSum("hello15967java%#^#");
		
		System.out.println("-------------print Vowels And Consonants Count from the string----------------");
		printVowelsAndConsonantsCount("hello");
		
		System.out.println("-------------print Sum of numbers from Array----------------");
		int[] intArr4 = {3,2,5,4,1};
		printSumOfNumbersFrmArra(intArr4);
		
		System.out.println("-------------print Sum of digits untila sigle digit----------------");
		printSumOfNumbersUptoSungleDigit(657849);
	}

}
