import java.util.Optional;

import enums.ItemType;
import models.Inventory;
import models.InventorySlot;
import models.Item;
import models.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Mathieu Henrotay", 100);
        Item axe = new Item("eviscerator", ItemType.WEAPON);
        InventorySlot emptySlot = new InventorySlot(Optional.empty());
        InventorySlot filledSlot = new InventorySlot(Optional.of(axe));
        InventorySlot[] slots = {
            emptySlot,
            filledSlot
        };
        Inventory inventory = new Inventory(slots);
        inventory.print();
    }
}
