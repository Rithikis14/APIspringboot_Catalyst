package com.deploy.SpringAPI.api.controller;

import com.deploy.SpringAPI.api.model.User;
import com.deploy.SpringAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser(@RequestParam Integer id){
        return userService.getUser(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
