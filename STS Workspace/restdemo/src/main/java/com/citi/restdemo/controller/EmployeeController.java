package com.citi.restdemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.citi.restdemo.dto.Employee;
import com.citi.restdemo.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addEmployeeDetails(@RequestBody Employee employee){
		// @RequestBody => to read data from request body
		
		return ResponseEntity.status(201).body(employeeService.addEmployee(employee));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmpById(@PathVariable("id") int id){
		
		Optional<Employee> result = employeeService.getEmployeeById(id);
		if(result.isEmpty()) {
			//Fail
			return ResponseEntity.status(404).body("ID not found! " + id);
		}
		else {
			//To get the dept details using deptID from deptservice
			String url = "http://localhost:9999/api/dept";
			RestTemplate restTemplate = new RestTemplate();
			String deptJSON = restTemplate.getForObject(url, String.class, Map.of("id", 2));
			
			//Store the retrieved details in a map
			//"Emp Details":{emp details}    (String:Object)
			Map<String, Object> mapResult = new HashMap<>();
			mapResult.put("Emp Details", result.get());
			mapResult.put("Dept Details", deptJSON);
			
			//Success 
			return ResponseEntity.status(200).body(mapResult);
		}
	}
	
	@GetMapping("")
	public ResponseEntity<?> getList(){
		
		List<Employee> result = employeeService.getEmployees();
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
	public ResponseEntity<?> deleteEmpById(@PathVariable("id") int id){
		
			return ResponseEntity.status(200).body(employeeService.deleteEmployee(id));
	}

}
