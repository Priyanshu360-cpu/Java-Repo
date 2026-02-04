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

}
