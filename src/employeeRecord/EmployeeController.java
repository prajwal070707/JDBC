package employeeRecord;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeController {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int input = 1;
		while(true){
			System.out.println("Please choose an option by typing a number");
			System.out.println("Enter 1 to add new employee.");
			System.out.println("Enter 2 to display all employee.");
			System.out.println("Enter 3 if you are done.");

			input = scanner.nextInt();
			try{
				if(input == 1){
					showAddMenu();
				}
				else if(input == 2){
					displayAll();}
				else
					break;
			}
			catch(Exception e){
				System.out.println(e.getCause());
				System.out.println(e.getStackTrace());
			}
		}
		scanner.close();
	}

    public static void showAddMenu() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Firstname: ");

		String firstName = scanner.nextLine();

		System.out.println("Your first name is: " + firstName);
		System.out.println("Enter Lastname: ");

		String lastName = scanner.nextLine();

		System.out.println("Your last name is: " + lastName);
		System.out.println("Enter age: ");

		String age = scanner.nextLine();

		System.out.println("Your age is: " + age);

		EmployeeDAO employeeDAO;
		employeeDAO = new EmployeeDAO();
		employeeDAO.addEmployee(firstName, lastName, Integer.parseInt(age));
	}

	public static void displayAll() throws ClassNotFoundException, SQLException {
		EmployeeDAO employeeDAO;
		employeeDAO = new EmployeeDAO();
		//employeeDAO.getAllEmployees();
        System.out.println(Arrays.toString(employeeDAO.getAllEmployees().toArray()));
		//Employee emp= new Employee();
	}
}

