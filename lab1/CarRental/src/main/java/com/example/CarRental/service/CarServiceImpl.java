package com.example.CarRental.service;

import com.example.CarRental.data.*;

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
}
