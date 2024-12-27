package fundamentals;

public class Datatypes {

	public static void main(String[] args) {
		
		byte byte1 = 100;
		
		System.out.println(byte1);
		System.out.println(byte1*10);
		
		byte byte2;  // declaration
		byte2 = 100; // Initialization
		
		byte byte3 = 127; // rage  -127 to +127
//		byte byte4 = 128; // rage  -127 to +127
		
		short short1 = 128;
		short short2 = 32767;
//		short short3 = 32768;  // -32768 to +32767
		
		int int1 = 32768;
		int int2 = 3276890;
//		int int3 = 3276890987;  // error
		
		long long1 = 3276890987L;
		long long2 = 3276890987l;
		
		float float1 = 10.5F;
		float float2 = 10.5f;
		
		double double1 = 100.366E34D;
		double double2 = 100.366E34d;
		
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '$';
		char char4 = '9'; // it takes as ASCII code
		
		System.out.println(char4);
		System.out.println(char4*10);
		
		
		String string1 = "ABC";
		String string2 = "abc";
		String string3 = "ABCabc";
		String string4 = "ABCabc1234";
		String string5 = "ABCabc#%$^";
		String string6 = "ABCabc1234$&*#^";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a == b); 
		
		boolean bool1 = a == b;
		
		System.out.println(bool1);
		
		
		
		char ch1 = 'A';
		int i1 = ch1;
		
		System.out.println("i1: "+i1);
		
		int i2 = 100;
		char ch2 = (char)i2;
		
		System.out.println("ch2: "+ch2);
		
	}

}
