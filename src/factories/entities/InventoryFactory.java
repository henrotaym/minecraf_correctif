package factories.entities;

import java.util.Optional;

import entities.Inventory;
import entities.InventorySlot;

public class InventoryFactory {
    private Integer size;

    public InventoryFactory(Integer size) {
        this.size = size;
    }

    public Inventory createInventory() {
        InventorySlot[] slots = new InventorySlot[this.size];

        for (int i = 0; i < slots.length; i++) {
            slots[i] = new InventorySlot(Optional.empty());
        }

        return new Inventory(slots);
    }
}
