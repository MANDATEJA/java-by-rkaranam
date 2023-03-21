package com.teja.oops;

import java.util.ArrayList;

public class Book {
	//	State
	private short id;
	private String name;
	private String author;

	private ArrayList<Review> reviews = new ArrayList<>();

	//	Constructor
	public Book(short id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	//	Methods
	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id - %s, name of book - %s, author - %s, review - [%s]", id, name, author, reviews);
	}
}
