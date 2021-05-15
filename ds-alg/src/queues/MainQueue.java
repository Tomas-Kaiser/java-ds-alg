package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MainQueue {
    public static void main(String[] args){
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.enqueue(50);
//        aq.enqueue(50);

        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.enqueue(10);
        aq.enqueue(11);
        aq.enqueue(12);
        aq.dequeue();

        System.out.println(aq.isFull());
        System.out.println(aq.peek());
        System.out.println(aq.isEmpty());
        System.out.println(aq);


//        Reverse exercise
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverse(queue);
//        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

    }
}
