package com.citi.deptservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.deptservice.dto.Department;
import com.citi.deptservice.service.DepartmentService;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addDepartmentDetails(@RequestBody Department department){
		// @RequestBody => to read data from request body
		
		return ResponseEntity.status(201).body(departmentService.addDepartment(department));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDeptById(@PathVariable("id") int id){
		
		Optional<Department> result = departmentService.getDeptById(id);
		if(result.isEmpty()) {
			//Fail
			return ResponseEntity.status(404).body("ID not found! " + id);
		}
		else {
			//Success 
			return ResponseEntity.status(200).body(result.get());
		}
	}
	
	@GetMapping("")
	public ResponseEntity<?> getList(){
		
		List<Department> result = departmentService.getDepartments();
		if(result.isEmpty()) {
			//Fail
			return ResponseEntity.status(404).body("Not found! ");
		}
		else {
			//Success 
			return ResponseEntity.status(200).body(result);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDeptById(@PathVariable("id") int id){
		
			return ResponseEntity.status(200).body(departmentService.deleteDepartment(id));
	}

}
