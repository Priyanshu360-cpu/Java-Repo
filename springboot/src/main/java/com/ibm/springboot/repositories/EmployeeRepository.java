package com.ibm.springboot.repositories;

import org.springframework.stereotype.Repository;

import com.ibm.springboot.model.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
Optional<Employee> findByFirstNameAndEmail(String firstName,String Email);
}
