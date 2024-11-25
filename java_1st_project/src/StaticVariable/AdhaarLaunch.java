package StaticVariable;

import java.util.Scanner;

class details {
    int id;
    int AdhaarNo;
    String n;
    String name;
    static String nation = "Indian";
    Scanner sc = new Scanner(System.in);

    void reaData() {
        System.out.println("Enter the Id NO = ");
        AdhaarNo = sc.nextInt();
        System.out.println("Enter the Name = ");
        name = sc.next();

    }

    void display() {
        System.out.println("My Adhaar Number is " + AdhaarNo);
        System.out.println("My name is " + name);
        System.out.println("My Nationality is " + n);
        System.out.println("My Nationality is " + nation);
    }

}

public class AdhaarLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        details d = new details();
        d.reaData();
        d.display();
    }
}