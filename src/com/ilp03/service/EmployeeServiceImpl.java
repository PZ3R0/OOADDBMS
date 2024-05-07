package com.ilp03.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.OnboardingDAO;
import com.ilp03.entity.Assets;

public class EmployeeServiceImpl implements EmployeeService {

	public void getAssetHistory() {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Asset Name :");
			String assetName = scanner.nextLine();

			Connection connection = OnboardingDAO.getConnection();
			ArrayList<Assets> employeeList = OnboardingDAO.getAssetHistory(connection, assetName);
			System.out.println(String.format("%-20s%-25s%-25s%-20s%-30s", "Employee ID", "Employee First Name",
					"Employee Last Name", "Issued Item Name", "Issue Date"));

			for (Assets employee : employeeList) {
				System.out.println(String.format("%-20s%-25s%-25s%-20s%-30s", employee.getEmployeeId().getEmployeeId(),
						employee.getEmployeeId().getEmployeeFirstName(), employee.getEmployeeId().getEmployeeLastName(),
						employee.getItemName(), employee.getIssueDate()));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void setEmployeeDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection connection = OnboardingDAO.getConnection();
			System.out.println("Enter Employee First Name : ");
			String employeeFirstName = scanner.nextLine();
			System.out.println("Enter Employee Last Name : ");
			String employeeLastName = scanner.nextLine();
			System.out.println("Enter Employee Phone Number : ");
			long employeePhone = scanner.nextLong();
			scanner.nextLine();
			System.out.println("Enter Employee Joining Date : ");
			String employeeJoiningDate = scanner.nextLine();
			Date joiningDate = Date.valueOf(employeeJoiningDate);
			System.out.println("Enter Employee Department Id : ");
			int departmentId = scanner.nextInt();
			System.out.println("Enter Employee Designation Id : ");
			int designationId = scanner.nextInt();
			System.out.println("Created By (please enter employee id) : ");
			int createdBy = scanner.nextInt();
			System.out.println("Updated By (please enter employee id) : ");
			int updatedBy = scanner.nextInt();
			OnboardingDAO.setEmployeeDetails(connection, employeeFirstName, employeeLastName, employeePhone,
					joiningDate, departmentId, designationId, createdBy, updatedBy);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
