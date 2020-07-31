package com.aop;


class FacturaSinIva extends Factura{

	
	public FacturaSinIva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaSinIva(String number, String concepto, double importe) {
		super(number, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeTotal() {
		
		return this.getImporte();
	}

	
	
}
