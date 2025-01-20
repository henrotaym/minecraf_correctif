

import entities.Inventory;
import exceptions.enums.ItemTypeException;
import factories.entities.InventoryFactory;

public class Main {
    public static void main(String[] args) throws ItemTypeException {
        Inventory inventory = new InventoryFactory(6).createInventory();
        inventory.print();
    }
}