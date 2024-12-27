package fundamentals;

public class Constructor {

	int int1;
	float float1;
	long long1;
	double double1;
	char char1;
	boolean bool1;
	String string1;

	static byte byte1;
	static short short1;

	public Constructor() {
		int1 = 1000;
		float1 = 100.5F;
		long1 = 10000;
		double1 = 100.456E34D;
		char1 = 'A';
		bool1 = true;
		string1 = "Hello";

		byte1 = 10;
		short1 = 100;
	}

	void display() {
		System.out.println(Constructor.byte1);
		System.out.println(Constructor.short1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(char1);
		System.out.println(bool1);
		System.out.println(string1);
		
	}

	public Constructor(int byte1, int short1, int int1, float float1, long long1, double double1, char char1,
			boolean bool1, String string1) {
		
		Constructor.byte1 = (byte)byte1;
		Constructor.short1 = (short)short1;
		this.int1 = int1;
		this.float1 = float1;
		this.long1 = long1;
		this.double1 = double1;
		this.char1 = char1;
		this.bool1 = bool1;
		this.string1 = string1;
		
//		int c = 100;
//		c = c;		
//		byte1 = 100;
//		byte1 = byte1;
	}
	
	public static void displyStaticData() {
		System.out.println(byte1);
		System.out.println(short1);
	}

	public static void main(String[] args) {

		Constructor cons1 = new Constructor();
		Constructor cons2 = new Constructor();

//		cons1.display();
		System.out.println("----------------------------------------");
//		cons2.display();

		System.out.println("----------------------------------------");
		Constructor cons3 = new Constructor(100, 1000, 10000, 1000.5F, 100000, 1000.456E57D, 'B', true, "Java");
		cons3.display();
		
		System.out.println(byte1);
		System.out.println(short1);
		displyStaticData();
	}

}
