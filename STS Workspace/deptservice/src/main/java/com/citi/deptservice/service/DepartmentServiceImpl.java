package com.citi.deptservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.deptservice.dto.Department;
import com.citi.deptservice.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}

	@Override
	public String deleteDepartment(int id) {
		// TODO Auto-generated method stub
		try {
			departmentRepo.deleteById(id);
			return "Success";
		}
		catch(Exception e) {
			return "Fail";
		}
	}

	@Override
	public String updateDepartment(String id, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDeptById(int deptID) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(deptID);
	}

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}

}
