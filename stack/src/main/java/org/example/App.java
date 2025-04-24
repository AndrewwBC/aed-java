package org.example;

public class App {
    public static void main(String[] args) {

        Stack stack = new Stack();

        int i = 0;
        while (i <= 10) {
            if(i == 0) stack.insertNode(new Node(i, null));
            else stack.insertNode(new Node(i, stack.getTop()));
            i++;
        }

        stack.displayNodes();

        stack.removeNode();
        stack.removeNode();
        stack.displayNodes();
    }
}