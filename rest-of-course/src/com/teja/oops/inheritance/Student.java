package com.teja.oops.inheritance;

public class Student extends Person {
	private String college;
	private int classOf;

	// Since the constructor of super class Person requires name, we are calling the
	// super constructor with name
	public Student(String name, String college) {
		super(name);
		this.college = college;
	}

	public String getCollege() {
		return college;
	}

	public int getClassOf() {
		return classOf;
	}

	public void setClassOf(int classOf) {
		this.classOf = classOf;
	}

}
