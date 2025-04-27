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
    public Node removeNode() {
        Node node = this.front;

        if(this.front.getNext() == null) this.front = null;
        else this.front = this.front.getNext();

        return node;
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
