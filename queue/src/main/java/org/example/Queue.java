package org.example;

public class Queue implements QueueBehavior {

    private Node front = null;

    @Override
    public void insertNode(Node nodeToInsertInQueue) {
        if (this.front == null) this.front = nodeToInsertInQueue;
        else {
            Node nodeToIterate = this.front;

            while (nodeToIterate != null) {

                if (nodeToIterate.getNext() == null) {
                    nodeToIterate.setNext(nodeToInsertInQueue);
                    break;
                }

                nodeToIterate = nodeToIterate.getNext();
            }

        }

    }

    @Override
    public Node removeNode() {
        return null;
    }

    public void displayQueue() {

        Node nodeToIterate = this.front;

        while(nodeToIterate != null) {
            System.out.println(nodeToIterate.getInfo());
            nodeToIterate = nodeToIterate.getNext();
        }

    }
}
