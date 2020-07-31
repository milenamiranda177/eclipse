package com.servicio;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Esta es la clase Proxy para usarla junto con el Servicio, para esto
//Debe estar en el mismo paquete
@Aspect
@Component
public class AspectLog {

	@Before("execution (* mensaje())")
	public void log() {
		System.out.println("El método mensaje se va a invocar");
	}
}
