package ToStringMethod;

import java.util.ArrayList;
import java.util.Collections;

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
}

public class ToString1 {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Sachin", 15000, 300, 200, "India");
        Cricketer c2 = new Cricketer("Dhoni", 12000, 300, 600, "India");
        Cricketer c3 = new Cricketer("Malinga", 5000, 250, 99, "SriLanka");
        Cricketer c4 = new Cricketer("ABD", 9000, 200, 300, "SA");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        ArrayList<Cricketer> ac = new ArrayList<>();
        ac.add(c1);
        ac.add(c2);
        ac.add(c3);
        ac.add(c4);

        System.out.println(ac);

        // Collections.sort(ac);
    }
}
