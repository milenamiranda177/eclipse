package com.springjdbc.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entitys.Factura;

public class RowMapperFactura implements RowMapper<Factura>{

	@Override
	public Factura mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Factura(rs.getInt("numero"), rs.getString("concepto"), rs.getDouble("importe"));
	}

	
}
