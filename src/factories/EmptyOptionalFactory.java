package factories;

import java.util.Optional;

import interfaces.factories.OptionalFactory;

public class EmptyOptionalFactory<T> implements OptionalFactory<T> {

    @Override
    public Optional<T> createOptional() {
        return Optional.empty();
    }
    
}
