package functions;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {

	public static void print(Integer length) {
		System.out.println(length);
	}
	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cheetah", "Deer", "Elephant").stream().map(s -> s.length())
			.forEach(num -> System.out.println(num));



		System.out.println("\n");
		// Method reference implementation of above code
		// s -> s.length() can be replaced by String::length
		// num -> System.out.println(num) can be replaced by System.out::println
		List.of("Ant", "Bat", "Cheetah", "Deer", "Elephant").stream().map(String::length)
			// .forEach(System.out::println);
			.forEach(MethodReferencesRunner::print);

//		List.of(23, 45, 67).stream()
//			.filter(num -> num % 2 == 0)
//			.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);

		// Storing function in a variable
		Predicate<? super Integer> evenPredicate = evenNumber();
		Integer max = List.of(23, 45, 67, 34, 56).stream()
		.filter(evenPredicate)
		.max(Integer::compare).orElse(0);

		System.out.println("Max number: " + max);
	}

	// Function definition
	private static Predicate<? super Integer> evenNumber() {
		return num -> num % 2 == 0;
	}

}
