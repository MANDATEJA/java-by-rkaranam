package com.teja.loops;

import java.util.Scanner;

public class PrintCubeUntilNegetiveRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println(num * num * num);
			System.out.print("Enter a number: ");
			num = scanner.nextInt();
		} while (num >= 0);

		scanner.close();
		System.out.println("Thank you! Have fun!");
	}
}
