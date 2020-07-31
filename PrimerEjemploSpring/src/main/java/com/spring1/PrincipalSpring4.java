package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PrincipalSpring4 {

public static void main(String[] args) {
		
		//Inicializa el contexto
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		//Traigo el bean que relaciona la clase que quiero usar		
		Factura factura = context.getBean(FacturaConIva.class);
		Persona persona = context.getBean(Persona.class);
		LineaFactura linea1 = context.getBean(LineaFactura.class);
		LineaFactura linea2 = context.getBean(LineaFactura.class);
		
		imprimirP(persona);
			
	
	}
	
	public static void imprimir (Factura factura) {
		
		System.out.println("*****************");
		System.out.println(factura.getNumber());
		System.out.println(factura.importeTotal());
	}
	public static void imprimirP (Persona persona) {
		
		System.out.println("*****************Factura de ");
		System.out.println(persona.getNombre() + " Tipo Factura " + persona.getFactura().getConcepto());
	}

}
