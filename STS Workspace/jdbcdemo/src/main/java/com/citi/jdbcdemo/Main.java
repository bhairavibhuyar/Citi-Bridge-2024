package com.citi.jdbcdemo;

import com.citi.jdbcdemo.dto.Employee;
import com.citi.jdbcdemo.service.EmployeeService;
import com.citi.jdbcdemo.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		
		Employee employee = new Employee();
		String res = employeeService.addEmployee(employee);
		System.out.println(res);
		String res2 = employeeService.deleteEmployee(null);
		System.out.println(res2);
		
		// code to retrieve data
	}

}
