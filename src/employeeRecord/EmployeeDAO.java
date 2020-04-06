package employeeRecord;

import java.sql.*;

public class EmployeeDAO {
	
	
	
	public EmployeeDAO() {
		super();
	}

	public void addEmployee(String firstName, String lastName,Integer age) throws Exception {
//firstname = "prajwal', 'lastname', '20'
		String url = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "matrix";
		//"INSERT INTO employee (first_name, last_name, age) values (PRAJAL', 'SHRESTHA', 2)";
		String query = "INSERT INTO employee (first_name, last_name, age) values ('" + firstName + "', '"+lastName+"', "+age+")";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);

		System.out.println(count + " " + "row affected");
		st.close();
		con.close();

	}
}


