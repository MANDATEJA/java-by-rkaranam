package com.teja.oops;

public class Customer {
	// State
	//	Mandatory
	private String name;
	private Address homeAddress; // Object composition
	//	Optional
	private Address workAddress; // Object composition

	//	Constructor
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//	Methods
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("name - %s, home address - %s, work address - %s", name, homeAddress, workAddress);
	}
}
