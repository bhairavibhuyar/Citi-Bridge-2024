package com.citi.jdbcdemo.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citi.jdbcdemo.dto.Employee;
import com.citi.jdbcdemo.utils.DBUtils;
import com.mysql.cj.xdevapi.PreparableStatement;

public class EmployeeRepoImpl implements EmployeeRepo {
	
//	private EmployeeRepoImpl() {
//		// TODO Auto-generated constructor stub
//	}
	
	private static EmployeeRepo employeeRepo;
	
	public static EmployeeRepo getInstance() {
		if(employeeRepo == null) {
			employeeRepo = new EmployeeRepoImpl();
		}
		return employeeRepo;
	}

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		String insertStatement = "insert into emp (empID, empFirstName, empLastName, salary, address) "
				+ "values (?, ?, ?, ?, ?)";
		
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, employee.getEmpID());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setFloat(4, employee.getSalary());
			preparedStatement.setString(5, employee.getAddress());
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				return "Success";
			}
			else {
				return "Fail";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		String deleteStatement = "delete from emp "
				+ "where empID = ?";
		
		Connection connection = null;
		try {
			connection = DBUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(deleteStatement);
			preparedStatement.setString(1, id);
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				return "Success";
			}
			else {
				return "Fail";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
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
		String query = "select * from emp";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		ResultSet resultSet = null;
		
		List<Employee> employees = new ArrayList<>();
		
		connection = DBUtils.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmpID(resultSet.getString("empID"));
				employee.setEmpFirstName(resultSet.getString("empFirstName"));
				employee.setEmpLastName(resultSet.getString("empLastName"));
				employee.setSalary(resultSet.getFloat("salary"));
				employee.setAddress(resultSet.getString("address"));
				
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
