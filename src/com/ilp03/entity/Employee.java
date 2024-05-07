package com.ilp03.entity;

public class Employee {

	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private long employeePhoneNumber;
	private String employeeJoiningDate;
	private int departmentId;
	private Department designationId;
	private Employee createdBy;
	private Employee updatedBy;

	public Employee(int employeeId, String employeeFirstName, String employeeLastName, long employeePhoneNumber,
			String employeeJoiningDate, int departmentId, Department designationId, Employee createdBy,
			Employee updatedBy) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeePhoneNumber = employeePhoneNumber;
		this.employeeJoiningDate = employeeJoiningDate;
		this.departmentId = departmentId;
		this.designationId = designationId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public String getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}

	public void setEmployeeJoiningDate(String employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Department getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Department designationId) {
		this.designationId = designationId;
	}

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Employee getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Employee updatedBy) {
		this.updatedBy = updatedBy;
	}

}
