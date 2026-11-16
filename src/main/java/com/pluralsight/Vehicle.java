package com.pluralsight;

public class Vehicle {
    protected String color;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected int fuelCapacity;
    protected int numOfWheels;


    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numOfWheels) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.numOfWheels = numOfWheels;
    }

    public Vehicle() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}