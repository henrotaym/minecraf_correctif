package factories.entities;

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import factories.EmptyOptionalFactory;
import factories.SizedListFactory;
import interfaces.ElementFactory;
import interfaces.ListFactory;
import interfaces.OptionalFactory;
import interfaces.factories.entities.InventoryFactory;

public class PlayerInventoryFactory implements InventoryFactory {

    @Override
    public Inventory createInventory() {
        OptionalFactory<Item> optionalItemFactory = new EmptyOptionalFactory<Item>();
        ElementFactory<InventorySlot> slotFactory = new OptionalInventorySlotFactory(optionalItemFactory);
        ListFactory<InventorySlot> slotListFactory = new SizedListFactory<InventorySlot>(6, slotFactory);
        SlotListInventoryFactory inventoryFactory = new SlotListInventoryFactory(slotListFactory);

        return inventoryFactory.createInventory();
    }
    
}
