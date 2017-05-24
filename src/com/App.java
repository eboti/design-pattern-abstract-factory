package com;

import com.ColorFactory.ColorType;
import com.FactoryProducer.FactoryType;
import com.ShapeFactory.ShapeType;

public class App {

	public static void main(String[] args) throws Exception {
		
	      //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);

	      //get an object of Shape Circle
	      Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

	      //call draw method of Shape Circle
	      shape1.draw();

	      //get an object of Shape Rectangle
	      Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

	      //call draw method of Shape Rectangle
	      shape2.draw();
	      


	      //get color factory
	      AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);

	      //get an object of Color Red
	      Color color1 = colorFactory.getColor(ColorType.RED);

	      //call fill method of Red
	      color1.fill();

	      //get an object of Color Blue
	      Color color3 = colorFactory.getColor(ColorType.BLUE);

	      //call fill method of Color Blue
	      color3.fill();
	}

}
