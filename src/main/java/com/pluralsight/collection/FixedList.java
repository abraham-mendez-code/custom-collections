package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    // class attributes
    List<T> items;
    int maxSize;

    // constructor
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add (T item) {

        if (items.size() < maxSize) {
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }

}
