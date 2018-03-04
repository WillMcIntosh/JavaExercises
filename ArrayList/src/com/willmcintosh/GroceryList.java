package com.willmcintosh;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) +". " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
            System.out.println(item + " has been removed.");
        } else if (position < 0) {
            System.out.println("Item " + item + " not found.");
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove((position));
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
            System.out.println("Grocery item " + (position + 1) + " has been modified.");
        }
    }

    // internal method is private so that users only deal with String version
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    // will return -1 if item is not in groceryList
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
