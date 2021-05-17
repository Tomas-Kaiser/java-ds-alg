package queues;

import java.util.Arrays;

public class PriorityQueue {
    // insert(2)
    // [1, 3, 5, 7]
    // items[i + 1] = items[i] X wrong approach
    // iterate from the back to the front to not loose the number
    // when shifting to the right

    private int[] items;
    private int count;

    public PriorityQueue(int size) {
        this.items = new int[size];
    }

    // [1, 3, 5, 0]
    // insert 2
//    1, 2, 4
    public void enqueue(int item) {
        if (isEmpty()) {
            items[count++] = item;
            return;
        }

        if (isFull()) throw new IllegalStateException("Queue is full!");

        int index = shiftItemsToInsert(item);
        items[index] = item;
        count++;

    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    private boolean isFull() {
        return count == items.length;
    }

    private boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
