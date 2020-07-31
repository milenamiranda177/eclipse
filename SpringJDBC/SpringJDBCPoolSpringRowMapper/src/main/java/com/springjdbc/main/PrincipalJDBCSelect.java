package com.springjdbc.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.ConfigurationSpring;
import com.springjdbc.entitys.Factura;
import com.springjdbc.repository.FacturaRepository;

public class PrincipalJDBCSelect {

	public static void main(String[] args) throws Exception {
		
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
			FacturaRepository fr = context.getBean(FacturaRepository.class);
			
			List<Factura> facturas = fr.buscarTodas();
			for(Factura factura: facturas) {
				System.out.println(factura.getImporte());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
