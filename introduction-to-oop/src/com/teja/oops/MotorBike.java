package com.teja.oops;

public class MotorBike {
	// State
	// Creating a variable as private will make it not accessible outside of the
	// class, this passes encapsulation concept
	private int speed; // member variable

	// No argument c onstructor method
	MotorBike() {
		this(5);// This code line calls below Constructor method
	}

	//	Constructor method
	MotorBike(int speed) {
		this.speed = speed;
	}

	// Behavior
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int speed) {
		setSpeed(this.speed + speed);
	}

	public void decreaseSpeed(int speed) {
		setSpeed(this.speed - speed);
	}

	void start() {
		System.out.print("Bike started\n");
	}
}
