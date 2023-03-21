package com.teja.oops;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('b');

		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());

		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());

		//		myChar.printLowerCaseAlphabets();
		//		myChar.printUpperCaseAlphabets();
	}

}
