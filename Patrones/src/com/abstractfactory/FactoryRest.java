package com.abstractfactory;

public class FactoryRest implements AbstractFactory {

	@Override
	public Communication createLlamado() {
		return new CommunicationRest();
	}

}
