package Collection.LinkedListFile;

import java.util.*;

public class LinkedSatya {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(40);
        System.out.println("List after add: " + list);

        list.addFirst(5);
        list.addLast(50);
        System.out.println("List after addFirst and addLast: " + list);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(30);
        newNumbers.add(60);
        list.addAll(newNumbers);
        System.out.println("List after addAll: " + list);

        int lastIndex = list.lastIndexOf(20);
        System.out.println("Last index of 20: " + lastIndex);

        list.remove(4);
        System.out.println("List after remove(30): " + list);

        list.removeFirst();
        System.out.println("List after removeFirst: " + list);

        list.removeLast();
        System.out.println("List after removeLast: " + list);

        ArrayList<Integer> toRemove = new ArrayList<>();
        toRemove.add(20);
        toRemove.add(40);
        list.removeAll(toRemove);
        System.out.println("List after removeAll([20, 40]): " + list);

        System.out.println("Contains 10: " + list.contains(10));

        list.poll();
        System.out.println("List after poll: " + list);

        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        list.set(1, 70);
        System.out.println("List after set: " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.sort(null);
        System.out.println("Sorted list: " + list);

        for (int x : list) {
            System.out.println(x);
        }

        int removedElement = list.pop();
        System.out.println("Popped element: " + list);

        list.push(1);
        System.out.println("List after push: " + list);

        LinkedList<Integer> clonedList = (LinkedList<Integer>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        for (int number : list) {
            System.out.println(number);
        }

        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        int hashCode = list.hashCode();
        System.out.println("HashCode of the list: " + hashCode);

        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        Class listClass = list.getClass();
        System.out.println("Class of the list: " + listClass.getName());

        list.offer(50);
        System.out.println("After offer(50): " + list);

        list.offerFirst(5);
        System.out.println("After offerFirst(5): " + list);

        list.offerLast(60);
        System.out.println("After offerLast(60): " + list);

        int f = list.peek();
        System.out.println("Element peeked (first element): " + f);
        System.out.println("List after peek: " + list);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---");

        while (it.hasPrevious()) {
            System.out.println(it.previous());

        }
    }
}