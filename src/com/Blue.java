package com;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println(this.getClass().getSimpleName() + ", fill()");

	}

}
