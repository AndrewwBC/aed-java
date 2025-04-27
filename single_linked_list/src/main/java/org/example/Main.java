package org.example;

public class Main {
    public static void main(String[] args) {


        int i = 1;

        SingleLinkedList list = new SingleLinkedList();
        Node lastNode = null;
        Node firstNode = null;

        while(i <= 10) {
            Node node = new Node(i, null);
            list.insert(node);
            if(i == 1) firstNode = node;
            if(i == 10) lastNode = node;

            i++;
        }

        Node node = new Node(999, null);
        Node node1 = new Node(111, null);
        list.insertAfter(lastNode, node);
        list.insertBefore(firstNode, node1);

        list.displayList();

    }
}