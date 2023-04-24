package com.ea.HomeApplication.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/")
    public String getEmployee(){
        return "CF";
    }
    
}
