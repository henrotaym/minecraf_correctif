

import entities.Inventory;
import exceptions.enums.ItemTypeException;
import factories.entities.SlotListInventoryFactory;

public class Main {
    public static void main(String[] args) throws ItemTypeException {
        Inventory inventory = new SlotListInventoryFactory(6).createInventory();
        inventory.print();
    }
}