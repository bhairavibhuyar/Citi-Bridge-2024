package com.citi.deptservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.deptservice.dto.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	
}
