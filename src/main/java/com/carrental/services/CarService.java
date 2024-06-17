package com.carrental.services;

import com.carrental.models.Car;
import com.carrental.dao.CarDao;

import java.util.List;

public class CarService {
    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public Car findCarById(int id) {
        return carDao.findById(id);
    }

    public List<Car> findAllCars() {
        return carDao.findAll();
    }

    public void saveCar(Car car) {
        carDao.save(car);
    }

    public void updateCar(int id, Car car) {
        carDao.update(car);
    }

    public void deleteCar(int id) {
        carDao.delete(id);
    }
}
