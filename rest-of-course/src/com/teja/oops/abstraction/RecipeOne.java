package com.teja.oops.abstraction;

public class RecipeOne extends Recipe {

	@Override
	public void setup() {
		System.out.println("Kitchen setup for recipe one complete");

	}

	@Override
	public void prepare() {
		System.out.println("Recipe one is prepared");

	}

	@Override
	public void cleanup() {
		System.out.println("Kitchen cleanup for recipe one complete");

	}

}
