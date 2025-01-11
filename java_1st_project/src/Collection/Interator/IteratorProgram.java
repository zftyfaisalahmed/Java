package Collection.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorProgram {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        System.out.println(al);

        System.out.println("=========");
        System.out.println("Using for loop : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("=========");
        ArrayList<String> als = new ArrayList<>();
        als.add("dfvghbjcn");
        als.add("sdgfh");
        als.add("bdvfsdc");
        als.add("ggbdfvd");
        System.out.println("Using for each loop : ");
        for (String o : als) {
            System.out.println(o);
        }
        System.out.println("=========");
        System.out.println("Using Iterator : ");
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext() == true) {
            int al1 = iterator.next();
            System.out.println(al1);
        }
        System.out.println("=========");
        System.out.println("Using List Iterator : ");
        ListIterator<Integer> listIterator = al.listIterator();
        while (listIterator.hasNext() == true) {
            int al2 = listIterator.next();
            System.out.println(al2);
        }
    }
}
