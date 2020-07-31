package com.springjdbc.main;

import java.util.List;

import com.springjdbc.entitys.Factura;
import com.springjdbc.repository.FacturaRepository;

public class PrincipalJDBCSelect {

	public static void main(String[] args) throws Exception {
		
		try {
			FacturaRepository fr = new FacturaRepository();
			List<Factura> facturas = fr.buscarTodas();
			for(Factura factura: facturas) {
				System.out.println(factura.getImporte());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
