package org.example;

public class Node {

    private Integer info;

    private Node next;

    public Node(Integer info, Node next){
        this.info = info;
        this.next = next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Integer getInfo(){
        return this.info;
    }

    public Node getNext(){
        return this.next;
    }

}
