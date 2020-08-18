package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app")
public class Controller {
    @GetMapping("/name")
    public String getMyName() {

        return "Simple Spring Boot Application";

    }
}