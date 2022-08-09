package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InterviewPrepJDBCEx {

	public static void main(String[] args) throws Exception {
		System.out.println("Practice Of JDBC .....");
		String url = "jdbc:mysql://localHost/gauri";
		String username = "root";
		String password = "manu";
		// String query = "insert into information values
		// (1003,'Samrudhii','Deulkar',788097875,'Wardha')";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection(url, username, password);

		Statement stmt = conn.createStatement();
		// stmt.executeUpdate(query);

		ResultSet rs = stmt.executeQuery("select * from information");

		System.out.println("Result fetch from database...");

		System.out.println("  id  " + "   name " + "     surname    " + "   mob_no   " + "   address   ");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String surname = rs.getString(3);
			int mob_no = rs.getInt(4);
			String address = rs.getString(5);

			System.out.println(" " + id + "    " + name + "    " + surname + "      " + mob_no + "     " + address);

		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
