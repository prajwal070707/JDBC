package employeeRecord;

import java.sql.*;

public class EmployeeDAO {
	
	public EmployeeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addEmployee(String firstName, String lastName,Integer age) throws Exception {

		String url = "jdbc:mysql://localhost:3306/database1";
		String username = "root";
		String password = "terminator";
		String query = "INSERT INTO employeetable values (13, '"+ firstName+"', '"+lastName+"', "+age+")";// "SELECT * FROM
																						// database1.`employeetable`";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);

		System.out.println(count + " " + "row affected");
		st.close();
		con.close();

	}
}

/*
 * public class EmployeeDAO{ //JDBC driver name and database URL static final
 * String JDBC_DRIVER="com.mysql.jdbc.Driver"; static final String
 * URL="jdbc:mysql://localhost:3306/database1"; //Database credentials
 * 
 * static final String USER= "root"; static final String PASS="terminator";
 * 
 * public static void main(String[] args) throws ClassNotFoundException {
 * Connection conn=null; Statement stmt=null;
 * 
 * try { //Register JDBC driver Class.forName("com.mysql.jdbc.Driver"); //open a
 * connection System.out.println("Connecting to database...");
 * conn=DriverManager.getConnection(URL, USER,PASS); //Execute a query
 * System.out.println("Creating statement..."); stmt=conn.createStatement();
 * String sql;
 * sql="SELECT employee id, first name, last name, age FROM employee table";
 * ResultSet rs=stmt.executeQuery(sql);
 * 
 * // Extract data from result set while(rs.next()) { int
 * id=rs.getInt("employee id"); int age=rs.getInt("age"); String first =
 * rs.getString("first name"); String last=rs.getString("last name");
 * 
 * //Display values System.out.print("ID: "+id);
 * System.out.print(", Age: "+age); System.out.print(",First:"+first);;
 * System.out.print(",Last:"+last);;
 * 
 * } //Clean-up environment rs.close(); stmt.close(); conn.close();
 * }catch(SQLException se) { se.printStackTrace(); }finally { try {
 * if(stmt!=null) stmt.close(); }catch(SQLException se2) { } try {
 * if(conn!=null) conn.close(); }catch(SQLException se) { se.printStackTrace();
 * } } System.out.println("Goodbye!");
 * 
 * 
 * 
 * 
 * 
 * } }
 */
