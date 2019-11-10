package com.pt.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
        public String sayHi(@RequestParam("message") String message){
        return String.format("Hi your message is : %s  port is: %s",message,port);
    }
}
