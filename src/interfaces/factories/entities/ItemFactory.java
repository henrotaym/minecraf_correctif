package interfaces.factories.entities;

import entities.Item;
import interfaces.ElementFactory;

public interface ItemFactory extends ElementFactory<Item> {
    public Item createItem();

    @Override
    default Item createElement() {
        return this.createItem();
    }
}
