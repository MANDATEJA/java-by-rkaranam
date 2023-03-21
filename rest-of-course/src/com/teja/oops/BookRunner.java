package com.teja.oops;


public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book((short) 123, "Object Orinted Programming with Java", "Teja");
		book.addReview(new Review((short) 10, "Great book", (byte) 5));
		//		System.out.println(book);

		book.addReview(new Review((short) 101, "Concepts well explained", (byte) 5));
		System.out.println(book);
	}

}
