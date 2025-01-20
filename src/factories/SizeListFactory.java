package factories;

import java.util.ArrayList;
import java.util.List;

import interfaces.factories.ElementFactory;
import interfaces.factories.ListFactory;

public class SizeListFactory<T> implements ListFactory<T>{
    protected Integer size;
    protected ElementFactory<T> elementFactory;

    public SizeListFactory(ElementFactory<T> elementFactory, Integer size) {
        this.size = size;
        this.elementFactory = elementFactory;
    }

    public List<T> createList() {
        List<T> list = new ArrayList<T>(this.size);

        for (int i = 0; i < this.size; i++) {
            list.add(this.elementFactory.createElement());
        }

        return list;
    }
}
