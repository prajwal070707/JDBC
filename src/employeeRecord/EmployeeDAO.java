package employeeRecord;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
	
	
	
	public EmployeeDAO() {
		super();
	}

	public void addEmployee(String firstName, String lastName,Integer age) throws Exception {
//firstname = "prajwal', 'lastname', '20'
		String url = "jdbc:mysql://localhost:3306/new_schema";
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

	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/new_schema";
		String username = "root";
		String password = "matrix";
		String query="SELECT * FROM new_schema.employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		ResultSet rs = 		st.executeQuery(query);
		ArrayList<Employee> employeeList=new ArrayList<>();
		while (rs.next()) {		
			Employee emp = new Employee();

			emp.setEmployeeId(rs.getInt("employee_ID"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
            emp.setAge(rs.getInt("age"));
			employeeList.add(emp);
			
		}
		return employeeList;
	}

}


