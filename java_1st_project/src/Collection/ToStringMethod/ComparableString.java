package Collection.ToStringMethod;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1> {
    String name;
    int runs;

    public Cricketer1(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    @Override
    public int compareTo(Cricketer1 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + "----" + runs;
    }
}

public class ComparableString {
    public static void main(String[] args) {
        ArrayList<Cricketer1> ac = new ArrayList<>();
        ac.add(new Cricketer1("Sachin", 15000));
        ac.add(new Cricketer1("Dhoni", 2000));
        ac.add(new Cricketer1("Malinga", 8000));
        ac.add(new Cricketer1("ABD", 12000));

        System.out.println("Before Sorting:");
        System.out.println(ac);

        Collections.sort(ac);

        System.out.println("After Sorting:");
        System.out.println(ac);
    }
}
