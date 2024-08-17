package com.citi.jdbcdemo.service;

import java.util.List;

import com.citi.jdbcdemo.dto.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	public String deleteEmployee(String id);
	public String updateEmployee(String id, Employee employee);
	public Employee getEmployeeById(String empID);
	public List<Employee> getEmployees();

}
