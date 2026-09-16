package com.example.CarRental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.CarRental.data.Car;
import com.example.CarRental.data.CarRepository;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository carRepository) {
		return (args) -> {
			Car car1 = new Car("11AA22", "Ferrari", 1000);
			carRepository.save(car1);

			Car car2 = new Car("22BB44", "Porsche", 2000);
			carRepository.save(car2);

			Car car3 = new Car("33CC55", "Tesla", 1500);
			carRepository.save(car3);

			Car car4 = new Car("676767", "Toyota", 1500);
			carRepository.save(car4);

			Car car5 = new Car("25CDF1", "Toyoto", 1500);
			carRepository.save(car5);

			Car car6 = new Car("TEST12", "Toyoti", 1500);
			carRepository.save(car6);
		};
	}

}