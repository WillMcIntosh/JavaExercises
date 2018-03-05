package com.willmcintosh;

public interface MyNodeList {
    MyListItem getRoot();
    boolean addItem(MyListItem item);
    boolean removeItem(MyListItem item);
    void traverse(MyListItem root);
}
