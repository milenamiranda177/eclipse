package com.springjdbc.entitys;

import org.springframework.stereotype.Component;

@Component
public class PlacaDelete extends EntityDelete{

	@Override
	public String deleteEntity() throws Exception {
		System.out.println("Se va a borrar una placa");
		System.out.println(getRows());
		return null;
	}

}
