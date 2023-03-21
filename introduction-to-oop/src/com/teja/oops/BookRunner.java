package com.teja.oops;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1200);
		Book cleanCode = new Book(1011);

		artOfComputerProgramming.read();
		effectiveJava.setNoOfCopies(16);
		cleanCode.setNoOfCopies(21);

		artOfComputerProgramming.increaseNoOfCopies(24);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}
}
