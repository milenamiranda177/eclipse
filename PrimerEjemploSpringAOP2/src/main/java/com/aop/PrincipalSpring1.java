package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.configuration.ConfigurationSpring;
import com.servicio.Servicio;


public class PrincipalSpring1 {
	
	
	public static void main(String[] args) {
		
		//Inicializa el contexto
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		
		//Traigo el bean que relaciona la clase que quiero usar		
		Servicio servicio = context.getBean(Servicio.class);
		servicio.mensaje();			
	
	}
	
}
