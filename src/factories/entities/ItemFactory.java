package factories.entities;

import java.util.Random;

import entities.Item;
import enums.ItemType;
import exceptions.enums.ItemTypeException;

public class ItemFactory {
    private ItemType[] types = ItemType.values();
    private Random random = new Random();

    public Item createItem() throws ItemTypeException {
        ItemType type = this.types[random.nextInt(this.types.length)];
        String[] names = type.getNames();
        String name = names[random.nextInt(names.length)];
        
        return new Item(name, type);
    }
}
