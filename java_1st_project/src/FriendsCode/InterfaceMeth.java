package FriendsCode;

interface Innertr {
    void pritnMessage(String msg);
}

public class InterfaceMeth {
    public static void main(String[] args) {
        Innertr printInner = (message) -> System.out.println("Hello, " + message);
        printInner.pritnMessage("World");
    }
}
