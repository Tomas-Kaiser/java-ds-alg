package queues;

import java.util.Stack;

public class StackQueue {
//    [10, 20, 30
//      S1 = [20, 30]
//      S2 = [10]
    private Stack<Integer> stack1; // used for adding items
    private Stack<Integer> stack2; // used for removing items

    public StackQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        moveStack1ToStack2();

        return stack2.pop();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    @Override
    public String toString() {
        return "StackQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
