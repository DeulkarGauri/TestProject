package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTp {

	public static void main(String[] args) {
		System.out.println("jdbc.............");
		String url = "jdbc:mysql://localhost/employee";
		String user = "root";
		String password = "manu";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				Connection conn = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
