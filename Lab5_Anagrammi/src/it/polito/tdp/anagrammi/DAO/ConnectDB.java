package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	private static final String jdbcUrl = "jdbc:mysql://localhost/dizionario?useTimezone=true&serverTimezone=UTC&user=root&password=484Stefano16";
	private static Connection connection = null;
	
	public static Connection getConnection() {
		try {
			if(connection == null) {
				connection = DriverManager.getConnection(jdbcUrl);
			}
			return connection;
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
	}
	

}
