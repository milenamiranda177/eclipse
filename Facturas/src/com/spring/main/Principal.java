package com.spring.main;

import com.factory.FactoryFacturas;
import com.factory.Factura;

public class Principal {

	public static void main(String[] args) {
		Factura f1 = FactoryFacturas.getInstance("IVA");
		Factura f2 = FactoryFacturas.getInstance("SinIVA");
		f1.setConcepto("Ordenador");
		f1.setImporte(200);
		f1.setNumber("1");
		
		f2.setConcepto("Mouse");
		f2.setImporte(250);
		f2.setNumber("2");
		imprimir(f1);
		imprimir(f2);
	}
	
	public static void imprimir (Factura factura) {
		
		System.out.println("*****************");
		System.out.println(factura.importeTotal());
	}

}
