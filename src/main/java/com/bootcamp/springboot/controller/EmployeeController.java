package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.model.Employee;
import com.bootcamp.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String main(Employee employee) {
        return "saved";
    }

    @GetMapping("/rest")
    @ResponseBody
    public List<Employee> list() {
        return employeeService.getEmployees();
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
