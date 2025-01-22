package entities;

public class Monster {
    private Inventory inventory;

    public Monster(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
