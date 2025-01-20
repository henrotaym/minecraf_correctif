package factories.entities;

import java.util.List;
import java.util.Random;

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import factories.RandomOptionalFactory;
import factories.SizeListFactory;
import interfaces.factories.ElementFactory;
import interfaces.factories.ListFactory;
import interfaces.factories.OptionalFactory;
import interfaces.factories.entities.InventoryFactory;

public class MonsterInventoryFactory implements InventoryFactory {
    private ElementFactory<Item> itemFactory = new RandomItemFactory();
    private OptionalFactory<Item> optionalItemFactory = new RandomOptionalFactory<Item>(this.itemFactory);
    private ElementFactory<InventorySlot> inventorySlotFactory = new OptionalInventorySlotFactory(this.optionalItemFactory);
    private Random random = new Random();

    public Inventory createInventory() {
        Integer size = random.nextInt(2, 10);
        ListFactory<InventorySlot> slotsFactory = new SizeListFactory<InventorySlot>(this.inventorySlotFactory, size);
        return new Inventory(slotsFactory.createList());
    }
}
