package com.example.httprequeststutorial.models;

public class Car {
    public int id;
    private String name ;
    private String color;

    private String year;

    private String fuelType;

    public Car(String name, String color, String year, String fuelType) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.fuelType = fuelType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }
}
