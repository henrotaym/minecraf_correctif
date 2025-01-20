

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import exceptions.enums.ItemTypeException;
import factories.SizeListFactory;
import factories.EmptyOptionalFactory;
import factories.RandomOptionalFactory;
import factories.entities.SlotListInventoryFactory;
import factories.entities.MonsterInventoryFactory;
import factories.entities.OptionalInventorySlotFactory;
import factories.entities.PlayerInventoryFactory;
import factories.entities.RandomItemFactory;
import interfaces.factories.ElementFactory;
import interfaces.factories.ListFactory;
import interfaces.factories.OptionalFactory;

public class Main {
    public static void main(String[] args) throws ItemTypeException {

        ElementFactory<Item> itemFactory = new RandomItemFactory();
        OptionalFactory<Item> optionalItemFactory = new RandomOptionalFactory<Item>(itemFactory);
        ElementFactory<InventorySlot> inventorySlotFactory = new OptionalInventorySlotFactory(optionalItemFactory);
        ListFactory<InventorySlot> slotsFactory = new SizeListFactory<InventorySlot>(inventorySlotFactory, 6);
        Inventory inventory = new SlotListInventoryFactory(slotsFactory).createInventory();

        // inventory.print();

        Inventory monsterInventory = new MonsterInventoryFactory().createInventory();
        monsterInventory.print();

        Inventory playerInventory = new PlayerInventoryFactory().createInventory();
        playerInventory.print();

        // Map map = new MapFactory(new ArrayListSizeFactory<Tile>(new TileOptionalFactory(new ItemRandomFactory()), 50)).createContainer();
        // map.print();
    }
}