package com.ibm.webapp.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ibm.webapp.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final JdbcTemplate jdbcTemplate;

	public EmployeeServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertEmployee(Employee employee) {
		jdbcTemplate.update("INSERT INTO employee(email, name, phone) VALUES (?,?,?)", employee.getEmail(),
				employee.getName(), employee.getPhone());
		System.out.println("Employee inserted to database");
	}

	@Override
	public void updateEmployee(String email, String phone) {
		jdbcTemplate.update("UPDATE employee SET phone=? where email=?",email,phone);
		System.out.println("Employee's Phone Number Updated");

	}

	@Override
	public int deleteEmployee(String email) {
		int a=jdbcTemplate.update("DELETE FROM employee where email=?",email);
		System.out.println("Employee Deleted");
		return a;
		
	}

}
