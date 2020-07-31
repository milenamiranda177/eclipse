package com.springjdbc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.ConfigurationSpring;
import com.springjdbc.entitys.Factura;
import com.springjdbc.repository.FacturaRepository;

public class PrincipalJDBCBorrar {

	public static void main(String[] args) throws Exception {
		
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
			FacturaRepository fr = context.getBean(FacturaRepository.class);
			Factura factura = new Factura(1);
			fr.borrar(factura);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
