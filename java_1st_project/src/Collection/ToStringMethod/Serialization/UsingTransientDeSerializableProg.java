package Collection.ToStringMethod.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UsingTransientDeSerializableProg {
    public static void main(String[] args) throws Exception {
        String path = "C:\\FREQUENCY TECHNOLOGY\\JavaFiles\\Players.txt";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Players c1 = (Players) ois.readObject();
        System.out.println(c1.toString());
    }
}
