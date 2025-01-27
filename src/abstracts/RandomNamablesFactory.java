package abstracts;

import Helpers.RandomHelper;
import interfaces.ElementFactory;
import interfaces.Namables;

public abstract class RandomNamablesFactory<T extends Namables, S> implements ElementFactory<S> {
    private T[] types;
    private RandomHelper randomHelper = new RandomHelper();

    public RandomNamablesFactory(T[] types) {
        this.types = types;
    }

    public S createElement() {
        T type = this.randomHelper.list(this.types);

        try {
            String[] names = type.getNames();
            String name = this.randomHelper.list(names);
            
            return this.getValue(name, type);
        } catch (Exception e) {
            return this.getDefaultValue();
        }
    }

    public abstract S getDefaultValue();

    public abstract S getValue(String name, T type);
}
