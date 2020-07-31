package com.springjdbc.entitys;


import org.springframework.beans.factory.annotation.Autowired;

import com.springjdbc.util.ReadCsv;

public abstract class EntityDelete {

	@Autowired
	public ReadCsv rc;

	public String getRows() throws Exception {
		return rc.readCsv();
	}
	public abstract String deleteEntity()throws Exception ;
	
}
