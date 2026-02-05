package com.ibm.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	@GetMapping("/")
	public List<Employee> getEmployee() {
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
	      Employee savedEmployee = employeeService.createEmployee(employee);
	      return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body(savedEmployee);
	}
	@PostMapping("/findBy")
	public Optional<Employee> findByEmployee(@RequestBody Employee employee) {
	     return employeeService.getByFirstNameAndEmail(employee.getFirstName(),employee.getEmail());
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(
	        @PathVariable Long id,
	        @RequestBody Employee employee) {

	    Employee updatedEmployee = employeeService.updateEmployee(id, employee);
	    return ResponseEntity.ok(updatedEmployee);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {

	    employeeService.deleteEmployee(id);
	    return ResponseEntity.noContent().build();
	}
}
