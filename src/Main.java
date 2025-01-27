


import entities.Map;
import entities.Tile;
import exceptions.enums.ItemTypeException;
import factories.entities.RandomTileFactory;
import factories.entities.TileListMapFactory;

public class Main {
    public static void main(String[] args) throws ItemTypeException {
        Tile tile = new RandomTileFactory().createTile();
        System.out.println(tile.display());
        Map map = new TileListMapFactory().createMap();

        map.print();
    }
}