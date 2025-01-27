package abstracts.entities;

import java.util.Optional;

import entities.Item;
import exceptions.abstracts.entities.SlotException;
import interfaces.entities.Slotable;

public abstract class Slot<T extends Slotable> {
    private Optional<T> slotable;

    public Slot(Optional<T> slotable) {
        this.slotable = slotable;
    }

    public Optional<T> getSlotable(){
        return this.slotable;
    }

    public void addItem(T slotable) throws SlotException{
        if(this.slotable.isPresent()){
            throw new SlotException("Cannot add item to a slot that is not empty.");
        } 
        this.slotable = Optional.of(slotable);
    }

    public void removeItem(T slotable) throws SlotException{
        if(this.slotable.isEmpty()){
            throw new SlotException("Cannot remove an empty slot.");
        } 
        this.slotable = Optional.of(slotable);
    }

    public String display(){
        return this.slotable.map(slotable -> slotable.display()).orElse("empty");
    }
}
