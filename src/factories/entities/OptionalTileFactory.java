package factories.entities;

import entities.Item;
import entities.Tile;
import interfaces.factories.OptionalFactory;
import interfaces.factories.entities.TileFactory;

public class OptionalTileFactory implements TileFactory {
    private OptionalFactory<Item> optionalItemFactory;

    public OptionalTileFactory(OptionalFactory<Item> optionalItemFactory) {
        this.optionalItemFactory = optionalItemFactory;
    }

    @Override
    public Tile createTile() {
        return new Tile(this.optionalItemFactory.createOptional());
    }
}
