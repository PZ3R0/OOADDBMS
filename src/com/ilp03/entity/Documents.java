package com.ilp03.entity;

public class Documents {

	private int documentId;
	private String documentName;
	private String documentType;
	private Employee employeeId;
	private String uploadLink;

	public Documents(int documentId, String documentName, String documentType, Employee employeeId, String uploadLink) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.employeeId = employeeId;
		this.uploadLink = uploadLink;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getUploadLink() {
		return uploadLink;
	}

	public void setUploadLink(String uploadLink) {
		this.uploadLink = uploadLink;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

}
