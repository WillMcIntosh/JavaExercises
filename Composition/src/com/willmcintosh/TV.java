package com.willmcintosh;

public class TV {
    private boolean isON;
    private int screenSize;
    private String manufacturer;

    public TV(int screenSize, String manufacturer) {
        this.isON = false;
        this.screenSize = screenSize;
        this.manufacturer = manufacturer;
    }

    public void pressPowerButton() {
        System.out.println("Power button Pressed.");
        if (this.isON) {
            this.isON = false;
            System.out.println("The TV turned off");
        } else {
            this.isON = true;
            System.out.println("The TV turned on");
        }
    }
    private boolean isON() {
        return isON;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
