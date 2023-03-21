package com.teja.oops;

public class Address {
	//	State
	private String lineOne;
	private String city;
	private String zip;

	// Constructor
	public Address(String lineOne, String city, String zip) {
		super();
		this.lineOne = lineOne;
		this.city = city;
		this.zip = zip;
	}

	// Methods
	@Override
	public String toString() {
		return String.format("%s, %s, %s", lineOne, city, zip);
	}
}
