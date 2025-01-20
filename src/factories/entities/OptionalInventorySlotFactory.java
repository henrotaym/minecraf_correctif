package factories.entities;

import entities.InventorySlot;
import entities.Item;
import interfaces.OptionalFactory;
import interfaces.entities.InventorySlotFactory;

public class OptionalInventorySlotFactory implements InventorySlotFactory {
    private OptionalFactory<Item> itemFactory;
    public OptionalInventorySlotFactory(OptionalFactory<Item> itemFactory) {
        this.itemFactory = itemFactory;
    }
    @Override
    public InventorySlot createSlot() {
        return new InventorySlot(this.itemFactory.createOptional());
    }
    
}
