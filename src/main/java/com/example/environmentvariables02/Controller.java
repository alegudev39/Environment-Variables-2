package com.example.environmentvariables02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping(path = "/hello")
    public String hello() {
        return service.welcomeMessage();
    }
}
