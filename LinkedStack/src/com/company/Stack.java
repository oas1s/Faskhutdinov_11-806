package com.company;

public class Stack {
    private Node head;
    private int n;

    public Stack() {

    }

    public void push(char c) {
        Node b = new Node();
        b.setValue(c);
        if (getTail() == null) {
            head = b;
        }
        else {
            getTail().setNext(b);
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        char p = getTail().getValue();
        getPreviousOfTail().setNext(null);
        return p;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private Node getTail() {
        Node current = head;
        if (head == null) {
            return null;
        }
        while(current.hasNext()) {
            current = current.getNext();
        }
        return current;
    }

    private Node getPreviousOfTail() {
        Node current = head;
        if (head == null) {
            return null;
        }
        while (current.hasNext()) {
            if (current.getNext().hasNext()) {
                current = current.getNext();
            } else {
                return current;
            }
        }
        return null;
    }
}