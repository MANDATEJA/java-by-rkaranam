package com.teja.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 34, 45, 56, 67);

//		Predicate<Integer> evenNumberPredicte = n -> n % 2 == 0;
//		numbers.stream().filter(evenNumberPredicte.negate()).forEach(System.out::println);

		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println); // Using predicate.not() method to print off numbers

	}

}
