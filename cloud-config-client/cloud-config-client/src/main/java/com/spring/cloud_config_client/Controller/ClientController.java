package com.spring.cloud_config_client.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ClientController {
    @Value("${service.name}")
    private String serviceInfo;
    @GetMapping
    public String getServiceInfo(){
        return "Service name : " + serviceInfo;
    }
}
