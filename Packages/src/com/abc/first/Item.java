package com.abc.first;

public class Item {

    private String type;

    public Item(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Item { type='%s' }", type);
    }
}
