package employeeRecord;

import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) throws NumberFormatException, Exception {

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
		scanner.close();
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.addEmployee(firstName, lastName, Integer.parseInt(age));

	}
}