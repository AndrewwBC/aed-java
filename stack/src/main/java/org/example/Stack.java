package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack implements StackBehavior{
    private Node top = null;
    @Override
    public boolean isStackEmpty() {
        return this.top == null;
    }

    public Node getTop() {
        return this.top;
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

    public void displayNodes() {
        List<Node> list = new ArrayList<>();
        Node start = this.top;
        while(start != null) {
            list.add(start);
            start = start.getNext();
        }

        list.forEach(item -> System.out.println(item.getInfo()));

    }

}
