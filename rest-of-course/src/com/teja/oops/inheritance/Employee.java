package com.teja.oops.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private char employeeGrade;
	private int salary;

	public Employee(String name, String title, String employer, char employeeGrade, int salary) {
		super(name);
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	// We are calling super.methodName to get the info from super class
	public String toString() {
		return String.format("%s, title: %s, Employer: %s, Grade: %s", super.toString(),
				title, employer, employeeGrade);
	}
}
