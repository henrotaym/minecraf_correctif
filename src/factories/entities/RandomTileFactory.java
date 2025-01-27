package factories.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entities.Inventory;
import entities.Monster;
import entities.Tile;
import factories.RandomOptionalFactory;
import interfaces.ElementFactory;
import interfaces.entities.Slotable;
import interfaces.factories.entities.InventoryFactory;
import interfaces.factories.entities.MonsterFactory;
import interfaces.factories.entities.TileFactory;

public class RandomTileFactory implements TileFactory {

    @Override
    public Tile createTile() {
        ElementFactory<Slotable> slotFactory = new RandomSlotableFactory();
        Optional<Slotable> slot = new RandomOptionalFactory<Slotable>(slotFactory).createOptional();
        
        return new Tile(slot);
    }

    @Override
    public Tile createElement() {
        return this.createTile();
    }
    
}
