package enums;

import exceptions.enums.ItemTypeException;
import interfaces.Namables;

public enum ItemType implements Namables {
    WEAPON,
    FOOD;

    @Override
    public String[] getNames() throws Exception {
        switch (this) {
            case WEAPON:
                return new String[] { "bow", "sword", "knife" };
            case FOOD:
                return new String[] { "apple", "beef", "watermelon" };
            default:
                throw new ItemTypeException("No names foud for type " + this.name()); 
        }
    }
}