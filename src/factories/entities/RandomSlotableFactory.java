package factories.entities;

import java.util.Random;

import entities.Monster;
import interfaces.ElementFactory;
import interfaces.entities.Slotable;

public class RandomSlotableFactory implements ElementFactory<Slotable> {
    private Random random = new Random();

    @Override
    public Slotable createElement() {
        Boolean isMonster = this.random.nextBoolean();
        Monster monster = new InventoryMonsterFactory(new MonsterInventoryFactory()).createElement();

        return isMonster
            ? monster
            : new RandomItemFactory().createElement();
    }
    
}
