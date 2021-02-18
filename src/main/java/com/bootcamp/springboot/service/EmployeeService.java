package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.Employee;
import com.bootcamp.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee findByFirstName(String firstName, String lastName) {
        return employeeRepository.findByFirstName(firstName, lastName);
    }

}
