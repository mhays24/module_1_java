package com.example.demo.cars;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandlinerunner (CarRepository cr) {
        return args -> {
            Car toyota = new Car(

            );
        };
    }
}
