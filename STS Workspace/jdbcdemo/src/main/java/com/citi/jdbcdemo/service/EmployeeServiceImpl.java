package com.citi.jdbcdemo.service;

import java.util.List;

import com.citi.jdbcdemo.dto.Employee;
import com.citi.jdbcdemo.repo.EmployeeRepo;
import com.citi.jdbcdemo.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static EmployeeService employeeService;
	
	public static EmployeeService getInstance() {
		if(employeeService == null) {
			employeeService = new EmployeeServiceImpl();
		}
		return employeeService;
	}
	
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.addEmployee(employee);
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeRepo.deleteEmployee(id);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(String empID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
