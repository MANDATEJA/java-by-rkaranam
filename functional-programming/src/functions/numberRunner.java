package functions;

import java.util.List;

public class numberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 3, 45, 56, 84, 2);

		// int sum = numbers.stream().reduce(0, (subTotal, number) -> subTotal +
		// number);// sum of all numbers

		int sum = fpSum(numbers);

		System.out.println("Sum of numbers: " + sum);

	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 != 0).reduce(0, (subTotal, number) -> subTotal + number);
	}

}
