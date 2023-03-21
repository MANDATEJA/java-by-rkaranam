package exception.handling;

import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

			int[] numbers = {1, 2, 3, 4};
			System.out.println(numbers[10]);
		} catch (Exception ex) {
			System.out.println("Caught Exception");
			ex.printStackTrace();
		} finally {
			System.out.println("Inside finally block");
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("End of main method");
	}

}
