package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.model.User;
import com.bootcamp.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public String main (User user) {
        return "user";
    }

    @PostMapping
    public String save(User user) {
        if (user != null) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userService.save(user);
        }
        return "user";
    }
}
