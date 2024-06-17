package com.carrental.controllers;

import com.carrental.models.Car;
import com.carrental.services.CarService;

public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public void addCar(Car car) {
        carService.saveCar(car);
    }

    public void updateCar(int carId, Car car) {
        carService.updateCar(carId, car);
    }

    public Car getCar(int carId) {
        return carService.findCarById(carId);
    }

    public void deleteCar(int carId) {
        carService.deleteCar(carId);
    }
}
