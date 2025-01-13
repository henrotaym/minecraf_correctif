package models;

import enums.ItemType;

public class Item {
    private String name;
    private ItemType type;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public ItemType getType() {
        return this.type;
    }

    public String getSummary() {
        return this.name + " (" + this.type.name().toLowerCase() + ")";
    }
}
