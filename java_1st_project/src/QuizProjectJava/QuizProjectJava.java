package QuizProjectJava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class part {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Participant> participants = new ArrayList<>();

    void register() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        int id = new Random().nextInt(1000);
        Participant participant = new Participant(name, email, id);
        participants.add(participant);

        System.out.println("Registered successfully! Your ID is: " + id);

    }

    void displayParticipants() {
        System.out.println("\nList of Participants:");
        for (Participant p : participants) {
            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Email: " + p.email);
        }
    }

    void ifelseform(int input) {
        QuestionQuiz q = new QuestionQuiz();
        Candidate c = new Candidate();

        if (input == 1) {
            boolean bool1 = q.question1(c);
            if (bool1 == true) {
                System.out.println("Congrats. You answer is correct.\n You have won 1000rs");
                c.amount = 1000;
                System.out.println("========================");
                bool1 = q.question2(c);
                if (bool1 == true) {
                    System.out.println("Congrats. You answer is correct.\n You have won 3000rs");
                    c.amount = 3000;
                    System.out.println("========================");
                    bool1 = q.question3(c);
                    if (bool1 == true) {
                        System.out.println("Congrats. You answer is correct.\n You have won 7000rs");
                        c.amount = 7000;
                        System.out.println("========================");
                        System.out.println("The total amount won is = " + c.amount);
                        bool1 = q.question4(c);
                        if (bool1 == true) {
                            System.out.println("Congrats. You answer is correct.\nYou have won 10000rs");
                            c.amount = 10000;
                            System.out.println("========================");
                            System.out.println("The total amount won is = " + c.amount);
                            bool1 = q.question5(c);
                            if (bool1 == true) {
                                System.out.println("Congrats. You answer is correct.\n You have won 12000rs");
                                c.amount = 12000;
                                System.out.println("========================");
                                System.out.println("The total amount won is = " + c.amount);
                                bool1 = q.question6(c);
                                if (bool1 == true) {
                                    System.out.println("Congrats. You answer is correct.\n You have won 15000rs");
                                    c.amount = 15000;
                                    System.out.println("========================");
                                    System.out.println("The total amount won is = " + c.amount);
                                    bool1 = q.question7(c);
                                    if (bool1 == true) {
                                        System.out.println("Congrats. You answer is correct.\n You have won 17000rs");
                                        c.amount = 17000;
                                        System.out.println("========================");
                                        System.out.println("The total amount won is = " + c.amount);
                                        bool1 = q.question8(c);
                                        if (bool1 == true) {
                                            System.out
                                                    .println("Congrats. You answer is correct.\n You have won 20000rs");
                                            c.amount = 20000;
                                            System.out.println("========================");
                                            System.out.println("The total amount won is = " + c.amount);
                                        } else {
                                            System.out
                                                    .println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                                            System.out.println("You have won Rs. " + c.amount);
                                            System.out.println("Thank you for participating");

                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                                        System.out.println("You have won Rs. " + c.amount);
                                        System.out.println("Thank you for participating");

                                        System.exit(0);

                                    }
                                } else {
                                    System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                                    System.out.println("You have won Rs. " + c.amount);
                                    System.out.println("Thank you for participating");

                                    System.exit(0);
                                }
                            } else {
                                System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                                System.out.println("You have won Rs. " + c.amount);
                                System.out.println("Thank you for participating");

                                System.exit(0);
                            }
                        } else {
                            System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                            System.out.println("You have won Rs. " + c.amount);
                            System.out.println("Thank you for participating");

                            System.exit(0);
                        }
                    } else {
                        System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                        System.out.println("You have won Rs. " + c.amount);
                        System.out.println("Thank you for participating");

                        System.exit(0);
                    }
                } else {
                    System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                    System.out.println("You have won Rs. " + c.amount);
                    System.out.println("Thank you for participating");

                    System.exit(0);
                }
            } else {
                System.out.println("Wrong option or LifeLine Exhuast. Better Luck Next time");
                System.out.println("You have won Rs. " + c.amount);
                System.out.println("Thank you for participating");

                System.exit(0);
            }
        } else {
            System.out.println("Thank you for participating");
            System.exit(0);
        }
    }
}

public class QuizProjectJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        part pa = new part();

        System.out.println("Register for Quiz : ");
        pa.register();

        System.out.println("Welcome to the game");

        System.out.println("Are you ready to start the game?(1--> Continue 0--> Stop)");
        int input = sc.nextInt();

        pa.ifelseform(input);
    }
}