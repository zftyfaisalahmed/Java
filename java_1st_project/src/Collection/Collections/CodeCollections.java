package Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CodeCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        // Adding elements to al and printing it
        System.out.println(al);
        // Output: [100, 200, 300, 400, 500, 600]
        // Comment: Prints the list as it was added sequentially.

        Collections.sort(al);
        System.out.println(al);
        // Output: [100, 200, 300, 400, 500, 600]
        // Comment: The list is already sorted, so the output remains the same.

        int pos = Collections.binarySearch(al, 100);
        System.out.println(pos);
        // Output: 0
        // Comment: 100 is found at index 0 using binary search on the sorted list.

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1100);
        al1.add(1200);
        al1.add(1300);
        al1.add(1400);
        al1.add(1500);
        al1.add(1600);
        al1.add(2100);
        al1.add(2200);
        al1.add(2300);
        al1.add(2400);
        al1.add(2500);
        al1.add(2600);
        Collections.copy(al1, al);
        System.out.println(al1);
        // Output: [100, 200, 300, 400, 500, 600, 2100, ...]
        // Comment: The first six elements of `al1` are replaced with elements from
        // `al`.

        Integer max = Collections.max(al1);
        System.out.println(max);
        // Output: 2600
        // Comment: Finds and prints the maximum value in `al1`.

        Integer min = Collections.min(al1);
        System.out.println(min);
        // Output: 100
        // Comment: Finds and prints the minimum value in `al1`.

        int freq = Collections.frequency(al1, 2600);
        System.out.println(freq);
        // Output: 1
        // Comment: Counts how many times 2600 appears in `al1`.

        Collections.replaceAll(al1, 2600, 2500);
        System.out.println(al1);
        // Output: [100, ..., 2500]
        // Comment: Replaces all occurrences of 2600 with 2500.

        Collections.reverse(al1);
        System.out.println(al1);
        // Output: Reversed version of `al1`
        // Comment: Reverses the order of elements in `al1`.

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(4);
        al2.add(5);
        System.out.println(al2);
        // Output: [1, 2, 3, 4, 5]
        // Comment: Prints the original list.

        Collections.rotate(al2, 3);
        System.out.println(al2);
        // Output: [3, 4, 5, 1, 2]
        // Comment: Rotates the list 3 positions to the right.

        Collections.shuffle(al2);
        System.out.println(al2);
        // Output: Elements of `al2` in random order
        // Comment: Shuffles elements randomly.

        Collections.swap(al2, 2, 4);
        System.out.println(al2);
        // Output: Swaps elements at positions 2 and 4
        // Comment: After swapping, elements at these indices are exchanged.

    }
}
