package com.example.CarRental.service;

import com.example.CarRental.data.Car;
import java.util.List;

public interface CarService {
    List<Car> getCars();

    Car getCarByPlateNumber(String plateNumber);

    void rentCar(String plateNumber, boolean rent);
}