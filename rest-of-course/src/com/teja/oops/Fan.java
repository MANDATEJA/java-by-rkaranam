package com.teja.oops;

public class Fan {
	// State
	// Mandatory - included in constructor
	private String make;
	private double radius;
	private String color;
	// Optional - not included in constructor
	private boolean isOn;
	private byte speed; // 0 to 5

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		this.setSpeed((byte) 2);
	}

	public void switchOff() {
		this.isOn = false;
		this.setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	//	Print state of object
	@Override
	public String toString() {
		return String.format("Make - %s, raidus - %f, color - %s, is on - %b, speed - %d", make, radius, color, isOn,
				speed);
	}
}
