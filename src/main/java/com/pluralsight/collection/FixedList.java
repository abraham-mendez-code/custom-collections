package com.pluralsight.collection;

import java.util.List;

public class FixedList<T> {

    // class attributes
    List<T> items;
    int maxSize;

    // constructor
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add (T item) {

        if (items.size() < maxSize) {
            items.add(item);
        }
    }
}
