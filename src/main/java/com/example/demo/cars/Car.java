package com.example.demo.cars;

import jakarta.persistence.*;
import com.example.demo.Dealership.Dealership;
import com.example.demo.Driver.Driver;

import java.util.Set;

@Entity
@Table
public class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    private Long id;
    private String make;
    private String model;
    private String year;
    private String color;

    @ManyToMany(mappedBy = "cars")
    private Set<Driver> drivers;

    @ManyToOne
    @JoinColumn(name = "dealership_id")
    private Dealership dealership;

    public Car() {
    }

    public Car(Long id, String make, String model, String year, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }
}