package linkedList;

import java.util.NoSuchElementException;

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
    private int count = 0;

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

        count++;
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

        count++;
    }

    public int indexOf(int value) {
        Node node = first;

        for (int i = 0; i < count; i++){
            if (node.value == value){
                return i;
            }
            node = node.next;
        }

        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;

            count = 0;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;

        count--;
    }

    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            count = 0;
            return;
        }

        Node previous = getPrevious(last);

        previous.next = null;
        last = previous;

        count--;
    }

    public int size(){
        return count;
    }

    public int[] toArray(){
        int[] arr = new int[count];

        int index = 0;
        Node current = first;
        while(current != null) {
            arr[index++] = current.value;
            current = current.next;
        }


        return arr;
    }


//      p       c       next
//    [10   -> 20     -> 30      -> 40]
    public void reverse(){
        if (isEmpty()) return;

        Node current = first.next;
        Node previous = first;
        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }


//  [10 -> 20 -> 30 -> 40 -> 50]
//    *          *
    public int getKthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalStateException();
        if (k <= 0 || k > count) throw new IllegalArgumentException();

        Node current = first;
        Node second = current;

        for (int i = 0; i < k - 1; i++){
            second = second.next;
        }

        while (second.next != null) {
            second = second.next;
            current = current.next;
        }

        return current.value;
    }

//  [10 -> 20 -> 30 -> 40 -> 50 -> 60]
    public void printMiddle(){
        Node current = first;
        Node second = current;

        while (second != last && second.next != last) {
            current = current.next;
            second = second.next.next;
        }

        System.out.println(second.value);
        if (second == last) {
            System.out.println(current.value);
        } else {
            System.out.println(current.value + ", " + current.next.value);
        }

//        Or another option:


//        for (int i = 0; i < count / 2; i++){
//            second = second.next;
//        }
//
//        while (second != last) {
//            current = current.next;
//            second = second.next;
//        }
//
//        if (count % 2 == 0) {
//            System.out.println(current.value + ", " + current.next.value);
//        } else {
//            System.out.println(current.value);
//        }

    }

    private Node getPrevious(Node node){
        Node current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }

        return null;
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
