package com;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println(this.getClass().getSimpleName());

	}

}
