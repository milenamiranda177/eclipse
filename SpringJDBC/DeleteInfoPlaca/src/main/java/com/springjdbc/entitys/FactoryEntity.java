package com.springjdbc.entitys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryEntity {
	
	@Autowired
	UsuarioDelete ud;
	@Autowired
	PlacaDelete pd;
	
	public EntityDelete getInstance(Boolean porUsuario, Boolean porPlaca) {
		if (porUsuario) {
			return ud;
		} else if(porPlaca) {
			return pd;
		}else {
			throw new IllegalArgumentException("No se detectó tipo de borrado" );
		}
		
	}
}
