package com.citi.deptservice.service;

import java.util.List;
import java.util.Optional;

import com.citi.deptservice.dto.Department;


public interface DepartmentService {
	
	public Department addDepartment(Department department);
	public String deleteDepartment(int id);
	public String updateDepartment(String id, Department department);
	public Optional<Department> getDeptById(int deptID);
	public List<Department> getDepartments();

}
