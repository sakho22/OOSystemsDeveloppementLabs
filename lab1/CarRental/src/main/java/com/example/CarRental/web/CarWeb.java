package com.example.CarRental.web;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.CarRental.data.*;
import com.example.CarRental.service.*;

@RestController
@RequestMapping("/cars")
public class CarWeb {
    private final CarService carService;

    public CarWeb(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> listOfCars() {
        return carService.getCars();
    }

    @GetMapping("/{plateNumber}")
    public Car aCar(@PathVariable("plateNumber") String plateNumber) {
        return carService.getCarByPlateNumber(plateNumber);
    }

    @PutMapping("/{plateNumber}")
    public void rentCar(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value = "rent", required = true) boolean rent) {
        carService.rentCar(plateNumber, rent);
    }
}
