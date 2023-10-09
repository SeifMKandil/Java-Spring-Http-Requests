package com.example.httprequeststutorial.controllers;

import com.example.httprequeststutorial.models.Car;
import com.example.httprequeststutorial.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return carService.getCars();
    }

    @GetMapping("/getCarById/{id}")
    public Car getCarById(@PathVariable("id") int id){
        return carService.getCarById(id);
    }

    @PostMapping("/addCars")
    public void addCars(@RequestBody Car car){
        carService.addCars(car);
    }

    @DeleteMapping("/deleteCars/{id}")
    public void deleteCars(@PathVariable("id") int id){
        carService.deleteCars(id);
    }

    @PutMapping("updateCar/{id}")
    public void updateCar(@PathVariable("id") int id ,@RequestBody Car car){
        carService.updateCar(id,car);
    }
}
