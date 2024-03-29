package com.pt.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/*开启eureka 客户端*/
@EnableEurekaClient
public class ServicerAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicerAdminApplication.class,args);

    }
}
