package com.teja.oops;

public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);

		System.out.println(numbers.add());
		System.out.println(numbers.multiply());

		numbers.doubleNumbers();

		System.out.println(numbers.getNumberOne());
		System.out.println(numbers.getNumberTwo());
	}
}
