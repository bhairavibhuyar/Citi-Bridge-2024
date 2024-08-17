package com.citi.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.citi.restdemo.dto.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public String deleteEmployee(int id);
	public String updateEmployee(String id, Employee employee);
	public Optional<Employee> getEmployeeById(int empID);
	public List<Employee> getEmployees();

}
