package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PrincipalSpring5 {
public static void main(String[] args) {
		
		//Inicializa el contexto
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		//Traigo el bean que relaciona la clase que quiero usar		
		Persona persona = context.getBean(Persona.class);
		
		imprimirP(persona);
			
	
	}
	public static void imprimirP (Persona persona) {
		
		System.out.println("*****************Factura de ");
		System.out.println(persona.getNombre() + " Tipo Factura " + persona.getFactura().getConcepto());
		System.out.println("*****************Lineas ");
		for(LineaFactura linea: persona.getFactura().getLineas()) {
			System.out.println("*****************Linea " + linea.getNumero());
		}
	}
}
