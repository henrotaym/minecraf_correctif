package factories.entities;

import Helpers.RandomHelper;
import entities.Item;
import enums.ItemType;
import exceptions.enums.ItemTypeException;

public class ItemFactory {
    private ItemType[] types = ItemType.values();
    private RandomHelper randomHelper = new RandomHelper();

    public Item createItem() throws ItemTypeException {
        ItemType type = this.randomHelper.list(this.types);
        String[] names = type.getNames();
        String name = this.randomHelper.list(names);
        
        return new Item(name, type);
    }
}
