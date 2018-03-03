package com.willmcintosh;

public class Main {

    public static void main(String[] args) {

        Printer steveThePrinter = new Printer(0,
                0,false);

        steveThePrinter.fillToner(10);
        System.out.println(" \n");

//        System.out.println("If I try a negative number:");
//        steveThePrinter.fillToner(-3);
//        System.out.println(" \n");
//
//        System.out.println("Try to overfill:");
//        steveThePrinter.fillToner(300);
//        System.out.println(" \n");

        steveThePrinter.printPages(15);

        steveThePrinter.printPages(130);

//        steveThePrinter.printPages(-2);

    }
}
