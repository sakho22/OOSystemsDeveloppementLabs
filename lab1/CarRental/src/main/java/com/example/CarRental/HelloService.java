package com.example.CarRental;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

}
