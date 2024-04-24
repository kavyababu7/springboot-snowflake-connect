package com.example.demo.snowflakeconnect.service;

import com.example.demo.snowflakeconnect.entity.Car;
import com.example.demo.snowflakeconnect.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCar(String numberPlate) {
        return carRepository.getOneByNumberPlate(numberPlate);
    }
}
