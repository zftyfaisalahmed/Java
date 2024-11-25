package ScannerCode;

import java.util.Scanner;

class Operators {
    void arithmeticOperators() {
        System.out.println("Arithmetic operations: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation to be performed: \n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + "5. Modulus\n"
                + "6. Exit\n");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Addition result is: ");
                System.out.println(num1 + num2);
                System.out.println("Type 1 to continue or else type 0");
                int num = sc.nextInt();
                if (num == 1)
                    arithmeticOperators();
                else
                    break;
            }
            case 2: {
                System.out.println("Subtraction result is: ");
                System.out.println(num1 - num2);
                System.out.println("Type 1 to continue or else type 0");
                int num = sc.nextInt();
                if (num == 1)
                    arithmeticOperators();
                else
                    break;
            }
            case 3: {
                System.out.println("Multiplication result is: ");
                System.out.println(num1 * num2);
                System.out.println("Type 1 to continue or else type 0");
                int num = sc.nextInt();
                if (num == 1)
                    arithmeticOperators();
                else
                    break;
            }
            case 4: {
                System.out.println("Division result is: ");
                System.out.println(num1 / num2);
                System.out.println("Type 1 to continue or else type 0");
                int num = sc.nextInt();
                if (num == 1)
                    arithmeticOperators();
                else
                    break;
            }
            case 5: {
                System.out.println("Modulus result is: ");
                System.out.println(num1 % num2);
                System.out.println("Type 1 to continue or else type 0");
                int num = sc.nextInt();
                if (num == 1)
                    arithmeticOperators();
                else
                    break;
            }

            default:
                break;
        }

    }

    void relationalOperators() {
        System.out.println("Relational Operators: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 16)
            System.out.println("School kid");
        else if (age >= 16)
            System.out.println("Completed Schooling");
        System.out.println("--------------------------");
        if (age <= 22)
            System.out.println("college kid");
        else if (age > 22)
            System.out.println("Completed college");
        System.out.println("--------------------------");
        if (age == 27)
            System.out.println("Right age for the marriage");
        else if (age != 45)
            System.out.println("might be married ");
        System.out.println("--------------------------");
    }
}

public class OperatorsCode {

    public static void main(String[] args) {
        Operators ob = new Operators();
        ob.arithmeticOperators();
        ob.relationalOperators();
    }

}
