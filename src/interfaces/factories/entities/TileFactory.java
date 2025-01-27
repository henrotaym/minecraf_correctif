package interfaces.factories.entities;

import entities.Tile;
import interfaces.ElementFactory;

public interface TileFactory extends ElementFactory<Tile> {
    public Tile createTile();
}
