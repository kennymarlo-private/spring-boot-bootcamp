package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.model.Employee;
import com.bootcamp.springboot.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private EmployeeService employeeService;

    @Autowired
    private IndexController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String main(Employee employee) {
        return "index";
    }

    @PostMapping
    public String save(Employee employee) {
        if (employee != null) {
            logger.info("{}",employee);
            employeeService.save(employee);
        }
        return "saved";
    }

}
