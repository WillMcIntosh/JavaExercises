package com.willmcintosh;

public class LivingRoom extends Room {
    private Couch couch;
    private TV television;

    public LivingRoom(Dimensions dimensions, boolean hasWindows,
                      Couch couch, TV television) {

        super(dimensions, hasWindows);
        this.couch = couch;
        this.television = television;
    }

    public void turnTVOnOff() {
        System.out.println("from Living Room class:");
        television.pressPowerButton();
    }
    public Couch getCouch() {
        return couch;
    }

    private TV getTelevision() {
        return television;
    }
}
