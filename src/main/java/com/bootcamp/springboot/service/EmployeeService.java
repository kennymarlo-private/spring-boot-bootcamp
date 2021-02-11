package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.Employee;
import com.bootcamp.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }


}
