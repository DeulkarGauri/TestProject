package log4jExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// THIS IS PRACTICING CRUD OPERATION USING PREPARED STATEMENT

public class User {

	public static void main(String[] args) throws Exception {
		System.out.println("this is my user class.....");

		String url = "jdbc:mysql://localhost/Student";
		String username = "root";
		String password = "manu";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection(url, username, password);

		/*
		 * CRUD OPERATION
		 */
		// 1. INSERT DATA INTO DATABASE
		// String query = "INSERT INTO Users (username, password, fullname, email)
		// VALUES (?, ?, ?, ?)";
		// PreparedStatement st = conn.prepareStatement(query);
		// st.setString(1, "Gauri");
		// st.setString(2, "gauri@10");
		// st.setString(3, "gauri deulkar");
		// st.setString(4, "deulkargauri@gmail.com");
		// int rows_affected = st.executeUpdate();
		// if (rows_affected > 0) {
		// System.out.println("a new user inserted successfully...");
		// }
		// 2. UPDATE
		// String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE
		// username=?";
		//
		// PreparedStatement statement = conn.prepareStatement(sql);
		// statement.setString(1, "Sweety@10");
		// statement.setString(2, "sweeety deulkar");
		// statement.setString(3, "sweety@gmail.com");
		// statement.setString(4, "Gauri");
		//
		// int rowsUpdated = statement.executeUpdate();
		// if (rowsUpdated > 0) {
		// System.out.println("An existing user was updated successfully!");
		// }
		// 3. DELETE
		// String sql = "DELETE FROM Users WHERE username=?";
		//
		// PreparedStatement statement = conn.prepareStatement(sql);
		// statement.setString(1, "gauri");
		//
		// int rowsDeleted = statement.executeUpdate();
		// if (rowsDeleted > 0) {
		// System.out.println("A user was deleted successfully!");
		// }

		// 4. SELECT
		String query = "select * from users";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		int count = 0;
		System.out.println("result fetch from student ....");

		System.out.println("name     " + "password     " + "fullname     " + "email     ");
		while (rs.next()) {
			String name = rs.getString(2);
			String pass = rs.getString(3);
			String fullname = rs.getString("fullname");
			String email = rs.getString("email");
			//
			// String output = "User #%d: %s - %s - %s - %s";
			// System.out.println(String.format(output, ++count, name, pass, fullname,
			// email));

			System.out.println("" + name + "  " + pass + "  " + fullname + "  " + email);
			System.out.println("end....");
		}
	}
}
