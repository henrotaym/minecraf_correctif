package factories.entities;

import entities.Map;
import entities.Tile;
import interfaces.factories.ListFactory;
import interfaces.factories.entities.MapFactory;

public class TileListMapFactory implements MapFactory {
    private ListFactory<Tile> slotsFactory;

    public TileListMapFactory(ListFactory<Tile> slotsFactory) {
        this.slotsFactory = slotsFactory;
    }

    @Override
    public Map createMap() {
        return new Map(this.slotsFactory.createList());
    }
}
