package com.ibm.webapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.webapp.model.Employee;


public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee d = new Employee();
		d.setEmail(rs.getString("email"));
		d.setName(rs.getString("name"));
		d.setPhone(rs.getString("phone"));
		return d;
	}
}