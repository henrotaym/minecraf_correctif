package entities;

import java.util.Optional;

import abstracts.entities.Slot;

public class InventorySlot extends Slot<Item> {
    public InventorySlot(Optional<Item> item) {
        super(item);
    }    
}
