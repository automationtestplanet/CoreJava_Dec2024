package fundamentals;

public class LoopsExamples {

	public static void printMultiplicationTable(int tableNo) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableNo + " X " + i + " = " + (tableNo * i));
		}
	}

	public static void main(String[] args) {
		printMultiplicationTable(555);
	}

}
