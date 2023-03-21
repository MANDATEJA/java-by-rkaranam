package com.teja.oops;

public class MyChar {
	char myChar;

	MyChar(char myChar) {
		this.myChar = myChar;
	}

	public boolean isVowel() {
		if (this.myChar == 'a' || this.myChar == 'e' || this.myChar == 'i' || this.myChar == 'o' || this.myChar == 'u'
				|| this.myChar == 'A' || this.myChar == 'E' || this.myChar == 'I' || this.myChar == 'O'
				|| this.myChar == 'U') {
			return true;
		}
		return false;
	}

	// Using ASCII code char for numbers to determine if a char is a number
	public boolean isNumber() {
		if (this.myChar >= 48 && this.myChar <= 57) {
			return true;
		}
		return false;
	}

	// Using ASCII code char for alphabets to determine if a char is a alphabet
	public boolean isAlphabet() {
		if (this.myChar >= 65 && this.myChar <= 90 || this.myChar >= 97 && this.myChar <= 122) {
			return true;
		}
		return false;
	}

	public boolean isConsonent() {
		return isAlphabet() && !isVowel();
	}

	public static void printLowerCaseAlphabets() {
		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i);
		}
	}

	public static void printUpperCaseAlphabets() {
		//		String upperCaseAlphabets;
		for (int i = 65; i <= 90; i++) {
			System.out.println((char) i);
		}
	}
}
