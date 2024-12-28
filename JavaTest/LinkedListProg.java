package JavaTest;

import java.util.LinkedList;

public class LinkedListProg {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] data = { 47, 59, 32, 16, 6, 18, 56, 125, 185, 150 };

        for (int each : data) {
            list.add(each);
        }

        System.out.println("LinkedList: " + list);
    }
}
