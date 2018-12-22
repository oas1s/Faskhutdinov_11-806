package com.company;

public interface IntList {
    //добавление элемента в конец списка
    void add(int e);

    //получение элемента по индексу
    int get(int index);

    //число элементов в списке
    int size();

    //есть ли в списке такой элемент
    boolean contains(int value);

    //удаление элемента по индекс (со смещением элементов влево)
    void remove(int index);

    //возвращает все элементы из списка в виде массива
    int[] toArray();

    //добавление всех элементов из списка list в данный список(в конец)
    void addAll(IntList list);

    //добавление всех элементов из списка list в данный список
    //начиная с позиции index
    void addAll(IntList list, int index);
}