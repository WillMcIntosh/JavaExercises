package com.willmcintosh;

public class Room {
    private Dimensions dimensions;
    private boolean hasWindows;

    public Room(Dimensions dimensions, boolean hasWindows) {
        this.dimensions = dimensions;
        this.hasWindows = hasWindows;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isHasWindows() {
        return hasWindows;
    }
}
