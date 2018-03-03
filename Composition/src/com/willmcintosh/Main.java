package com.willmcintosh;

public class Main {

    public static void main(String[] args) {

        TV telly = new TV(46, "Vizio");
        Couch sofa = new Couch(true, 20, "red");
        Dimensions livingRoomSize = new Dimensions(9,12,8);

        LivingRoom cambridgeHouse = new LivingRoom(livingRoomSize, true, sofa, telly);

//        System.out.println("TV is on: " + telly.isON());
//        telly.pressPowerButton();
//        System.out.println("TV is on: " + telly.isON());

//        System.out.println("TV is on: " + telly.isON());
//
//        cambridgeHouse.getTelevision().pressPowerButton();
//
//        System.out.println("TV is on: " + telly.isON());

        cambridgeHouse.turnTVOnOff();
        System.out.println("\n ================= \n");
        cambridgeHouse.turnTVOnOff();



    }
}
