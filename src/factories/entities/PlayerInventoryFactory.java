package factories.entities;

import java.util.List;

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import factories.EmptyOptionalFactory;
import factories.SizeListFactory;
import interfaces.factories.ElementFactory;
import interfaces.factories.ListFactory;
import interfaces.factories.OptionalFactory;
import interfaces.factories.entities.InventoryFactory;

public class PlayerInventoryFactory implements InventoryFactory {
    private OptionalFactory<Item> optionalItemFactory = new EmptyOptionalFactory<Item>();
    private ElementFactory<InventorySlot> inventorySlotFactory = new OptionalInventorySlotFactory(this.optionalItemFactory);
    private ListFactory<InventorySlot> slotsFactory = new SizeListFactory<InventorySlot>(this.inventorySlotFactory, 6);

    public Inventory createInventory() {
        List<InventorySlot> slots = this.slotsFactory.createList();
        return new Inventory(slots);
    }
}
