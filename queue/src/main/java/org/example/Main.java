package org.example;

public class Main {
    public static void main(String[] args) {

        int i = 1;

        Queue queue = new Queue();

        while(i <= 10) {
            Node node = new Node(i, null);
            queue.insertNode(node);

            i++;
        }

        queue.displayQueue();

    }
}