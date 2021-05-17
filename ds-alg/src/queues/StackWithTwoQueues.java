package queues;

import java.util.*;

public class StackWithTwoQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public StackWithTwoQueues() {
        this.queue1 = new ArrayDeque<>();
        this.queue2 = new ArrayDeque<>();
    }

    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    // 10, 20, 30
    // 10, 20
    public int pop() {
        if (queue1.isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int peek() {
        return top;
    }

    public int size() {
        return queue1.size();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
