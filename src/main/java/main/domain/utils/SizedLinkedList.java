package main.domain.utils;

import java.util.LinkedList;


//TODO remplaze this custom Class for a HashMap implementation (Garbage collector bug)
public class SizedLinkedList<E> extends LinkedList<E> {
    private final int size;

    public SizedLinkedList(int initialSize) {
        this.size = initialSize;
        initializeWithDefault();
    }

    private void initializeWithDefault() {
        for (int i = 0; i < size; i++) {
            add(null); // Adding null as default data
        }
    }
}