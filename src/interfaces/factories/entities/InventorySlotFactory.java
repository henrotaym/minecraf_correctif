package interfaces.factories.entities;

import entities.InventorySlot;
import interfaces.factories.ElementFactory;

public interface InventorySlotFactory extends ElementFactory<InventorySlot> {
    public InventorySlot createInventorySlot();

    public default InventorySlot createElement() {
        return this.createInventorySlot();
    }
}
