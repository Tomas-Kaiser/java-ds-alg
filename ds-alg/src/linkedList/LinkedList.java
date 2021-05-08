package linkedList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int value){
        Node node = new Node(value);

        // If this is the very fist node in LinkedList
        if (isEmpty())
            first = last = node;
        else {
            // If it is the second node or more...
            last.next = node;
            last = node;

        }

    }

    public void addFirst(int value){
        Node node = new Node(value);

        // If this is the very fist node in LinkedList
        if (isEmpty())
            first = last = node;

        else {
            node.next = first;
            first = node;
        }
    }


    private boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        Node node = first;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

        return "LinkedList{" +
                "first=" + first.value +
                ", last=" + last.value +
                '}';
    }
}
