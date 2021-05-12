package linkedList;

import java.util.Arrays;

public class MainLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
//        list.addFirst(40);

//        System.out.println(list.indexOf(0));
//        System.out.println(list.contains(12));
//        list.removeLast();

//        System.out.println(list.size());
//
//        System.out.println(Arrays.toString(list.toArray()));
//
//        list.reverse();
//        System.out.println(Arrays.toString(list.toArray()));

//        System.out.println(list.getKthFromTheEnd(3));
//        list.printMiddle();

        System.out.println(list.hasLoop());
        System.out.println("-----------");

        System.out.println(list);
    }
}
