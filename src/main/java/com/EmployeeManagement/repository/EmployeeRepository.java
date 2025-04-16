package com.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
