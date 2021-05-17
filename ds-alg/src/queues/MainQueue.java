package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MainQueue {
    public static void main(String[] args){

        StackWithTwoQueues stack = new StackWithTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);




//        LinkedListQueue lsq = new LinkedListQueue();
//        lsq.enqueue(10);
//        lsq.enqueue(20);
//        lsq.enqueue(30);
//        lsq.enqueue(40);
//        lsq.dequeue();
//        System.out.println(lsq.peek());
//        System.out.println(lsq.size());
//        System.out.println(lsq.isEmpty());
//        System.out.println(lsq);




//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.add(50);
//        QueueReverser qr = new QueueReverser();
//        qr.reverse(queue, 4);
//        System.out.println(queue);

//        PriorityQueue pq = new PriorityQueue(5);
//        pq.enqueue(4);
//        pq.enqueue(5);
//        pq.enqueue(2);
//        pq.enqueue(1);
//        pq.enqueue(3);
//        pq.enqueue(6);
//        System.out.println(pq);


//        StackQueue sq = new StackQueue();
//        sq.enqueue(10);
//        sq.enqueue(20);
//        sq.enqueue(30);
//        sq.dequeue();
//        sq.enqueue(40);
//        sq.dequeue();
//        sq.enqueue(50);
//        System.out.println(sq);



//        ArrayQueue aq = new ArrayQueue(5);
//        aq.enqueue(10);
//        aq.enqueue(20);
//        aq.enqueue(30);
//        aq.enqueue(40);
//        aq.enqueue(50);
//        aq.enqueue(50);
//
//        aq.dequeue();
//        aq.dequeue();
//        aq.dequeue();
//        aq.enqueue(10);
//        aq.enqueue(11);
//        aq.enqueue(12);
//        aq.dequeue();
//
//        System.out.println(aq.isFull());
//        System.out.println(aq.peek());
//        System.out.println(aq.isEmpty());
//        System.out.println(aq);


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
