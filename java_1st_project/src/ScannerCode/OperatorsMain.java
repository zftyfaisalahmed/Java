package ScannerCode;

import java.util.Scanner;

class Operation {
    void chooseOperator() {
        System.out.println("Operation : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the opeartion to be performed : \n" + "1. Arthimetic\n" + "2. Relation\n");
        int choose = sc.nextInt();
        // System.out.println("Enter the num 1");
        // int num1 = sc.nextInt();
        // System.out.println("Enter the num 2");
        // int num2 = sc.nextInt();
        // System.out.println("Select the opeartion to be performed : \n" + "1.
        // Addition\n" + "2. Subtraction\n"
        // + "3. Multiple\n" + "4. Division\n" + "5. Modulus\n" + "6. Exit\n");
        // int choice = sc.nextInt();

        switch (choose) {
            case 1: {
                Operation op = new Operation();
                op.arithematic();
                break;
            }

            case 2: {
                Operation op = new Operation();
                op.relation();
                break;
            }
            default:
                break;
        }

    }

    void arithematic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the opeartion to be performed : \n" + "1. Addition\n" + "2. Subtraction\n"
                + "3. Multiple\n" + "4. Division\n" + "5. Modulus\n" + "6. Exit\n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter the num 1");
                int num1 = sc.nextInt();
                System.out.println("Enter the num 2");
                int num2 = sc.nextInt();

                System.out.println("Addition result is :");
                System.out.println(num1 + num2);
                System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    arithematic();
                    break;
                } else if (num == 2) {
                    chooseOperator();
                    break;
                } else {
                    break;
                }
            }

            case 2: {
                System.out.println("Enter the num 1");
                int num1 = sc.nextInt();
                System.out.println("Enter the num 2");
                int num2 = sc.nextInt();

                System.out.println("Subtraction result is :");
                System.out.println(num1 - num2);
                System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    arithematic();
                    break;
                } else if (num == 2) {
                    chooseOperator();
                    break;
                } else {
                    break;
                }
            }

            case 3: {
                System.out.println("Enter the num 1");
                int num1 = sc.nextInt();
                System.out.println("Enter the num 2");
                int num2 = sc.nextInt();

                System.out.println("Multiple result is :");
                System.out.println(num1 * num2);
                System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    arithematic();
                    break;
                } else if (num == 2) {
                    chooseOperator();
                    break;
                } else {
                    break;
                }
            }

            case 4: {
                System.out.println("Enter the num 1");
                int num1 = sc.nextInt();
                System.out.println("Enter the num 2");
                int num2 = sc.nextInt();

                System.out.println("Division result is :");
                System.out.println(num1 / num2);
                System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    arithematic();
                    break;
                } else if (num == 2) {
                    chooseOperator();
                    break;
                } else {
                    break;
                }
            }

            case 5: {
                System.out.println("Enter the num 1");
                int num1 = sc.nextInt();
                System.out.println("Enter the num 2");
                int num2 = sc.nextInt();

                System.out.println("Modulus result is :");
                System.out.println(num1 % num2);
                System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    arithematic();
                    break;
                } else if (num == 2) {
                    chooseOperator();
                    break;
                } else {
                    break;
                }
            }

            default:
                break;
        }
    }

    void relation() {
        System.out.println("Relational Operators");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("School kid");
        } else if (age >= 16) {
            System.out.println("Completed Schooling");
        }

        System.out.println("================");

        if (age <= 22) {
            System.out.println("College Kid");
        } else if (age > 22) {
            System.out.println("Completed College");
        }

        System.out.println("==================");

        if (age == 27) {
            System.out.println("Right Age for Marriage");
        } else if (age != 45) {
            System.out.println("Not Valid for Marriage");
        }

        System.out.println("type 1 if you wish to continue, For Operation type 2, For Exit type 0");
        int num = sc.nextInt();

        switch (num) {
            case 1: {
                relation();
                break;
            }

            case 2: {
                chooseOperator();
                break;
            }

            default:
                break;
        }
    }
}

class OperatorsMain {
    public static void main(String[] args) {
        Operation op = new Operation(); // instance
        op.chooseOperator();
    }
}
