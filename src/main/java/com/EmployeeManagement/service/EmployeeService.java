package com.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.entity.Employee;
import com.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
    
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
    
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}