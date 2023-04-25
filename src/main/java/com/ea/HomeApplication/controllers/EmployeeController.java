package com.ea.HomeApplication.controllers;


import com.ea.HomeApplication.models.Address;
import com.ea.HomeApplication.models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {



    @RequestMapping("/employee")
    public Employee getEmployee(){
        Employee employee = Employee.builder()
                .id(1)
                .email("cf@gmail.com")
                .phone(1233455)
                .address(Address.builder().city("Aukland").country("NZ").street("12 Street").build())
                .name("CF")
                .build();
        return employee;
    }
    
}
