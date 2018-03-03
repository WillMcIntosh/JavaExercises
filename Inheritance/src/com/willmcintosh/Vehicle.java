package com.willmcintosh;

public class Vehicle {
    private int doors;
    private int window;
    private int numOfPassengers;

    public Vehicle(int doors, int window, int numOfPassengers) {
        this.doors = doors;
        this.window = window;
        this.numOfPassengers = numOfPassengers;
    }

    public void move(int speed) {
        System.out.println("The vehicle is moving at a speed of " + speed);
    }

    public void steering() {
        System.out.println("The vehicle can turn and stuff.");
    }
}
