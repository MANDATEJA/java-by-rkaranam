package com.teja.oops;

public class CustomerRunner {

	public static void main(String[] args) {
		//		Address homeAddress = new Address("2214 Pierce Ave", "Bloom", "61761");
		//		Customer customer = new Customer("John", homeAddress);

		Customer customer = new Customer("John", new Address("2214 Pierce Ave", "Bloom", "61761"));
		customer.setWorkAddress(new Address("3 SF Plaza South", "Bloom", "67105"));

		System.out.println(customer);
	}

}
