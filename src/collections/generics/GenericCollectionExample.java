package collections.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollectionExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
//		arrayList.add(true);
//		arrayList.add('A');
//		arrayList.add(100.5F);
//		arrayList.add("String");
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

//		String str = (str)arrayList.get(0);
		int int1 = arrayList.get(0);
		
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		

		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Apple");
//		hashSet.add(100);
//		hashSet.add(true);
//		hashSet.add('A');
		hashSet.add("Banana");
		hashSet.add("Carrot");
		Set<String> inkedHashSet= new LinkedHashSet<>();
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		hashMap.put("Apple", 10);
//		hashMap.put(100, 10);
//		hashMap.put("Banana", "100");
		hashMap.put("Banana", 100);
		hashMap.put("Carrot", 50);

		Set<Map.Entry<String, Integer>> allEntries = hashMap.entrySet();
		
		for(Map.Entry<String,Integer> eachEntry  :allEntries) {
			System.out.println(eachEntry.getKey() + " : "+eachEntry.getValue());
		}

	}

}
