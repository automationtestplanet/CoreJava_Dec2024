package fundamentals;

public class TypeConversions {
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public static float division(int a, int b) {
		return a/b;
	}
	
	public static long multiplication(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		byte byte1 = 100;
		
		short short1 = byte1;   // Smaller <-> Big  -> Implicit Conversion
		
		System.out.println(short1);
		
		short short2= 100;
		
		byte byte2 = (byte)short2;   // Bigger <-> Small  -> Explicit Conversion
		
		System.out.println(byte2);
		
		short short3 = 1000;
		
		byte byte3 = (byte)short3;   // -128 to +127
		
		System.out.println(byte3);
		
		byte byte4 = (byte)129;
		System.out.println(byte4);
		
		
		
		int int1 = 10000;
		float float1 = int1;  // Equals memory size - > no issue
		System.out.println(float1);
		
		float float2 = 10.5F;
		int int2 = (int)float2;   // There is loss of data 
		
		System.out.println(int2);
		
		
		long long1 = 1000000000000L;
		double double1 = long1;
		System.out.println(double1);
		
		double double2 = 100.567E65D;
		long long2 = (long)double2; // loss of data
		System.out.println(long2);
		
		
		
		byte b1 = (byte) addition(20, 30);  // it returns integer
		
		int i1 = (int) division(b1, 3);  // it returns float
		
		long l1 = multiplication(i1, 10000000);
		
		System.out.println(l1);
		
		System.out.println(multiplication((int) division((byte) addition(20, 30), 3), 10000000));
		
		
		String str1 = "100";
		System.out.println(str1);
		
//		int integer1 = (int)str1; // implicit conversion and explicit conversion are not working.
//		
//		int integer2 = 100;
//		
//		String str2 = (String)integer2; // implicit conversion and explicit conversion are not working.
		
		
		
		
		
	}

}
