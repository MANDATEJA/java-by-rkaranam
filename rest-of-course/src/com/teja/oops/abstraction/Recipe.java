package com.teja.oops.abstraction;

public abstract class Recipe {
	public void makeRecipe() {
		setup();
		prepare();
		cleanup();
	}

	public abstract void setup();

	public abstract void prepare();

	public abstract void cleanup();
}
