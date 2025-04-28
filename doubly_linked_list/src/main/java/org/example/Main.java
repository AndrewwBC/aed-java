package org.example;

public class Main {
    public static void main(String[] args) {

        int i = 1;

        DoublyLinkedList list = new DoublyLinkedList();

        Node secondNode = null;
        Node random = new Node(555, null, null);

        while(i <= 10) {
            Node node = new Node(i, null, null);
            list.insert(node);
            if(i == 2) secondNode = node;
            i++;
        }

        list.insertBefore(secondNode, random);

        list.displayList();
    }
}