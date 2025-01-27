package entities;

import interfaces.entities.Slotable;

public class Monster implements Slotable {
    private Inventory inventory;
    private String name;

    public Monster(Inventory inventory, String name) {
        this.inventory = inventory;
        this.name = name;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String display() {
        return this.getName();
    }
}
