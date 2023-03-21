package functions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Implementing Predicate manually to understand functional interfaces
class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

// Manual implementation of forEach Consumer Interface
class ForEachConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println("Even number: " + number);
	}

}

public class FunctionalInterfaceRunner {

	public static void main(String[] args) {
		//		List.of(12, 23, 34, 45, 56, 67, 78).stream().filter(num -> num % 2 == 0)
		//		.forEach(number -> System.out.println(number));

		// Implementing above code manually by calling the new EvenNumberPredicate() to
		// understand funcitonal interfaces
		// When we call .filter(num -> num % 2 == 0) -> behind the scenes this gets
		// implemented: filter(new EvenNumberPredicate())
		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);
		List.of(12, 23, 34, 45, 56, 67, 78).stream().filter(new EvenNumberPredicate())
		.forEach(number -> System.out.println(number));

		// Implementing forEach() stream() method manually using ForEachConsumer class
		List.of(12, 23, 34, 45, 56, 67, 78).stream().filter(new EvenNumberPredicate()).forEach(new ForEachConsumer());
	}

}
