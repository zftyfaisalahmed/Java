package QuizProjectJava;

import java.util.Scanner;

public class Questions {
    Scanner sc = new Scanner(System.in);
    static int life_line_count = 2;
    static int ff = 1;
    static int ap = 1;

    boolean question1(Candidate c) {
        String question1 = "1. Which is the capital of India?";
        System.out.println(question1 + " \n Select the correct option");
        System.out.println("1. Karnataka\n"
                + "2. Tamil Nadu\n"
                + "3. New Delhi\n"
                + "4. Jammu\n"
                + "5. Life Line");
        int opt = sc.nextInt();

        if (opt == 3) {
            return true;
        } else if (opt == 5) {
            life_line_count--;
            if (ff == 1 && ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();

                if (opt1 == 1) {
                    ff--;

                    System.out.println("50 - 50 Life is Played " + ff);
                    System.out.println("1. Karnataka\n"
                            + "3. New Delhi\n");

                    opt = sc.nextInt();
                    if (opt == 3) {
                        return true;
                    } else {
                        return false;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    System.out.println("Audiance Poll Life is Played " + ap);
                    System.out.println("1. Karnataka --> 25%\n"
                            + "2. Tamil Nadu --> 20%\n"
                            + "3. New Delhi --> 35%\n"
                            + "4. Jammu --> 20%\n");

                    opt = sc.nextInt();
                    if (opt == 3) {
                        return true;
                    } else {
                        return false;
                    }

                }

            }

        } else {
            return false;
        }
        return false;
    }

    boolean question2(Candidate c) {
        String question2 = "2. Who is the founder of Codegnan Destination?";
        System.out.println(question2 + " \n Select the correct option");
        System.out.println("1. Deepak\n"
                + "2. Nikitha\n"
                + "3. Beemesh\n"
                + "4. Sanjay\n"
                + "5. Life Line");
        int opt = sc.nextInt();

        if (opt == 1) {
            return true;
        } else if (opt == 5) {
            life_line_count--;

            if (ff == 1 && ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();

                if (opt1 == 1) {
                    ff--;

                    System.out.println("50 - 50 Life is Playing " + ff);
                    System.out.println("1. Deepak\n" + "2. Nikitha\n");
                    opt = sc.nextInt();
                    if (opt == 1) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (opt1 == 2) {
                    ap--;

                    System.out.println("Audiance Poll Life is Playing " + ap);
                    System.out.println("1. Deepak --> 35%\n"
                            + "2. Nikitha --> 20%\n"
                            + "3. Beemesh --> 25%\n"
                            + "4. Sanjay --> 20%\n");

                    opt = sc.nextInt();
                    if (opt == 1) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }

        return false;
    }
}
