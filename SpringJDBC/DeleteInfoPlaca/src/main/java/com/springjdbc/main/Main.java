package com.springjdbc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.config.ConfigurationSpring;
import com.springjdbc.entitys.Factura;
import com.springjdbc.service.ServiceMain;

public class Main {
public static void main(String[] args) throws Exception {
		
		try {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);
			ServiceMain sf = context.getBean(ServiceMain.class);
			sf.getDeleteEntity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
