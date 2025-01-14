package entities;

public class Inventory {
    private InventorySlot[] slots;

    public Inventory(InventorySlot[] slots){
        this.slots = slots;
    }

    public void print(){
        for (InventorySlot slot : this.slots){
            System.out.println(slot.display());
        }
    }
}
