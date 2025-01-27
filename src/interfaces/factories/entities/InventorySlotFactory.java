package interfaces.factories.entities;

import entities.InventorySlot;
import interfaces.ElementFactory;

public interface InventorySlotFactory extends ElementFactory<InventorySlot> {
    public InventorySlot createSlot();
}
