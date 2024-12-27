package fundamentals;

public class ObjectAndVarUsage {

	public static void main(String[] args) {
		boolean bool1 = true;  // boolean bool2 = 100;
		byte byte1 = 100;     // byte byte2 = 100.5;
		short short1 = 1000;
		char char1 = 'A';
		int int1 = 10000;
		float float1 = 100.5F;
		long long1 = 100000;
		double double1 = 100.546E34D;
		String string1 = "Java";
		

		Object obj1 = true;
		Object obj2 = 100;    
		Object obj3 = 1000;
		Object obj4 = 'A';
		Object obj5 = 10000;
		Object obj6 = 100.5F;
		Object obj7 = 100000;
		Object obj8 = 100.546E34D;
		Object obj9 = "Java";
		
//		int int2 = obj2; // error
		
		var var1 = true;
		var var2 = 100;    
		var var3 = 1000;
		var var4 = 'A';
		var var5 = 10000;
		var var6 = 100.5F;
		var var7 = 100000;
		var var8 = 100.546E34D;
		var var9 = "Java";
		
		int int3 = var5; // here var is keyword, it just holds the value
		
		
		int intArr[] = {10,20,30,40};
		var varArr = intArr;
		
		Object[] objArr1 = {10,20,30,40};
		Object[] objArr2 = {true,100,1000,'A',10000,100.5,100000,100.45E54, "Java"};
		
	}

}
