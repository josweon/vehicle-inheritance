package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numOfWheels, int numberOfDoors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, numOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public Car(){
        super();
    }
}