package org.example;

public class Node {
    private int info;
    private Node next;

    public Node(int info, Node node) {
        this.info = info;
        this.next = node;
    }
    public int getInfo() {
        return this.info;
    }
    public Node getNext() {
        return this.next;
    }
    public void setNext(Node node) {
        this.next = node;
    }
}
