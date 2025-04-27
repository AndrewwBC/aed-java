package org.example;

public class Main {
    public static void main(String[] args) {


        int i = 1;

        SingleLinkedList list = new SingleLinkedList();
        Node lastNode = null;

        while(i <= 10) {
            Node node = new Node(i, null);
            list.insert(node);
            if(i == 10) lastNode = node;

            i++;
        }

        Node node = new Node(999, null);

        list.insertAfter(lastNode, node);

        list.displayList();

    }
}