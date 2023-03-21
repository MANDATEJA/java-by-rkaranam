package com.teja.oops;

public class BiNumber {
	private int numberOne;
	private int numberTwo;

	BiNumber(int numberOne, int numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int add() {
		return this.numberOne + this.numberTwo;
	}

	public int multiply() {
		return this.numberOne * this.numberTwo;
	}

	public void doubleNumbers() {
		this.numberOne *= 2;
		this.numberTwo *= 2;
	}
}
