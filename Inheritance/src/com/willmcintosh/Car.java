package com.willmcintosh;

public class Car extends Vehicle {
    private int wheels;
    private String make;
    private String model;

    public Car(int doors, int window, int numOfPassengers,
               int wheels, String make, String model) {

        super(doors, window, numOfPassengers);
        this.wheels = wheels;
        this.make = make;
        this.model = model;
    }

    public void drive(int speed) {
        System.out.println("Vrrooom I'm a car!");
        super.move(speed);
    }


}
