package com.springjdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.ds.PGConnectionPoolDataSource;

public class MiDataSource {

	//Esta clase va a ser un singleton
	private static MiDataSource miDataSource = new MiDataSource();
	private PGConnectionPoolDataSource source;
	
	private MiDataSource() {
		source = new PGConnectionPoolDataSource();
		source.setDatabaseName("spring");
		source.setUser("root");
		source.setPassword("mmiranda");
		source.setLoginTimeout(20);
		source.setSocketTimeout(20);
	}
	
	public static MiDataSource getInstance() {
		if (miDataSource == null) {
			miDataSource = new MiDataSource();
		}
		return miDataSource;
	}
	
	public Connection getConnection() throws SQLException{
		return source.getConnection();
	}
}
