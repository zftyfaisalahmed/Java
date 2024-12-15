package ExceptionHandling;

import java.util.Scanner;

class InvalidAccNo extends Exception {
    public String getMessage() {
        return "The provide Account Number is Invalid. Please try again!!";
    }
}

class InvalidPass extends Exception {
    public String getMessage() {
        return "The provide Password is Invalid. Please try again!!";
    }
}

class Customer {
    private int accno;
    private int pass;
    private int arg_no = 111;
    private int arg_pass = 222;

    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Acc No : ");
        accno = sc.nextInt();
        System.out.println("Enter the password : ");
        pass = sc.nextInt();
    }

    void validate() throws InvalidAccNo, InvalidPass {
        if (accno == arg_no) {
            if (pass == arg_pass) {
                System.out.println("User Valid");
            } else {
                InvalidAccNo ian = new InvalidAccNo();
                System.out.println(ian.getMessage());
                throw ian;
            }
        } else {
            InvalidPass ip = new InvalidPass();
            System.out.println(ip.getMessage());
            throw ip;
        }
    }
}

class NetBanking {
    void verify(Customer c) {
        try {
            c.collectData();
            c.validate();
        } catch (InvalidAccNo | InvalidPass e1) {
            System.out.println("You have two attempts remaining to enter correct AccNo and Password");
            try {
                c.collectData();
                c.validate();
            } catch (InvalidAccNo | InvalidPass e2) {
                System.out.println("You have one attempts remaining to enter correct AccNo and Password");
                try {
                    c.collectData();
                    c.validate();
                } catch (InvalidAccNo | InvalidPass e3) {
                    System.out.println("User Blocked");
                    System.exit(0);
                }
            }
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        NetBanking nb = new NetBanking();
        // c1.collectData();
        nb.verify(c1);
    }
}
