package com.teja.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Teja");
		names.add("Mounica");
		names.add("Gowthami");
		names.add("Ganavi");

		List<String> copyOfNames = List.copyOf(names); // copyOf method creates an immutable list of names and returns it
		names.add("Parijatha");
		System.out.println(names);

		doSomething(copyOfNames);
		System.out.println(names);
	}

	private static void doSomething(List<String> names) {
		names.add("Parijatha");

	}
}
