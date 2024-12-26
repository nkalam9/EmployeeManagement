package com.infy.empmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpManagementController {
    @GetMapping("/welcome")
    public String Welcome(){
        return "welcome to spring boot";
    }
}
