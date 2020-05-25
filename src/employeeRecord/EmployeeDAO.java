package employeeRecord;

import java.util.ArrayList;

public interface EmployeeDAO {
	
	public void addEmployee(String firstName, String lastName, Integer age) throws Exception;
	
	public ArrayList<Employee> getAllEmployees();

}
