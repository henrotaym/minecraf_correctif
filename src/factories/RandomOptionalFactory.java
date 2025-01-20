package factories;

import java.util.Optional;
import java.util.Random;

import interfaces.factories.ElementFactory;
import interfaces.factories.OptionalFactory;

public class RandomOptionalFactory<T> implements OptionalFactory<T> {

    private ElementFactory<T> elementFactory;
    private EmptyOptionalFactory<T> emptyFactory = new EmptyOptionalFactory<T>();

    public RandomOptionalFactory(ElementFactory<T> elementFactory) {
        this.elementFactory = elementFactory;
    }

    @Override
    public Optional<T> createOptional() {
        Boolean hasItem = new Random().nextBoolean();

        return hasItem
            ? Optional.of(this.elementFactory.createElement())
            : this.emptyFactory.createOptional();
    }
    
}
