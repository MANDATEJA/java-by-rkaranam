package com.teja.api.records;

public class RecordsRunner {
	record Person(String name, String email, String phoneNumber) {
		// Instance variable not allowed like below
		// int number = 6;
		// Compact constructor
		// Assignments of fields is done in background
		Person {
			if (name == null) {
				throw new IllegalArgumentException("name is null");
			}
		}

		// Overriding default method that was created in background
		public String name() {
			System.out.println("Implement some logic here");
			return name;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Teja", "teja@email.com", "123-456-7890");
		System.out.println(person);
		System.out.println(person.name());

		Person personTwo = new Person("Teja", "teja@email.com", "123-456-7890");
		Person personThree = new Person("Tejareddy", "teja@email.com", "123-456-7890");
		System.out.println(person.equals(personTwo));
		System.out.println(personTwo.equals(personThree));
	}
}
