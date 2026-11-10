
package com.example.employee_management_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_backend.model.Employee;
import com.example.employee_management_backend.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Add single employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Add multiple employees
    public List<Employee> saveAllEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Update employee
    public Employee updateEmployee(String id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }

    // Delete employee
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
