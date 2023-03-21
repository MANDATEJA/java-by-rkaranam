package com.teja.oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//		GamingConsole game = new ChessGame();
		GamingConsole game = new MarioGame(); // Here the data type of the object game is of type
		// GamingConsole(interface) created from class MarioGame. This is also called
		// polymorphism
		game.up();
		game.down();
		game.right();

	}

}
