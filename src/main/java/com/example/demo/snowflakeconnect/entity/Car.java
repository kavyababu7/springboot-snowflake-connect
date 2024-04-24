package com.example.demo.snowflakeconnect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_CAR")
public class Car {

    @Id
    @Column(name = "CAR_ID")
    private Integer carId;

    @Column(name = "CAR_NAME")
    private String name;

    @Column(name = "CAR_MODEL")
    private String model;

    @Column(name = "CAR_MAKE_YEAR")
    private int year;

    @Column(name = "NUMBER_PLATE")
    String numberPlate;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
