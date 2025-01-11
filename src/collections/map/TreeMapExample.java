package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map treeMap = new TreeMap();
		
		treeMap.put("Bananas", 50);
//		treeMap.put(100, 50);		
		treeMap.put("Apples", 10);		
		treeMap.put("Carrots", 100);
		treeMap.put("Dragon", null);
				
		System.out.println(treeMap);

	}

}
