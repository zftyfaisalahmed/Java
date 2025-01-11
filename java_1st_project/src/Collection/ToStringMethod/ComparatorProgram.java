package Collection.ToStringMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer {
    String name;
    int runs;
    int matches;
    int catches;
    String country;

    // Encapsulation - parametrized constructor
    public Cricketer(String name, int runs, int matches, int catches, String country) {
        super();
        this.name = name;
        this.runs = runs;
        this.matches = matches;
        this.catches = catches;
        this.country = country;
    }

    @Override
    public String toString() {
        return name + "----" + runs + "----" + matches + "----" + catches + "----" + country;
    }

}

class Alpha implements Comparator<Cricketer> {
    public int compare(Cricketer o1, Cricketer o2) {
        if (o1.runs < o2.runs) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparatorProgram {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Sachin", 15000, 300, 200, "India");
        Cricketer c2 = new Cricketer("Dhoni", 2000, 300, 600, "India");
        Cricketer c3 = new Cricketer("Malinga", 8000, 250, 99, "SriLanka");
        Cricketer c4 = new Cricketer("ABD", 12000, 200, 300, "SA");

        ArrayList<Cricketer> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);

        System.out.println(al);

        System.out.println("==========");

        Alpha alpha = new Alpha();
        Collections.sort(al, alpha);

        System.out.println(al);

    }
}
