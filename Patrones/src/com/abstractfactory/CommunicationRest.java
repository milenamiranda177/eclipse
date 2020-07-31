package com.abstractfactory;

public class CommunicationRest implements Communication{

	@Override
	public void enviarPeticion() {
		System.out.println("Solicitud enviada por RestFUll");
		
	}

	@Override
	public void tenerRespuesta() {
		System.out.println("Recepción de respuesta de RestFull");
	}

}
