package com.example.CarRental.service;

import com.example.CarRental.data.*;
import com.example.CarRental.exception.CarNotFoundException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    public List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("A", "1", 1));
        cars.add(new Car("B", "2", 2));
        cars.add(new Car("C", "3", 3));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public Car getCarByPlateNumber(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        throw new CarNotFoundException("No car found with the plate number: " + plateNumber);
    }

    @Override
    public void rentCar(String plateNumber, boolean rent) {
        Car car = getCarByPlateNumber(plateNumber);
        car.setIsRented(rent);
    }
}
