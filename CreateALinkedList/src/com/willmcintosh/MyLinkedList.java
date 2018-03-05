package com.willmcintosh;

public class MyLinkedList implements MyNodeList {

    private MyListItem root = null;

    public MyLinkedList(MyListItem root) {
        this.root = root;
    }

    @Override
    public MyListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(MyListItem newItem) {
        if (this.root == null) {
            // the list was empty so this item becomes the head of the list
            this.root = newItem;
            return true;
        }
        MyListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // new item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                  // there is nothing next so insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, move left
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // they are equal
                System.out.println(newItem.getValue() + " is already present. Not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(MyListItem item) {
        return false;
    }

    @Override
    public void traverse(MyListItem root) {

    }
}
