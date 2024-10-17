import java.util.Scanner;

class PatternOp {
    void choosePattern() {
        System.out.println("Patterns : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Patterns to be performed : \n" + "1. pattern1\n" + "2. pattern2\n"
                + "3. pattern3\n" + "4. pattern4\n" + "5. pattern5\n" + "6. pattern6\n" + "7. pattern7\n"
                + "8. pattern8\n" + "9. pattern9\n" + "10. pattern10\n");
        int choose = sc.nextInt();

        switch (choose) {
            case 1: {
                PatternOp op = new PatternOp();
                op.pattern1();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern1();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }

            case 2: {
                PatternOp op = new PatternOp();
                op.pattern2();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern2();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }

            case 3: {
                PatternOp op = new PatternOp();
                op.pattern3();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern3();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 4: {
                PatternOp op = new PatternOp();
                op.pattern4();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern4();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 5: {
                PatternOp op = new PatternOp();
                op.pattern5();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern5();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 6: {
                PatternOp op = new PatternOp();
                op.pattern6();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern6();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 7: {
                PatternOp op = new PatternOp();
                op.pattern7();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern7();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 8: {
                PatternOp op = new PatternOp();
                op.pattern8();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern8();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 9: {
                PatternOp op = new PatternOp();
                op.pattern9();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern9();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }
            case 10: {
                PatternOp op = new PatternOp();
                op.pattern10();

                System.out.println("type 1 if you wish to continue, For Patterns type 2, For Exit type 0");
                int num = sc.nextInt();
                if (num == 1) {
                    pattern10();
                    break;
                } else if (num == 2) {
                    choosePattern();
                    break;
                } else {
                    break;
                }
            }

            default:
                break;
        }

    }

    void pattern1() {
        System.out.println("#");
    }

    void pattern2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("#");
        }
    }

    void pattern3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("# ");
        }
    }

    void pattern4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    void pattern5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    void pattern6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    void pattern7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    void pattern8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    void pattern9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                System.out.print("  ");
                count++;
            }
            System.out.println();
        }
    }

    void pattern10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int count = n * n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                System.out.print("  ");
                count--;
            }
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        PatternOp pa = new PatternOp(); // instance
        pa.choosePattern();
    }
}
