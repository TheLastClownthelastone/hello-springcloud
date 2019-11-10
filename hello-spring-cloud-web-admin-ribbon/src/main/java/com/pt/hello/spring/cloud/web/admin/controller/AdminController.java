package com.pt.hello.spring.cloud.web.admin.controller;

import com.pt.hello.spring.cloud.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("hi")
    public String sayHi(String message){
        return adminService.say(message);
    }
}
