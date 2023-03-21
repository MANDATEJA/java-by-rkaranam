package com.teja.oops;

public class Rectangle {
	private int length;
	private int width;

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return String.format("Length - %d, width - %d, area - %d, perimeter - %d", length, width, area(), perimeter());
	}
}
