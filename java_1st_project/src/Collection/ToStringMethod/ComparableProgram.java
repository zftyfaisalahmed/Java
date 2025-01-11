package Collection.ToStringMethod;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer2 implements Comparable<Cricketer2> {
    String name;
    int runs;
    int matches;
    int catches;
    String country;

    // Encapsulation - parametrized constructor
    public Cricketer2(String name, int runs, int matches, int catches, String country) {
        super();
        this.name = name;
        this.runs = runs;
        this.matches = matches;
        this.catches = catches;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getRuns() {
        return runs;
    }

    public int getMatches() {
        return matches;
    }

    public int getCatches() {
        return catches;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return name + "----" + runs + "----" + matches + "----" + catches + "----" + country;
    }

    @Override
    public int compareTo(Cricketer2 o) {
        if (this.runs < o.runs) {
            return 1;
        } else {
            return -1;
        }
    }

    // @Override
    // public int compareTo(Cricketer2 o) {
    // return this.name.compareTo(o.name);
    // }
}

public class ComparableProgram {
    public static void main(String[] args) {
        Cricketer2 c1 = new Cricketer2("Sachin", 15000, 300, 200, "India");
        Cricketer2 c2 = new Cricketer2("Dhoni", 2000, 300, 600, "India");
        Cricketer2 c3 = new Cricketer2("Malinga", 8000, 250, 99, "SriLanka");
        Cricketer2 c4 = new Cricketer2("ABD", 12000, 200, 300, "SA");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        ArrayList<Cricketer2> ac = new ArrayList<>();
        ac.add(c1);
        ac.add(c2);
        ac.add(c3);
        ac.add(c4);

        System.out.println(ac);

        Collections.sort(ac);

        System.out.println(ac);
    }
}
