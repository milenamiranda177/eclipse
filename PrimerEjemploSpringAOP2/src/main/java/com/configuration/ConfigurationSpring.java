package com.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
//Esta activa la inserción de Componentes o Beans desde otra clase
@ComponentScan("com.servicio")
//Esta activa la programación orientada a aspectos
@EnableAspectJAutoProxy
public class ConfigurationSpring {

	
}
