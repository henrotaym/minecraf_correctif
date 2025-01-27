


import java.sql.Connection;
import java.sql.DriverManager;

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

        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://database:3306/example_database",
                "user",
                "root"
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}