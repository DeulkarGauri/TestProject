package com.demo.JDBC.sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(StudentInfo st) {
		boolean f = false;
		// we have to write jdbc code
		try {

			Connection conn = College.createC();

			String query = "insert into student(Stud_name, mobile_no, city) values (?, ? ,?)";

			// creating an prepared statement
			PreparedStatement ptstmt = conn.prepareStatement(query);

			// set the value to paramter

			ptstmt.setString(1, st.getName());
			ptstmt.setString(2, st.getPhone());
			ptstmt.setString(3, st.getCity());

			// execute the prepared statement
			ptstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;

	}

	public static boolean deletestudent(int id) {
		// TODO Auto-generated method stub

		boolean f = false;
		// we have to write jdbc code
		try {

			Connection conn = College.createC();

			String query = "Delete from student where Stud_id = ?";

			// creating an prepared statement
			PreparedStatement ptstmt = conn.prepareStatement(query);

			// set the value to paramter

			ptstmt.setInt(1, id);

			// execute the prepared statement
			ptstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void displayAllStudent() {
		// TODO Auto-generated method stub

		boolean f = false;
		// we have to write jdbc code
		try {

			Connection conn = College.createC();

			String query = "select * from student ";

			// creating an prepared statement
			Statement stm = conn.createStatement();

			ResultSet res = stm.executeQuery(query);

			while (res.next()) {
				int id = res.getInt(1);
				String name = res.getString(2);
				int percentage = res.getInt(3);
				String city = res.getString(4);

				System.out.println("id............> " + id);

				System.out.println("name............> " + name);

				System.out.println("name............> " + percentage);

				System.out.println("name............> " + city);

				System.out.println("***************************");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}