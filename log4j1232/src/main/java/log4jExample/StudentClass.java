package log4jExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// we write this program as a example of maven project

/*
 * in this we directly connect dependecies to the project 
 */
public class StudentClass {

	public static void main(String[] args) throws Exception {
		System.out.println("Student class...");

		String url = "jdbc:mysql://localhost/Student";
		String username = "root";
		String password = "manu";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();
		StringBuilder s = new StringBuilder("hello...");
		// String query = "insert into student values(6,'pranjali',798977568,'delhi')";
		//
		// // String query = " delete from student where Stud_id = 6";
		// int row_count = st.executeUpdate(query);
		// System.out.println("insert :------ > \n Updated rows are :------> " +
		// row_count);

		String Query = " update Student set city = 'Aurangabad' where Stud_id=6 ";

		int Row_Count = st.executeUpdate(Query);
		System.out.println("Updated Rows :------- " + Row_Count);

		String Query1 = " update Student set city = 'Lucknow' where Stud_id= 4";
		int Row_Count1 = st.executeUpdate(Query1);
		System.out.println("Updated Rows :------- " + Row_Count1);

		String Query2 = "select  * from student ";
		Statement stmt = conn.createStatement();
		ResultSet re = stmt.executeQuery(Query2);

		System.out.println("\n Result Fetch From Selected  database ");

		System.out.println("\n Stud_id       name            Mobile_no                 City");

		while (re.next()) {
			// getting data from selected databases

			int id = re.getInt(1);
			String name = re.getString(2);
			int mobile_no = re.getInt(3);
			String City = re.getString(4);

			System.out
					.println("  " + id + "            " + name + "             " + mobile_no + "             " + City);
		}

	}
}
