package com.teja.api.c;

import java.util.List;

public class TypeInferencesRunner {
	public static void main(String[] args) {
		List<String> namesOne = List.of("John", "Jason");
		List<String> namesTwo = List.of("Billy", "Dan");

		// Data structure is complicated. Declaring type of variable becomes more difficult with growing complexity
		// List<List<String>> names = List.of(namesOne, namesTwo);

		// Using var to declare above variable
		var names = List.of(namesOne, namesTwo);
		// System.out.println(names);

		for(var nameN:names) {
			System.out.println(nameN);
		}
	}
}
