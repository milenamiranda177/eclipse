package com.springjdbc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.ConfigurationSpring;
import com.springjdbc.entitys.Factura;
import com.springjdbc.repository.FacturaRepository;

public class PrincipalJDBC {

	public static void main(String[] args) throws Exception {
		
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
			FacturaRepository fr = context.getBean(FacturaRepository.class);
			Factura factura = new Factura(1, "Mouse", 200);
			fr.insertar(factura);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
