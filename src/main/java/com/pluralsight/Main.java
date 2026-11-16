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
        System.out.printf("Big car has only %d wheels%n",bigCar.getNumOfWheels());

        //Test if super works
        Moped fastRide = new Moped("Yellow",
                1,
                1,
                10,
                2,
                "Large");

        System.out.printf("Fast ride can only hold %d passenger and has a %s battery%n",
                fastRide.getNumberOfPassengers(),
                fastRide.getBatterySize());

        Car ghostRida = new Car("Red", 1, 10, 5, 4, 4);
        System.out.println(ghostRida.toString());
    }
}