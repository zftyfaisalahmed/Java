package Collection.ToStringMethod.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Players implements Serializable {
    String name;
    String country;
    transient int matched;
    transient int catches;
    int runs;

    public Players(String name, String country, int matched, int catches, int runs) {
        super();
        this.name = name;
        this.country = country;
        this.matched = matched;
        this.catches = catches;
        this.runs = runs;

    }

    @Override
    public String toString() {
        return name + "--" + country + "--" + matched + "--" + catches + "--" + runs;
    }
}

public class UsingTransientSerializableProg {
    public static void main(String[] args) throws Exception {
        Players c1 = new Players("Rohith", "India", 200, 180, 13000);
        System.out.println(c1.toString());

        String path = "C:\\FREQUENCY TECHNOLOGY\\JavaFiles\\Players.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c1);
        System.out.println("Object is Stored");

    }
}
