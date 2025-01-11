package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set linkedhashSet = new LinkedHashSet();
		linkedhashSet.add(true);
		linkedhashSet.add(10);
		linkedhashSet.add(100);
		linkedhashSet.add('A');
		linkedhashSet.add(1000);
		linkedhashSet.add(10000);
		linkedhashSet.add(100.5F);
		linkedhashSet.add(100.5764E89D);
		linkedhashSet.add("Java");
		
		System.out.println(linkedhashSet);
		linkedhashSet.add(100);
		System.out.println(linkedhashSet);
		
		System.out.println(linkedhashSet.size());
		System.out.println(linkedhashSet.contains(1000));
		System.out.println(linkedhashSet.remove(100));  // value we need to pass
		System.out.println(linkedhashSet);
		
		for(Object eachElement: linkedhashSet) {
			System.out.println(eachElement);
		}

	}

}
