package entities;

import java.util.Optional;

import abstracts.entities.Slot;
import interfaces.entities.Slotable;

public class Tile extends Slot<Slotable> {
    public Tile(Optional<Slotable> slotable) {
        super(slotable);
    }
}
