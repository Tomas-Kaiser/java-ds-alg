package linkedList;

public class MainLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
//        list.addFirst(40);

//        System.out.println(list.indexOf(0));
//        System.out.println(list.contains(12));
//        list.removeLast();

        System.out.println(list);
    }
}
