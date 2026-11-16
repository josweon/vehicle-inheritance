package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car bigCar = new Car();
        bigCar.setNumOfWheels(4);
        bigCar.setColor("Green");
        bigCar.setFuelCapacity(8);

        System.out.printf("Slowride is %s%n",slowRide.getColor());
        System.out.printf("Big car has only %d wheels",bigCar.getNumOfWheels());


    }
}
