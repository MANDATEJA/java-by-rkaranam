package tips;

import java.util.Arrays;

enum Season {
	WINTER(2), SPRING(1), SUMMER(3), FALL(4);

	private int value;

	public int getValue() {
		return value;
	}

	private Season(int value) {
		this.value = value;
	}
}

public class EnumRunner {
	public static void main(String[] args) {
		Season season = Season.WINTER; // Assigning an enum
		Season seasonTwo = Season.valueOf("SPRING"); // Assigning an enum
		System.out.println(seasonTwo);
		System.out.println(Season.SUMMER.ordinal()); // Printing order of the enum

		System.out.println(Season.SPRING.getValue());

		System.out.println(Arrays.toString(Season.values())); // Accessing all values in enum
	}
}
