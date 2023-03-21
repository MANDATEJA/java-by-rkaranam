package com.teja.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(60);
		MotorBike honda = new MotorBike(60);

		MotorBike triumph = new MotorBike();

		// Not calling the class without any constructor parameters will call the
		// default constructor
		System.out.println(triumph.getSpeed());

		ducati.start();
		honda.start();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		//		ducati.increaseSpeed(100);
		//		honda.increaseSpeed(100);
		//		ducati.start();
		//		honda.start();
		//
		//		System.out.println(ducati.getSpeed());
		//		System.out.println(honda.getSpeed());
		//
		//		ducati.decreaseSpeed(100);
		//		honda.decreaseSpeed(50);
		//		ducati.start();
		//		honda.start();
		//
		//
		//		System.out.println(ducati.getSpeed());
		//		System.out.println(honda.getSpeed());
		//
		//		ducati.decreaseSpeed(100);
		//		System.out.println(ducati.getSpeed());
		//
		//		ducati.start();
		//		honda.start();
	}
}
