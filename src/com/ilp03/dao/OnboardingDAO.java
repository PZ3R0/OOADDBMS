package com.ilp03.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ilp03.entity.Assets;
import com.ilp03.entity.Employee;

public class OnboardingDAO {

	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/employeeonboarding?useSSL=false";
		String userName = "root";
		String password = "experion@123";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<Assets> getAssetHistory(Connection connection, String assetName) {

		ArrayList<Assets> employeeList = new ArrayList<Assets>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM\r\n" + "         Assets a\r\n" + "     JOIN\r\n"
							+ "         Employee e ON a.employeeId = e.employeeId\r\n" + "     WHERE\r\n"
							+ "         a.itemName = ? \r\n" + "    ORDER BY\r\n" + "         a.issueDate DESC;");

			preparedStatement.setString(1, assetName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				String employeeFirstName = resultSet.getString("employeeFirstName");
				String employeeLastName = resultSet.getString("employeeLastName");
				String itemName = resultSet.getString("itemName");
				String issueDate = resultSet.getString("issueDate");
				int employeeId = resultSet.getInt("employeeId");
				long employeePhone = resultSet.getLong("employeePhone");

				Employee employee = new Employee();
				employee.setEmployeeFirstName(employeeFirstName);
				employee.setEmployeeLastName(employeeLastName);
				employee.setEmployeeId(employeeId);
				employee.setEmployeePhoneNumber(employeePhone);

				Assets assets = new Assets();
				assets.setItemName(itemName);
				assets.setIssueDate(issueDate);
				assets.setEmployeeId(employee);

				employeeList.add(assets);
			}
		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return employeeList;

	}

	public static void setEmployeeDetails(Connection connection, String employeeFirstName, String employeeLastName,
			long employeePhone, Date employeeJoiningDate, int departmentId, int designationId, int createdBy,
			int updatedBy) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					" INSERT INTO employee (employeeFirstname, employeeLastname, employeePhone, employeeJoiningDate, "
							+ "departmentId,designationId,createdBy,updatedBy)VALUES (?,?,?,?,?,?,?,?)");

			preparedStatement.setString(1, employeeFirstName);
			preparedStatement.setString(2, employeeLastName);
			preparedStatement.setLong(3, employeePhone);
			preparedStatement.setDate(4, employeeJoiningDate);
			preparedStatement.setLong(5, departmentId);
			preparedStatement.setLong(6, designationId);
			preparedStatement.setLong(7, createdBy);
			preparedStatement.setLong(8, updatedBy);
			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Employee data inserted successfully!");
			} else {
				System.out.println("Failed to insert employee data.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
