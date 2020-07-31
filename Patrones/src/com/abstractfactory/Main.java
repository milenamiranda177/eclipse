package com.abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		Communication rest = Gateway.llamado("rest");
		Communication wsdl = Gateway.llamado("wsdl");
		
		rest.tenerRespuesta();
		wsdl.tenerRespuesta();
	}
}
