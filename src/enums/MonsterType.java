package enums;

import exceptions.enums.MonsterTypeException;
import interfaces.Namables;

public enum MonsterType implements Namables {
    MINION;

    @Override
    public String[] getNames() throws MonsterTypeException {
        switch (this) {
            case MINION:
                return new String[] { "choupisson", "dracofeu", "cat" };
            default:
                throw new MonsterTypeException("No names foud for type " + this.name()); 
        }
    }
}
