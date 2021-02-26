package com.fram.models;

public class User {
	private int emp_id;
	private String firstName;
	private String lastName;
	private String title;
	private String email;
	private String employeeId;
	private String department;
	private String station;
	
	
	public User(int emp_id, String firstName, String lastName, String title, String email, String employeeId,
			String department, String station) {
		this.emp_id = emp_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.email = email;
		this.employeeId = employeeId;
		this.department = department;
		this.station = station;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getStation() {
		return station;
	}


	public void setStation(String station) {
		this.station = station;
	}
	
	
	
	
}
