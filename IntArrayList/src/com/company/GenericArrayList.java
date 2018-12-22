package com.company;

public class GenericArrayList<E> implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public GenericArrayList() {
        this.elements = new E[DEFAULT_CAPACITY];
    }
    
    public void add(E e) {
        if (count == elements.length) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        E[] newElements = new E[newCapacity];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    
    public E get(int index) {
        if (index < 0 || index >= count){
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    
    public int size() {
        return count;
    }

    
    public boolean contains(E value) {
        for(E e : elements) {
            if( e == value) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(int index) {
        for (int i = index; i <count-1; i++) {
            elements[i] = elements[i+1];
        }
        count--;
    }

    
    public void sort() {
        boolean wasChangedOnLastIteration = true;
        for (int i = 0; i < count & wasChangedOnLastIteration; i++) {
            wasChangedOnLastIteration = false;
            for (int j = 0; j < count - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int buf = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = buf;
                    wasChangedOnLastIteration = true;
                }
            }
        }
    }

    
    public int[] toArray() {
        int[] newMas = new int[count];
        for (int i = 0; i <count; i++) {
            newMas[i] = elements[i];
        }
        return newMas;
    }

    
    public void addAll(IntList list) {
        addAll(list, 0);
    }

    
    public void addAll(IntList list, int index) {
        int newSize = (count + list.size() - offset);
        int[] newArray = new int[(int) (newSize * EXTENSION_COEF)];
        for(int i = 0; i < count; i++) {
            newArray[i] = elements[i];
        }
        for(int i = offset; i < list.size(); i++) {
            newArray[i+count] = list.get(i);
        }
        elements = newArray;
    }
}