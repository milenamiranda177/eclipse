package com.spring1;

public class PrincipalSpring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f = FactoryFacturas.getInstance("IVA");
		Persona p = FactoryPersona.getInstance();
		f.setConcepto("Ordenador");
		f.setImporte(200);
		f.setNumber("5656");
		p.setFactura(f);
		
		System.out.println(p.getFactura().getConcepto());
	}

}
