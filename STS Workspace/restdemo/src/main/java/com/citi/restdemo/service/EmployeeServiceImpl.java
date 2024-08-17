package com.citi.restdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.restdemo.dto.Employee;
import com.citi.restdemo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			employeeRepo.deleteById(id);
			return "Success";
		}
		catch(Exception e) {
			return "Fail";
		}
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(int empID) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(empID);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
