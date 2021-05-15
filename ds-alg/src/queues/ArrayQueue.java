package queues;

import java.util.Arrays;

public class ArrayQueue {
    // Implement the Array queue
    // enqueue, dequeue, peek, isEmpty, isFull
    // [10, 20, 30, 40, 0]
    //  f           r
    // f = 0
    // r = 3

    private int[] items;
    private int count;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int size) {
        this.items = new int[size];
        this.count = 0;
        this.size = size;
    }

    // [0, 20, 30, 40, 50]
    //      f          r

    // circular array
    // 5 -> 0   left % length       // length is 5 in this case
    // 6 -> 1
    // 7 -> 2
    // 8 -> 3
    // 9 -> 4
    // 10 -> 0
    // 11 -> 1
    // (rear + 1) % length

    public void enqueue(int item) {
        if (isFull()) throw new IllegalStateException("Queue is full!");

        items[rear] = item;
        rear = (rear + 1) % size;
        count++;
    }

    // [0, 20, 30, 40, 0]
    //      f       r
    public void dequeue() {
        if (isEmpty()) throw new IllegalStateException();

        items[front] = 0;
        front = (front + 1) % size;
        count--;
    }

    public int peek() {
        return items[front];
    }

    public boolean isFull() {
        return items.length == count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
