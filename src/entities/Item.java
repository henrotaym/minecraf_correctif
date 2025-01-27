package entities;

import enums.ItemType;
import interfaces.entities.Slotable;

public class Item implements Slotable {
    private String name;
    public ItemType type;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public ItemType getType(){
        return this.type;
    }

    @Override
    public String display() {
        return this.getName();
    }
}
