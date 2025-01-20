package interfaces.factories.entities;

import entities.Tile;
import interfaces.factories.ElementFactory;

public interface TileFactory extends ElementFactory<Tile> {
    public Tile createTile();

    public default Tile createElement() {
        return this.createTile();
    }
}
