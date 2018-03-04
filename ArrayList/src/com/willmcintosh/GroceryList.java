package com.willmcintosh;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) +". " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get((position));
        groceryList.remove((position));
        System.out.println(theItem + " has been removed.");
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public String findItem(String searchItem) {
//        String lowercaseSearchItem = searchItem.toLowerCase();
//        boolean exists = groceryList.contains(lowercaseSearchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;

    }
}
