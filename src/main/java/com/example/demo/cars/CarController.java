package com.example.demo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(path = "{carId}")
    public Optional<Car> findCar(@PathVariable("carId") Long carId) {
         return carService.findCar(carId);
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping
    public void registerNewCar(@RequestBody Car car) {
        carService.addNewCar(car);
    }

    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") Long carId) {
        carService.deleteCar(carId);
    }

    @PutMapping(path = "{carId}")
    public void updateCar(
            @PathVariable("carId") Long carId,
            @RequestParam(required = false) String make,
            @RequestParam(required = false) String model) {
        carService.updateCar(carId, make, model);
    }

}
