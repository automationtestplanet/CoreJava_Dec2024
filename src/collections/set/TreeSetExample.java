package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set treeSet = new TreeSet();
		treeSet.add(40);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);
		treeSet.add(20);

		System.out.println(treeSet);

		Set treeSet2 = new TreeSet();

		treeSet2.add("Banana");
		treeSet2.add("Apple");
		treeSet2.add("Carrot");

		System.out.println(treeSet2);

		Set treeSet3 = new TreeSet();
		treeSet3.add('H');
		treeSet3.add('A');
		treeSet3.add('C');
		treeSet3.add('F');
		treeSet3.add('B');
		treeSet3.add('E');
		treeSet3.add('G');

		System.out.println(treeSet3);
	}

}
