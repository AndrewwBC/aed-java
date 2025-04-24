package org.example;

public class Stack implements StackBehavior{
    private Node top = null;
    private int stackCapacity;

    @Override
    public boolean isStackEmpty() {
        return this.top == null;
    }

    @Override
    public void insertNode(Node node) {
        // should verify if stack is full
        this.top = node;
    }

    @Override
    public Node removeNode(Node node) {
        this.top = this.top.getNext();
        return null;
    }
}
