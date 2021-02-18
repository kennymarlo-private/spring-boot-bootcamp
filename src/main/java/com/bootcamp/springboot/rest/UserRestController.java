package com.bootcamp.springboot.rest;

import com.bootcamp.springboot.model.User;
import com.bootcamp.springboot.service.UserService;
import jdk.jfr.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/rest")
public class UserRestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<Optional<User>> userById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        return user.isPresent() ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<User>> list() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/consume")
    public ResponseEntity<String> consume() {
        return new RestTemplate().getForEntity("https://jsonplaceholder.typicode.com/posts/1", String.class);
    }
}
