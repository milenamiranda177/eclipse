package com.springjdbc.repository;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.springjdbc.entity.Factura;

public class FacturaRepository {

	
	public void insertar(Factura factura) {
		String sql = "insert into factura values (?,?,?)";
		List<Factura> lista = new ArrayList<Factura>();
		
		try(Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql)){
			sentencia.setString(1, factura.getConcepto());
			sentencia.setDouble(2, factura.getImporte());
			sentencia.setInt(3, factura.getNumero());
			sentencia.execute();
		} catch(Exception ex) {
			throw ex;
		}
		
		
		
	}
}
