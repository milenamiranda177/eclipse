package com.factory;

import com.springjdbc.entity.Factura;

public class Principal {

	public static void main(String[] args) {
		Factura f1 = FactoryFacturas.getInstance("IVA");
		f1.setConcepto("Ordenador");
		f1.setImporte(200);
		f1.setNumber("1");
		imprimir(f1);
	}
	
	public static void imprimir (Factura factura) {
		
		System.out.println("*****************");
		System.out.println(factura.importeTotal());
	}

}
