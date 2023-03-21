package com.teja.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	//	private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	// Student(String name, int[] marks) {
	Student(String name, int... marks) { // Accepting variable arguments
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfSubjects() {
		return this.marks.size();
	}

	public int getSumofMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxMark() {
		return Collections.max(marks);
	}

	public int getMinMark() {
		return Collections.min(marks);
	}

	public BigDecimal getAverageOfMarks() {
		int sum = this.getSumofMarks();
		int totalSubjects = this.getNumberOfSubjects();
		return new BigDecimal(sum).divide(new BigDecimal(totalSubjects), 2, RoundingMode.UP); // .divide(number,
		// precision,
		// roundingmode);
	}


	@Override
	public String toString() {
		return name + marks;
	}

	public void addMark(int mark) {
		this.marks.add(mark);
	}

	public void removeMark(int mark) {
		if (this.marks.indexOf(mark) >= 0) {
			this.marks.remove(this.marks.indexOf(mark));
		}
		//		System.out.println(this.marks.indexOf(mark) > 0);
	}

}
