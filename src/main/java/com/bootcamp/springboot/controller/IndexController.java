package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    private EmployeeService employeeService;

    @Autowired
    private IndexController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String main(Model model) {
        return "index";
    }

    @PostMapping
    public String save(Model model) {
        return "saved";
    }
}
