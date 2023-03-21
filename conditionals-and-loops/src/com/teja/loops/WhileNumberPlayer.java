package com.teja.loops;

public class WhileNumberPlayer {
	int number;

	WhileNumberPlayer(int number) {
		this.number = number;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < number) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();

	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < number) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}
}
