package com.example.CarRental.web;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

}
