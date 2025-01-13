package com.micro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountMicroservices {
    @GetMapping("sayHello")
    public String helloWorld() {
        return "Hello World";
    }

}
