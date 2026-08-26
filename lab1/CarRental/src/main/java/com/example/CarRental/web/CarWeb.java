package com.example.CarRental.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.CarRental.data.*;
import com.example.CarRental.service.*;

@RestController
public class CarWeb {

    public CarWeb(CarService carService) {

    }

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> Cars(CarService carService) {
        return carService.getCars();
    }

}
