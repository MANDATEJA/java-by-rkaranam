package exception.handling;

import java.util.Scanner;

public class TryWithResoucesRunner {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {

			int[] numbers = {1, 2, 3, 4};
			System.out.println(numbers[10]);
		}
		System.out.println("End of main method");
	}

}
