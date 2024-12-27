package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {
		 int int1 = 100;   // int is a keyword
		 Integer int2 = 100;  // Integer is a class, it contains methods
		 
//		 String str1 = int1;   // primitive to no-primitive assignment is not possible.
		 String str2 = "100";		 
//		 int int3 = str2;   // non-primitive to primitive not possible
		 
		 int int3 = Integer.parseInt(str2); 
		 
		 
		 int int4 = int2;  // non-primitive to primitive 
		 Integer int5 = int4;  // primitive to non-primitve
		 
		 byte byte1 = 100;
		 Byte byte2 = byte1;
		 byte byte3 = byte2;
		 
//		 byte byte4 = str2;
		 byte byte4 = Byte.parseByte(str2);
		 
		 String str3 = "true";
		 System.out.println(Boolean.parseBoolean(str3));
		 
		 String str4 = "Hello";
		 System.out.println(Boolean.parseBoolean(str4));
		 
		 String str5 = "Hundred";
		 
//		int int6 =  Integer.parseInt(str5); // Error
		 

	}

}
