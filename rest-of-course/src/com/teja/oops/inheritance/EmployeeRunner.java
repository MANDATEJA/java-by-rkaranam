package com.teja.oops.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee("Teja", "Software Developer", "TEKSystems", 'A', 95000);

		//		employee.setName("Teja");
		employee.setAge(26);

		System.out.println(employee); // This is same as System.out.println(employee.toString());
	}

}
