package com.willmcintosh;

public class FormulaOne extends Car {
    private boolean awesome;

    public FormulaOne(String make, String model, boolean awesome) {

        super(0, 1, 1, 4, make, model);
        this.awesome = awesome;
    }

    @Override
    public void drive(int speed) {
        System.out.println("Gentlemen, start your engines.");
        super.drive(speed);
    }
}
