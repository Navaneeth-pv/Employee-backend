package com.example.Employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeBackend {

    @GetMapping("/")
    public String WelcomePage(){
        return "Welcome to EmployeeApp";
    }
}
