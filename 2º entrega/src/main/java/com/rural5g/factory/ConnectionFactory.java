package com.rural5g.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String url = "jdbc:mysql://localhost/rural_5g?verifyServerCertificate=false&useSSL=true";
	private static final String user = "root";
	private static final String password = "4d3c2b1a";

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found. " + e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to databse");
			return connection;

		} catch (SQLException e) {
			System.out.println("Not connected to databse." + e.getMessage());
			return null;
		}
	}

}
