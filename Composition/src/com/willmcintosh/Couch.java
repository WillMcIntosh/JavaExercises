package com.willmcintosh;

public class Couch {
    private boolean isComfy;
    private int width;
    private String color;

    public Couch(boolean isComfy, int width, String color) {
        this.isComfy = isComfy;
        this.width = width;
        this.color = color;
    }

    public boolean isComfy() {
        return isComfy;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
