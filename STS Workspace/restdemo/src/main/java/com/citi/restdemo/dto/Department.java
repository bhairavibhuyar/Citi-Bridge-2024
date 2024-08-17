package com.citi.restdemo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {

	@Id
	private int deptID;
	@Column
	private String deptName;
	private String location;
	
}
