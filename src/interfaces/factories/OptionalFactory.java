package interfaces.factories;

import java.util.Optional;

public interface OptionalFactory<T> {
    public Optional<T> createOptional();
}
