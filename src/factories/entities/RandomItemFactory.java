package factories.entities;

import abstracts.RandomNamablesFactory;
import entities.Item;
import enums.ItemType;
import interfaces.factories.entities.ItemFactory;

public class RandomItemFactory extends RandomNamablesFactory<ItemType, Item> implements ItemFactory {

    public RandomItemFactory() {
        super(ItemType.values());
    }
    
    @Override
    public Item createItem() {
        return this.createElement();
    }

    @Override
    public Item getDefaultValue() {
        return new Item("apple", ItemType.FOOD);
    }

    @Override
    public Item getValue(String name, ItemType type) {
        return new Item(name, type);
    }
    
}
