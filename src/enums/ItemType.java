package enums;

import exceptions.enums.ItemTypeException;

public enum ItemType {
    WEAPON,
    FOOD;

    public String[] getNames() throws ItemTypeException {
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