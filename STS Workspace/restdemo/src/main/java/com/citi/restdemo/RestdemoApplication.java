package com.citi.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.citi.restdemo.dto.Employee;
import com.citi.restdemo.service.EmployeeService;

@SpringBootApplication
public class RestdemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RestdemoApplication.class, args);
		
//		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
//		System.out.println(employeeService!=null);
//		System.out.println(employeeService.hashCode());
//
//		EmployeeService employeeService2 = applicationContext.getBean(EmployeeService.class);
//		System.out.println(employeeService2!=null);
//		System.out.println(employeeService2.hashCode());
//		
//		Employee emp = new Employee();
//		
//		Employee res = employeeService.addEmployee(emp);
//		System.out.println(res);
//		
//		String res2 = employeeService.deleteEmployee(0);
//		System.out.println(res2);
	}

}
