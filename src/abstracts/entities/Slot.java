package abstracts.entities;

import java.util.Optional;

import entities.Item;
import exceptions.abstracts.entities.SlotException;

public abstract class Slot {
    private Optional<Item> item;

    public Slot(Optional<Item> item) {
        this.item = item;
    }

    public Optional<Item> getItem(){
        return this.item;
    }

    public void addItem(Item item) throws SlotException{
        if(this.item.isPresent()){
            throw new SlotException("Cannot add item to a slot that is not empty.");
        } 
        this.item = Optional.of(item);
    }

    public void removeItem(Item item) throws SlotException{
        if(this.item.isEmpty()){
            throw new SlotException("Cannot remove an empty slot.");
        } 
        this.item = Optional.of(item);
    }

    public String display(){
        return this.item.map(item -> item.getName()).orElse("empty");
    }
}
