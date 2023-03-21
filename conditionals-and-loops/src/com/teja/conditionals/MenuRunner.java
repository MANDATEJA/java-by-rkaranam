package com.teja.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter numberOne: ");
		int numberOne = scanner.nextInt();
		//		System.out.println("The first number you entered is: " + numberOne);

		System.out.print("Enter numberTwo: ");
		int numberTwo = scanner.nextInt();
		//		System.out.println("The second number you entered is: " + numberTwo);

		System.out.println("Choose operation you want to perform: \n1 - add\n2 - subtract\n3 - multiply\n4 - devide\n");
		int operationType = scanner.nextInt();
		scanner.close();

		//		performOperationUsingNestedIfElse(numberOne, numberTwo, operationType);
		performOperationUsingSwitch(numberOne, numberTwo, operationType);
	}

	private static void performOperationUsingNestedIfElse(int numberOne, int numberTwo, int operationType) {
		if (operationType == 1) {
			System.out.println("Result: " + (numberOne + numberTwo));
		} else if (operationType == 2) {
			System.out.println("Result: " + (numberOne - numberTwo));
		} else if (operationType == 3) {
			System.out.println("Result: " + (numberOne * numberTwo));
		} else if (operationType == 4) {
			System.out.println("Result: " + (numberOne / numberTwo));
		} else {
			System.out.println("Invalid operation");
		}
	}

	private static void performOperationUsingSwitch(int numberOne, int numberTwo, int operationType) {
		switch (operationType) {
		case 1:
			System.out.println("Result: " + (numberOne + numberTwo));
			break;
		case 2:
			System.out.println("Result: " + (numberOne - numberTwo));
			break;
		case 3:
			System.out.println("Result: " + (numberOne * numberTwo));
			break;
		case 4:
			System.out.println("Result: " + (numberOne / numberTwo));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

}
