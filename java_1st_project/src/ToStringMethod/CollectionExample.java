package ToStringMethod;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(32);
        al.add(42);
        al.add(22);
        al.add(44);
        al.add(72);
        System.out.println(al);

        // Approach-1
        // TreeSet<Integer> ts = new TreeSet<>();
        // ts.addAll(al);
        // al.clear();
        // al.addAll(ts);
        // System.out.println(ts); // Sorted

        Collections.sort(al);
        System.out.println(al);
        System.out.println("============");

        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(12);
        ad.add(32);
        ad.add(42);
        ad.add(22);
        ad.add(44);
        ad.add(72);
        System.out.println("Before Sorting " + ad);

        // Collections.sort(ad); // It will show an error

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.addAll(ad);
        Collections.sort(al1);
        System.out.println("After Sorting " + al1);
    }
}
