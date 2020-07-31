package com.springjdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjdbc.entitys.Factura;
import com.springjdbc.repository.FacturaRepository;

@Service
public class ServiceCrud {
	
	//Repositorio para CRUD
	@Autowired
	private FacturaRepository fr;
	
	@Transactional
	public void insertarVarios(Factura f1, Factura f2) {
		fr.insertar(f1);
		fr.insertar(f2);
	}
	
	
	

}
