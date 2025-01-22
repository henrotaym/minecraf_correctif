package factories.entities;

import java.util.Random;

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import factories.RandomOptionalFactory;
import factories.SizedListFactory;
import interfaces.ElementFactory;
import interfaces.ListFactory;
import interfaces.entities.InventoryFactory;

public class MonsterInventoryFactory implements InventoryFactory {
    private Random random = new Random();

    @Override
    public Inventory createInventory() {
        Integer size = this.random.nextInt(2, 12);
        ElementFactory<Item> itemFactory = new RandomItemFactory();
        RandomOptionalFactory<Item> optionalItemFactory = new RandomOptionalFactory<Item>(itemFactory);
        ElementFactory<InventorySlot> slotFactory = new OptionalInventorySlotFactory(optionalItemFactory);
        ListFactory<InventorySlot> slotListFactory = new SizedListFactory<InventorySlot>(size, slotFactory);
        SlotListInventoryFactory inventoryFactory = new SlotListInventoryFactory(slotListFactory);

        return inventoryFactory.createInventory();
    }
    
}
