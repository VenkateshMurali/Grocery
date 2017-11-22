package com.dummy;

public class Employee {
	private int emp_id;
	private String name;
	private String emailId;
	private long phone;
	private float houseRentAllowance;
	public float travelAllowance;
	public float dearnessAllowance;
	public float providentFund;
	private double basicSalary;

	public Employee(String name, String emailId, long phone, float houseRentAllowance, float travelAllowance,
			float dearnessAllowance, float providentFund, double basicSalary) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.houseRentAllowance = houseRentAllowance;
		this.travelAllowance = travelAllowance;
		this.dearnessAllowance = dearnessAllowance;
		this.providentFund = providentFund;
		this.basicSalary = basicSalary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	

}