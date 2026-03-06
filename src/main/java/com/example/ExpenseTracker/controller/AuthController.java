package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.dto.LoginDto;
import com.example.ExpenseTracker.entity.User;
import com.example.ExpenseTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginDto dto){
        return userService.login(dto.getUsername(), dto.getPassword());
    }
}
