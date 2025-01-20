package entities;

import abstracts.entities.SlotList;

public class Inventory extends SlotList<InventorySlot> {
    public Inventory(InventorySlot[] slots) {
        super(slots);
    }
}
