package org.example;

public interface SingleLinkedListBehavior {

    public void insert(Node node);
    public Node remove(Node node);
    public void insertAfter( Node referenceNode, Node nodeToInsert);
    public void insertBefore();

}
