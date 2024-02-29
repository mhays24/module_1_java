package com.example.demo.cars;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repository) {
        return args -> {
            Car f150 = new Car(
                    "ford",
                    "f150",
                    "2006",
                    "brown"
            );

            Car charger = new Car(
                    "Dodge",
                    "Charger",
                    "2020",
                    "Red"
            );

            repository.saveAll(
                    List.of(f150, charger)
            );

        };
    }
}
