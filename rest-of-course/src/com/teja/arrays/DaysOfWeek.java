package com.teja.arrays;

public class DaysOfWeek {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Saturday" };
		String dayWithMostChars = "";

		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostChars.length()) {
				dayWithMostChars = day;
			}
		}

		System.out.println(dayWithMostChars);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
