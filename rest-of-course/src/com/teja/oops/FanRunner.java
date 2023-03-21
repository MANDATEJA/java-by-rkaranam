package com.teja.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Usha", 0.345, "Beige");

		System.out.println(fan);

		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);
	}

}
