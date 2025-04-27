package org.example;

public class Queue implements QueueBehavior {

    private Node front = null;

    @Override
    public void insertNode(Node nodeToInsertInQueue) {
        if (this.front == null) this.front = nodeToInsertInQueue;
        else {
            this.iterateQueueRecursive(this.front, nodeToInsertInQueue);
        }

    }

    @Override
    public Node removeNode() {
        return null;
    }

    public Node iterateQueueRecursive(Node nodeToIterate, Node nodeToInsertInQueue) {
        if (nodeToIterate.getNext() != null) return this.iterateQueueRecursive(nodeToIterate.getNext(), nodeToInsertInQueue);
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
