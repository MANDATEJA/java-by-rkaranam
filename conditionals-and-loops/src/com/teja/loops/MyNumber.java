package com.teja.loops;

public class MyNumber {
	int number;

	MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// Formula: 2 to n-1
		if (this.number < 2) {
			return false;
		}

		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= this.number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		if (this.number < 3) {
			return 0;
		}

		int sum = 0;
		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		String numberTriangle = "";
		for (int i = 1; i <= this.number; i++) {
			for (int j = 1; j <= i; j++) {
				//				System.out.print();
				numberTriangle += j + " ";
			}
			numberTriangle += '\n';
		}

		System.out.println(numberTriangle);
	}
}
