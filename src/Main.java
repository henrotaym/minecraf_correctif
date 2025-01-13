import java.util.Optional;

import entities.Inventory;
import entities.InventorySlot;
import entities.Item;
import enums.ItemType;

public class Main {
    public static void main(String[] args) {
        Item item = new  Item("Arc de glace", ItemType.WEAPON);
        InventorySlot slot = new InventorySlot(Optional.empty());
        
        Inventory inventory = new Inventory();

        System.out.println(inventory);
    }
}