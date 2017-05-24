package com;

public class FactoryProducer {

	public enum FactoryType {
		COLOR, SHAPE
	};

	public static AbstractFactory getFactory(FactoryType factoryType)
			throws Exception {

		switch (factoryType) {
		case COLOR:
			return new ColorFactory();
		case SHAPE:
			return new ShapeFactory();
		default:
			throw new Exception("Unknown factory");
		}
	}
}
