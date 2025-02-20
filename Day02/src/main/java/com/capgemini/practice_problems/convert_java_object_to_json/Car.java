package com.capgemini.practice_problems.convert_java_object_to_json;

public class Car {
    private String carName;
    private int model;
    private String color;
    private double price;

    public Car(String carName, int model, String color, double price){
        this.carName = carName;
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public String getName() {
        return carName;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
