package org.example;

public class Stack implements StackBehavior{
    private Node top = null;
    @Override
    public boolean isStackEmpty() {
        return this.top == null;
    }
    @Override
    public void insertNode(Node node) {

        if (this.isStackEmpty()) {
            node.setNext(null);
            this.top = node;
        }
        else {
            node.setNext(this.top);
            this.top = node;
        }
    }
    @Override
    public Node removeNode() {
        this.top = this.top.getNext();
        return null;
    }
}
