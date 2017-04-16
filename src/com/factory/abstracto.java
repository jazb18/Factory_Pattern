package com.factory;

public abstract class abstracto {
	
	public abstract factory getAreas();

	public static abstracto factory(int area) {

		switch (area) {

		case 1:
			return new factoryProducerLogistica();
		case 2:
			return new factoryProducerVentas();

		default:
			return null;
		}

	}
}
