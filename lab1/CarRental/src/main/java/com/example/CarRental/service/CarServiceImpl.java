package com.example.CarRental.service;

import com.example.CarRental.data.Car;
import com.example.CarRental.data.CarRepository;
import com.example.CarRental.exception.CarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findByIsRentedFalse();
    }

    @Override
    public Car getCarByPlateNumber(String plateNumber) {
        return carRepository.findById(plateNumber)
                .orElseThrow(() -> new CarNotFoundException("Could not find car with plate number " + plateNumber));
    }

    @Override
    public void rentCar(String plateNumber, boolean rent) {
        Car car = getCarByPlateNumber(plateNumber);
        car.setIsRented(rent);
        carRepository.save(car);
    }
}