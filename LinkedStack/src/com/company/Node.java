package com.company;

public class Node {
    private Node next;
    private char value;

    void setValue(char value) {
        this.value = value;
    }

    void setNext(Node next) {
        this.next = next;
    }

    Node getNext() {
        return next;
    }

    char getValue() {
        return value;
    }

    boolean hasNext() {
        return next!= null;
    }

}