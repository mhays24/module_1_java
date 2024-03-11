package com.example.demo.Dealership;

import jakarta.persistence.*;
import com.example.demo.cars.Car;

import java.util.List;

@Entity
@Table
public class Dealership {
    @Id
    @SequenceGenerator(
            name = "dealership_sequence",
            sequenceName = "dealership_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dealership_sequence"
    )
    private Long id;
    private String name;

    @OneToMany(mappedBy = "dealership")
    private List<Car> cars;

    public Dealership() {
    }

    public Dealership(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dealership(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}