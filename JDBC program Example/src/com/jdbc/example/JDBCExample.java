package com.jdbc.example;

import java.sql.Connection;
// jdbc example  date 17/06/2022;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Data {

	static String url = "jdbc:mysql://localhost/employee";
	static String username = "root";
	static String password = "manu";

}

public class JDBCExample {

	public static void main(String[] args) {

		System.out.println("******jdbc Program*******");

		String query = "select  id ,name,  percentage  from student_detail where courses_id = 2";

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				conn = DriverManager.getConnection(Data.url, Data.username, Data.password); // creating an object of//
																							// driver manager and pass
				// ,// name passwordp

				stmt = conn.createStatement(); // creating an statement

				res = stmt.executeQuery(query); // executing an selected query

				System.out.println("\n Result Fetch From Selected  database");

				System.out.println("\nStud_id-------- name ----------percentages ");

				while (res.next()) { // getting data from selected databases

					int id = res.getInt(1);
					String name = res.getString(2);
					int percentage = res.getInt("percentage");

					System.out.println(id + "-------------" + name + "-------------" + percentage);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
