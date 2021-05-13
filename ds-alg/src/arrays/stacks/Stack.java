package arrays.stacks;

import arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Stack {
    private int[] items;
    private int count;
    private List<Integer> mins;

    public Stack() {
        this.items = new int[5];
        this.mins = new ArrayList<>();
        this.count = 0;
    }

    public void printMins() {
        for (int item : mins)
            System.out.println(item);
    }

    public int getMin(){
        if (isEmpty()) throw new IllegalStateException();

        return mins.get(0);
    }

    public void push(int item){
        if (count == items.length) {
            resize();
        }

        // set the min value
        if (isEmpty()) {
            mins.add(item);
        } else if (mins.get(count - 1) > item){
            for (int i = 0; i < count; i++) {
                if (mins.get(i) > item) {
                    mins.add(i, item);
                    break;
                }
            }
        } else {
            mins.add(item);
        }

        items[count++] = item;
    }

    public int pop() {
        if (isEmpty()) throw new IllegalStateException();

        // Remove from mins
        mins.remove(Integer.valueOf(items[count - 1]));



        items[--count] = 0;
        return items[count];
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private void resize() {
        int[] newArr = new int[count * 2];
        for (int i = 0; i < items.length; i++) {
            newArr[i] = items[i];
        }
        items = newArr;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
