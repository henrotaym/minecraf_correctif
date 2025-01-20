package factories.entities;

import java.util.Optional;

import abstracts.factories.SlotListFactory;
import entities.Inventory;
import entities.InventorySlot;

public abstract class InventoryFactoryCopy {
    private Integer size;

    public InventoryFactoryCopy(Integer size) {
        this.size = size;
    }

    public Inventory createSlotList() {
        InventorySlot[] slots = new InventorySlot[this.size];

        for (int i = 0; i < slots.length; i++) {
            slots[i] = new InventorySlot(Optional.empty());
        }

        return new Inventory(slots);
    }
}
