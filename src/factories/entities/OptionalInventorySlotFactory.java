package factories.entities;

import entities.InventorySlot;
import entities.Item;
import interfaces.factories.OptionalFactory;
import interfaces.factories.entities.InventorySlotFactory;

public class OptionalInventorySlotFactory implements InventorySlotFactory {
    private OptionalFactory<Item> optionalItemFactory;

    public OptionalInventorySlotFactory(OptionalFactory<Item> optionalItemFactory) {
        this.optionalItemFactory = optionalItemFactory;
    }

    @Override
    public InventorySlot createInventorySlot() {
        return new InventorySlot(this.optionalItemFactory.createOptional());
    }
}
