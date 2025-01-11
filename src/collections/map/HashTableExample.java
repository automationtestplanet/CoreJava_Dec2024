package collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map hashTable = new Hashtable();
		
		hashTable.put("Bananas", 50);
		hashTable.put(100, 50);		
		hashTable.put("Apples", 10);		
		hashTable.put("Carrots", 100);
//		hashTable.put("Dragon", null); // can not add null value
//		hashTable.put(null, 100);  // can no add nullkey
		
		
		System.out.println(hashTable);

	}

}
