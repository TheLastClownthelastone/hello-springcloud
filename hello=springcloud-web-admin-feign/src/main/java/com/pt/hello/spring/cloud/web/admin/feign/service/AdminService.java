package com.pt.hello.spring.cloud.web.admin.feign.service;

import com.pt.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback= AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "hi")
    String say(@RequestParam("message") String message);
}
