package factories.entities;

import Helpers.RandomHelper;
import entities.Item;
import enums.ItemType;
import exceptions.enums.ItemTypeException;
import interfaces.factories.entities.ItemFactory;

public class RandomItemFactory implements ItemFactory {
    private ItemType[] types = ItemType.values();
    private RandomHelper randomHelper = new RandomHelper();

    @Override
    public Item createItem() {
        ItemType type = this.randomHelper.list(this.types);
        try {
            String[] names = type.getNames();
            String name = this.randomHelper.list(names);
            
            return new Item(name, type);
        } catch (ItemTypeException e) {
            return new Item("apple", ItemType.FOOD);
        }
    }    
}
