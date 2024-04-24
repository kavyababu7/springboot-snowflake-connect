package com.example.demo.snowflakeconnect.controller;

import com.example.demo.snowflakeconnect.entity.Car;
import com.example.demo.snowflakeconnect.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> findByNumberPlate(@RequestParam("numberPlate") String numberPlate) {
        return carService.getCar(numberPlate);
    }

}