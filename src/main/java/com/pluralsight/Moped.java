package com.pluralsight;

public class Moped extends Vehicle {
    private String batterySize;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfWheels, String batterySize){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, numberOfWheels);
        this.batterySize = batterySize;
    }

    public Moped() {
        super();
    }

    public String getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(String batterySize) {
        this.batterySize = batterySize;
    }
}