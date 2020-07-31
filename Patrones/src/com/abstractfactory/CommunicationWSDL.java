package com.abstractfactory;

public class CommunicationWSDL implements Communication {

	@Override
	public void enviarPeticion() {
		System.out.println("Solicitud enviada por Webservice");
		
	}

	@Override
	public void tenerRespuesta() {
		System.out.println("Recepción de respuesta de Webservices");
	}

}
