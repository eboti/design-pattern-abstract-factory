package com;

import com.ShapeFactory.ShapeType;

public class ColorFactory extends AbstractFactory {

	public enum ColorType {
		RED, BLUE
	};

	@Override
	Color getColor(ColorType colorType) throws Exception {

		switch (colorType) {
		case RED:
			return new Red();
		case BLUE:
			return new Blue();
		default:
			throw new Exception("Unknown shape");
		}
	}

	@Override
	Shape getShape(ShapeType shapeType) {
		return null;
	}
}
