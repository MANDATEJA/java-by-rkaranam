package com.teja.oops.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Goes in hole");

	}

	@Override
	public void left() {
		System.out.println("pause the game");

	}

	@Override
	public void right() {
		System.out.println("Go forward");

	}

}
