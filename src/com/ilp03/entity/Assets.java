package com.ilp03.entity;

public class Assets {

	private int itemId;
	private String itemName;
	private String issueDate;
	private Employee employeeId;

	public Assets(int itemId, String itemName, String issueDate, Employee employeeId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.issueDate = issueDate;
		this.employeeId = employeeId;
	}

	public Assets() {
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

}
