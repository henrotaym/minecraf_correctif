package factories;

import java.util.Optional;

import interfaces.ElementFactory;
import interfaces.OptionalFactory;

public class FilledOptionalFactory<T> implements OptionalFactory<T> {
    private ElementFactory<T> elementFactory;

    public FilledOptionalFactory(ElementFactory<T> elementFactory) {
        this.elementFactory = elementFactory;
    } 

    @Override
    public Optional<T> createOptional() {
        return Optional.of(this.elementFactory.createElement());
    }
    
}
