package Collection.LinkedListFile;

import java.util.LinkedList;

public class LinkedListCode1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();

        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println(ll);

        LinkedList ll1 = new LinkedList<>();
        ll1.add(70);
        ll1.add(80);
        ll1.add(90);
        System.out.println(ll1);

        ll.push(10);
        System.out.println(ll);

        ll.clone();
        System.out.println(ll);

        ll.pop();
        System.out.println(ll);

        boolean res;

        res = ll.containsAll(ll1);
        System.out.println(res);

        res = ll.containsAll(ll);
        System.out.println(res);

    }
}
