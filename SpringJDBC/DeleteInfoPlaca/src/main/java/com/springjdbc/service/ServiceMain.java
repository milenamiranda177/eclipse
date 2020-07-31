package com.springjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.springjdbc.entitys.EntityDelete;
import com.springjdbc.entitys.FactoryEntity;
@Service
public class ServiceMain {
	
	//Fábrica de tipos de borrado
	private FactoryEntity fe;
	
	@Autowired
	public void setFe(FactoryEntity fe) {
		this.fe = fe;
	}

	@Value("${porPlaca}")
	Boolean porPlaca;
	@Value("${porUsuario}")
	Boolean porUsuario;
		
	public void getDeleteEntity() throws Exception {
		EntityDelete ed = fe.getInstance(porUsuario, porPlaca);
		ed.deleteEntity();
	}	

}
