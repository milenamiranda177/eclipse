package com.aop;


class FacturaConIva extends Factura{

	
	
	public FacturaConIva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaConIva(String number, String concepto, double importe) {
		super(number, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeTotal() {
		
		return this.getImporte() * 0.019;
	}

	
	
}
