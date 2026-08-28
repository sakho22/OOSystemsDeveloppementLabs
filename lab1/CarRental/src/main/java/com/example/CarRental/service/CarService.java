package com.example.CarRental.service;

import java.util.List;

import com.example.CarRental.data.*;;

public interface CarService {
    public List<Car> getCars();

    public Car getCarByPlateNumber(String plateNumber);

    public void rentCar(String plateNumber, boolean rent);
}
