package fundamentals;

public class StringOperations {

	public static void main(String[] args) {
		
		String str1 = "Java";
		
		String str2 = new String("Java");
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.length());
		
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(3));
		
		System.out.println(str1.indexOf("J"));
		System.out.println(str1.indexOf("v"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		
		System.out.println(str1.contains("Ja"));
		System.out.println(str1.contains("aa"));
		
		System.out.println(str1.replace("a", "b"));
		System.out.println(str1.replaceFirst("a", "b"));
		System.out.println(str1.replaceAll("a", "b"));  // we can pass regular expression in replaceALl method
		
		String str3 = "Hello1234%&*$@(#JAVA";
		System.out.println(str3.replaceAll("[^A-Z]", ""));
		System.out.println(str3.replaceAll("[^a-z]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
		System.out.println(str3.replaceAll("[a-zA-Z]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str3.replaceAll("[^0-9]", ""));
		System.out.println(str3.replaceAll("[a-zA-Z0-9]", ""));
		
		
		String str4 = "Hello Java";
		
		System.out.println(str4.substring(0,5));
		System.out.println(str4.substring(6,10));
		System.out.println(str4.substring(6));
		
		System.out.println(str4.startsWith("Hello"));
		System.out.println(str4.endsWith("Java"));
		System.out.println(str4.contains("Java"));
		
		String[] strArr1 = str4.split(" ");
		
		for(String eachStr:strArr1) {
			System.out.println(eachStr);
		}
		
		char[] chars = str4.toCharArray();
		for(char eachChar:chars) {
			System.out.println(eachChar);
		}
		
		
		byte[] byteArr = str4.getBytes();
		
		for(byte eachByte:byteArr) {
			System.out.println(eachByte);
		}		
		
		System.out.println(new String(byteArr));
		
		int int1 = 100;
		boolean bool = true;
		
		String str5 = String.valueOf(int1);
		String str6 = String.valueOf(bool);
		
		String str7 = "Hello";
		
		System.out.println(str7.concat("World"));
		System.out.println(str7.equals("Hello"));
		System.out.println(str7.equals("hello"));
		System.out.println(str7.equalsIgnoreCase("hello"));
		System.out.println(str7.equalsIgnoreCase("HELLO"));
		
		String string1 = "Java";  // it stores into String constant pool
		String string2 = "Java";
		String string3 = new String("Java"); // it stores into Heap memory
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		
		System.out.println(string1 == string2);
		System.out.println(string1 == string3);   // It compares the memories
		System.out.println(string1.equals(string3));  // it compares the values
		System.out.println(string1 == string3.intern()); // temporarily it will bring the string from heap memory to string constant pool
		
	}

}
