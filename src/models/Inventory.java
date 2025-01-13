package models;

public class Inventory {
    private InventorySlot[] slots;

    public Inventory(InventorySlot[] slots) {
        this.slots = slots;
    }

    public InventorySlot[] getSlots() {
        return this.slots;
    }

    public void print()  {
        for (int i = 0; i < this.slots.length; i++) {
            InventorySlot slot = this.slots[i];
            System.out.println("Slot " + i + slot.getItem().map(item -> " contains " + item.getSummary()).orElse(" is empty"));
        }
    }
}
