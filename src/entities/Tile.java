package entities;

import java.util.Optional;

import abstracts.entities.Slot;

public class Tile extends Slot {
    public Tile(Optional<Item> item) {
        super(item);
    }
}
