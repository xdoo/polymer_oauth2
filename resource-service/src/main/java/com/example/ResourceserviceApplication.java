package com.example;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
public class ResourceserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceserviceApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        return "hello " + user;
    }
}
