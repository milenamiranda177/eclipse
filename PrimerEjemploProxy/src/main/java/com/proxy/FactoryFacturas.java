package com.proxy;

import com.springjdbc.entitys.Factura;

public class FactoryFacturas {

	
	public static Factura getInstance(String tipo) {
		if (tipo.equals("IVA")) {
			return new FacturaConIva();
		} else {
			return new FacturaConIva();
		}
	}
}
