package com.ibm.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.springjdbc.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(resultSet.getInt("id"));
		employee.setFirstName(resultSet.getString("firstname"));
		employee.setLastName(resultSet.getString("lastname"));
		employee.setSalary(resultSet.getInt("salary"));
		return employee;
	}
}
