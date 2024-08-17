package com.citi.jdbcdemo.dto;

import lombok.Data;

@Data
public class Employee {
	
	private String empID;
	private String empFirstName;
	private String empLastName;
	private float salary;
	private String address;

}
