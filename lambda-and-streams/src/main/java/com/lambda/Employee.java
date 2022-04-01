package com.lambda;

public class Employee {

	private String firstName;
	private String lastName;
	private int yearsOfService;
	private Employee manager;
	private int numberOfDirectReports;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(final int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(final Employee manager) {
		this.manager = manager;
	}

	public int getNumberOfDirectReports() {
		return numberOfDirectReports;
	}

	public void setNumberOfDirectReports(final int numberOfDirectReports) {
		this.numberOfDirectReports = numberOfDirectReports;
	}
}
