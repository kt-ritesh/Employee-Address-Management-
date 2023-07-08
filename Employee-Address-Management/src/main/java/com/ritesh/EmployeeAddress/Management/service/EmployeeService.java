package com.ritesh.EmployeeAddress.Management.service;

import com.ritesh.EmployeeAddress.Management.model.Employee;
import com.ritesh.EmployeeAddress.Management.repo.IEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;

    public void add(Employee employies) {
        employeeRepository.save(employies);
    }

    public Iterable<Employee> getAllEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeesId(Long id) {
        return employeeRepository.findById(id);
    }
    @Transactional
    public String updateEmployeeNow(Employee employee, Long id) {
        employeeRepository.updateEmployee(employee.getFirstName() , employee.getLastName() , id);
        return "Employee Updated!!";
    }

    public String deleteEmployeeDetails(Long id) {
        employeeRepository.deleteById(id);
        return "Employee deleted!!";
    }
}
