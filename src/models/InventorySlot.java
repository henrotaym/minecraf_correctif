package models;

import java.util.Optional;

public class InventorySlot {
    private Optional<Item> item;

    public InventorySlot(Optional<Item> item) {
        this.item = item;
    }

    public Optional<Item> getItem() {
        return this.item;
    }
}
