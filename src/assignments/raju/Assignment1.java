package assignments.raju;

public class Assignment1 {
	
	//Write a reusable program to print Even and odd numbers count from an array 
	public static void printOddAndEvenNumersCountFromArray(int[] intArr) {
		int evenCount = 0;
		int oddCount = 0;
		
		for(int eachNum:intArr) {
			if(eachNum %2 ==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("Even Numbers Count: "+ evenCount);
		System.out.println("Odd Numbers Count: "+ oddCount);
	}

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		printOddAndEvenNumersCountFromArray(intArr);

	}

}
