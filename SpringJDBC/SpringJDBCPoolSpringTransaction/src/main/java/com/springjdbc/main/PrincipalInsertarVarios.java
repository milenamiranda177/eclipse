package com.springjdbc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.ConfigurationSpring;
import com.springjdbc.entitys.Factura;
import com.springjdbc.service.ServiceFactura;

public class PrincipalInsertarVarios {

public static void main(String[] args) throws Exception {
		
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
			ServiceFactura sf = context.getBean(ServiceFactura.class);
			Factura factura = new Factura(4, "Ropa", 200);
			Factura factura2 = new Factura(6, "Ganchos", 400);
			sf.insertarVarios(factura, factura2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
