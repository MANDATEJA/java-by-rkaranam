package com.teja.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber myNumber = new MyNumber(9);

		System.out.println(myNumber.isPrime());

		System.out.println(myNumber.sumUptoN());

		System.out.println(myNumber.sumOfDivisors());

		myNumber.printNumberTriangle();

	}

}
