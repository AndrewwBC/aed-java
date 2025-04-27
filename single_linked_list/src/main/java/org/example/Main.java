package org.example;

public class Main {
    public static void main(String[] args) {


        int i = 1;

        SingleLinkedList list = new SingleLinkedList();

        while(i <= 10) {
            Node node = new Node(i, null);
            list.insert(node);
            if(i == 10) {
                Node removedNode = list.remove(null);
                System.out.println(removedNode.getInfo());
            }
            i++;
        }

        list.displayList();

    }
}