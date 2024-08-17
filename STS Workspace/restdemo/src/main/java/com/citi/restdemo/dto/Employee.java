package com.citi.restdemo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	private int empID;
	@Column
	private String empFirstName;
	private String empLastName;
	private String address;
	private float salary;
	private int deptID;

}
