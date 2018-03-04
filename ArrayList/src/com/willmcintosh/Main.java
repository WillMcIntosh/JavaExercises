package com.willmcintosh;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
//        GroceryList groceries = new GroceryList();
//        groceries.addGroceryItem("peas");
//        groceries.addGroceryItem("mayo");
//        groceries.addGroceryItem("bread");
//
//        groceries.printGroceryList();
//        System.out.println("===========");
//
//        groceries.modifyGroceryItem(2, "pop tarts");
//        groceries.printGroceryList();
//
//        String derp = groceries.findItem("pop tarts");
//        System.out.println(derp);

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To remove an item in the list.");
        System.out.println("\t 4 - To modify an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the next grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.print("Please enter the item number to be removed: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNum -1);
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem((itemNum - 1), newItem);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " is not found in the shopping list.");
        }

    }
}
