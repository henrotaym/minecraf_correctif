package interfaces.factories.entities;

import entities.Item;
import interfaces.factories.ElementFactory;

public interface ItemFactory extends ElementFactory<Item> {
    public Item createItem();

    public default Item createElement() {
        return this.createItem();
    }
}
