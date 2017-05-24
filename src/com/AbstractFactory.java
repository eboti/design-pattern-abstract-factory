package com;

import com.ColorFactory.ColorType;
import com.ShapeFactory.ShapeType;

public abstract class AbstractFactory {
	
	abstract Color getColor(ColorType colorType) throws Exception;
	abstract Shape getShape(ShapeType shapeType) throws Exception;
}
