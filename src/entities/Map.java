package entities;

import java.util.List;

import abstracts.entities.SlotList;

public class Map extends SlotList<Tile> {
    public Map(List<Tile> slots) {
        super(slots);
    }
}
