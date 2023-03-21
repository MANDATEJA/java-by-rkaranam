package com.teja.api.c;

public class StringNewApiRunner {
	public static void main(String[] args) {
		System.out.println("  ".isBlank());
		System.out.println(" LR ".strip());
		System.out.println(" LR ".stripLeading());
		System.out.println(" LR ".stripTrailing());

		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));

		System.out.println("My name is %s, age: %d".formatted("Teja", 26));
	}
}
