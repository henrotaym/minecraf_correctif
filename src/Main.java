

import entities.Monster;
import exceptions.enums.ItemTypeException;
import factories.entities.InventoryMonsterFactory;
import factories.entities.MonsterInventoryFactory;
import interfaces.entities.InventoryFactory;

public class Main {
    public static void main(String[] args) throws ItemTypeException {
        InventoryFactory inventoryFactory = new MonsterInventoryFactory();
        Monster monster = new InventoryMonsterFactory(inventoryFactory).createMonster();
        monster.getInventory().print();
    }
}