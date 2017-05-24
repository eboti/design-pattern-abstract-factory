package com;

import com.ColorFactory.ColorType;

public class ShapeFactory extends AbstractFactory {

	public enum ShapeType {
		RECTANGLE, CIRCLE, SQUARE
	};

	@Override
	public Shape getShape(ShapeType shapeType) throws Exception {

		switch (shapeType) {
		case RECTANGLE:
			return new Rectangle();
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		default:
			throw new Exception("Unknown shape");
		}
	}

	@Override
	Color getColor(ColorType colorType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
