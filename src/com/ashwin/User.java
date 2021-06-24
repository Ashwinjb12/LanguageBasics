package com.ashwin;

public class User {

	public User(String fName, String sName, int ageOfUser) {
		this.firstName = fName;
		this.surName =sName;
		this.age = ageOfUser;
	}
	static String company = "Employee of TCS";
	private String firstName;
	private String surName;
	private int age;
	
	public static String getCompany() {
		return company;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
