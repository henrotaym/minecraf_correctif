package factories;

import java.util.Optional;
import java.util.Random;

import interfaces.ElementFactory;
import interfaces.OptionalFactory;

public class RandomOptionalFactory<T> implements OptionalFactory<T> {
    private Random random = new Random();
    private ElementFactory<T> elementFactory;

    public RandomOptionalFactory(ElementFactory<T> elementFactory) {
        this.elementFactory = elementFactory;
    }

    @Override
    public Optional<T> createOptional() {
        Boolean isEmpty = this.random.nextBoolean();

        return isEmpty
            ? new EmptyOptionalFactory<T>().createOptional()
            : new FilledOptionalFactory<T>(this.elementFactory).createOptional();
    }
    
}
