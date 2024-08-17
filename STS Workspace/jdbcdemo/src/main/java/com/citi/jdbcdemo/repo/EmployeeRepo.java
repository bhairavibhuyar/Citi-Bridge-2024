package com.citi.jdbcdemo.repo;

import java.util.List;

import com.citi.jdbcdemo.dto.Employee;

public interface EmployeeRepo {
	
	public String addEmployee(Employee employee);
	public String deleteEmployee(String id);
	public String updateEmployee(String id, Employee employee);
	public Employee getEmployeeById(String empID);
	public List<Employee> getEmployees();

}
