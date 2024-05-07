package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.EmployeeService;
import com.ilp03.service.EmployeeServiceImpl;

//import com.ilp03.service.CustomerService;
//import com.ilp03.service.CustomerServiceImpl;

public class OnboardUtility {
	public static void main(String[] args) {
//		CustomerService customerService = new CustomerServiceImpl();
//		customerService.getAllCustomers();
		int choice = 0;
		while (choice != 5) {
			System.out.println("\nWelcome To Employee Management System");
			System.out.println("1. In Progress");
			// System.out.println("2. Use employee id to show docs that are submitted by
			// that employee");
			System.out.println("2. In Progress");
			System.out.println("3. Use Asset Name to show Assets that are provided to that employee");
			System.out.println("4. Insert Employee Data");
			System.out.println("5. Exit");
			System.out.println(" Enter Your Choice ");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Work in progress");
				break;
			}
			case 2: {
				System.out.println("Work in progress");
				break;
			}
			case 3: {
				System.out.println(
						" The Avialable Assets are : /n Laptop /n Mobile Phone /n Printer /n Projector /n Desk");
				EmployeeService employeeService = new EmployeeServiceImpl();
				employeeService.getAssetHistory();
				break;
			}
			case 4: {
				EmployeeService employeeService = new EmployeeServiceImpl();
				employeeService.setEmployeeDetails();
				break;
			}
			case 5:
				break;

			default:
				System.out.println("Enter a valid Number");
			}
		}

	}

}