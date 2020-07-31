package com.springjdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjdbc.entitys.Factura;

@Component
public class FacturaRepository {
	
	@Autowired
	DataSource dataSource;
	
	public void insertar(Factura factura) throws Exception {

		String sql = "insert into factura (numero, concepto, importe) values (?,?,?)";

		List<Factura> facturas = new ArrayList<Factura>();

		try (Connection connection = getConnection(); PreparedStatement sentencia = connection.prepareStatement(sql)) {
			sentencia.setInt(1, factura.getNumero());
			sentencia.setString(2, factura.getConcepto());
			sentencia.setDouble(3, factura.getImporte());
			sentencia.execute();
		} catch (Exception ex) {
			throw ex;
		}
	}

	public List<Factura> buscarTodas() throws Exception {
		String sql = "select * from factura";
		List<Factura> facturas = new ArrayList<Factura>();
		try(Connection connection = getConnection();
				PreparedStatement sentencia = connection.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()){
				
			while(rs.next()) {
				Factura f = new Factura();
				f.setNumero(Integer.parseInt(rs.getString("numero")));
				f.setConcepto(rs.getString("concepto"));
				f.setImporte(Double.parseDouble(rs.getString("importe")));
				facturas.add(f);
			}
			return facturas;
			}catch(Exception ex) {
				throw ex;
			}
	}

	private Connection getConnection() throws SQLException {
		Connection driver = dataSource.getConnection();
				return driver;
	}
}
