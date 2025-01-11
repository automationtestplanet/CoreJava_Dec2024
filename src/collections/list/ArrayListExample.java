package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List arraylist = new ArrayList();
		arraylist.add(true);
		arraylist.add(10);
		arraylist.add(100);
		arraylist.add('A');
		arraylist.add(1000);
		arraylist.add(10000);
		arraylist.add(100.5F);
		arraylist.add(100.5764E89D);
		arraylist.add("Java");
		
		System.out.println(arraylist);
		System.out.println(arraylist.get(0));
		System.out.println(arraylist.size());
		System.out.println(arraylist.contains(1000));
		System.out.println(arraylist.remove(2)); // index of element we need to pass
		System.out.println(arraylist);
		arraylist.add(100);
		System.out.println(arraylist);
		arraylist.add(100);
		System.out.println(arraylist);
		
		boolean b1 = (boolean)arraylist.get(0); // by default all values are in Object type.
		System.out.println(b1);
		
		for(Object eachElement: arraylist) {
			System.out.println(eachElement);
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println(arraylist.get(arraylist.size()-3));
		
		String str = (String)arraylist.get(arraylist.size()-3);
		System.out.println(str);
		
		int int1 = (int)arraylist.get(arraylist.size()-3);
		System.out.println(int1);
		
	}

}
