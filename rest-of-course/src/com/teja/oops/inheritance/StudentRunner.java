package com.teja.oops.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Teja", "VIT");

		//		student.setName("Teja");
		student.setAge(26);
		student.setClassOf(2016);
		//		student.setCollege("VIT");

		System.out.println(student.getName());

	}

}
