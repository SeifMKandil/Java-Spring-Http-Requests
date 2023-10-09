package com.example.httprequeststutorial.services;

import com.example.httprequeststutorial.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>(List.of(
            new Car("Bmw" , "Black" , "2009" , "Benzene"),
            new Car("Mercedes" , "Blue" , "2005" , "Gas"),
            new Car("Fiat" , "Red" , "2002" , "Benzene")
    ));

    int carId = 1;
    public List<Car> getCars(){
        return cars;
    }

    public Car getCarById(int id){
        return cars.stream().filter(c -> c.getId() == id ).findFirst().get();
    }
    public Car addCars(Car car) {
        car.setId(carId);
        cars.add(car);
        carId ++;
        return car;
    }


    public Car updateCar(int id  ,  Car car){
        cars.stream().forEach(c->{
            if(c.getId() == id){
                c.setName(car.getName());
                c.setColor(car.getColor());
                c.setYear(car.getYear());
                c.setFuelType(car.getFuelType());
            }
        });

        return cars.stream().filter(c->c.getId()==id).findFirst().get();

    }
    public void deleteCars(int id) {
        cars.stream().forEach(c->{
            if(c.getId() == id){
                cars.remove(c);
            }
        });
    }
}
