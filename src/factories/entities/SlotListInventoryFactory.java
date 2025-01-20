package factories.entities;

import entities.Inventory;
import entities.InventorySlot;
import interfaces.factories.ListFactory;
import interfaces.factories.entities.InventoryFactory;

public class SlotListInventoryFactory implements InventoryFactory {
    private ListFactory<InventorySlot> slotsFactory;

    public SlotListInventoryFactory(ListFactory<InventorySlot> slotsFactory) {
        this.slotsFactory = slotsFactory;
    }

    @Override
    public Inventory createInventory() {
        return new Inventory(this.slotsFactory.createList());
    }
}
