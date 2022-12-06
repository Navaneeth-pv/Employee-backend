package com.example.Employee_backend.controller;

import com.example.Employee_backend.dao.EmployeeDao;
import com.example.Employee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;


    @GetMapping("/")
    public String WelcomePage() {
        return "Welcome to EmployeeApp";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String Addemployee(@RequestBody Employee e) {
        System.out.println(e.getUserName().toString());
        System.out.println(e.getCompanyName() .toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getMobNo().toString());
        System.out.println(e.getPassword().toString());

        dao.save(e);

        return "Employee Added Successfully";

    }

    @GetMapping("/viewall")
    public List<Employee> ViewallEmployee(){
        return (List<Employee>) dao.findAll();
    }

}




