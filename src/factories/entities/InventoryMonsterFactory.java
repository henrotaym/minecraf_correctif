package factories.entities;

import entities.Inventory;
import entities.Monster;
import interfaces.entities.InventoryFactory;
import interfaces.entities.MonsterFactory;

public class InventoryMonsterFactory implements MonsterFactory {
    private InventoryFactory inventoryFactory;
    public InventoryMonsterFactory(InventoryFactory inventoryFactory) {
        this.inventoryFactory = inventoryFactory;
    }

    @Override
    public Monster createMonster() {
        Inventory inventory = this.inventoryFactory.createInventory();

        return new Monster(inventory);
    }
    
}
