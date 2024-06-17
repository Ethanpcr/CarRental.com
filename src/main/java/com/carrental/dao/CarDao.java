package com.carrental.dao;

import com.carrental.models.Car;
import java.util.List;

public interface CarDao {
    Car findById(int id);
    List<Car> findAll();
    void save(Car car);
    void update(Car car);
    void delete(int carId);
}
