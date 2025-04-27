package org.example;

public class Queue implements QueueBehavior {

    private Node front = null;

    @Override
    public void insertNode(Node nodeToInsertInQueue) {
        if (this.front == null) this.front = nodeToInsertInQueue;
        else {
            this.iterateQueue(this.front, nodeToInsertInQueue);
        }

    }

    @Override
    public Node removeNode(Node nodeToIterate) {
        if(nodeToIterate.getNext().getNext() == null) {
            Node removedNode = nodeToIterate.getNext().getNext();
            nodeToIterate.setNext(null);
            return removedNode;
        } else {
            return this.removeNode(nodeToIterate.getNext());
        }
    }

    private Node iterateQueue(Node nodeToIterate, Node nodeToInsertInQueue) {
        if (nodeToIterate.getNext() != null) return this.iterateQueue(nodeToIterate.getNext(), nodeToInsertInQueue);
        else {
            nodeToIterate.setNext(nodeToInsertInQueue);
            return nodeToIterate;
        }
    }

    public void displayQueue() {

        Node nodeToIterate = this.front;

        while(nodeToIterate != null) {
            System.out.println(nodeToIterate.getInfo());
            nodeToIterate = nodeToIterate.getNext();
        }
    }
}
