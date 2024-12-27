package fundamentals;

public class ArrayExample {

	public static void main(String[] args) {
		
		System.out.println("----------------- 1D Array ------------------");
		
		int intArr1[] = {10,20,30,40,50};
		int[] intArr2 = {10,20,30,40,50};		
		intArr1 = intArr2;
		
		System.out.println(intArr1);
		
		System.out.println(intArr1[0]);
		System.out.println(intArr1[1]);
		System.out.println(intArr1[2]);
		System.out.println(intArr1[3]);
		System.out.println(intArr1[4]);
		
		intArr1[3] = 60;
		System.out.println(intArr1[3]);
		
		System.out.println(intArr1.length);
		
		for(int index = 0; index < intArr1.length; index++) {
			System.out.println(intArr1[index]);
		}
		
//		System.out.println(intArr1[5]);
		
		System.out.println("Program completed");
		
		for(int eachValue : intArr1) {
			System.out.println(eachValue);
		}
		
		
		int a;		
		a = 100;
		
		int[] intArr3 = new int[4];
		
		intArr3[0] = 100;
		intArr3[1] = 200;
		intArr3[2] = 300;
		intArr3[3] = 400;
		
		for(int eachNumber :intArr3) {
			System.out.println(eachNumber);
		}
		
		
		System.out.println("----------------- 2D Array ------------------");
		
		int[] arr1 = {10,20,30};
		int[] arr2 = {100,200,300};
		int[] arr3 = {1000,2000,3000};
		
		int[][] D2Arr1 = {arr1, arr2, arr3};
		int[][] D2Arr2 = {{10,20,30}, {100,200,300}, {1000,2000,3000}}; 
		
		
		System.out.println(D2Arr2[0][0]);
		System.out.println(D2Arr2[1][0]);
		System.out.println(D2Arr2[2][0]);
		
		for(int index = 0; index<D2Arr2.length; index++) {
			int[] eachArray = D2Arr2[index];			
			for(int i=0; i< eachArray.length; i++) {
				System.out.println(eachArray[i]);
			}
		}
		
		for(int[] eachArray : D2Arr2) {					
			for(int eachValue : eachArray) {
				System.out.println(eachValue);
			}
		}
		
		for(int i = 0; i<D2Arr2.length; i++) {					
			for(int j=0; j< D2Arr2[i].length; j++) {
				System.out.println(D2Arr2[i][j]);
			}
		}
		
		System.out.println("------------------------------------------------------");
		for(int i = 0; i<D2Arr2.length; i++) {					
			for(int j=0; j< D2Arr2[i].length; j++) {
				System.out.print(D2Arr2[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("------------------------------------------------------");
		for(int i = 0; i<D2Arr2.length; i++) {					
			for(int j=0; j< D2Arr2[i].length; j++) {
				System.out.print(D2Arr2[j][i] + " ");
			}
			System.out.println("");
		}
	}

}
