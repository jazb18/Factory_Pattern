package com.factory;

public class factoryProducerVentas extends abstracto {

	@Override
	public com.factory.factory getAreas() {
		return new ventas();
	}

}
