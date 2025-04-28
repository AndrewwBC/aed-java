package org.example;

public class Node {
    private Integer info;
    private Node before;
    private Node next;

    public Node(Integer info, Node before, Node next) {
        this.info = info;
        this.before = before;
        this.next = next;
    }

    public void setBefore(Node before) {
        this.before = before;
    }

    public Node getBefore() {
        return before;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }
}
