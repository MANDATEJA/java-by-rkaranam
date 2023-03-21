package com.teja.oops;

public class Review {
	//	State
	private short id;
	private String message;
	private byte rating;

	//	Constructor
	public Review(short id, String message, byte rating) {
		this.id = id;
		this.message = message;
		this.rating = rating;
	}

	//	Methods
	@Override
	public String toString() {
		return String.format("%s, %s, %s", id, message, rating);
	}
}
