package com.aop;

import java.util.ArrayList;
import java.util.List;

public abstract class Factura {

	private String number;
	private String concepto;
	private double importe; 
	private List<LineaFactura> lineas = new ArrayList<LineaFactura>();
	
	
	public Factura() {
		super();
	}
	public Factura(String number, String concepto, double importe) {
		super();
		this.number = number;
		this.concepto = concepto;
		this.importe = importe;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	public List<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public abstract double importeTotal();
	
	
}
