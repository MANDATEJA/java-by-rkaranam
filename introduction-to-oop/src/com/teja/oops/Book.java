package com.teja.oops;

public class Book {
	private int noOfCopies; // Member variable

//	Constructor method
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) { // local variable
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int copies) {
		setNoOfCopies(this.noOfCopies + copies);
	}

	public void decreaseNoOfCopies(int copies) {
		setNoOfCopies(this.noOfCopies - copies);
	}

	public int getNoOfCopies() {
		return this.noOfCopies;
	}

	void read() {
		System.out.println("completed reading book\n");
	}
}
