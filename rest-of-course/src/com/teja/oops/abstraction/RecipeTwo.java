package com.teja.oops.abstraction;

public class RecipeTwo extends Recipe {

	@Override
	public void setup() {
		System.out.println("Kitchen setup for recipe two complete");

	}

	@Override
	public void prepare() {
		System.out.println("Recipe two is prepared");

	}

	@Override
	public void cleanup() {
		System.out.println("Kitchen cleanup for recipe two complete");

	}

}
