package com.citi.restdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.restdemo.dto.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
