package com.ibm.springboot.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
private final EmployeeRepository employeeRepository;
public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	this.employeeRepository=employeeRepository;
}
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("EMPLOYEE NOT FOUND WITH ID " +id));
	}
	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee = getEmployeeById(id);
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmail(employeeDetails.getEmail());	
		return employeeRepository.save(employee);
	}
	@Override
	public void deleteEmployee(Long id) {
		Employee employee = getEmployeeById(id);
		employeeRepository.delete(employee);
		
	}
	@Override
	public Optional<Employee> getByFirstNameAndEmail(String firstName, String Email) {
		return employeeRepository.findByFirstNameAndEmail(firstName, Email);
	}
	
}
