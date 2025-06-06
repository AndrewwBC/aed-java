package org.example;

import java.util.Objects;

public class DoublyLinkedList implements DoublyLinkedListBehavior {

    private Node first;

    @Override
    public void insert(Node node) {
        if(this.first == null) this.first = node;
        else insertRecursive(this.first, node);
    }

    @Override
    public Node remove(Node node) {
        Node removedNode = null;
        if(this.first.getNext() == null) {
            removedNode = this.first;
            this.first = null;
            return removedNode;
        } else {
            if(node == null) return this.remove(this.first);
            else {
                if(node.getNext().getNext() != null) return this.remove(node.getNext());
                else {
                    removedNode = node.getNext();
                    node.setNext(null);
                    return removedNode;
                }
            }
        }
    }

    @Override
    public void insertAfter(Node referenceNode, Node nodeToInsert) {
        if(referenceNode == null || nodeToInsert == null) {
            throw new IllegalArgumentException("Reference node must not be null");
        }

        Node originalNextOfReferenceNode = referenceNode.getNext();
        referenceNode.setNext(nodeToInsert);

        nodeToInsert.setNext(originalNextOfReferenceNode);
    }

    @Override
    public void insertBefore(Node referenceNode, Node nodeToInsert) {

        if(this.first.getNext() == null || Objects.equals(this.first, referenceNode)) {
            Node originalFirst = this.first;
            this.first = nodeToInsert;
            this.first.setNext(originalFirst);
            originalFirst.setBefore(this.first);
            return;
        }

        Node originalBeforeReferenceNode = referenceNode.getBefore();
        originalBeforeReferenceNode.setNext(nodeToInsert);

        nodeToInsert.setBefore(originalBeforeReferenceNode);
        nodeToInsert.setNext(referenceNode);

        referenceNode.setBefore(nodeToInsert);
    }

    private Node insertRecursive(Node nodeToIterate, Node nodeToInsert) {
        if(nodeToIterate.getNext() != null) return this.insertRecursive(nodeToIterate.getNext(), nodeToInsert);
        else {
            nodeToIterate.setNext(nodeToInsert);
            nodeToInsert.setBefore(nodeToIterate);
            return nodeToInsert;
        }
    }
    public void displayList() {

        Node nodeToIterate = this.first;

        while(nodeToIterate != null) {

            if(nodeToIterate.getNext() == null) System.out.println(nodeToIterate.getInfo());
            else if(nodeToIterate.getBefore() != null) System.out.println(nodeToIterate.getBefore().getInfo() + " - " + nodeToIterate.getInfo() + " - " + nodeToIterate.getNext().getInfo());
            else System.out.println(nodeToIterate.getInfo() + " - " + nodeToIterate.getNext().getInfo());

            nodeToIterate = nodeToIterate.getNext();
        }
    }

}

