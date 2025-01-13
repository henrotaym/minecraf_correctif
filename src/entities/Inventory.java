package entities;

public class Inventory {
    private InventorySlot[] slots;
    private Integer size = 6;

    public Inventory(){
        this.slots = new InventorySlot[this.size];
    }

    public void print(){
        for (InventorySlot slot : this.slots){
            System.err.println(slot.display());
        }
    }
}
