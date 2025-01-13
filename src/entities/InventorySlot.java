package entities;

import java.util.Optional;

import exceptions.entities.InventorySlotException;

public class InventorySlot {
    private Optional<Item> item;

    public InventorySlot(Optional<Item> item) {
        this.item = item;
    }

    public Optional<Item> getItem(){
        return this.item;
    }

    public void addItem(Item item) throws InventorySlotException{
        if(this.item.isPresent()){
            throw new InventorySlotException("Cannot add item to a slot that is not empty.");
        } 
        this.item = Optional.of(item);
    }

    public void removeItem(Item item) throws InventorySlotException{
        if(this.item.isEmpty()){
            throw new InventorySlotException("Cannot remove an empty slot.");
        } 
        this.item = Optional.of(item);
    }

    public String display(){
        return this.item.map(item -> item.getName()).orElse("empty");
        //return this.item.isEmpty() ? "empty" : this.item.get().getName();
    }
}
