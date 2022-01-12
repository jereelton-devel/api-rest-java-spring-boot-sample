package com.jprojects.rest.api.controller;

import com.jprojects.rest.api.model.UserModel;
import com.jprojects.rest.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{code}")
    public ResponseEntity<?> query(@PathVariable("code") Integer code) {
        return repository.findById(code)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/save")
    public UserModel save(@RequestBody UserModel user) {
        return repository.save(user);
    }

}
