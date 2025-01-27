package factories.entities;

import java.util.List;
import java.util.Random;

import entities.Map;
import entities.Tile;
import factories.SizedListFactory;

public class TileListMapFactory {
    private Random random = new Random();

    public Map createMap() {
        Integer size = this.random.nextInt(15, 30);
        List<Tile> list = new SizedListFactory<Tile>(size, new RandomTileFactory()).createList();

        return new Map(list);
    }
}
