package com.greatlearning.model;

public class Employee {
 // Declare firstName,lastName,department
 private String firstName;
 private String lastName;
 private String department;
 
// Create a constructor
 public Employee(String firstName, String lastName, String department) {
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.department = department;
	 	 
 }
// Create getters and setters
 
 public  String getfirstName() {
	 return firstName;
	 
 }

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}
	
}

