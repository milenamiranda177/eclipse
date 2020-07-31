package com.springjdbc.entitys;

import org.springframework.stereotype.Component;

@Component
public class UsuarioDelete extends EntityDelete {

	
	@Override
	public String deleteEntity()throws Exception  {
		System.out.println("Borra los usuarios");
		System.out.println(getRows());
		return null;
	}

}
