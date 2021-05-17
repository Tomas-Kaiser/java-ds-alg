package queues;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    // O(1)
    public void enqueue(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

        count++;
    }

    // O(1)
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();

        int value;
        if (first == last) {
            value = first.value;
            first = last = null;
        } else {
            value = first.value;
            Node second = first.next;
            first.next = null;
            first = second;
        }
        count--;

        return value;
    }

    // O(1)
    public boolean isEmpty() {
        return first == null;
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return first.value;
    }

    // O(1)
    public int size() {
        return this.count;
    }

    // O(n)
    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = first;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }
}
