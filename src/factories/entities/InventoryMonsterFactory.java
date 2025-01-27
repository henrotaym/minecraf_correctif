package factories.entities;

import abstracts.RandomNamablesFactory;
import entities.Monster;
import enums.MonsterType;
import interfaces.factories.entities.InventoryFactory;
import interfaces.factories.entities.MonsterFactory;

public class InventoryMonsterFactory extends RandomNamablesFactory<MonsterType, Monster> implements MonsterFactory {
    private InventoryFactory inventoryFactory;
    
    public InventoryMonsterFactory(InventoryFactory inventoryFactory) {
        super(MonsterType.values());
        this.inventoryFactory = inventoryFactory;
    }

    @Override
    public Monster createMonster() {
        return this.createElement();
    }

    @Override
    public Monster getDefaultValue() {
        return new Monster(this.inventoryFactory.createInventory(), "choupisson");
    }

    @Override
    public Monster getValue(String name, MonsterType type) {
        return new Monster(this.inventoryFactory.createInventory(), name);
    }
    
}
