package Problems;

import java.util.*;

class Participant {
    String name;
    String email;
    int id;

    Participant(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }
}

class QuizQuestionandAnswer {
    String question;
    String[] answers;
    int correctAnswer;

    QuizQuestionandAnswer(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz {
    ArrayList<Participant> participants = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void registerParticipant() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        int id = new Random().nextInt(1000);
        Participant participant = new Participant(name, email, id);
        participants.add(participant);

        System.out.println("Registered successfully! Your ID is: " + id);
    }

    public void startQuiz() {
        System.out.println("Starting the quiz...");

        QuizQuestionandAnswer[] quizzes = {
                new QuizQuestionandAnswer("What is the capital of India?",
                        new String[] { "Mumbai", "New Delhi", "Bangalore", "Chennai" }, 1),
                new QuizQuestionandAnswer("Who is the founder of Java?",
                        new String[] { "James Gosling", "Bill Gates", "Steve Jobs", "Larry Page" }, 0),
                new QuizQuestionandAnswer("What is the largest planet in our solar system?",
                        new String[] { "Earth", "Saturn", "Jupiter", "Mars" }, 2)
        };

        int score = 0;
        int lifelineCount = 2;
        int questionNumber = 1;

        System.out.println("Welcome to Quiz Game!");
        System.out.println("You have 2 lifelines: Audio Call (A) and 50-50 (F)");

        for (QuizQuestionandAnswer quiz : quizzes) {
            System.out.println("\nQuestion " + questionNumber++ + ": " + quiz.question);
            for (int i = 0; i < quiz.answers.length; i++) {
                System.out.println((i + 1) + ". " + quiz.answers[i]);
            }

            System.out.println("Lifelines: Audio Call (A), 50-50 (F)");
            System.out.print("Enter your answer (1-" + quiz.answers.length + ") or lifeline (A/F): ");
            String input = scanner.next().trim().toUpperCase();

            if (input.equals("A") && lifelineCount > 0) {
                lifelineCount--;
                System.out.println("Audio Call: Expert says answer is likely option " + (quiz.correctAnswer + 1));
                System.out.print("Enter your answer (1-" + quiz.answers.length + "): ");
                input = scanner.next().trim();
            } else if (input.equals("F") && lifelineCount > 0) {
                lifelineCount--;
                int otherOption = (quiz.correctAnswer + 1) % quiz.answers.length;
                System.out.println(
                        "50-50 Lifeline: Options are " + (quiz.correctAnswer + 1) + " and " + (otherOption + 1));
                System.out.print("Enter your answer (1-" + quiz.answers.length + "): ");
                input = scanner.next().trim();
            } else if (!input.equals("A") && !input.equals("F")) {
                try {
                    int answer = Integer.parseInt(input) - 1;
                    if (answer == quiz.correctAnswer) {
                        System.out.println("Correct!");
                        score += 100;
                    } else {
                        System.out.println("Incorrect. The correct answer was: " + (quiz.correctAnswer + 1));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Skipping question.");
                }
            } else {
                System.out.println("No lifelines left!");
            }
        }

        System.out.println("Quiz Over! You scored " + score + " out of " + (quizzes.length * 100));
    }

    public void displayParticipants() {
        System.out.println("\nList of Participants:");
        for (Participant p : participants) {
            System.out.println("ID: " + p.id + ", Name: " + p.name + ", Email: " + p.email);
        }
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register for the quiz");
            System.out.println("2. Start the quiz");
            System.out.println("3. Show all participants");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    quiz.registerParticipant();
                    break;
                case 2:
                    quiz.startQuiz();
                    break;
                case 3:
                    quiz.displayParticipants();
                    break;
                case 4:
                    System.out.println("Exiting the quiz application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
