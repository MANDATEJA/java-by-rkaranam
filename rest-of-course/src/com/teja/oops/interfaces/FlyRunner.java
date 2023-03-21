package com.teja.oops.interfaces;

public class FlyRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };

		for (Flyable fly : flyingObjects) {
			fly.fly();
		}
	}

}
