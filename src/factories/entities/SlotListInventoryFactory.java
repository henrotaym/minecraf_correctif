package factories.entities;

import entities.Inventory;
import entities.InventorySlot;
import interfaces.ListFactory;
import interfaces.entities.InventoryFactory;

public class SlotListInventoryFactory implements InventoryFactory {
    private ListFactory<InventorySlot> listFactory;
    public SlotListInventoryFactory(ListFactory<InventorySlot> listFactory) {
        this.listFactory = listFactory;
    }

    @Override
    public Inventory createInventory() {
        return new Inventory(this.listFactory.createList());
    }
    
}
