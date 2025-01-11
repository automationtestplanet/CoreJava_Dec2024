package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map hashMap =  new HashMap();
		
		hashMap.put("FirstName", "Raj");   
		hashMap.put("lastName", "Ch");
		hashMap.put(10, 100);
		hashMap.put('A', 'B');
		hashMap.put(null, null);
		hashMap.put(null, 100);
		hashMap.put(100, null);
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get("FirstName"));
		System.out.println(hashMap.get('A'));
		System.out.println(hashMap.get(10));
		
		System.out.println(hashMap.containsKey("FirstName"));
		System.out.println(hashMap.containsValue("Ch"));
		System.out.println(hashMap.size());
		
		Set entrySet =  hashMap.entrySet();
		
		for(Object eachEntry: entrySet) {
			System.out.println(eachEntry);
		}
		

	}

}
