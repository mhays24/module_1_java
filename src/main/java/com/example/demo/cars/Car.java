package com.example.demo.cars;
import java.lang.annotation.Annotation;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
public class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_sequence")
    private Long id;
    private String make;
    private String model;
    private String year;
    private String color;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
