package collections.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);

		for (int eachValue : list1) {
			System.out.print(eachValue + " ");
		}
		System.out.println();

		list1.forEach(eachValue -> System.out.print(eachValue + " "));
		System.out.println();

		for (int eachValue : list1) {
			if (eachValue % 2 != 0)
				System.out.print(eachValue + " ");
		}
		System.out.println();

		list1.stream().filter(eachValue -> eachValue % 2 != 0).forEach(eachValue -> System.out.print(eachValue + " "));
		System.out.println();

		list1.stream().filter(eachVal -> eachVal % 2 == 0).forEach(eachValue -> System.out.print(eachValue + " "));
		System.out.println();

		list1.stream().map(eachValue -> eachValue * 5).forEach(eachValue -> System.out.print(eachValue + " "));
		System.out.println();

		System.out.println(list1.stream().reduce(0, (val1, val2) -> val1 + val2));
		
		String str = "I Love India";
		
		System.out.println(Arrays.stream(str.split(" "))
				.map(eachValue -> new StringBuilder(eachValue).reverse().toString())
				.collect(Collectors.joining(" ")));
	}

}
