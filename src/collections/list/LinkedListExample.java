package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List linkedlist = new LinkedList();
		linkedlist.add(true);
		linkedlist.add(10);
		linkedlist.add(100);
		linkedlist.add('A');
		linkedlist.add(1000);
		linkedlist.add(10000);
		linkedlist.add(100.5F);
		linkedlist.add(100.5764E89D);
		linkedlist.add("Java");
		
		
		System.out.println(linkedlist);
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.size());
		System.out.println(linkedlist.contains(1000));
		System.out.println(linkedlist.remove(2));
		System.out.println(linkedlist);
		linkedlist.add(100);
		System.out.println(linkedlist);
		linkedlist.add(100);
		System.out.println(linkedlist);
		
		boolean b1 = (boolean)linkedlist.get(0); // by default all values are in Object type.
		System.out.println(b1);
		
		for(Object eachElement: linkedlist) {
			System.out.println(eachElement);
		}

	}

}
