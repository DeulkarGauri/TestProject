package com.demo.JDBC.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class College {

	static Connection conn;

	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/student";
			String user = "root";
			String password = "manu";

			try {
				conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return conn;
	}

}
