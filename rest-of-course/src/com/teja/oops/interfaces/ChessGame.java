package com.teja.oops.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move chess piece up");

	}

	@Override
	public void down() {
		System.out.println("Move chess piece Down");

	}

	@Override
	public void left() {
		System.out.println("Move chess piece left");

	}

	@Override
	public void right() {
		System.out.println("Move chess piece right");

	}
}
