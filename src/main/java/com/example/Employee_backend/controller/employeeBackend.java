package com.example.Employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeBackend {

    @GetMapping("/")
    public String WelcomePage(){
        return "Welcome to EmployeeApp";
    }

    @GetMapping("/add")
    public  String Addemployee(){
        return "Add Employeee";

    }

    @GetMapping("/search")
    public  String  SearchEmployee(){
        return "Search Employee";
    }

    @GetMapping("/edit")
    public String EditEmployee(){
        return "Edit employe";
    }
}




