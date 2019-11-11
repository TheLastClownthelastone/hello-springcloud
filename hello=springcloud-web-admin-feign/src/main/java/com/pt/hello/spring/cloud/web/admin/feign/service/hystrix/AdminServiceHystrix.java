package com.pt.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.pt.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String say(String message) {
        return "服务器繁忙";
    }
}
