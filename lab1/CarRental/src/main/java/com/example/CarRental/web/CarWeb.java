package com.example.CarRental.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.CarRental.data.*;
import com.example.CarRental.service.*;

@RestController
public class CarWeb {
    private final CarService carService;

    public CarWeb(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCars() {
        return carService.getCars();
    }

}
