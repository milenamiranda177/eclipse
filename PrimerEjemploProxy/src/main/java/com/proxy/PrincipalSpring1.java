package com.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springjdbc.entitys.Factura;


public class PrincipalSpring1 {
	
	
	public static void main(String[] args) {
		
		//Inicializa el contexto
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		
		//Traigo el bean que relaciona la clase que quiero usar		
		Factura factura = context.getBean(FacturaConIva.class);
		
		imprimir(factura);
			
	
	}
	
	public static void imprimir (Factura factura) {
		
		System.out.println("*****************");
		System.out.println(factura.getNumber());
		System.out.println(factura.importeTotal());
	}
}
