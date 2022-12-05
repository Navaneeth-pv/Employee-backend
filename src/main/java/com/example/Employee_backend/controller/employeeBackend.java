package com.example.Employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeBackend {

    @GetMapping("/")
    public String WelcomePage() {
        return "Welcome to EmployeeApp";
    }

    @PostMapping("/add")
    public String Addemployee() {
        return "Welcome to Add Employeee";

    }

    @PostMapping("/search")
    public String SearchEmployee() {
        return "Welcome to Search Employee";
    }

    @PostMapping("/edit")
    public String editEmployee() {
        return "Welcome to Edit Employee";
    }

    @PostMapping("/delete")
    public  String deleteEmployee(){
        return  "Welcome to delete Employee";
    }

}




