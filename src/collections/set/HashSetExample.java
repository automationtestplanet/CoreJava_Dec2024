package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set hashSet = new HashSet();
		hashSet.add(true);
		hashSet.add(10);
		hashSet.add(100);
		hashSet.add('A');
		hashSet.add(1000);
		hashSet.add(10000);
		hashSet.add(100.5F);
		hashSet.add(100.5764E89D);
		hashSet.add("Java");
		
		System.out.println(hashSet);
		hashSet.add(100);
		System.out.println(hashSet);
		
		
		
		System.out.println(hashSet.size());
		System.out.println(hashSet.contains(1000));
		System.out.println(hashSet.remove(100));  // value we need to pass
		System.out.println(hashSet);
		
		for(Object eachElement: hashSet) {
			System.out.println(eachElement);
		}
		
		Iterator hashSetItr = hashSet.iterator();
		System.out.println("--------------------------------------------------------");
		if(hashSetItr.hasNext()) {
			System.out.println(hashSetItr.next()); 
		}

	}

}
