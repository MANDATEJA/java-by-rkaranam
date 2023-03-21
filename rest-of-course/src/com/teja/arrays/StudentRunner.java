package com.teja.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		//		Student student = new Student("Teja", new int[] { 85, 97, 92, 79, 82, 88 }); // Passing arguments inline
		Student student = new Student("Teja", 85, 97, 92, 79, 82, 88); // Variable arguments
		int number = student.getNumberOfSubjects();
		System.out.println("Number of subjects: " + number);
		int sum = student.getSumofMarks();
		System.out.println("Sum of marks: " + sum);
		int maxMark = student.getMaxMark();
		System.out.println("Max of marks: " + maxMark);
		int minMark = student.getMinMark();
		System.out.println("Min of marks: " + minMark);

		BigDecimal averageOfMarks = student.getAverageOfMarks();
		System.out.println("Average of marks: " + averageOfMarks);

		student.addMark(78);
		System.out.println(student);

		student.removeMark(79);
		System.out.println(student);
	}

}
