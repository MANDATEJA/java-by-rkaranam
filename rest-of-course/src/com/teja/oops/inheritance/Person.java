package com.teja.oops.inheritance;

public class Person {
	private String name;
	private int age;
	private String gender;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("name: %s, age: %s, gender: %s", name, age, gender);
	}
}
