package com.ibm.springboot2.respositories;

import org.springframework.stereotype.Repository;

import com.ibm.springboot2.model.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
}