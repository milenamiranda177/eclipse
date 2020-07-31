package com.abstractfactory;

public class FactoryWSDL implements AbstractFactory{

	@Override
	public Communication createLlamado() {
		return new CommunicationWSDL();
	}
	
}
