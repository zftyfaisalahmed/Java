package Collection.LinkedListFile;

import java.util.LinkedList;

public class LinkedListCode2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();

        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println(ll);

        Object object1 = ll.get(4);
        System.out.println(object1);

        Class class1 = ll.getClass();
        System.out.println(class1);

        object1 = ll.getFirst();
        System.out.println(object1);

        object1 = ll.getLast();
        System.out.println(object1);

        int hashCode = ll.hashCode();
        System.out.println(hashCode);

        int indexOf = ll.indexOf(20);
        System.out.println(indexOf);

        boolean ll1;

        ll1 = ll.isEmpty();
        System.out.println(ll1);

        // ll.clear();
        // ll1 = ll.isEmpty();
        // System.out.println(ll1);

        ll.offer(object1);
        System.out.println(ll);

    }
}
