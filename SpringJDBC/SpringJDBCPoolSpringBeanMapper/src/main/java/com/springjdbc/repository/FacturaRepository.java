package com.springjdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.entitys.Factura;

@Component
public class FacturaRepository {
	
	@Autowired
	JdbcTemplate plantillaFactura;
	
	public void insertar(Factura factura) throws Exception {

		String sql = "insert into factura (numero, concepto, importe) values (?,?,?)";

		//Se reemplaza este código
//		List<Factura> facturas = new ArrayList<Factura>();
//
//		try (Connection connection = getConnection(); PreparedStatement sentencia = connection.prepareStatement(sql)) {
//			sentencia.setInt(1, factura.getNumero());
//			sentencia.setString(2, factura.getConcepto());
//			sentencia.setDouble(3, factura.getImporte());
//			sentencia.execute();
//		} catch (Exception ex) {
//			throw ex;
//		}
		
		plantillaFactura.update(sql, factura.getNumero(), factura.getConcepto(), factura.getImporte());
	}

	public List<Factura> buscarTodas() {
		String sql = "select * from factura";
		
		//Se elimina este código y se reemplaza 
//		List<Factura> facturas = new ArrayList<Factura>();
//		try(Connection connection = getConnection();
//				PreparedStatement sentencia = connection.prepareStatement(sql);
//				ResultSet rs = sentencia.executeQuery()){
//				
//			while(rs.next()) {
//				Factura f = new Factura();
//				f.setNumero(Integer.parseInt(rs.getString("numero")));
//				f.setConcepto(rs.getString("concepto"));
//				f.setImporte(Double.parseDouble(rs.getString("importe")));
//				facturas.add(f);
//			}
//			return facturas;
//			}catch(Exception ex) {
//				throw ex;
//			}
		return plantillaFactura.query(sql, new BeanPropertyRowMapper<Factura>(Factura.class));
	}
	
	//Ya no es necesario este método
//
//	private Connection getConnection() throws SQLException {
//		Connection driver = dataSource.getConnection();
//				return driver;
//	}
}
