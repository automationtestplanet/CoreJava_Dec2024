package oops.abstraction.functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {

	public static <T> void main(String[] args) {

//		Function
//		BiFunction
//		Predicate
//		Consumer
//		Supplier
		System.out.println("---------------------------Function--------------------------");
		Function<Integer, Integer> function1 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer value1) {
				return value1 + 100;
			}
		};

		Function<Integer, Integer> function2 = (a) -> a + 100;
		System.out.println(function2.apply(100));

		System.out.println("---------------------------Bi-Function--------------------------");
		BiFunction<Integer, String, String> bifunction1 = new BiFunction<Integer, String, String>() {
			@Override
			public String apply(Integer val1, String val2) {
				return "Hello";
			}
		};
		System.out.println(bifunction1.apply(100, "Java"));

		BiFunction<Integer, String, String> bifunction2 = (a, b) -> "Hello";
		System.out.println(bifunction2.apply(100, "Java"));

		System.out.println("---------------------------Predicate--------------------------");
		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer value) {
				return value > 100;
			}
		};

		System.out.println(predicate1.test(90));
		System.out.println(predicate1.test(101));

		Predicate<String> predicate2 = (a) -> a.equals("Hello");
		System.out.println(predicate2.test("Java"));
		System.out.println(predicate2.test("Hello"));

		System.out.println("---------------------------Consumer--------------------------");
		Consumer<Integer> consumer1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		};

		consumer1.accept(100);

		Consumer<String> consumer2 = (a) -> System.out.println(a);
		consumer2.accept("Java");

		System.out.println("---------------------------Supplier--------------------------");
		Supplier<Integer> supplier1 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 100;
			}
		};

		System.out.println(supplier1.get());

		Supplier<String> supplier2 = () -> "Hello";
		System.out.println(supplier2.get());
		
		
		System.out.println("---------------------------Binary Operator--------------------------");		
		BinaryOperator<Integer> binaryOperator1 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer val1, Integer val2) {				
				return val1+val2;
			}
		};
		
		System.out.println(binaryOperator1.apply(100,200));
		
		BinaryOperator<Integer> binaryOperator2 = (val1,val2)-> val1+val2;
		System.out.println(binaryOperator2.apply(100, 200));
	}

}
