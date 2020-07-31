package com.abstractfactory;

public class Gateway {
	
	private static final String REST = "rest";
	private static final String WSDL = "wsdl";

	public static Communication llamado(String typeCom) {
		
		switch (typeCom) {
		case REST:
			return new FactoryRest().createLlamado();
		case WSDL:
			return new FactoryWSDL().createLlamado();
		default:
			throw new IllegalArgumentException("No soporta esta comunicación " + typeCom);
		}
		 
		 		 
	}
}
