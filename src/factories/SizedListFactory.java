package factories;

import java.util.ArrayList;
import java.util.List;

import interfaces.ElementFactory;
import interfaces.ListFactory;

public class SizedListFactory<T> implements ListFactory<T> {
    private Integer size;
    private ElementFactory<T> elementFactory;

    public SizedListFactory(Integer size, ElementFactory<T> elementFactory) {
        this.size = size;
        this.elementFactory = elementFactory;
    }

    @Override
    public List<T> createList() {
        ArrayList<T> list = new ArrayList<T>(this.size);

        for (int i = 0; i < this.size; i++) {
            list.add(this.elementFactory.createElement());
        }

        return list;
    }
    
}
