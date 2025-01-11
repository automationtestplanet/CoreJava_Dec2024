package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map linkedHashMap =  new LinkedHashMap();
		
		linkedHashMap.put("FirstName", "Raj");
		linkedHashMap.put("lastName", "Ch");
		linkedHashMap.put(10, 100);
		linkedHashMap.put('A', 'B');
		
		System.out.println(linkedHashMap);
		
		System.out.println(linkedHashMap.get("FirstName"));
		System.out.println(linkedHashMap.get('A'));
		System.out.println(linkedHashMap.get(10));
		
		System.out.println(linkedHashMap.containsKey("FirstName"));
		System.out.println(linkedHashMap.containsValue("Ch"));
		System.out.println(linkedHashMap.size());

	}

}
