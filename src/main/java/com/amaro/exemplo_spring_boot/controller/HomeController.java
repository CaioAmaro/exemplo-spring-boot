package com.amaro.exemplo_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String helloWorld(){
        return "Hello, world!";
    }

}
