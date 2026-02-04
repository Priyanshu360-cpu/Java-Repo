package com.ibm.webapp.service;

import com.ibm.webapp.model.Employee;

public interface EmployeeService {
public void insertEmployee(Employee employee);
public void updateEmployee(String email,String phone);
public int deleteEmployee(String email);
public boolean employeeExists(String email);
public Employee findEmployee(String email);
}
