package entities;

import java.util.List;

import abstracts.entities.SlotList;

public class Inventory extends SlotList<InventorySlot> {
    public Inventory(List<InventorySlot> slots) {
        super(slots);
    }
}
