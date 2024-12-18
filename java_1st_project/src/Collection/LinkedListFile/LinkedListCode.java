package Collection.LinkedListFile;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.add(30);
        ll.add(34);
        ll.add(56);
        ll.add(123);
        ll.add(302);
        ll.add(450);
        ll.add(305);

        System.out.println(ll);

        ll.addFirst(1000);
        ll.addLast(2000);

        ArrayList al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        ll.addAll(al);
        System.out.println(ll);

        ll.addAll(4, al);
        System.out.println(ll);
    }

}
