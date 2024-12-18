package Collection.LinkedListFile;

import java.util.LinkedList;

public class LinkedListCode3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();

        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println(ll);

        int int1 = ll.lastIndexOf(60);
        System.out.println(int1);

        Object obj = ll.remove(3);
        System.out.println(obj);
        System.out.println(ll);

        obj = ll.removeFirst();
        System.out.println(obj);
        System.out.println(ll);

        obj = ll.removeLast();
        System.out.println(obj);
        System.out.println(ll);

        boolean obj1 = ll.remove(ll);
        System.out.println(obj1);

        obj1 = ll.removeAll(ll);
        System.out.println(obj1);
        System.out.println(ll);
    }
}
