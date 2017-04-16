package com.factory;

public class factoryProducerLogistica extends abstracto{

	@Override
	public com.factory.factory getAreas() {
		return new logistica();
	}

}
