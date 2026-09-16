package com.example.CarRental.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
    
    @Id
    private String plateNumber;
    private String brand;
    private int price;
    private boolean isRented;

    // An Entity class must have a constructor without arguments
    public Car() {
    }

    public Car(String plateNumber, String brand, int price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.isRented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }
}